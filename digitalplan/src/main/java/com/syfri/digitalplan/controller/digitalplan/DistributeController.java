package com.syfri.digitalplan.controller.digitalplan;

import com.syfri.baseapi.controller.BaseController;
import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.model.digitalplan.DistributeVO;
import com.syfri.digitalplan.service.digitalplan.DistributeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("distribute")
public class DistributeController  extends BaseController<DistributeVO> {

	@Autowired
	private DistributeService distributeService;

	@Override
	public DistributeService getBaseService() {
		return this.distributeService;
	}

	/**
	 * 获取所有总队信息
	 */
	@ApiOperation(value="获取所有总队",notes="列表信息")
	@PostMapping("/distribute")
	public @ResponseBody ResultVO distribute(@RequestBody DistributeVO distributeVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(distributeService.doInsertDistributeVO(distributeVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 获取已经分发的总队信息
	 */
	@ApiOperation(value="获取已经分发的总队信息",notes="列表信息")
	@GetMapping("/doFindFfzd/{yaid}")
	public @ResponseBody ResultVO doFindFfzd(@PathVariable String yaid){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(distributeService.doFindFfzd(yaid));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
