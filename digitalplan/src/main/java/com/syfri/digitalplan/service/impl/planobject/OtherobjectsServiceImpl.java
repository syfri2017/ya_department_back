package com.syfri.digitalplan.service.impl.planobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.planobject.OtherobjectsDAO;
import com.syfri.digitalplan.model.planobject.OtherobjectsVO;
import com.syfri.digitalplan.service.planobject.OtherobjectsService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("otherobjectsService")
public class OtherobjectsServiceImpl extends BaseServiceImpl<OtherobjectsVO> implements OtherobjectsService {

	@Autowired
	private OtherobjectsDAO otherobjectsDAO;

	@Override
	public OtherobjectsDAO getBaseDAO() { return otherobjectsDAO; }
}