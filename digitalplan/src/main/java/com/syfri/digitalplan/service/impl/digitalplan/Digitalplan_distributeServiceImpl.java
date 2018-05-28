package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.Digitalplan_distributeDAO;
import com.syfri.digitalplan.model.digitalplan.Digitalplan_distributeVO;
import com.syfri.digitalplan.service.digitalplan.Digitalplan_distributeService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("digitalplan_distributeService")
public class Digitalplan_distributeServiceImpl extends BaseServiceImpl<Digitalplan_distributeVO> implements Digitalplan_distributeService {

	@Autowired
	private Digitalplan_distributeDAO digitalplan_distributeDAO;

	@Override
	public Digitalplan_distributeDAO getBaseDAO() {
		return digitalplan_distributeDAO;
	}
}