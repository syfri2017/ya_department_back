package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.XfscDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfscVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfscService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfscService")
public class XfscServiceImpl extends BaseServiceImpl<XfscVO> implements XfscService {

	@Autowired
	private XfscDAO xfscDAO;

	@Override
	public XfscDAO getBaseDAO() {
		return xfscDAO;
	}
	public XfscVO doFindXfscById(XfscVO xfscVO) {
		return xfscDAO.doFindXfscById(xfscVO);
	}
}