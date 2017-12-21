package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.PermissionVO;

import java.util.List;

public interface PermissionDAO extends BaseDAO<PermissionVO>{

	/*根据角色ID取权限.*/
	List<PermissionVO> doFindPermissionByRoleid(String roleid);
}