package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.XhsDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XhsVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XhsService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xhsService")
public class XhsServiceImpl extends BaseServiceImpl<XhsVO> implements XhsService {

	@Autowired
	private XhsDAO xhsDAO;

	@Override
	public XhsDAO getBaseDAO() {
		return xhsDAO;
	}

}