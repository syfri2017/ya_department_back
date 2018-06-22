package com.syfri.digitalplan.service.impl.auxiliarydecision.danger;

import com.syfri.digitalplan.dao.auxiliarydecision.danger.DangerDAO;
import com.syfri.digitalplan.model.auxiliarydecision.danger.DangerVO;
import com.syfri.digitalplan.service.auxiliarydecision.danger.DangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syfri.baseapi.service.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("dangerService")
public class DangerServiceImpl extends BaseServiceImpl<DangerVO> implements DangerService {

    @Autowired
    private DangerDAO dangerDAO;

    @Override
    public DangerDAO getBaseDAO() {
        return dangerDAO;
    }

    /**
     * @Description: 条件查询：危化品.
     * @Param: [dangerVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.danger.DangerVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/20 16:46
     */
    @Override
    public List<DangerVO> doFindlist(DangerVO dangerVO) {
        //英文名
        if (dangerVO.getEnglishName() != null && !"".equals(dangerVO.getEnglishName())) {
            dangerVO.setEnglishName(dangerVO.getEnglishName().toLowerCase());
        }
        return dangerDAO.doSearchByVO(dangerVO);
    }

    /**
     * @Description: 化危品删除
     * @Param: [dangerList]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.danger.DangerVO>
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/6/22 14:23
     */
    public int doDeleteDanger(List<DangerVO> dangerList) {
        int count = 0;
        if (dangerList.size() > 0) {
            for (DangerVO dangerVO : dangerList) {
                DangerVO vo = new DangerVO();
                vo.setUuid(dangerVO.getUuid());
                vo.setXgrid(dangerVO.getXgrid());
                vo.setXgrmc(dangerVO.getXgrmc());
                vo.setXgsj("1");
                vo.setDeleteFlag("Y");
                count = count + dangerDAO.doUpdateByVO(vo);
            }
        }
        return count;
    }

    /**
     * @Description: 化危品修改
     * @Param: [dangerVO]
     * @Return: int
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/6/22 15:48
     */
    public int doUpdateDanger(DangerVO dangerVO) {
        dangerVO.setCjrid(null);
        dangerVO.setCjrmc(null);
        dangerVO.setCjsj(null);
        dangerVO.setXgsj("1");
        int count = dangerDAO.doUpdateByVO(dangerVO);
        return count;
    }
}