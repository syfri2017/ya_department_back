package com.syfri.digitalplan.controller.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import com.syfri.digitalplan.model.digitalplan.Digitalplan_distributeVO;
import com.syfri.digitalplan.service.digitalplan.Digitalplan_distributeService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("digitalplan_distribute")
public class Digitalplan_distributeController  extends BaseController<Digitalplan_distributeVO>{

	@Autowired
	private Digitalplan_distributeService digitalplan_distributeService;

	@Override
	public Digitalplan_distributeService getBaseService() {
		return this.digitalplan_distributeService;
	}

}
