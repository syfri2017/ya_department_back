package com.syfri.digitalplan.service.impl.basicinfo.equipmentsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.equipmentsource.EquipengineDAO;
import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipengineVO;
import com.syfri.digitalplan.service.basicinfo.equipmentsource.EquipengineService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("equipengineService")
public class EquipengineServiceImpl extends BaseServiceImpl<EquipengineVO> implements EquipengineService {

	@Autowired
	private EquipengineDAO equipengineDAO;

	@Override
	public EquipengineDAO getBaseDAO() {
		return equipengineDAO;
	}
}