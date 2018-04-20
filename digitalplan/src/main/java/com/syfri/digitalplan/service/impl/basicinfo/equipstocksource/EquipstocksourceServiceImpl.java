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
		//所属消防机构id
		if(equipstocksourceVO.getSsxfjgid()!=null && !"".equals(equipstocksourceVO.getSsxfjgid())){
			equipstocksourceVO.setSsxfjgid(equipstocksourceVO.getSsxfjgid().toUpperCase());
		}
		return equipstocksourceDAO.doSearchByVO(equipstocksourceVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<EquipstocksourceVO> doFindDetailById(String id) {
		return equipstocksourceDAO.doFindDetailById(id);
	}
}