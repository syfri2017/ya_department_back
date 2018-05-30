package com.syfri.digitalplan.controller.xfbwjw;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.utils.Base64ImageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.xfbwjw.XfbwjwVO;
import com.syfri.digitalplan.service.xfbwjw.XfbwjwService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

@Api(value = "保卫警卫",tags = "保卫警卫",description = "保卫警卫")
@RestController
@RequestMapping("xfbwjw")
public class XfbwjwController extends BaseController<XfbwjwVO>{

	private static final Logger logger  = LoggerFactory.getLogger(XfbwjwController.class);

	@Autowired
	protected Environment environment;

	@Autowired
	private XfbwjwService xfbwjwService;

	@Override
	public XfbwjwService getBaseService() {
		return this.xfbwjwService;
	}
	/**
	 * @Description:
	 * @Param: [model]
	 * @Return: void
	 * @Author: zhaijianchen
	 * @Modified By:
	 * @Date: 2018/4/20 16:37
	 */

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
		return "digitalplan/xfbwjw_list";
	}


	/**
	 * 根据条件获取预案信息
	 */
	@ApiOperation(value="根据条件获取预案信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="预案信息对象")
	@PostMapping("/findByVO")
	public @ResponseBody ResultVO findByVO(@RequestBody XfbwjwVO xfbwjwVO){
		ResultVO resultVO = ResultVO.build();
		try{
			List<XfbwjwVO> result = xfbwjwService.doFindXfbwjwlist(xfbwjwVO);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}


	/**
	 * 根据id获取预案信息
	 */
	@ApiOperation(value="根据id获取预案信息",notes="列表信息")
	@GetMapping("/doFindById/{pkid}")
	public @ResponseBody ResultVO getDetail(@PathVariable String pkid){
		ResultVO resultVO = ResultVO.build();
		try{
			XfbwjwVO xfbwjwVO = xfbwjwService.doFindDetailById(pkid);
			String photo64 = Base64ImageUtil.byteArr2String(xfbwjwVO.getPhoto());
			xfbwjwVO.setPhoto64(photo64);
			resultVO.setResult(xfbwjwVO);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
