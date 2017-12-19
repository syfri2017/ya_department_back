package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.service.RoleService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("role")
public class RoleController  extends BaseController<RoleVO>{

	@Autowired
	private RoleService roleService;

	@Override
	public RoleService getBaseService() {
		return this.roleService;
	}

}
