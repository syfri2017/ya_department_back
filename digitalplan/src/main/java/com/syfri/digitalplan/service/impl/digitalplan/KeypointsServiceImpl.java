package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.KeypointsDAO;
import com.syfri.digitalplan.model.digitalplan.KeypointsVO;
import com.syfri.digitalplan.service.digitalplan.KeypointsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("keypointsService")
public class KeypointsServiceImpl extends BaseServiceImpl<KeypointsVO> implements KeypointsService {

	@Autowired
	private KeypointsDAO keypointsDAO;

	@Override
	public KeypointsDAO getBaseDAO() {
		return keypointsDAO;
	}

	@Override
	public KeypointsVO doFindByPlanId(String yaid){
		return keypointsDAO.doFindByPlanId(yaid);
	}
}