package com.syfri.digitalplan.service.impl.planobject;

import com.syfri.digitalplan.model.firefacilities.FirefacilitiesVO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.planobject.ImportantunitsDAO;
import com.syfri.digitalplan.dao.buildingzoning.BuildingDAO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.service.planobject.ImportantunitsService;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import com.syfri.digitalplan.service.firefacilities.FirefacilitiesService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("importantunitsService")
public class ImportantunitsServiceImpl extends BaseServiceImpl<ImportantunitsVO> implements ImportantunitsService {

	@Autowired
	private ImportantunitsDAO importantunitsDAO;
	@Autowired
	private BuildingDAO buildingDAO;
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private FirefacilitiesService firefacilitiesService;

	@Override
	public ImportantunitsDAO getBaseDAO() {
		return importantunitsDAO;
	}

	//通过重点单位 查询包含消防队伍详情
	@Override
	public List<XiaofangliliangVO> doFindXfllListByZddwId(String zddwId) {
		return this.importantunitsDAO.doFindXfllListByZddwId(zddwId);
	}

	//通过重点单位 查询包含分区详情
	@Override
	public List<BuildingVO> doFindBuildingDetailsByVo(ImportantunitsVO vo) {
		List<BuildingVO> resultList = new ArrayList<>();
		String zddwid = vo.getUuid();
		String fqlx = vo.getJzfl();
		List<String> list = this.buildingDAO.doFindFqidListByZddwid(zddwid);
		for(String fqid : list){
			BuildingVO buildingVO = new BuildingVO();
			buildingVO.setJzid(fqid);
			buildingVO.setJzlx(fqlx);
			BuildingVO resultVO = this.buildingService.doFindFqDetailByVo(buildingVO);
			resultList.add(resultVO);
		}
		return resultList;
	}

	@Override
	public Map<String, List> doFindFireFacilitiesDetailsByVo(ImportantunitsVO vo) {
		Map<String,List> resultMap = new HashMap<String,List>();
		String zddwid = vo.getUuid();
		List<String> list = this.buildingDAO.doFindFqidListByZddwid(zddwid);
		for(String fqid : list){
			FirefacilitiesVO firefacilitiesVO = new FirefacilitiesVO();
			firefacilitiesVO.setJbxx_jzid(fqid);
			Map<String, List> eachMap = new HashMap<String,List>();
			eachMap = this.firefacilitiesService.doFindlist(firefacilitiesVO);
			resultMap.putAll(eachMap);
		}
		return resultMap;
	}

	/**
	 * author lxy
	 * @param vo
	 * @return
	 */
	public List<ImportantunitsVO> doSearchZddwListByVO(ImportantunitsVO vo){
		return importantunitsDAO.doSearchZddwListByVO(vo);
	};
}