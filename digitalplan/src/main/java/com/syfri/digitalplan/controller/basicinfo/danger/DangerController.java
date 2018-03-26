package com.syfri.digitalplan.controller.basicinfo.danger;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;
import com.syfri.digitalplan.service.basicinfo.danger.DangerService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

@RestController
@RequestMapping("danger")
public class DangerController  extends BaseController<DangerVO>{

	@Autowired
	protected Environment environment;

	@Autowired
	private DangerService dangerService;

	@Override
	public DangerService getBaseService() {
		return this.dangerService;
	}

	@ModelAttribute
	public void Model(Model model){
		if (environment.containsProperty("server.context-path")) {
			model.addAttribute("contextPath", environment.getProperty("server.context-path"));
		}else{
			model.addAttribute("contextPath", "/");
		}
	}

	@GetMapping("")
	public String getUser(Model model, @RequestParam(value="index") String index){
		model.addAttribute("index", index);
		return "digitalplan/digitalplan_list";
	}

	/**
	 * 根据条件获取化学危险品信息
	 */
	@ApiOperation(value="根据条件获取化学危险品信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="化学危险品对象")
	@PostMapping("/findByVO")
	public @ResponseBody ResultVO findByVO(@RequestBody DangerVO dangerVO){
		ResultVO resultVO = ResultVO.build();
		try{
			List<DangerVO> result = dangerService.doSearchListByVO(dangerVO);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	@ApiOperation(value="根据id获取化学危险品信息",notes="列表信息")
	@GetMapping("/doFindById/{ID}")
	public @ResponseBody ResultVO getDetail(@PathVariable String ID){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(dangerService.doFindById(ID));
		}catch (Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}


}
