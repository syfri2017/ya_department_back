package com.syfri.digitalplan.service.impl.digitalplan;

import com.syfri.digitalplan.dao.digitalplan.DigitalplanlistDAO;
import com.syfri.digitalplan.dao.digitalplan.DisastersetDAO;
import com.syfri.digitalplan.dao.digitalplan.KeypointsDAO;
import com.syfri.digitalplan.dao.digitalplan.ForcedevDAO;
import com.syfri.digitalplan.dao.buildingzoning.BuildingDAO;

import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.model.digitalplan.DisastersetVO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.digitalplan.ForcedevVO;
import com.syfri.digitalplan.model.digitalplan.KeypointsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;

import com.syfri.digitalplan.service.digitalplan.DigitalplanlistService;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("digitalplanlistService")
public class DigitalplanlistServiceImpl extends BaseServiceImpl<DigitalplanlistVO> implements DigitalplanlistService {

    @Autowired
    private DigitalplanlistDAO digitalplanlistDAO;
    @Autowired
    private DisastersetDAO disastersetDAO;
    @Autowired
    private KeypointsDAO keypointsDAO;
    @Autowired
    private ForcedevDAO forcedevDAO;
    @Autowired
    private BuildingDAO buildingDAO;


    @Override
    public DigitalplanlistDAO getBaseDAO() {
        return digitalplanlistDAO;
    }


    /*
    * 预案审批（更新部分字段）
    * by yushch 20180426
    */
    public DigitalplanlistVO doApproveUpdate(DigitalplanlistVO digitalplanlistVO) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String shsj = sdf.format(date);
		digitalplanlistVO.setShsj(shsj);
        String shzt = digitalplanlistVO.getShzt();
        //如果选择“未通过”，预案状态变更为已驳回
        if(shzt.equals("02")){
            digitalplanlistVO.setYazt("04");
        }
        //如果选择“已通过”，预案状态变更为已审核
        else if(shzt.equals("03")){
            digitalplanlistVO.setYazt("05");
        }
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
        String shztmc = digitalplanlistDAO.doFindShztmcByShzt(shzt);
        digitalplanlistVO.setShztmc(shztmc);
        return digitalplanlistVO;
    }

    /**
     * @Description: 新增：预案
     * @Param: [digitalplanlistVO]
     * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/2 16:05
     */
    @Override
    public DigitalplanlistVO doInsertDigitalplan(DigitalplanlistVO digitalplanlistVO) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String zzsj = sdf.format(date);
        //预案插入
