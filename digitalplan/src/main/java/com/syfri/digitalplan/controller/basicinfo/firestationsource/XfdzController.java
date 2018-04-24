package com.syfri.digitalplan.controller.basicinfo.firestationsource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.digitalplan.model.basicinfo.firestationsource.XfdzVO;
import com.syfri.digitalplan.service.basicinfo.firestationsource.XfdzService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xfdz")
public class XfdzController  extends BaseController<XfdzVO>{

	@Autowired
	private XfdzService xfdzService;

	@Override
	public XfdzService getBaseService() {
		return this.xfdzService;
	}

}
