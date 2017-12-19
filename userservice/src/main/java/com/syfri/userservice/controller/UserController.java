package com.syfri.userservice.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.UserVO;
import com.syfri.userservice.service.UserService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("user")
public class UserController  extends BaseController<UserVO>{

	@Autowired
	private UserService userService;

	@Override
	public UserService getBaseService() {
		return this.userService;
	}

	@RequestMapping("/list")
	@RequiresPermissions("list")
	public String userList(){
		return "userList";
	}

	@RequestMapping("/add")
	@RequiresPermissions("add")
	public String userAdd(){
		return "userAdd";
	}

}
