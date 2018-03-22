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

	@ApiOperation(value="通过id获取消防水池信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="消防水池")
	@PostMapping("/findById")
	public @ResponseBody
	ResultVO findById(@RequestBody XfscVO xfscVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(xfscService.doFindXfscById(xfscVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
