package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.ResourceVO;
import com.syfri.userservice.service.ResourceService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("resource")
public class ResourceController  extends BaseController<ResourceVO>{

	@Autowired
	private ResourceService resourceService;

	@Override
	public ResourceService getBaseService() {
		return this.resourceService;
	}

}
