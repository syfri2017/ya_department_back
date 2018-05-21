package com.syfri.digitalplan.service.planobject;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;
import java.util.Map;

public interface ImportantunitsService  extends BaseService<ImportantunitsVO>{

    //通过重点单位id 查询包含消防队伍详情
    public List<XiaofangliliangVO> doFindXfllListByZddwId(String zddwId);

    //通过重点单位 查询包含分区详情
    public List<BuildingVO> doFindBuildingDetailsByVo(ImportantunitsVO vo);

    //通过重点单位 查询包含消防设施详情
    public Map<String, List> doFindFireFacilitiesDetailsByVo(ImportantunitsVO vo);
}