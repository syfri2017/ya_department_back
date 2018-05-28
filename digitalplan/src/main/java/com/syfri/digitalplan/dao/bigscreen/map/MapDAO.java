package com.syfri.digitalplan.dao.bigscreen.map;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.bigscreen.map.MapVO;

import java.util.List;

public interface MapDAO extends BaseDAO<MapVO>{

    public List<MapVO> getMapByVO(MapVO vo);
    public List<MapVO> getShiMapByVO(MapVO vo);
    public List<MapVO> getImportantunitsVO(MapVO vo);
}