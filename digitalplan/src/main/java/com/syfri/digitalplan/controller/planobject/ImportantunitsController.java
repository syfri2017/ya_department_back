package com.syfri.digitalplan.controller.planobject;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.dao.planobject.ImportantunitsDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.planobject.ImportantunitsVO;
import com.syfri.digitalplan.service.planobject.ImportantunitsService;
import com.syfri.baseapi.controller.BaseController;
import java.util.List;

@RestController
@RequestMapping("importantunits")
public class ImportantunitsController  extends BaseController<ImportantunitsVO>{

	@Autowired
	private ImportantunitsService importantunitsService;


	@Override
	public ImportantunitsService getBaseService() {
		return this.importantunitsService;
	}

	/**
	 * author lxy
	 *
	 */
	@ApiOperation(value="通过重点单位 查询包含分区详情",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
	@PostMapping("/doSearchListByVO")
	public @ResponseBody ResultVO doSearchListByVO(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			List<ImportantunitsVO> result= importantunitsService.doSearchListByVO(vo);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 通过重点单位 查询包含消防队伍详情
	 */
	@ApiOperation(value="通过重点单位 查询包含消防队伍详情",notes="列表信息")
	@ApiImplicitParam(name="zddwId",value="重点单位id")
	@GetMapping("/doFindXfllListByZddwId/{zddwId}")
	public @ResponseBody ResultVO doFindXfllListByZddwId(@PathVariable String zddwId){
		ResultVO resultVO = ResultVO.build();
		try{
			List<XiaofangliliangVO> result= importantunitsService.doFindXfllListByZddwId(zddwId);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 通过重点单位 查询包含分区详情
	 */
	@ApiOperation(value="通过重点单位 查询包含分区详情",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
	@PostMapping("/doFindBuildingDetailsByVo")
	public @ResponseBody ResultVO doFindBuildingDetailsByVo(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			List<BuildingVO> result= importantunitsService.doFindBuildingDetailsByVo(vo);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 通过重点单位 查询包含消防设施详情
	 */
	@ApiOperation(value="通过重点单位 查询包含消防设施详情",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
	@PostMapping("/doFindFireFacilitiesDetailsByVo")
	public @ResponseBody ResultVO doFindFireFacilitiesDetailsByVo(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(importantunitsService.doFindFireFacilitiesDetailsByVo(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * author lxy
	 * @param vo
	 * @return
	 */
	@PostMapping("/doSearchZddwListByVO")
	public @ResponseBody ResultVO doSearchZddwListByVO(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(importantunitsService.doSearchZddwListByVO(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 通过重点单位ID查询建筑详细信息
	 * by li.xue 2018/8/16
	 */
	@ApiOperation(value="通过重点单位ID查询建筑详细信息",notes="列表信息")
	@ApiImplicitParam(name="String",value="重点单位对象ID")
	@GetMapping("/doFindJzxxDetailByZddwId/{zddwId}")
	public @ResponseBody ResultVO getJzxxDetailByZddwId(@PathVariable String zddwId) {
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(importantunitsService.doFindJzxxDetailByZddwId(zddwId));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
	/**
	 * 通过重点单位Gis坐标 查询周围1公里水源信息
	 * by liurui 2018/9/20
	 */
	@ApiOperation(value="通过重点单位Gis坐标 查询周围1公里水源信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="水源")
	@PostMapping("/doFindXfsyListByZddwGis")
	public @ResponseBody ResultVO doFindXfsyListByZddwGis(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(importantunitsService.doFindXfsyListByZddwGis(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
	/**
	 * 通过重点单位Gis坐标 查询周围1公里车辆信息
	 * by liurui 2018/9/20
	 */
	@ApiOperation(value="通过重点单位Gis坐标 查询周围1公里车辆信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="车辆")
	@PostMapping("/doFindXfclListByZddwGis")
	public @ResponseBody ResultVO doFindXfclListByZddwGis(@RequestBody ImportantunitsVO vo) {
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(importantunitsService.doFindXfclListByZddwGis(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
