package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.XfmtDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfmtVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfmtService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfmtService")
public class XfmtServiceImpl extends BaseServiceImpl<XfmtVO> implements XfmtService {

	@Autowired
	private XfmtDAO xfmtDAO;

	@Override
	public XfmtDAO getBaseDAO() {
		return xfmtDAO;
	}

	public XfmtVO doFindXfmtById(XfmtVO xfmtVO) {
		return xfmtDAO.doFindXfmtById(xfmtVO);
	}
}