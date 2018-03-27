package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.XfmtVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfmtService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xfmt")
public class XfmtController  extends BaseController<XfmtVO>{

	@Autowired
	private XfmtService xfmtService;

	@Override
	public XfmtService getBaseService() {
		return this.xfmtService;
	}
}
