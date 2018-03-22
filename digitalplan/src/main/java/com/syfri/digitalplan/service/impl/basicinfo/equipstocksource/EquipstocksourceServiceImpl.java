package com.syfri.digitalplan.service.impl.basicinfo.equipstocksource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.equipstocksource.EquipstocksourceDAO;
import com.syfri.digitalplan.model.basicinfo.equipstocksource.EquipstocksourceVO;
import com.syfri.digitalplan.service.basicinfo.equipstocksource.EquipstocksourceService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("equipstocksourceService")
public class EquipstocksourceServiceImpl extends BaseServiceImpl<EquipstocksourceVO> implements EquipstocksourceService {

	@Autowired
	private EquipstocksourceDAO equipstocksourceDAO;

	@Override
	public EquipstocksourceDAO getBaseDAO() {
		return equipstocksourceDAO;
	}

	/*--条件查询：重点单位.--*/
	@Override
	public List<EquipstocksourceVO> doFindlist(EquipstocksourceVO equipstocksourceVO){
		if(equipstocksourceVO.getZbqcmc()!=null && !"".equals(equipstocksourceVO.getZbqcmc())){
			equipstocksourceVO.setZbqcmc(equipstocksourceVO.getZbqcmc().toUpperCase());
		}
		if(equipstocksourceVO.getCkmc()!=null && !"".equals(equipstocksourceVO.getCkmc())){
			equipstocksourceVO.setCkmc(equipstocksourceVO.getCkmc().toUpperCase());
		}
		if(equipstocksourceVO.getHwmc()!=null && !"".equals(equipstocksourceVO.getHwmc())){
			equipstocksourceVO.setHwmc(equipstocksourceVO.getHwmc().toUpperCase());
		}
		return equipstocksourceDAO.doSearchByVO(equipstocksourceVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<EquipstocksourceVO> doFindDetailById(String id) {
		return equipstocksourceDAO.doFindDetailById(id);
	}
}