package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.model.RolePermissionVO;
import com.syfri.userservice.model.UserVO;

import java.util.List;

public interface RoleDAO extends BaseDAO<RoleVO>{

	/*根据用户取角色.*/
	List<RoleVO> getUserRoleByVO(UserVO userVO);

	/*获取权限，如果roleVO为null，则获取所有权限.*/
	List<RoleVO> doFindRolePermissions(RoleVO roleVO);

	/*新增角色时批量插入用户权限.*/
	int doBatchInsertRolePermissions(List<RolePermissionVO> rolePermissions);

	/*修改角色时先删除角色权限中间表数据*/
	int doDeleteRolePermissions(String roleid);

	/*修改角色时修改用户中间表数据*/
	int doBatchDeleteRolePermissions(String roleid);

}