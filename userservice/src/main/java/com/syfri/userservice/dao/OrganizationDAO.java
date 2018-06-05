package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.OrganizationVO;

import java.util.List;

public interface OrganizationDAO extends BaseDAO<OrganizationVO>{

	/*根据用户ID查询其组织机构.*/
	OrganizationVO doFindOrganizationByUserid(String userid);

	/*获取所有总队*/
	List<OrganizationVO> getZongdui();
}