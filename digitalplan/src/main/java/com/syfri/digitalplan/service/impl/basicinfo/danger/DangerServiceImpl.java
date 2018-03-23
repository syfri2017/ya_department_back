package com.syfri.digitalplan.service.impl.basicinfo.danger;

import com.syfri.digitalplan.dao.basicinfo.danger.DangerDAO;
import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;
import com.syfri.digitalplan.service.basicinfo.danger.DangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("dangerService")
public class DangerServiceImpl extends BaseServiceImpl<DangerVO> implements DangerService {

	@Autowired
	private DangerDAO dangerDAO;

	@Override
	public DangerDAO getBaseDAO() {
		return dangerDAO;
	}
}