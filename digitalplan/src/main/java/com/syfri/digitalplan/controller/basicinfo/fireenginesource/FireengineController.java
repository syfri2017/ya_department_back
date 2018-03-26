package com.syfri.digitalplan.controller.basicinfo.fireenginesource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.digitalplan.model.basicinfo.fireenginesource.FireengineVO;
import com.syfri.digitalplan.service.basicinfo.fireenginesource.FireengineService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("fireengine")
public class FireengineController  extends BaseController<FireengineVO>{

	@Autowired
	private FireengineService fireengineService;

	@Override
	public FireengineService getBaseService() {
		return this.fireengineService;
	}

}
