package com.syfri.digitalplan.controller;

import com.syfri.baseapi.controller.BaseController;
import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.model.DigitalplanlistVO;
import com.syfri.digitalplan.service.DigitalplanlistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.core.env.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "预案管理",tags = "预案管理API",description = "预案管理")
@Controller
@RequestMapping("digitalplanlist")
public class DigitalplanlistController  extends BaseController<DigitalplanlistVO>{

	private static final Logger logger  = LoggerFactory.getLogger(DigitalplanlistController.class);

	@Autowired
	protected Environment environment;

	@Autowired
	private DigitalplanlistService digitalplanlistService;

	@Override
	public DigitalplanlistService getBaseService() {
		return this.digitalplanlistService;
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
	 * 根据条件获取预案信息
	 */
	@ApiOperation(value="根据条件获取预案信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="预案信息对象")
	@RequestMapping("/findByVO")
	public @ResponseBody ResultVO findByVO( DigitalplanlistVO digitalplanlistVO){
		ResultVO resultVO = ResultVO.build();
		try{
			List s=digitalplanlistService.doSearchListByVO(digitalplanlistVO);
			System.out.print(s.size());
			resultVO.setResult(s);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 获取所有的代码集类型
	 */
	@ApiOperation(value="获取所有的代码集类型",notes="列表信息")
	@GetMapping("/doFindById/{pkid}")
	public @ResponseBody ResultVO getDetail(@PathVariable String pkid){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(digitalplanlistService.doFindById(pkid));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
