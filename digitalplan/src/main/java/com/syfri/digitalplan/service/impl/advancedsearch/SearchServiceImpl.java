package com.syfri.digitalplan.service.impl.advancedsearch;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.advancedsearch.SearchDAO;
import com.syfri.digitalplan.dao.buildingzoning.BuildingDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import com.syfri.digitalplan.service.advancedsearch.SearchService;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
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
	public List doSearchGjssListByVO(BuildingVO vo) {
		String jzlx = vo.getJzlx();
		List<BuildingVO> buildingList = new ArrayList<>();
		switch (jzlx){
			case  "":
				buildingList = searchDAO.doSearchGjssListByVO(vo);
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

}