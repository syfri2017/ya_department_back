package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.*;

import java.util.List;

public interface RoleService  extends BaseService<RoleVO>{
	/*根据用户取角色.*/
	List<RoleVO> doFindRoleByUserid(String userid);

	/*--查询：获取用户权限、菜单，如果roleVO为null，则获取所有用户权限、菜单.--*/
	List<RoleVO> doFindRoles(RoleVO roleVO);

	/*--新增：增加角色并为用户赋予权限、菜单.--*/
	RoleVO doInsertRole(RoleVO roleVO);

	/*--修改：修改角色并修改用户权限、菜单.--*/
	RoleVO doUpdateRole(RoleVO roleVO);

	/*--删除：删除角色同时删除其权限、菜单.--*/
	void doDeleteRole(String roleid);
}