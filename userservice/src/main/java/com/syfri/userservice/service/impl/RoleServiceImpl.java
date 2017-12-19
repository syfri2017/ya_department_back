package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.model.RolePermissionVO;
import com.syfri.userservice.model.UserVO;
import com.syfri.userservice.utils.CurrentUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.RoleDAO;
import com.syfri.userservice.model.RoleVO;
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
	public List<RoleVO> getUserRoleByVO(UserVO userVO) {
		return roleDAO.getUserRoleByVO(userVO);
	}

	/*--查询：获取用户权限，如果roleVO为null，则获取所有用户权限.--*/
	@Override
	public List<RoleVO> doFindRolePermissions(RoleVO roleVO){
		return roleDAO.doFindRolePermissions(roleVO);
	}

	/*--新增：增加角色并为用户赋予权限.--*/
	@Override
	@Transactional
	public RoleVO doInsertRolePermissions(RoleVO roleVO){
		roleVO.setCreateId(CurrentUserUtil.getCurrentUserId());
		roleVO.setCreateName(CurrentUserUtil.getCurrentUserName());
		roleDAO.doInsertByVO(roleVO);
		//向角色权限中间表插入数据
		String roleid = roleVO.getRoleid();
		this.insertRolePermissionsBatch(roleid, roleVO.getPermissions());
		return roleVO;
	}

	/*--修改：修改角色并修改用户权限.--*/
	@Override
	@Transactional
	public RoleVO doUpdateRolePermissions(RoleVO roleVO){
		roleDAO.doUpdateByVO(roleVO);
		String roleid = roleVO.getRoleid();
		roleDAO.doDeleteRolePermissions(roleid);
		this.insertRolePermissionsBatch(roleid, roleVO.getPermissions());
		return roleVO;
	}

	/*--删除：删除用户同时删除其角色.--*/
	@Override
	@Transactional
	public void doDeleteRolePermissions(String roleid){
		roleDAO.doDeleteById(roleid);
		roleDAO.doBatchDeleteRolePermissions(roleid);
	}

	public int insertRolePermissionsBatch(String roleid, List<PermissionVO> permissions){
		List<RolePermissionVO> list = new ArrayList<>();
		if(permissions.size()>0){
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
}