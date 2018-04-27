package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.OrganizationVO;

import java.util.List;

public interface OrganizationService  extends BaseService<OrganizationVO>{

//    /*--查询：重点单位.--*/
//    List<OrganizationVO> doFindOrganizationlist(OrganizationVO rganizationVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<OrganizationVO> doFindDetailById(String organizationId);

}