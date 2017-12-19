package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.UserRoleVO;
import com.syfri.userservice.model.UserVO;

import java.util.List;

public interface UserDAO extends BaseDAO<UserVO>{

	/*获取用户，如果userVO为null，则获取所有用户.*/
	List<UserVO> doFindUserRoles(UserVO userVO);

	/*新增用户时批量插入用户角色.*/
	int doBatchInsertUserRoles(List<UserRoleVO> userRoles);

	/*修改用户时删除用户中间表数据*/
	int doDeleteUserRoles(String userid);

	/*修改用户时修改用户中间表数据*/
	int doBatchDeleteUserRoles(String userid);

}