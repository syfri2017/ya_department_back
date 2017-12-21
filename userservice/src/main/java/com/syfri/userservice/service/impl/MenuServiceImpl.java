package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.MenuTree;
import com.syfri.userservice.model.ShiroUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.MenuDAO;
import com.syfri.userservice.model.MenuVO;
import com.syfri.userservice.service.MenuService;

import java.util.ArrayList;
import java.util.List;

@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<MenuVO> implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	public MenuDAO getBaseDAO() {
		return menuDAO;
	}

	/**
	 * 根据角色取菜单.
	 */
	@Override
	public List<MenuTree> doFindMenuByRoleid(String roleid){

		//根据用户角色获取父菜单
		List<MenuVO> parentMenus = menuDAO.doFindMenuByRoleid(roleid);

		return this.doGetParent(roleid, parentMenus);
	}

	/**
	 * 根据用户查询菜单
	 */
	@Override
	public List<MenuTree> doFindMenusByUser(ShiroUser user){

		//根据用户角色获取父菜单
		List<MenuVO> parentMenus = menuDAO.doFindMenuByUserid(user.getUserid(), "-1");

		//获取子菜单
		List<MenuTree> trees = new ArrayList<>();
		//获取子菜单
		if(parentMenus.size()>0){
			for(MenuVO menu : parentMenus){
				MenuTree tree = this.doMenuToMenuTree(menu);

				List<MenuTree> children = new ArrayList<>();
				List<MenuVO> temps = menuDAO.doFindMenuByUserid(user.getUserid(), menu.getMenuid());
				if(temps.size()>0){
					for(MenuVO temp : temps){
						MenuTree child = this.doMenuToMenuTree(temp);
						children.add(child);
					}
				}
				tree.setChildren(children);
				trees.add(tree);
			}
		}
		return trees;
	}

	/**
	 * 将MenuVO对象转换成MenuTree对象
	 */
	public MenuTree doMenuToMenuTree(MenuVO menu){
		MenuTree tree = new MenuTree();
		tree.setMenuid(menu.getMenuid());
		tree.setMenuname(menu.getMenuname());
		tree.setMenuurl(menu.getMenuurl());
		tree.setMenuinfo(menu.getMenuinfo());
		tree.setSeqno(menu.getSeqno());
		return tree;
	}

	/**
	 * 根据角色ID获取MenuTree
	 */
	public List<MenuTree> doGetParent(String roleid, List<MenuVO> parentMenus){
		List<MenuTree> trees = new ArrayList<>();
		//获取子菜单
		if(parentMenus.size()>0){
			for(MenuVO menu : parentMenus){
				MenuTree tree = this.doMenuToMenuTree(menu);

				List<MenuTree> children = new ArrayList<>();
				List<MenuVO> temps = menuDAO.doFindMenusByPraUserid(roleid, menu.getMenuid());
				if(temps.size()>0){
					for(MenuVO temp : temps){
						MenuTree child = this.doMenuToMenuTree(temp);
						children.add(child);
					}
				}
				tree.setChildren(children);
				trees.add(tree);
			}
		}
		return trees;
	}
}