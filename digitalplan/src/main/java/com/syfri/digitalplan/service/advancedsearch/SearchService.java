package com.syfri.digitalplan.service.advancedsearch;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;

public interface SearchService{
    //单位建筑
    public List<BuildingVO> doSearchGjssDwjzListByVO(BuildingVO vo);
    //预案信息
    public List<DigitalplanlistVO> doSearchGjssYaxxListByVO(DigitalplanlistVO vo);
    //预案对象信息
    public List<ImportantunitsVO> doSearchGjssYadxListByVO(ImportantunitsVO vo);
}