package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.model.UserRoleVO;
import com.syfri.userservice.utils.CurrentUserUtil;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.UserDAO;
import com.syfri.userservice.model.UserVO;
import com.syfri.userservice.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserVO> implements UserService {

	//指定加密算法为MD5
	private String algorithmName = "MD5";

	//指定加密迭代次数
	private int hashIterations = 1;

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDAO getBaseDAO() {
		return userDAO;
	}

	/*采用MD5对密码进行加密.*/
	@Override
	public UserVO getPasswordEncry(UserVO userVO) {
		RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
		userVO.setSalt(randomNumberGenerator.nextBytes().toHex());
		String newPassword = new SimpleHash(algorithmName, userVO.getPassword(), ByteSource.Util.bytes(userVO.getSalt()),hashIterations).toHex();
		userVO.setPassword(newPassword);
		return userVO;
	}

	/*--查询：根据用户获取用户及其角色--.*/
	@Override
	public List<UserVO> doFindUserRoles(UserVO userVO) {
		return userDAO.doFindUserRoles(userVO);
	}

	/*--新增：增加用户并为用户赋予角色.--*/
	@Transactional
	@Override
	public UserVO doInsertUserRoles(UserVO userVO){
		userVO = this.getPasswordEncry(userVO);
		userVO.setCreateId(CurrentUserUtil.getCurrentUserId());
		userVO.setCreateName(CurrentUserUtil.getCurrentUserName());
		userDAO.doInsertByVO(userVO);
		String userid = userVO.getPkid();
		//向中间表中插入用户的角色
		this.insertUserRolesBatch(userid, userVO.getRoles());
		return userVO;
	}

	/*--修改：修改用户并修改用户角色.--*/
	@Override
	@Transactional(rollbackFor = Exception.class)
	public UserVO doUpdateUserRoles(UserVO userVO){
		//try{
		//修改用户表基本信息
		userDAO.doUpdateByVO(userVO);
		//修改角色中间表信息
		String userid = userVO.getPkid();
		userDAO.doDeleteUserRoles(userid);
		//向中间表中插入用户的角色
		this.insertUserRolesBatch(userid, userVO.getRoles());
//		}catch(Exception e){
//			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//		}
		return userVO;
	}

	/*--删除：删除用户同时删除其角色.--*/
	@Transactional
	@Override
	public void doDeleteUserRoles(String pkid){
		userDAO.doDeleteById(pkid);
		userDAO.doBatchDeleteUserRoles(pkid);
	}

	/*向用户角色中间表批量插入数据.*/
	public int insertUserRolesBatch(String userid, List<RoleVO> roles){
		List<UserRoleVO> userRoles = new ArrayList<>();
		if(roles.size()>0){
			for(RoleVO role : roles){
				UserRoleVO temp = new UserRoleVO();
				temp.setUserid(userid);
				temp.setRoleid(role.getRoleid());
				temp.setCreateId(CurrentUserUtil.getCurrentUserId());
				temp.setCreateName(CurrentUserUtil.getCurrentUserName());
				userRoles.add(temp);
			}
			return userDAO.doBatchInsertUserRoles(userRoles);
		}else{
			return 0;
		}
	}
}