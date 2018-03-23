package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.TrsyVO;
import com.syfri.digitalplan.service.basicinfo.watersource.TrsyService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("trsy")
public class TrsyController  extends BaseController<TrsyVO>{

	@Autowired
	private TrsyService trsyService;

	@Override
	public TrsyService getBaseService() {
		return this.trsyService;
	}
	@ApiOperation(value="通过id获取天然水源信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="天然水源对象")
	@PostMapping("/findById")
	public @ResponseBody
	ResultVO findById(@RequestBody TrsyVO trsyVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(trsyService.doFindTrsyById(trsyVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
