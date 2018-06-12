package com.syfri.digitalplan.controller.basicinfo.firedrugsource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;
import com.syfri.digitalplan.service.basicinfo.firedrugsource.FiredrugService;
import com.syfri.baseapi.controller.BaseController;


@RestController
@RequestMapping("firedrug")
public class FiredrugController  extends BaseController<FiredrugVO>{

	@Autowired
	private FiredrugService firedrugService;

	@Override
	public FiredrugService getBaseService() {
		return this.firedrugService;
	}


}
