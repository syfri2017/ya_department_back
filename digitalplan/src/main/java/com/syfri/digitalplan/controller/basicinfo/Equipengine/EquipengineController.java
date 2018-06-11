package com.syfri.digitalplan.controller.basicinfo.Equipengine;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipengineVO;
import com.syfri.digitalplan.service.basicinfo.equipmentsource.EquipengineService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("equipengine")
public class EquipengineController  extends BaseController<EquipengineVO>{

	@Autowired
	private EquipengineService equipengineService;

	@Override
	public EquipengineService getBaseService() {
		return this.equipengineService;
	}

}
