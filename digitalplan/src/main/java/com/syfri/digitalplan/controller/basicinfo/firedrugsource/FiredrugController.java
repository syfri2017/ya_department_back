package com.syfri.digitalplan.controller.basicinfo.firedrugsource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;
import com.syfri.digitalplan.service.basicinfo.firedrugsource.FiredrugService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

@RestController
@RequestMapping("firedrug")
public class FiredrugController  extends BaseController<FiredrugVO>{

	@Autowired
	private FiredrugService firedrugService;

	@Override
	public FiredrugService getBaseService() {
		return this.firedrugService;
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
	public String getFiredruglist(Model model, @RequestParam(value="index") String index){
		model.addAttribute("index", index);
		return "firedrug/firedrug_list";
	}

	/**
	 * @Description:查询消防药剂列表
	 * @Param: [firedrugVO]
	 * @Return: com.syfri.baseapi.model.ResultVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/22 21:18
	 */
	@ApiOperation(value="根据条件查询消防药剂",notes="列表信息")
	@ApiImplicitParam(name="vo",value="消防药剂对象")
//	@RequiresPermissions("firedrug:list")
	@PostMapping("/findByVO")
	public @ResponseBody
	ResultVO findByVO(@RequestBody FiredrugVO firedrugVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(firedrugService.doFindlist(firedrugVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
