package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.PermissionVO;
import com.syfri.userservice.service.PermissionService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("permission")
public class PermissionController  extends BaseController<PermissionVO>{

	@Autowired
	private PermissionService permissionService;

	@Override
	public PermissionService getBaseService() {
		return this.permissionService;
	}

}
