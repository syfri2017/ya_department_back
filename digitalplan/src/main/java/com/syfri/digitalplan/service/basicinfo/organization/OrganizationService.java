package com.syfri.digitalplan.service.basicinfo.organization;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.organization.OrganizationTree;
import com.syfri.digitalplan.model.basicinfo.organization.OrganizationVO;

import java.util.List;

public interface OrganizationService extends BaseService<OrganizationVO>{

//    /*--查询：重点单位.--*/
//    List<OrganizationVO> doFindOrganizationlist(OrganizationVO rganizationVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<OrganizationVO> doFindDetailById(String organizationId);

    /*--获取全部机构.--*/
    List<OrganizationTree> doFindAllOrganization();
}