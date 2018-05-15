package com.syfri.digitalplan.controller.digitalplan;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.service.digitalplan.DigitalplanlistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;
/*
 * 获取路径Controller
 * by dongbo 2018/03/26
 */
@Api(value = "预案管理",tags = "预案管理API",description = "预案管理")
@RestController
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

	/*
	* 预案审批
	* by yuahch 20180426
	*/
	@ApiOperation(value="预案审批",notes="修改")
	@ApiImplicitParam(name="vo",value="预案")
	@PostMapping("/approveByVO")
	public @ResponseBody ResultVO updateByVO(@RequestBody DigitalplanlistVO digitalplanlistVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(digitalplanlistService.doApproveUpdate(digitalplanlistVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/***
	 * @Description: 新增预案
	 * @Param: [DigitalplanlistVO]
	 * @Return: com.syfri.baseapi.model.ResultVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/5/2 15:51
	 */
	@ApiOperation(value="根据预案新增预案",notes="新增")
	@ApiImplicitParam(name="vo",value="预案对象")
	@RequiresPermissions("digitalplan:add")
	@PostMapping("/insertByVO")
	public @ResponseBody ResultVO insertByVO(@RequestBody DigitalplanlistVO digitalplanlistVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(digitalplanlistService.doInsertDigitalplan(digitalplanlistVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * @Description: 修改预案
	 * @Param: [DigitalplanlistVO]
	 * @Return: com.syfri.baseapi.model.ResultVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/5/2 15:52
	 */
	@ApiOperation(value="根据预案修改预案",notes="修改")
	@ApiImplicitParam(name="vo",value="预案对象")
	@RequiresPermissions("digitalplan:update")
	@PostMapping("/doUpdateByVO")
	public @ResponseBody ResultVO doUpdateByVO(@RequestBody DigitalplanlistVO digitalplanlistVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(digitalplanlistService.doUpdateDigitalplan(digitalplanlistVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
