package com.syfri.userservice.controller;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.CodelistVO;
import com.syfri.userservice.service.CodelistService;
import com.syfri.baseapi.controller.BaseController;

@Api(value = "代码集",tags = "代码集API",description = "代码集")
@RestController
@RequestMapping("codelist")
public class CodelistController  extends BaseController<CodelistVO>{

	@Autowired
	private CodelistService codelistService;

	@Override
	public CodelistService getBaseService() {
		return this.codelistService;
	}

	/**
	 * 获取所有的代码集类型
	 */
	@ApiOperation(value="获取所有的代码集类型",notes="列表信息")
	@RequiresPermissions("codelist:list")
	@GetMapping("/listByType")
	public @ResponseBody ResultVO listByType(){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(codelistService.doFindCodelistType());
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
