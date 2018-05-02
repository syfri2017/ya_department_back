package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.OrganizationVO;
import com.syfri.userservice.service.OrganizationService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("organization")
public class OrganizationController  extends BaseController<OrganizationVO>{

	@Autowired
	private OrganizationService organizationService;

	@Override
	public OrganizationService getBaseService() {
		return this.organizationService;
	}

}
