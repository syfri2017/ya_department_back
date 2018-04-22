package com.syfri.digitalplan.controller.basicinfo.equipstocksource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.equipstocksource.EquipstocksourceVO;
import com.syfri.digitalplan.service.basicinfo.equipstocksource.EquipstocksourceService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("equipstocksource")
public class EquipstocksourceController  extends BaseController<EquipstocksourceVO>{

	@Autowired
	private EquipstocksourceService equipstocksourceService;

	@Override
	public EquipstocksourceService getBaseService() {
		return this.equipstocksourceService;
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
	 * @Description:查询装备器材库存列表
	 * @Param: [equipstocksourceVO]
	 * @Return: com.syfri.baseapi.model.ResultVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/22 21:21
	 */
	@ApiOperation(value="根据条件查询重点单位",notes="列表信息")
	@ApiImplicitParam(name="vo",value="重点单位对象")
//	@RequiresPermissions("keyunit:list")
	@PostMapping("/findByVO")
	public @ResponseBody
	ResultVO findByVO(@RequestBody EquipstocksourceVO equipstocksourceVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(equipstocksourceService.doFindlist(equipstocksourceVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * @Description:跳转到装备库存详情页
	 * @Param: [model, id]
	 * @Return: java.lang.String
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/22 21:22
	 */
	@ApiOperation(value="跳转到装备库存详情页",notes="页面跳转")
	@GetMapping("/detail/{pkid}")
	public String getDetailPage(Model model, @PathVariable String id){
//		model.addAttribute("index", index);
		model.addAttribute("id", id);
		return "equipstocksource/equipstocksource_detail";
	}

	/**
	 * @Description:获取装备库存详情
	 * @Param: [id]
	 * @Return: com.syfri.baseapi.model.ResultVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/22 21:24
	 */
	@ApiOperation(value="获取重点装备库存",notes="列表信息")
//	@RequiresPermissions("keyunit:list")
	@GetMapping("/doFindDetailById/{id}")
	public @ResponseBody ResultVO getDetail(@PathVariable String id){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(equipstocksourceService.doFindDetailById(id));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
