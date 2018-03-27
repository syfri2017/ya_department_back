package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.XfscVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfscService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xfsc")
public class XfscController  extends BaseController<XfscVO>{

	@Autowired
	private XfscService xfscService;

	@Override
	public XfscService getBaseService() {
		return this.xfscService;
	}
}
