package com.syfri.digitalplan.service.impl.bigscreen.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.bigscreen.map.MapDAO;
import com.syfri.digitalplan.model.bigscreen.map.MapVO;
import com.syfri.digitalplan.service.bigscreen.map.MapService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("mapService")
public class MapServiceImpl extends BaseServiceImpl<MapVO> implements MapService {

	@Autowired
	private MapDAO mapDAO;

	@Override
	public MapDAO getBaseDAO() {
		return mapDAO;
	}

	@Override
	public List<MapVO> getMapByVO(MapVO vo) {
		return this.mapDAO.getMapByVO(vo);
	}
	@Override
	public List<MapVO> getShiMapByVO(MapVO vo){
		return this.mapDAO.getShiMapByVO(vo);
	}
	@Override
	public List<MapVO> getImportantunitsVO(MapVO vo){
		return this.mapDAO.getImportantunitsVO(vo);
	}


}