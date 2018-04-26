package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.OrganizationVO;

import java.util.List;

public interface OrganizationDAO extends BaseDAO<OrganizationVO>{
    /**
     * @Description:
     * @Param:
     * @Return:
     * @Author: zhaijianchen
     * @Modified By:
     * @Date: 2018/4/24 15:26
     */
/*--根据条件查询记录.--*/
    List<OrganizationVO> doSearchByVO(OrganizationVO organizationVO);

    /*--根据装备id获取装备详情.--*/
    List<OrganizationVO> doFindDetailById(String organizationId);

}