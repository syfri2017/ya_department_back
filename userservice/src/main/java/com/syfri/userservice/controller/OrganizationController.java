package com.syfri.userservice.controller;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.userservice.model.OrganizationTree;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.userservice.model.OrganizationVO;
import com.syfri.userservice.service.OrganizationService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

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
	 * 获取所有总队信息
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

	/**
	 * 获取全部机构树
	 */
	@ApiOperation(value="获取全部机构树",notes="查询")
	@PostMapping("/getOrganizationtree")
	public @ResponseBody ResultVO getOrganizationtree(){
		ResultVO resultVO = ResultVO.build();
		try{
			List<OrganizationTree> result = organizationService.doFindAllOrganization();
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 根据id获取组织机构信息
	 */
	@ApiOperation(value="根据id获取组织机构信息",notes="列表信息")
	@GetMapping("/doFindById/{uuid}")
	public @ResponseBody ResultVO doFindDetailById(@PathVariable String uuid){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(organizationService.doFindDetailById(uuid));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
