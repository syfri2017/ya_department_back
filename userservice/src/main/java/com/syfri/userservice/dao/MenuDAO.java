	package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

	public interface MenuDAO extends BaseDAO<MenuVO>{

		/*根据角色ID获取菜单.*/
		List<MenuVO> doFindMenuByRoleid(String roleid);

		/*根据父节点获取子菜单.*/
		List<MenuVO> doFindMenusByParentId(String parentId);

		/*根据用户ID、父节点获取菜单*/
		List<MenuVO> doFindMenuByUserid(@Param("userid") String userid, @Param("parentid") String parentid);

		/*根据父节点、角色ID获取子菜单.*/
		List<MenuVO> doFindMenusByPraUserid(@Param("roleid") String roleid, @Param("parentid") String parentid);
}