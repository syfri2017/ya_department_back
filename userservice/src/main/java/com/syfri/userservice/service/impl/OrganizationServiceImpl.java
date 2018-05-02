package com.syfri.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.OrganizationDAO;
import com.syfri.userservice.model.OrganizationVO;
import com.syfri.userservice.service.OrganizationService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("organizationService")
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationVO> implements OrganizationService {

	@Autowired
	private OrganizationDAO organizationDAO;

	@Override
	public OrganizationDAO getBaseDAO() {
		return organizationDAO;
	}

	/*根据用户ID查询其组织机构.*/
	@Override
	public OrganizationVO doFindOrganizationByUserid(String userid){
		return organizationDAO.doFindOrganizationByUserid(userid);
	}
}