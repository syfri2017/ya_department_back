package com.syfri.digitalplan.controller.bigscreen.map;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.bigscreen.map.MapVO;
import com.syfri.digitalplan.service.bigscreen.map.MapService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

@RestController
@RequestMapping("map")
public class MapController  extends BaseController<MapVO>{

	@Autowired
	private MapService mapService;

	@Override
	public MapService getBaseService() {
		return this.mapService;
	}

	/**
	 * 通过MapVO获取列表
	 *
	 */
	@ApiOperation(value="通过MapVO获取列表",notes="查询")
	@ApiImplicitParam(name="vo",value="map对象")
	@PostMapping("/getMapByVO")
	public @ResponseBody ResultVO getMapByVO(@RequestBody MapVO vo){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(mapService.getMapByVO(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	@PostMapping("/getShiMapByVO")
	public @ResponseBody ResultVO getShiMapByVO(@RequestBody MapVO vo){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(mapService.getShiMapByVO(vo));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}


}
