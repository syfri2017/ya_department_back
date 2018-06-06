package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.watersource.XfsyDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfsyVO;
import com.syfri.digitalplan.service.basicinfo.watersource.XfsyService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfsyService")
public class XfsyServiceImpl extends BaseServiceImpl<XfsyVO> implements XfsyService {

	@Autowired
	private XfsyDAO xfsyDAO;

	@Override
	public XfsyDAO getBaseDAO() {
		return xfsyDAO;
	}

	@Override
	public XfsyVO doFindSyAndSxByVo(XfsyVO xfsyVO) {
		String sylx = xfsyVO.getSylx();
		XfsyVO vo = new XfsyVO();
		switch (sylx){
			case "01":
				vo = xfsyDAO.doFindSyAndXHSByVo(xfsyVO);
				break;
			case "02":
				vo = xfsyDAO.doFindSyAndXFSHByVo(xfsyVO);
				break;
			case "03":
				vo = xfsyDAO.doFindSyAndXFSCByVo(xfsyVO);
				break;
			case "04":
				vo = xfsyDAO.doFindSyAndTrsyqsdByVo(xfsyVO);
				break;
			default:
				vo = xfsyDAO.doFindSyAndSxByVo(xfsyVO);
		}
		return vo;
	}
	@Override
	public List doFindListByVO(XfsyVO xfsyVO) {
		String sylx = xfsyVO.getSylx();
		List<XfsyVO> list = new ArrayList<XfsyVO>();
		if(sylx == null || sylx == "")
			list = xfsyDAO.doFindListByVO(xfsyVO);
		else {
			switch (sylx){
				case "01":
					list = xfsyDAO.doFindXhsListByVO(xfsyVO);
					break;
				case "02":
					list = xfsyDAO.doFindXfshListByVO(xfsyVO);
					break;
				case "03":
					list = xfsyDAO.doFindXfscListByVO(xfsyVO);
					break;
				case "04":
					list = xfsyDAO.doFindTrsyqsdListByVO(xfsyVO);
					break;
				default:
					list = xfsyDAO.doFindListByVO(xfsyVO);
					break;
			}
		}

		return list;
	}
}