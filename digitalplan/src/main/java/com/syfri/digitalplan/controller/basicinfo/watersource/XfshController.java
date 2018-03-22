package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.XfshVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfshService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xfsh")
public class XfshController  extends BaseController<XfshVO>{

	@Autowired
	private XfshService xfshService;

	@Override
	public XfshService getBaseService() {
		return this.xfshService;
	}
	@ApiOperation(value="通过id获取消防水鹤信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="消防水鹤")
	@PostMapping("/findById")
	public @ResponseBody
	ResultVO findById(@RequestBody XfshVO xfshVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(xfshService.doFindXfshById(xfshVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
