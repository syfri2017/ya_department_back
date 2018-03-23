package com.syfri.digitalplan.controller.basicinfo.equipmentsource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipmentsourceVO;
import com.syfri.digitalplan.service.basicinfo.equipmentsource.EquipmentsourceService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("equipmentsource")
public class EquipmentsourceController  extends BaseController<EquipmentsourceVO>{

	@Autowired
	private EquipmentsourceService equipmentsourceService;

	@Override
	public EquipmentsourceService getBaseService() {
		return this.equipmentsourceService;
	}

	@Autowired
	protected Environment environment;

	@ModelAttribute
	public void Model(Model model){
		if (environment.containsProperty("server.context-path")) {
			model.addAttribute("contextPath", environment.getProperty("server.context-path"));
		}else{
			model.addAttribute("contextPath", "/");
		}
	}

	@GetMapping("")
	public String getKeyunitlist(Model model, @RequestParam(value="index") String index){
		model.addAttribute("index", index);
		return "planobject/importantunits_list";
	}

	/**
	 * 查询重点单位列表
	 */
	@ApiOperation(value="根据条件查询重点单位",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
//	@RequiresPermissions("keyunit:list")
	@PostMapping("/findByVO")
	public @ResponseBody
	ResultVO findByVO(@RequestBody EquipmentsourceVO equipmentsourceVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(equipmentsourceService.doFindlist(equipmentsourceVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 跳转到重点单位详情页
	 */
	@ApiOperation(value="跳转到重点单位详情页",notes="页面跳转")
	@GetMapping("/detail/{pkid}")
	public String getDetailPage(Model model, @PathVariable String id){
//		model.addAttribute("index", index);
		model.addAttribute("id", id);
		return "planobject/importantunits_detail";
	}

	/**
	 * 获取重点单位详情
	 */
	@ApiOperation(value="获取重点单位详情",notes="列表信息")
//	@RequiresPermissions("keyunit:list")
	@GetMapping("/doFindDetailById/{id}")
	public @ResponseBody ResultVO getDetail(@PathVariable String id){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(equipmentsourceService.doFindDetailById(id));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
