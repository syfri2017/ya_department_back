package com.syfri.digitalplan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.DigitalplanlistDAO;
import com.syfri.digitalplan.model.DigitalplanlistVO;
import com.syfri.digitalplan.service.DigitalplanlistService;
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