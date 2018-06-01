package com.syfri.digitalplan.controller.basicinfo.firestationsource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

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

	/**
	 * 通过队站vo获取队站详细信息
	 * by yushch 20180531
	 */
	@ApiOperation(value="通过队站vo获取队站详细信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="队站对象")
	@PostMapping("/findDzDetailByVo")
	public @ResponseBody ResultVO findById(@RequestBody XfdzVO xfdzVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(xfdzService.doFindDzDetailByVo(xfdzVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
