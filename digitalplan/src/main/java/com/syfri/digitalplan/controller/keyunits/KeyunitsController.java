package com.syfri.digitalplan.controller.keyunits;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.keyunits.KeyunitsVO;
import com.syfri.digitalplan.service.keyunits.KeyunitsService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("keyunits")
public class KeyunitsController  extends BaseController<KeyunitsVO>{

	@Autowired
	private KeyunitsService keyunitsService;

	@Override
	public KeyunitsService getBaseService() {
		return this.keyunitsService;
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

	@ApiOperation(value="根据条件查询重点单位",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
//	@RequiresPermissions("keyunit:list")
	@PostMapping("/findByVO")
	public @ResponseBody
	ResultVO findByVO(@RequestBody KeyunitsVO keyunitsVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(keyunitsService.doFindKeyunitlist(keyunitsVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
