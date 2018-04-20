package com.syfri.digitalplan.service.impl.basicinfo.equipmentsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.equipmentsource.EquipmentsourceDAO;
import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipmentsourceVO;
import com.syfri.digitalplan.service.basicinfo.equipmentsource.EquipmentsourceService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("equipmentsourceService")
public class EquipmentsourceServiceImpl extends BaseServiceImpl<EquipmentsourceVO> implements EquipmentsourceService {

	@Autowired
	private EquipmentsourceDAO equipmentsourceDAO;

	@Override
	public EquipmentsourceDAO getBaseDAO() {
		return equipmentsourceDAO;
	}

	/*--条件查询：重点单位.--*/
	@Override
	public List<EquipmentsourceVO> doFindlist(EquipmentsourceVO equipmentsourceVO){
		//装备器材类型代码
		if(equipmentsourceVO.getZbqclxdm()!=null && !"".equals(equipmentsourceVO.getZbqclxdm())){
			equipmentsourceVO.setZbqclxdm(equipmentsourceVO.getZbqclxdm().toUpperCase());
		}
		return equipmentsourceDAO.doSearchByVO(equipmentsourceVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<EquipmentsourceVO> doFindDetailById(String id) {
		return equipmentsourceDAO.doFindDetailById(id);
	}
}