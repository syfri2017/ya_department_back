package com.syfri.digitalplan.service.impl.digitalplan;

import com.syfri.digitalplan.dao.digitalplan.DigitalplanlistDAO;
import com.syfri.digitalplan.dao.digitalplan.DisastersetDAO;
import com.syfri.digitalplan.dao.digitalplan.KeypointsDAO;
import com.syfri.digitalplan.dao.digitalplan.ForcedevDAO;
import com.syfri.digitalplan.model.digitalplan.ForcedevVO;
import com.syfri.digitalplan.model.digitalplan.KeypointsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.model.digitalplan.DisastersetVO;
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


	@Override
	public DigitalplanlistDAO getBaseDAO() {
		return digitalplanlistDAO;
	}



	/*
	* 预案审批（更新部分字段）
	* by yushch 20180426
	*/
	public DigitalplanlistVO doApproveUpdate(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String shsj = sdf.format(date);
//		digitalplanlistVO.setShsj(shsj);
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
		String shzt = digitalplanlistVO.getShzt();
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
	public DigitalplanlistVO doInsertDigitalplan(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String zzsj = sdf.format(date);
		//预案插入
//		digitalplanlistVO.setZzsj(zzsj);
		digitalplanlistVO.setDeleteFlag("N");
		digitalplanlistDAO.doInsertByVO(digitalplanlistVO);
		//灾情插入
		List disasterList = digitalplanlistVO.getDisasterList();
		for(int i=0;i<disasterList.size();i++){
			Map ds = (Map) disasterList.get(i);
			DisastersetVO dsVO = new DisastersetVO();
			dsVO.setYaid(digitalplanlistVO.getUuid());//预案id
			dsVO.setZdbwid("");//重点部位id
			dsVO.setJzid(ds.get("jzid").toString());
			dsVO.setZqbw(ds.get("bwmc").toString());
			dsVO.setZqdj(ds.get("zqdj").toString());
			dsVO.setQhyy(ds.get("qhyy").toString());
			dsVO.setGyjzhzwxx(ds.get("hzwxx").toString());
			dsVO.setZhcs(ds.get("zhcs").toString());
			dsVO.setRswz(ds.get("rswz").toString());
			dsVO.setQhbwgd(ds.get("qhbwgd").toString());
			dsVO.setRsmj(ds.get("rsmj").toString());
			dsVO.setZqms("");
			dsVO.setZqsdyj("");
			dsVO.setCjrid("");
//			dsVO.setCjsj(zzsj);
			dsVO.setDeleteFlag("N");
			disastersetDAO.doInsertByVO(dsVO);
			//力量部署插入
			List forceList = (List)ds.get("forcedevList");
			for(int k=0;k<forceList.size();k++){
				Map fd = (Map) forceList.get(i);
				ForcedevVO fdVO = new ForcedevVO();
				fdVO.setZqid(dsVO.getZqid());
				fdVO.setDjfalx(fd.get("djfalx").toString());
				fdVO.setDzid(fd.get("dzid").toString());
				fdVO.setTkwz(fd.get("tkwz").toString());
				fdVO.setClzbts(fd.get("clzbts").toString());
				fdVO.setCjrid("");
//				fdVO.setCjsj(zzsj);
				fdVO.setDeleteFlag("N");
				forcedevDAO.doInsertByVO(fdVO);
			}
			//要点提示插入
			Map kp = (Map)ds.get("keypointsMap");
			KeypointsVO kpVO = new KeypointsVO();
			kpVO.setZqid(dsVO.getZqid());
			kpVO.setZsyd(kp.get("zsyd").toString());
			kpVO.setTbjs(kp.get("tbjs").toString());
			kpVO.setCjrid("");
//			kpVO.setCjsj(zzsj);
			kpVO.setDeleteFlag("N");
			keypointsDAO.doInsertByVO(kpVO);
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
	public DigitalplanlistVO doUpdateDigitalplan(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String shsj = sdf.format(date);
		if(digitalplanlistVO.getYazt().equals("03")){
			digitalplanlistVO.setZzsj(shsj);
		}else if(digitalplanlistVO.getYazt().equals("01")){
			digitalplanlistVO.setXgsj(shsj);
		}
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
		return digitalplanlistVO;
	}
}