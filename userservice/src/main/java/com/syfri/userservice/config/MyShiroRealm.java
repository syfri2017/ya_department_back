package com.syfri.userservice.config;

import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.model.ShiroUser;
import com.syfri.userservice.model.UserVO;
import com.syfri.userservice.service.PermissionService;
import com.syfri.userservice.service.RoleService;
import com.syfri.userservice.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class MyShiroRealm extends AuthorizingRealm{

	private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	@Resource
	private UserService userService;

	@Resource
	private RoleService roleService;

	@Resource
	private PermissionService permissionService;

	/**
	 * 认证信息（身份验证）
	 * Authentication 是用来验证用户身份
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("【MyShiroRealm】身份验证");

		String username = (String) token.getPrincipal();
		UserVO userVO = new UserVO();
		userVO.setUsername(username);
		//UserVO user = userService.doFindByVO(userVO);
		List<UserVO> users = userService.doSearchListByVO(userVO);
		if(users == null){
			return null;
		}
		UserVO user = users.get(0);
		if("Y".equals(user.getDeleteFlag())){
			return null;
		}

		ShiroUser shiroUser = new ShiroUser(user.getPkid(), user.getUsername(), user.getRealname());
		List<String> roles = new ArrayList();
		List<String> permissions = new ArrayList();
		List<RoleVO> roleList = roleService.getUserRoleByVO(user);
		for(RoleVO role : roleList){
			roles.add(role.getRolename());
			List<PermissionVO> permissionList = permissionService.getRolePermissionByVO(role);
			for(PermissionVO permission : permissionList){
				permissions.add(permission.getPermissionname());
			}
		}
		shiroUser.setRoles(roles);
		shiroUser.setPermissions(permissions);


		//获取权限信息

		//账号判断（明文）
		/*
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				user,
				user.getPassword(),
				getName()
		);
		*/
		//账号判断（密文）
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				shiroUser,
				user.getPassword(),
				ByteSource.Util.bytes(user.getSalt()),
				getName()
		);
		return authenticationInfo;
	}

	/**
	 * 授权管理 1.如果用户正常退出，缓存自动清空；2。如何用户非正常退出，缓存自动清空；
	 * 3.如果我们修改了用户的权限，而用户不退出系统	，修改的权限无法立即生效，再权限修改后调用realm中的方法，二realm由spring管理，所以从spring中调用clearCached方法，再service中调用
	 * 此方法调用hasRole、hasPermission时才会进行回调
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		logger.info("【MyShiroRealm】权限管理");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

		ShiroUser shiroUser = (ShiroUser) principalCollection.getPrimaryPrincipal();
		if(shiroUser != null){
			authorizationInfo.addRoles(shiroUser.getRoles());
			for(int i=0; i<shiroUser.getPermissions().size(); i++){
				authorizationInfo.addStringPermission(shiroUser.getPermissions().get(i));
			}
			return authorizationInfo;
		}
		/*
		UserVO userVO = (UserVO) principalCollection.getPrimaryPrincipal();
		if(userVO != null){
			//根据用户取角色
			List<RoleVO> roleList = roleService.getUserRoleByVO(userVO);
			for(RoleVO role : roleList){
				authorizationInfo.addRole(role.getRolename());
				List<PermissionVO> permissionList = permissionService.getRolePermissionByVO(role);
				for(PermissionVO permission : permissionList){
					authorizationInfo.addStringPermission(permission.getPermissionname());
				}
			}
			return authorizationInfo;
		}
		*/
		return null;
	}

}
