package com.syfri.digitalplan.service.impl.advancedsearch;

import com.syfri.digitalplan.dao.advancedsearch.SearchDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;
import com.syfri.digitalplan.service.advancedsearch.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("SearchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDAO searchDAO;

	//高级搜索查询建筑列表
	public List doSearchGjssDwjzListByVO(BuildingVO vo) {
		String jzlx = vo.getJzlx();
		List<BuildingVO> buildingList = new ArrayList<>();
		switch (jzlx){
			case  "":
				buildingList = searchDAO.doSearchGjssDwjzListByVO(vo);
				break;
			case  "10":
			case  "20":
				if (vo.getJzl_dsgd().equals("1")){
					vo.setJzl_dsgd_max("50");
				}else if (vo.getJzl_dsgd().equals("2")){
					vo.setJzl_dsgd_min("50");
					vo.setJzl_dsgd_max("100");
				}else if (vo.getJzl_dsgd().equals("3")){
					vo.setJzl_dsgd_min("100");
				}
				buildingList = searchDAO.doSearchGjssJzlListByVO(vo);
				break;
			case  "30":
				vo.setZzl_jzjg(vo.getJzl_jzjg());
				buildingList = searchDAO.doSearchGjssZzlListByVO(vo);
				break;
			case  "40":
				buildingList = searchDAO.doSearchGjssCglListByVO(vo);
				break;
		}

		return buildingList;
	}

	//高级搜索 预案搜索
	public List doSearchGjssYaxxListByVO(DigitalplanlistVO vo) {
		String yadx = vo.getYadxType();
		List<DigitalplanlistVO> digitalplanlist = new ArrayList<>();
		switch (yadx){
			case "":
				digitalplanlist = searchDAO.doSearchGjssYaxxByVO(vo);
				break;
			case "1":
				digitalplanlist = searchDAO.doSearchGjssYaxxZddwByVO(vo);
				break;
			case "2":
				digitalplanlist = searchDAO.doSearchGjssYaxxBwjwByVO(vo);
				break;
			case "3":
				digitalplanlist = searchDAO.doSearchGjssYaxxQtdxByVO(vo);
				break;
		}
		return digitalplanlist;
	}

	//高级搜索 预案对象信息
	public List doSearchGjssYadxListByVO(ImportantunitsVO vo) {
		String yadx = vo.getYadxType();
		List<ImportantunitsVO> importantunitsList = new ArrayList<>();
		switch (yadx){
			case "":
				importantunitsList = searchDAO.doSearchGjssYadxByVO(vo);
				break;
			case "1":
				importantunitsList = searchDAO.doSearchGjssYadxZddwByVO(vo);
				break;
			case "2":
				importantunitsList = searchDAO.doSearchGjssYadxBwjwByVO(vo);
				break;
			case "3":
				importantunitsList = searchDAO.doSearchGjssYadxQtdxByVO(vo);
				break;
		}
		return importantunitsList;
	}
}