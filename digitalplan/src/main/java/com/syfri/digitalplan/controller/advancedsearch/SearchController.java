package com.syfri.digitalplan.controller.advancedsearch;

import com.syfri.baseapi.model.ResultVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import com.syfri.baseapi.controller.BaseController;

import com.syfri.digitalplan.service.advancedsearch.SearchService;

@RestController
@RequestMapping("advancedsearch")
public class SearchController  extends BaseController<BuildingVO>{

    @Autowired
    private SearchService searchService;
    private BuildingService buildingService;

    @Override
    public BuildingService getBaseService() {
        return this.buildingService;
    }

    /*
    * 高级搜索查询建筑列表
    * 通过输入框值匹配 建筑名称或建筑位置
    * by yushch 20180516
    */
    @ApiOperation(value="高级搜索查询列表",notes="列表信息")
    @ApiImplicitParam(name="vo",value = "业务实体")
    @PostMapping("gjssList")
    public @ResponseBody ResultVO gjssList(@RequestBody BuildingVO vo ) {
        ResultVO resultVO = ResultVO.build();
        try {
            resultVO.setResult(searchService.doSearchGjssListByVO(vo));
        } catch (Exception e) {
            logger.error("{}",e.getMessage());
        }
        return resultVO;
    }

}