//		digitalplanlistVO.setZzsj(zzsj);
        digitalplanlistVO.setDeleteFlag("N");
        digitalplanlistDAO.doInsertByVO(digitalplanlistVO);
        //灾情插入
        List disasterList = digitalplanlistVO.getDisasterList();
        for (int i = 0; i < disasterList.size(); i++) {
            Map ds = (Map) disasterList.get(i);
            DisastersetVO dsVO = new DisastersetVO();
            dsVO.setYaid(digitalplanlistVO.getUuid());//预案id
            dsVO.setZdbwid(ds.get("zdbwid").toString());//重点部位id
            dsVO.setJzid(ds.get("jzid").toString());
            dsVO.setZqbw(ds.get("bwmc").toString());
            if (ds.get("zqdj") == "" || ds.get("zqdj") == null) {
                dsVO.setZqdj("");
            } else {
                List zqdj = (List) ds.get("zqdj");//灾情等级
                if (zqdj.size() >= 1) {
                    dsVO.setZqdj(zqdj.get(zqdj.size() - 1).toString());
                }
            }
            dsVO.setQhyy(ds.get("qhyy").toString());
            dsVO.setGyjzhzwxx(ds.get("hzwxx").toString());
            dsVO.setZhcs(ds.get("zhcs").toString());
            if (ds.get("rswz") == "" || ds.get("rswz") == null) {
                dsVO.setRswz("");
            } else {
                List rswz = (List) ds.get("rswz");//燃烧物质
                if (rswz.size() >= 1) {
                    dsVO.setRswz(rswz.get(rswz.size() - 1).toString());
                }
            }
            dsVO.setQhbwgd(ds.get("qhbwgd").toString());
            dsVO.setRsmj(ds.get("rsmj").toString());
            dsVO.setZqms(ds.get("zqms").toString());
            dsVO.setZqsdyj(ds.get("zqsdyj").toString());
            dsVO.setCjrid(digitalplanlistVO.getZzrid());
            dsVO.setCjrmc(digitalplanlistVO.getZzrmc());
//			dsVO.setCjsj(zzsj);
            dsVO.setDeleteFlag("N");
            disastersetDAO.doInsertByVO(dsVO);
            //力量部署插入
            List forceList = (List) ds.get("forcedevList");
            for (int k = 0; k < forceList.size(); k++) {
                Map fd = (Map) forceList.get(i);
                ForcedevVO fdVO = new ForcedevVO();
                fdVO.setZqid(dsVO.getZqid());
                fdVO.setDjfalx(fd.get("djfalx").toString());
                fdVO.setDzid(fd.get("dzid").toString());
                fdVO.setTkwz(fd.get("tkwz").toString());
                fdVO.setClzbts(fd.get("clzbts").toString());
                fdVO.setCjrid(digitalplanlistVO.getZzrid());
                fdVO.setCjrmc(digitalplanlistVO.getZzrmc());
//				fdVO.setCjsj(zzsj);
                fdVO.setDeleteFlag("N");
                forcedevDAO.doInsertByVO(fdVO);
            }
            //要点提示插入
            Map kp = (Map) ds.get("keypointsMap");
            if (kp.get("zsyd") != "" && kp.get("zsyd") != null && kp.get("tbjs") != "" && kp.get("tbjs") != null) {
                KeypointsVO kpVO = new KeypointsVO();
                kpVO.setZqid(dsVO.getZqid());
                kpVO.setZsyd(kp.get("zsyd").toString());
                kpVO.setTbjs(kp.get("tbjs").toString());
                kpVO.setCjrid(digitalplanlistVO.getZzrid());
                kpVO.setCjrmc(digitalplanlistVO.getZzrmc());
//			kpVO.setCjsj(zzsj);
                kpVO.setDeleteFlag("N");
                keypointsDAO.doInsertByVO(kpVO);
            }
        }
        return digitalplanlistVO;
    }

    /**
     * @Description: 修改：预案
     * @Param: [digitalplanlistVO]
     * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/2 16:05
     */
    @Override
    public DigitalplanlistVO doUpdateDigitalplan(DigitalplanlistVO digitalplanlistVO) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String shsj = sdf.format(date);
        if (digitalplanlistVO.getYazt().equals("03")) {
            digitalplanlistVO.setZzsj(shsj);
        } else if (digitalplanlistVO.getYazt().equals("01")) {
            digitalplanlistVO.setXgsj(shsj);
        }
        digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
        return digitalplanlistVO;
    }

    /***
     * @Description: 删除：预案
     * @Param: [voList]
     * @Return: java.util.List<com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO>
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/26 13:53
     */
    @Override
    public int doDeleteDigitalplan(List<DigitalplanlistVO> digitalplanList,DigitalplanlistVO digitalplanVo){
        String xgrid = digitalplanVo.getXgrid();
        String xgrmc = digitalplanVo.getXgrmc();
        int num = 0;
        if (digitalplanList.size() > 0) {
            for (DigitalplanlistVO dpVo : digitalplanList) {
                List<DisastersetVO> disasterList = disastersetDAO.doFindByPlanId(dpVo.getUuid());
                if (disasterList.size() > 0) {
                    for (DisastersetVO dsVo : disasterList) {
                        ForcedevVO fdVo = new ForcedevVO();
                        fdVo.setZqid(dsVo.getZqid());
                        fdVo.setXgsj("1");
                        fdVo.setXgrid(xgrid);
                        fdVo.setXgrmc(xgrmc);
                        fdVo.setDeleteFlag("Y");
                        forcedevDAO.doDeleteByVO(fdVo);

                        KeypointsVO kpVo = new KeypointsVO();
                        kpVo.setZqid(dsVo.getZqid());
                        kpVo.setXgsj("1");
                        kpVo.setXgrid(xgrid);
                        kpVo.setXgrmc(xgrmc);
                        kpVo.setDeleteFlag("Y");
                        keypointsDAO.doDeleteByVO(kpVo);
                    }
                }
                DisastersetVO dsVo = new DisastersetVO();
                dsVo.setYaid(dpVo.getUuid());
                dsVo.setXgsj("1");
                dsVo.setXgrid(xgrid);
                dsVo.setXgrmc(xgrmc);
                dsVo.setDeleteFlag("Y");
                disastersetDAO.doDeleteByVO(dsVo);

                dpVo.setXgsj("1");
                dpVo.setXgrid(xgrid);
                dpVo.setXgrmc(xgrmc);
                dpVo.setDeleteFlag("Y");
                num = num + digitalplanlistDAO.doUpdateByVO(dpVo);
            }
        }
        return num;
    }

    /***
     * @Description: 查询：通过重点单位id查询建筑分区list
     * @Param: [zddwid]
     * @Return: java.util.List<com.syfri.digitalplan.model.buildingzoning.BuildingVO>
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/23 10:20
     */
    public List<BuildingVO> doSearchJzListByZddwId(BuildingVO buildingVO) {
        List<BuildingVO> resultList = this.buildingDAO.doSearchJzListByZddwId(buildingVO);
        return resultList;
    }
}