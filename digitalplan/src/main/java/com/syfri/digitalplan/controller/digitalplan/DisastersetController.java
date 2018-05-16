package com.syfri.digitalplan.controller.digitalplan;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.digitalplan.DisastersetVO;
import com.syfri.digitalplan.service.digitalplan.DisastersetService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("disasterset")
public class DisastersetController  extends BaseController<DisastersetVO>{

	@Autowired
	private DisastersetService disastersetService;

	@Override
	public DisastersetService getBaseService() {
		return this.disastersetService;
	}

	/**
	 * 根据预案id查询
	 */
	@ApiOperation(value="根据id获取预案信息",notes="列表信息")
	@GetMapping("/doFindByPlanId/{yaid}")
	public @ResponseBody
	ResultVO getDetail(@PathVariable String yaid){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(disastersetService.doFindByPlanId(yaid));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
