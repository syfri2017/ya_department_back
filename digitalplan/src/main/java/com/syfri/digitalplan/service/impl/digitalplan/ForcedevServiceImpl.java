package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.ForcedevDAO;
import com.syfri.digitalplan.model.digitalplan.ForcedevVO;
import com.syfri.digitalplan.service.digitalplan.ForcedevService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("forcedevService")
public class ForcedevServiceImpl extends BaseServiceImpl<ForcedevVO> implements ForcedevService {

	@Autowired
	private ForcedevDAO forcedevDAO;

	@Override
	public ForcedevDAO getBaseDAO() {
		return forcedevDAO;
	}

	@Override
	public List<ForcedevVO> doFindByPlanId(String yaid){
		return forcedevDAO.doFindByPlanId(yaid);
	}
}