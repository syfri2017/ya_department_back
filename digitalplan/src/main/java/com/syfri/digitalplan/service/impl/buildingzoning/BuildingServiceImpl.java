package com.syfri.digitalplan.service.impl.buildingzoning;

import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import com.syfri.digitalplan.model.buildingzoning.WeixianjiezhiVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.buildingzoning.BuildingDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.service.buildingzoning.BuildingService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("buildingService")
public class BuildingServiceImpl extends BaseServiceImpl<BuildingVO> implements BuildingService {

	@Autowired
	private BuildingDAO buildingDAO;

	@Override
	public BuildingDAO getBaseDAO() {
		return buildingDAO;
	}

	@Override
	public BuildingVO doFindFqDetailByVo(BuildingVO buildingVO) {
		String fqlx = buildingVO.getJzlx();
		BuildingVO vo = new BuildingVO();
		switch (fqlx){
			case "30":
				//查找建筑分区详情关联建筑分区-装置类
				vo = buildingDAO.doFindFqAndZzDetailByVo(buildingVO);
				break;
			case "40":
				//查找建筑分区详情关联建筑分区-储罐类
				vo = buildingDAO.doFindFqAndCgDetailByVo(buildingVO);
				ChuguanVO chuguanVO = new ChuguanVO();
				chuguanVO.setPkid(vo.getJzid());
				List<ChuguanVO> chuguanList = this.buildingDAO.doFindChuGuanList(chuguanVO);
				vo.setChuguanList(chuguanList);
				break;
			default:
				//分区类型为10和20 查找建筑分区详情关联建筑分区-建筑类
				vo = buildingDAO.doFindFqAndJzDetailByVo(buildingVO);
				break;
		}
		return vo;
	}

	//高级搜索查询建筑列表
	public List doSearchGjssListByVO(BuildingVO vo) {
		String jzlx = vo.getJzlx();
		List<BuildingVO> buildingList = new ArrayList<>();
		switch (jzlx){
			case  "":
				buildingList = buildingDAO.doSearchGjssListByVO(vo);
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
				buildingList = buildingDAO.doSearchGjssJzlListByVO(vo);
				break;
			case  "30":
				vo.setZzl_jzjg(vo.getJzl_jzjg());
				buildingList = buildingDAO.doSearchGjssZzlListByVO(vo);
				break;
			case  "40":
				buildingList = buildingDAO.doSearchGjssCglListByVO(vo);
				break;
		}

		return buildingList;
	}

}