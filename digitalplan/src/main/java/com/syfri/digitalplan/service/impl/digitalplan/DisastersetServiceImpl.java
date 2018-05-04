package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.DisastersetDAO;
import com.syfri.digitalplan.model.digitalplan.DisastersetVO;
import com.syfri.digitalplan.service.digitalplan.DisastersetService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("disastersetService")
public class DisastersetServiceImpl extends BaseServiceImpl<DisastersetVO> implements DisastersetService {

	@Autowired
	private DisastersetDAO disastersetDAO;

	@Override
	public DisastersetDAO getBaseDAO() {
		return disastersetDAO;
	}

	@Override
	public List<DisastersetVO> doFindByPlanId(String yaid){
		return disastersetDAO.doFindByPlanId(yaid);
	}
}