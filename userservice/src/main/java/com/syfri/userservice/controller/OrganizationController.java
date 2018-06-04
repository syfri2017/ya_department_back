package com.syfri.userservice.controller;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.userservice.model.OrganizationVO;
import com.syfri.userservice.service.OrganizationService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("organization")
public class OrganizationController  extends BaseController<OrganizationVO>{

	@Autowired
	private OrganizationService organizationService;

	@Override
	public OrganizationService getBaseService() {
		return this.organizationService;
	}

	/**
	 * 根据权限获取资源信息
	 */
	@ApiOperation(value="获取所有总队",notes="列表信息")
//	@RequiresPermissions("organization:list")
	@GetMapping("/getZongdui")
	public @ResponseBody ResultVO getZongdui(){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(organizationService.getZongdui());
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
