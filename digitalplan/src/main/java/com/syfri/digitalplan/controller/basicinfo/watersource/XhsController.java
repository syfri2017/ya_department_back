package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.syfri.digitalplan.model.basicinfo.watersource.XhsVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XhsService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xhs")
public class XhsController  extends BaseController<XhsVO>{

	@Autowired
	private XhsService xhsService;

	@Override
	public XhsService getBaseService() {
		return this.xhsService;
	}

}
