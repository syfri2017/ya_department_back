package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.model.RoleVO;

import java.util.List;

public interface PermissionService  extends BaseService<PermissionVO>{

	/*根据角色取权限.*/
	List<PermissionVO> getRolePermissionByVO(RoleVO roleVO);
}