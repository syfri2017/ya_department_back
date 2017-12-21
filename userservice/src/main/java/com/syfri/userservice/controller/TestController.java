package com.syfri.userservice.controller;

import com.syfri.baseapi.controller.BaseController;
import com.syfri.userservice.model.*;
import com.syfri.userservice.service.MenuService;
import com.syfri.userservice.service.PermissionService;
import com.syfri.userservice.service.RoleService;
import com.syfri.userservice.service.UserService;
import com.syfri.userservice.utils.CurrentUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController<UserVO>{

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private MenuService menuService;

	@Override
	public UserService getBaseService() {
		return this.userService;
	}

	//1
	@RequestMapping("/count")
	public int count(){
		UserVO vo = new UserVO();
		return userService.doSearchCount(vo);
	}

	//2
	@RequestMapping("/findById")
	public UserVO findById(){
		return userService.doFindById("1");
	}

	//3
	@RequestMapping("/findByVO")
	public List<UserVO> findByVO(){
		UserVO vo = new UserVO();
		vo.setUsername("aa");
		return userService.doSearchListByVO(vo);
	}

	//4
	@RequestMapping("/insertByVO")
	public int insertByVO(){
		UserVO vo = new UserVO();
		vo.setUsername("zzz");
		vo.setPassword("1");
		return userService.doInsertByVO(vo);
	}

	//5
	@RequestMapping("/insertByList")
	public int insertByList(){
		List<UserVO> list = new ArrayList<UserVO>();
		UserVO vo1 = new UserVO();
		vo1.setUsername("aa");
		vo1.setPassword("1");
		list.add(vo1);
		UserVO vo2 = new UserVO();
		vo2.setUsername("bb");
		vo2.setPassword("1");
		list.add(vo2);
		return userService.doBatchInsertByList(list);
	}

	//6
	@RequestMapping("/deleteById")
	public int insertByMap(){
		return userService.doDeleteById("11111");
	}

	//7
	@RequestMapping("updateByVO")
	public int updateByVO(){
		UserVO vo = userService.doFindById("1");
		vo = userService.getPasswordEncry(vo);
		UserVO vo2 = userService.doFindById("2");
		vo2 = userService.getPasswordEncry(vo2);
		userService.doUpdateByVO(vo2);
		return userService.doUpdateByVO(vo);
	}

	//8
	@RequestMapping("/updateByList")
	public int updateByList(){
		List<UserVO> list = new ArrayList<UserVO>();
		UserVO vo1 = new UserVO();
		vo1.setPkid("2");
		vo1.setUsername("lucy22");
		vo1.setPassword("1");
		list.add(vo1);
		UserVO vo2 = new UserVO();
		vo2.setPkid("3");
		vo2.setUsername("smith33");
		vo2.setPassword("1");
		list.add(vo2);
		return userService.doBatchUpdateByList(list);
	}
	//9
	@RequestMapping("doFindByVO")
	public UserVO doFindByVO(){
		UserVO userVO = new UserVO();
		userVO.setUsername("aaa");
		return userService.doFindByVO(userVO);
	}
	//10
	@RequestMapping("getRoleByUserid")
	public List<RoleVO> getUserRoleByVO(){
		UserVO userVO = new UserVO();
		return roleService.doFindRoleByUserid("1");
	}

	//11
	@RequestMapping("getUsers")
	public List<UserVO> getUsers(){
		UserVO vo = new UserVO();
		vo.setUsername("111");
		List<UserVO> lists = userService.doFindUserRoles(vo);
		return lists;
	}

	//12
	@RequestMapping("insertUser")
	public UserVO insertUser(){
		UserVO vo = new UserVO();
		vo.setUsername("lucy");
		vo.setPassword("1");
//		List<RoleVO> roles = new ArrayList<RoleVO>();
//		RoleVO role = new RoleVO();
//		role.setRolename("normal");
//		role.setRoleid("2");
//		roles.add(role);
//		vo.setRoles(roles);
		return userService.doInsertUserRoles(vo);
	}

	//13
	@RequestMapping("updateUser")
	public UserVO updateUser(){
		UserVO user = new UserVO();
		user.setPkid("3");
		UserVO vo = userService.doFindUserRoles(user).get(0);
		vo.setRealname("adminadmin1111");
		List<RoleVO> roles = new ArrayList<>();
		RoleVO role = new RoleVO();
		role.setRolename("normal");
		role.setRoleid("2");
		roles.add(role);
		vo.setRoles(roles);
		return userService.doUpdateUserRoles(vo);
	}

	//14
	@RequestMapping("deleteUser")
	public void deleteUser(){
		userService.doDeleteUserRoles("3");
	}

	//15
	@RequestMapping("getRoles")
	public List<RoleVO> getRoles(){
		RoleVO vo = new RoleVO();
		vo.setRolename("admin");
		List<RoleVO> lists = roleService.doFindRoles(vo);
		return lists;
	}

	//16
	@RequestMapping("insertRole")
	public RoleVO insertRole(){
		RoleVO vo = new RoleVO();
		vo.setRolename("角色1");

		List<PermissionVO> list = new ArrayList<>();
		PermissionVO rp = new PermissionVO();
		rp.setPermissionid("2");
		list.add(rp);
		vo.setPermissions(list);

		List<MenuVO> list2 = new ArrayList<>();
		MenuVO rm = new MenuVO();
		rm.setMenuid("1");
		list2.add(rm);
		vo.setMenus(list2);

		return roleService.doInsertRole(vo);
	}

	//17
	@RequestMapping("updateRole")
	public RoleVO updateRole(){
		RoleVO vo = new RoleVO();
		vo.setRoleid("02EAC2EA3BC24D1E8ABE7AA7CA6EB5DA");
		vo.setRoleinfo("没有描述222");

		List<PermissionVO> list = new ArrayList<>();
		PermissionVO p1 = new PermissionVO();
		p1.setPermissionid("4");
		list.add(p1);
		PermissionVO p2 = new PermissionVO();
		p2.setPermissionid("1");
		list.add(p2);
		vo.setPermissions(list);

		List<MenuVO> list2 = new ArrayList<>();
		MenuVO rm = new MenuVO();
		rm.setMenuid("6");
		list2.add(rm);
		vo.setMenus(list2);

		return roleService.doUpdateRole(vo);
	}

	//18
	@RequestMapping("deleteRole")
	public void deleteRole(){
		roleService.doDeleteRole("02EAC2EA3BC24D1E8ABE7AA7CA6EB5DA");
	}

	//19
	@RequestMapping("getPermission")
	public List<PermissionVO> getPermission(){
		PermissionVO vo = new PermissionVO();
		vo.setPermissionid("1");
		return permissionService.doSearchListByVO(vo);
	}

	//20
	@RequestMapping("getPermissions")
	public List<PermissionVO> getPermissions(){
		return permissionService.doSearchListByVO(null);
	}

	//21
	@RequestMapping("insertPermission")
	public int insertPermission(){
		PermissionVO vo = new PermissionVO();
		vo.setPermissionname("test");
		return permissionService.doInsertByVO(vo);
	}

	//22
	@RequestMapping("updatePermission")
	public int updatePermission(){
		PermissionVO vo = new PermissionVO();
		vo.setPermissioninfo("test");
		vo.setPermissionid("C642000235894C129742E44F2A7BEAE8");
		return permissionService.doUpdateByVO(vo);
	}

	//23
	@RequestMapping("deletePermission")
	public int deletePermission(){
		return permissionService.doDeleteById("2E85A37D74314CBDAFA0AC0148F41BA1");
	}

	//24
	@RequestMapping("getMenu")
	public List<MenuVO> getMenu(){
		MenuVO vo = new MenuVO();
		vo.setMenuid("1");
		return menuService.doSearchListByVO(vo);
	}

	//25
	@RequestMapping("getMenus")
	public List<MenuVO> getMenus(){
		return menuService.doSearchListByVO(null);
	}

	//26
	@RequestMapping("insertMenu")
	public int insertMenu(){
		MenuVO vo = new MenuVO();
		vo.setMenuname("权限管理");
		vo.setMenuurl("/test/");
		vo.setIsleaf("0");
		vo.setParentid("-1");
		vo.setSeqno(3);
		return menuService.doInsertByVO(vo);
	}

	//27
	@RequestMapping("updateMenu")
	public int updateMenu(){
		MenuVO vo = new MenuVO();
		vo.setMenuinfo("权限管理总页面");
		vo.setMenuid("25285BA352204C47A1D7536F6631D7BD");
		vo.setIsleaf("0");
		vo.setParentid("-1");
		return menuService.doUpdateByVO(vo);
	}

	//28
	@RequestMapping("deleteMenu")
	public int deleteMenu(){
		return menuService.doDeleteById("25285BA352204C47A1D7536F6631D7BD");
	}

	//29
	@RequestMapping("getMenuByRoleid")
	public List<MenuTree> getMenuByRoleid(){
		return menuService.doFindMenuByRoleid("2");
	}

	//30
	@RequestMapping("getMenuByUser")
	public List<MenuTree> getMenuByUserid(){
		ShiroUser user = CurrentUserUtil.getCurrentUser();
		return menuService.doFindMenusByUser(user);
	}

}
