package com.syfri.digitalplan.controller.buildingzoning;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("building")
public class BuildingController  extends BaseController<BuildingVO>{

	@Autowired
	private BuildingService buildingService;

	@Override
	public BuildingService getBaseService() {
		return this.buildingService;
	}

	/**
	 * 通过id获取建筑分区信息及分类信息
	 * by yushch 20180501
	 */
	@ApiOperation(value="通过id获取建筑分区信息及分类信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="建筑分区对象")
	@PostMapping("/findFqDetailByVo")
	public @ResponseBody ResultVO findById(@RequestBody BuildingVO buildingVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(buildingService.doFindFqDetailByVo(buildingVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}


	/*
	* 高级搜索查询建筑列表
	* 通过输入框值匹配 建筑名称或建筑位置
	* by yushch 20180516
	*/
	@ApiOperation(value="高级搜索查询列表",notes="列表信息")
	@ApiImplicitParam(name="vo",value = "业务实体")
	@PostMapping("gjssList")
	public @ResponseBody ResultVO gjssList(@RequestBody BuildingVO vo ) {
		ResultVO resultVO = ResultVO.build();
		try {
			resultVO.setResult(buildingService.doSearchGjssListByVO(vo));
		} catch (Exception e) {
			logger.error("{}",e.getMessage());
		}
		return resultVO;
	}

}
