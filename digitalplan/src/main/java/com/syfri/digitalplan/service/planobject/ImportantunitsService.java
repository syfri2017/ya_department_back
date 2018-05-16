package com.syfri.digitalplan.service.planobject;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;

public interface ImportantunitsService  extends BaseService<ImportantunitsVO>{

    //通过重点单位 查询包含分区详情
    public List<BuildingVO> doFindBuildingDetailsByVo(ImportantunitsVO vo);
}