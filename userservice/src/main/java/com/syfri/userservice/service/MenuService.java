package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.MenuTree;
import com.syfri.userservice.model.MenuVO;
import com.syfri.userservice.model.ShiroUser;

import java.util.List;

public interface MenuService  extends BaseService<MenuVO>{

	/*根据角色取菜单.*/
	List<MenuTree> doFindMenuByRoleid(String roleid);

	/*根据用户查询菜单.*/
	List<MenuTree> doFindMenusByUser(ShiroUser user);
}