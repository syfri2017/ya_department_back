package com.syfri.digitalplan.controller.buildingzoning;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import com.syfri.digitalplan.utils.Base64ImageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("building")
public class BuildingController  extends BaseController<BuildingVO>{

	@Autowired
	private BuildingService buildingService;

	@Override
	public BuildingService getBaseService() {
		return this.buildingService;
	}

	/**
	 * 通过id获取建筑分区信息及分类信息
	 * by yushch 20180501
	 */
	@ApiOperation(value="通过id获取建筑分区信息及分类信息",notes="查询一条信息")
	@ApiImplicitParam(name="vo",value="建筑分区对象")
	@PostMapping("/findFqDetailByVo")
	public @ResponseBody ResultVO findById(@RequestBody BuildingVO buildingVO){
		ResultVO resultVO = ResultVO.build();
		try{
			BuildingVO vo = buildingService.doFindFqDetailByVo(buildingVO);
			//将二进制转为Base64格式字符串
			String photo64 = Base64ImageUtil.byteArr2String(vo.getPhoto());
			vo.setPhoto64(photo64);
			resultVO.setResult(vo);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

}
