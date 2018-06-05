package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.OrganizationVO;

import java.util.List;

public interface OrganizationService  extends BaseService<OrganizationVO>{

	/*根据用户ID查询其组织机构.*/
	OrganizationVO doFindOrganizationByUserid(String userid);

	/*获取所有总队*/
	List<OrganizationVO> getZongdui();
}