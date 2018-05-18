package com.syfri.digitalplan.service.buildingzoning;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;

import java.util.List;

public interface BuildingService  extends BaseService<BuildingVO>{
    //通过id获取建筑分区信息及分类信息
     public BuildingVO doFindFqDetailByVo(BuildingVO buildingVO);

}