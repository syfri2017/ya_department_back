package com.syfri.digitalplan.service.buildingzoning;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;

import java.util.List;

public interface BuildingService  extends BaseService<BuildingVO>{
    //通过id获取建筑分区信息及分类信息
     public BuildingVO doFindFqDetailByVo(BuildingVO buildingVO);
    //通过罐组id 获取罐组中所有储罐信息
  //  public List<ChuguanVO> doFindChuGuanList(ChuguanVO vo);
    //高级搜索查询建筑列表
    public List<BuildingVO> doSearchGjssListByVO(BuildingVO vo);
    //高级搜索查询建筑类建筑列表
    public List<BuildingVO> doSearchGjssJzlListByVO(BuildingVO vo);
}