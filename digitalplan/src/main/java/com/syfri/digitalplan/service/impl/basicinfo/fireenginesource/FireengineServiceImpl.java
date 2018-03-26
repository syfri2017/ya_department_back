package com.syfri.digitalplan.service.impl.basicinfo.fireenginesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.fireenginesource.FireengineDAO;
import com.syfri.digitalplan.model.basicinfo.fireenginesource.FireengineVO;
import com.syfri.digitalplan.service.basicinfo.fireenginesource.FireengineService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("fireengineService")
public class FireengineServiceImpl extends BaseServiceImpl<FireengineVO> implements FireengineService {

	@Autowired
	private FireengineDAO fireengineDAO;

	@Override
	public FireengineDAO getBaseDAO() {
		return fireengineDAO;
	}
}