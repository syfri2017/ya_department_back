package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.model.UserVO;

import java.util.List;

public interface RoleService  extends BaseService<RoleVO>{
	/*根据用户取角色.*/
	List<RoleVO> getUserRoleByVO(UserVO userVO);

	/*--查询：获取用户权限，如果roleVO为null，则获取所有用户权限.--*/
	List<RoleVO> doFindRolePermissions(RoleVO roleVO);

	/*--新增：增加角色并为用户赋予权限.--*/
	RoleVO doInsertRolePermissions(RoleVO roleVO);

	/*--修改：修改角色并修改用户权限.--*/
	RoleVO doUpdateRolePermissions(RoleVO roleVO);

	/*--删除：删除用户同时删除其角色.--*/
	void doDeleteRolePermissions(String roleid);
}