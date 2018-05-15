package com.syfri.digitalplan.service.impl.importantparts;

import com.syfri.digitalplan.model.buildingzoning.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.importantparts.ImportantpartsDAO;
import com.syfri.digitalplan.dao.buildingzoning.BuildingDAO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.service.importantparts.ImportantpartsService;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("importantpartsService")
public class ImportantpartsServiceImpl extends BaseServiceImpl<ImportantpartsVO> implements ImportantpartsService {

	@Autowired
	private ImportantpartsDAO importantpartsDAO;
	@Autowired
	private BuildingDAO buildingDAO;

	@Override
	public ImportantpartsDAO getBaseDAO() {
		return importantpartsDAO;
	}

	/*--根据重点单位id获取建筑类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindJzlListByZddwId(String zddwId) {
		List<ImportantpartsVO> resultList = this.importantpartsDAO.doFindJzlListByZddwId(zddwId);
		for (ImportantpartsVO vo : resultList){
			WeixianjiezhiVO weixianjiezhiVO = new WeixianjiezhiVO();
			weixianjiezhiVO.setFkid(vo.getZdbwid());
			List<WeixianjiezhiVO> weixianjiezhiList = this.buildingDAO.doFindWeiXianJieZhiList(weixianjiezhiVO);
			vo.setWeixianjiezhiList(weixianjiezhiList);
		}
		return resultList;
	}
	/*--根据重点单位id获取装置类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindZzlListByZddwId(String zddwId) {
		List<ImportantpartsVO> resultList = this.importantpartsDAO.doFindJzlListByZddwId(zddwId);
		for (ImportantpartsVO vo : resultList){
			ZuchengVO zuchengVO = new ZuchengVO();
			YuanliaoVO yuanliaoVO = new YuanliaoVO();
			ChanwuVO chanwuVO = new ChanwuVO();
			zuchengVO.setZzid(vo.getZdbwid());
			yuanliaoVO.setZzid(vo.getZdbwid());
			chanwuVO.setZzid(vo.getZdbwid());
			List<ZuchengVO> zuchengList = this.buildingDAO.doFindZuChengList(zuchengVO);
			List<YuanliaoVO> yuanliaoList = this.buildingDAO.doFindYuanLiaoList(yuanliaoVO);
			List<ChanwuVO> chanwuList = this.buildingDAO.doFindChanWuList(chanwuVO);
			vo.setZuchengList(zuchengList);
			vo.setYuanliaoList(yuanliaoList);
			vo.setChanwuList(chanwuList);
		}
		return resultList;
	}
	/*--根据重点单位id获取储罐类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindCglListByZddwId(String zddwId) {
		List<ImportantpartsVO> resultList = this.importantpartsDAO.doFindCglListByZddwId(zddwId);
		for (ImportantpartsVO vo : resultList){
			ChuguanVO chuguanVO = new ChuguanVO();
			chuguanVO.setPkid(vo.getZdbwid());
			List<ChuguanVO> chuguanList = this.buildingDAO.doFindChuGuanList(chuguanVO);
			vo.setChuguanList(chuguanList);
		}
		return resultList;
	}
}