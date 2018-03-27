package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.TrsyDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.TrsyVO;
import com.syfri.digitalplan.service.basicinfo.watersource.TrsyService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("trsyService")
public class TrsyServiceImpl extends BaseServiceImpl<TrsyVO> implements TrsyService {

	@Autowired
	private TrsyDAO trsyDAO;

	@Override
	public TrsyDAO getBaseDAO() {
		return trsyDAO;
	}
}