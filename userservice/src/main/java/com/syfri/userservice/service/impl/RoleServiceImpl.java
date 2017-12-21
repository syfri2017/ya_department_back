package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.*;
import com.syfri.userservice.utils.CurrentUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.RoleDAO;
import com.syfri.userservice.service.RoleService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<RoleVO> implements RoleService {

	@Autowired
	private RoleDAO roleDAO;

	@Override
	public RoleDAO getBaseDAO() {
		return roleDAO;
	}

	@Override
	public List<RoleVO> doFindRoleByUserid(String userid) {
		return roleDAO.doFindRoleByUserid(userid);
	}

	/*--查询：获取用户权限、菜单，如果roleVO为null，则获取所有用户权限、菜单.--*/
	@Override
	public List<RoleVO> doFindRoles(RoleVO roleVO){
		return roleDAO.doFindRolePermissions(roleVO);
	}

	/*--新增：增加角色并为用户赋予权限、菜单.--*/
	@Override
	@Transactional
	public RoleVO doInsertRole(RoleVO roleVO){
		roleVO.setCreateId(CurrentUserUtil.getCurrentUserId());
		roleVO.setCreateName(CurrentUserUtil.getCurrentUserName());
		roleDAO.doInsertByVO(roleVO);

		String roleid = roleVO.getRoleid();
		//向角色权限中间表插入数据
		this.insertRolePermissionsBatch(roleid, roleVO.getPermissions());
		//向角色菜单中间表插入数据
		this.insertRoleMenusBatch(roleid, roleVO.getMenus());
		return roleVO;
	}

	/*--修改：修改角色并修改用户权限、菜单.--*/
	@Override
	@Transactional
	public RoleVO doUpdateRole(RoleVO roleVO){
		roleDAO.doUpdateByVO(roleVO);

		String roleid = roleVO.getRoleid();
		//角色权限表修改数据
		roleDAO.doDeleteRolePermissions(roleid);
		this.insertRolePermissionsBatch(roleid, roleVO.getPermissions());
		//角色菜单表修改数据
		roleDAO.doDeleteRoleMenus(roleid);
		this.insertRoleMenusBatch(roleid, roleVO.getMenus());

		return roleVO;
	}

	/*--删除：删除角色同时删除其权限、菜单.--*/
	@Override
	@Transactional
	public void doDeleteRole(String roleid){
		roleDAO.doDeleteById(roleid);
		roleDAO.doBatchDeleteRolePermissions(roleid);
		roleDAO.doBatchDeleteRoleMenus(roleid);
	}

	/*批量向角色权限中间表插入数据.*/
	public int insertRolePermissionsBatch(String roleid, List<PermissionVO> permissions){
		List<RolePermissionVO> list = new ArrayList<>();
		if(permissions!=null && permissions.size()>0){
			for(PermissionVO permission : permissions){
				RolePermissionVO temp = new RolePermissionVO();
				temp.setRoleid(roleid);
				temp.setPermissionid(permission.getPermissionid());
				temp.setCreateId(CurrentUserUtil.getCurrentUserId());
				temp.setCreateName(CurrentUserUtil.getCurrentUserName());
				list.add(temp);
			}
			return roleDAO.doBatchInsertRolePermissions(list);
		}else{
			return 0;
		}
	}

	/*批量向角色菜单中间表插入数据.*/
	public int insertRoleMenusBatch(String roleid, List<MenuVO> menus){
		List<RoleMenuVO> list = new ArrayList<>();
		if(menus!=null && menus.size()>0){
			for(MenuVO menu : menus){
				RoleMenuVO temp = new RoleMenuVO();
				temp.setRoleid(roleid);
				temp.setMenuid(menu.getMenuid());
				temp.setCreateId(CurrentUserUtil.getCurrentUserId());
				temp.setCreateName(CurrentUserUtil.getCurrentUserName());
				list.add(temp);
			}
			return roleDAO.doBatchInsertRoleMenus(list);
		}else{
			return 0;
		}
	}
}