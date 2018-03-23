package com.syfri.digitalplan.controller.basicinfo.watersource;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.watersource.ShuiyuanVO;
import com.syfri.digitalplan.service.basicinfo.watersource.ShuiyuanService;
import com.syfri.baseapi.controller.BaseController;

import java.util.List;

@Api(value = "水源管理",tags = "水源管理API",description = "水源管理")
@Controller
@RequestMapping("shuiyuan")
public class ShuiyuanController  extends BaseController<ShuiyuanVO>{

	@Autowired
	private ShuiyuanService shuiyuanService;

	@Override
	public ShuiyuanService getBaseService() {
		return this.shuiyuanService;
	}

	/**
	 * 获取水源信息及机构名称
	 */
	@ApiOperation(value="获取水源信息及机构名称",notes="列表信息")
	@ApiImplicitParam(name="vo",value="水源对象")
	@PostMapping("/findByVO")
	public @ResponseBody ResultVO list(@RequestBody ShuiyuanVO shuiyuanVO ) {
		ResultVO resultVO = ResultVO.build();
		try {
			resultVO.setResult(shuiyuanService.doFindShuiyuanList(shuiyuanVO));
		} catch (Exception e) {
			logger.error("{}",e.getMessage());
		}
		return resultVO;
	}

	/**
	 * 获取水源信息及水源类型属性信息
	 */
	@ApiOperation(value="通过id获取水源信息及水源类型属性信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="水源对象")
	@PostMapping("/findById")
	public @ResponseBody ResultVO findById(@RequestBody ShuiyuanVO shuiyuanVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(shuiyuanService.doFindShuiyuanById(shuiyuanVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
	@RequestMapping("find")
	public List<ShuiyuanVO> find(){
		ShuiyuanVO shuiyuanVO = new ShuiyuanVO();
		return shuiyuanService.doSearchListByVO(shuiyuanVO);
	}
}
