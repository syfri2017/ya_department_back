package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.XfsyVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfsyService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("xfsy")
public class XfsyController  extends BaseController<XfsyVO>{

	@Autowired
	private XfsyService xfsyService;

	@Override
	public XfsyService getBaseService() {
		return this.xfsyService;
	}

	/**
	 * 获取水源信息及水源类型属性信息
	 * by yushch 20180418
	 */
	@ApiOperation(value="通过id获取水源信息及水源类型属性信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="水源对象")
	@PostMapping("/findSyAndSxByVo")
	public @ResponseBody ResultVO findById(@RequestBody XfsyVO xfsyVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(xfsyService.doFindSyAndSxByVo(xfsyVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 获取水源列表 关联不同从表
	 * by yushch 20180419
	 */
	@ApiOperation(value="查询列表",notes="列表信息")
	@ApiImplicitParam(name="vo",value = "水源对象")
	@PostMapping("findlist")
	public @ResponseBody ResultVO list(@RequestBody XfsyVO xfsyVO) {
		ResultVO resultVO = ResultVO.build();
		try {
			resultVO.setResult(xfsyService.doFindListByVO(xfsyVO));
		} catch (Exception e) {
			logger.error("{}",e.getMessage());
		}
		return resultVO;
	}

}
