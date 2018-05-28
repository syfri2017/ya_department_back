package com.syfri.digitalplan.service.bigscreen.map;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.bigscreen.map.MapVO;

import java.util.List;

public interface MapService  extends BaseService<MapVO>{

    public List<MapVO> getMapByVO(MapVO vo);
    public List<MapVO> getShiMapByVO(MapVO vo);
    public List<MapVO> getImportantunitsVO(MapVO vo);


}