package com.syfri.digitalplan.service.impl.digitalplan;

import com.syfri.digitalplan.dao.digitalplan.DigitalplanlistDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.service.digitalplan.DigitalplanlistService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("digitalplanlistService")
public class DigitalplanlistServiceImpl extends BaseServiceImpl<DigitalplanlistVO> implements DigitalplanlistService {

	@Autowired
	private DigitalplanlistDAO digitalplanlistDAO;

	@Override
	public DigitalplanlistDAO getBaseDAO() {
		return digitalplanlistDAO;
	}

}