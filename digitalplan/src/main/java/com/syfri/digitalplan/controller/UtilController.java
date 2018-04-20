package com.syfri.digitalplan.controller;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.UtilXfdzVO;
import com.syfri.digitalplan.service.UtilService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("util")
public class UtilController  extends BaseController<UtilXfdzVO>{

	@Autowired
	private UtilService utilService;

	@Override
	public UtilService getBaseService() {
		return this.utilService;
	}

	/**
	 * 查询到消防总队
	 */
	@ApiOperation(value="查询到消防总队",notes="下拉列表信息")
	@ApiImplicitParam(name="vo",value="消防总队对象")
	@GetMapping("/doSearchContingents")
	public @ResponseBody ResultVO doSearchContingents(){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(utilService.doSearchContingents());
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
