package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.XfshDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfshVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfshService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfshService")
public class XfshServiceImpl extends BaseServiceImpl<XfshVO> implements XfshService {

	@Autowired
	private XfshDAO xfshDAO;

	@Override
	public XfshDAO getBaseDAO() {
		return xfshDAO;
	}

}