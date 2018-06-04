package com.syfri.digitalplan.service.impl.basicinfo.firestationsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.firestationsource.XfdzDAO;
import com.syfri.digitalplan.model.basicinfo.firestationsource.XfdzVO;
import com.syfri.digitalplan.service.basicinfo.firestationsource.XfdzService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfdzService")
public class XfdzServiceImpl extends BaseServiceImpl<XfdzVO> implements XfdzService {

	@Autowired
	private XfdzDAO xfdzDAO;

	@Override
	public XfdzDAO getBaseDAO() {
		return xfdzDAO;
	}

	public XfdzVO doFindDzDetailByVo(XfdzVO xfdzVO){
		String dzlx = xfdzVO.getDzlx().substring(0,2);
		XfdzVO vo = new XfdzVO();
		switch (dzlx){
			case "02":
				vo = xfdzDAO.doFindDzZongDDetailByVo(xfdzVO);
				break;
			case "03":
				vo = xfdzDAO.doFindDzZhiDDetailByVo(xfdzVO);
				break;
			case "05":
				vo = xfdzDAO.doFindDzDaDDetailByVo(xfdzVO);
				break;
			case "09":
				vo = xfdzDAO.doFindDzZhongDDetailByVo(xfdzVO);
				break;
			case "0A":
				vo = xfdzDAO.doFindDzQtxfdwDetailByVo(xfdzVO);
				break;
		}

		return vo;
	}
}