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
	/**
	 * 获取消防取水码头及天然水源属性信息
	 * by yushch 20180408
	 */
	@ApiOperation(value="通过id获取消防取水码头及天然水源属性信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="消防取水码头")
	@PostMapping("/findById")
	public @ResponseBody ResultVO findById(@RequestBody XfmtVO xfmtVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(xfmtService.doFindXfmtById(xfmtVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
