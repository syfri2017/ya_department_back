package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.PermissionDAO;
import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.service.PermissionService;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl extends BaseServiceImpl<PermissionVO> implements PermissionService {

	@Autowired
	private PermissionDAO permissionDAO;

	@Override
	public PermissionDAO getBaseDAO() {
		return permissionDAO;
	}

	@Override
	public List<PermissionVO> doFindPermissionByRoleid(String roleid) {
		return permissionDAO.doFindPermissionByRoleid(roleid);
	}
}