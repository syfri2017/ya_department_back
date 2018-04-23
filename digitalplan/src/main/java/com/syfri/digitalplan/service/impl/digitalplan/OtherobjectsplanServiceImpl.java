package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.OtherobjectsplanDAO;
import com.syfri.digitalplan.model.digitalplan.OtherobjectsplanVO;
import com.syfri.digitalplan.service.digitalplan.OtherobjectsplanService;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("otherobjectsplanService")
public class OtherobjectsplanServiceImpl extends BaseServiceImpl<OtherobjectsplanVO> implements OtherobjectsplanService {

	@Autowired
	private OtherobjectsplanDAO otherobjectsplanDAO;

	@Override
	public OtherobjectsplanDAO getBaseDAO() {
		return otherobjectsplanDAO;
	}
}