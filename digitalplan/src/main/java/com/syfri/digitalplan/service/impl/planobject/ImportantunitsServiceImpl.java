package com.syfri.digitalplan.service.impl.planobject;

import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import com.syfri.digitalplan.model.firefacilities.FirefacilitiesVO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsBuildingVO;
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
import org.springframework.util.StringUtils;

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
		//根据重点单位id查询包含建筑id和建筑类型列表
		List<BuildingVO> list = this.buildingDAO.doFindJzidJzlxListByZddwid(zddwid);
		for(BuildingVO buildingVO : list){
			//根据建筑id和建筑类型查询建筑详情
			BuildingVO resultVO = this.buildingService.doFindFqDetailByVo(buildingVO);
			resultList.add(resultVO);
		}
		return resultList;
	}

	@Override
	public Map<String, List> doFindFireFacilitiesDetailsByVo(ImportantunitsVO vo) {
		Map<String,List> resultMap = new HashMap<String,List>();
		String zddwid = vo.getUuid();
		List<BuildingVO> list = this.buildingDAO.doFindJzidJzlxListByZddwid(zddwid);
		for(BuildingVO buildingVO : list){
			String jzid = buildingVO.getJzid();
			FirefacilitiesVO firefacilitiesVO = new FirefacilitiesVO();
			firefacilitiesVO.setJbxx_jzid(jzid);
			Map<String, List> eachMap = new HashMap<String,List>();
			eachMap = this.firefacilitiesService.doFindlist(firefacilitiesVO);
			resultMap.putAll(eachMap);
		}
		return resultMap;
	}

	/***
	 * @Description: 通过重点单位 查询包含分区详情和消防设施
	 * @Param: [vo]
	 * @Return: java.util.List<com.syfri.digitalplan.model.buildingzoning.BuildingVO>
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/6/5 9:55
	 */
	public List<BuildingVO> doFindBuildingDetailsAndFirefacilitiesByVo(ImportantunitsVO vo) {
		List<BuildingVO> resultList = new ArrayList<>();
		String zddwid = vo.getUuid();
			List<BuildingVO> list = this.buildingDAO.doFindJzidJzlxListByZddwid(zddwid);
			for(BuildingVO buildingVO : list){
				String jzid = buildingVO.getJzid();
				BuildingVO resultVO = this.buildingService.doFindFqDetailByVo(buildingVO);

				FirefacilitiesVO firefacilitiesVO = new FirefacilitiesVO();
				firefacilitiesVO.setJbxx_jzid(jzid);
				Map<String, List> firefacilites = this.firefacilitiesService.doFindlist(firefacilitiesVO);
				resultVO.setFirefacilites(firefacilites);
				resultList.add(resultVO);
			}
		return resultList;
	}

	/**
	 * author lxy
	 * @param vo
	 * @return
	 */
	public List<ImportantunitsVO> doSearchZddwListByVO(ImportantunitsVO vo){
		return importantunitsDAO.doSearchZddwListByVO(vo);
	};

	/*--根据重点单位ID查询单位建筑信息详情 by li.xue 2018/8/16--*/
	public List<BuildingVO> doFindJzxxDetailByZddwId(String zddwid) {
		List<ImportantunitsBuildingVO> buildingList = importantunitsDAO.doFindJzxxListByZddwId(zddwid);
		List<BuildingVO> list = new ArrayList<>();
		for (ImportantunitsBuildingVO vo : buildingList) {
			if (!StringUtils.isEmpty(vo.getJzid())) {
				BuildingVO temp = new BuildingVO();
				temp.setJzid(vo.getJzid());
				if (vo.getJzlx() != null && vo.getJzlx() != "") {
					switch (vo.getJzlx()) {
						case "10":
						case "20":
							list.add(buildingDAO.doFindFqAndJzDetailByVo(temp));
							break;
						case "30":
							list.add(buildingDAO.doFindFqAndZzDetailByVo(temp));
							break;
						case "40":
							BuildingVO cgl = buildingDAO.doFindFqAndCgDetailByVo(temp);
							ChuguanVO cg = new ChuguanVO();
							cg.setPkid(cgl.getCgl_uuid());
							cgl.setChuguanList(buildingDAO.doFindChuGuanList(cg));
							list.add(cgl);
							break;
					}
				}
			}
		}
		return list;
	}
}