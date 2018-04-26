package com.syfri.digitalplan.controller.planobject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.digitalplan.model.planobject.OtherobjectsVO;
import com.syfri.digitalplan.service.planobject.OtherobjectsService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("otherobjects")
public class OtherobjectsController  extends BaseController<OtherobjectsVO>{

	@Autowired
	private OtherobjectsService otherobjectsService;

	@Override
	public OtherobjectsService getBaseService() {
		return this.otherobjectsService;
	}

}
