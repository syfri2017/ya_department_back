package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.model.RoleVO;

import java.util.List;

public interface PermissionDAO extends BaseDAO<PermissionVO>{

	/*根据角色取权限.*/
	List<PermissionVO> getRolePermissionByVO(RoleVO roleVO);
}