package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.*;

import java.util.List;

public interface RoleDAO extends BaseDAO<RoleVO>{

	/*根据用户取角色.*/
	List<RoleVO> doFindRoleByUserid(String userid);

	/*获取权限，如果roleVO为null，则获取所有权限.*/
	List<RoleVO> doFindRolePermissions(RoleVO roleVO);

	/*新增角色时批量插入用户权限.*/
	int doBatchInsertRolePermissions(List<RolePermissionVO> rolePermissions);

	/*修改角色时先删除角色权限中间表数据*/
	int doDeleteRolePermissions(String roleid);

	/*修改角色时修改用户中间表数据*/
	int doBatchDeleteRolePermissions(String roleid);

	/*新增：角色菜单时批量插入中间表.*/
	int doBatchInsertRoleMenus(List<RoleMenuVO> roleMenus);

	/*修改：角色菜单时先删除中间表相应数据*/
	int doDeleteRoleMenus(String roleid);

	/*删除角色时同时删除菜单中间表*/
	int doBatchDeleteRoleMenus(String roleid);

}