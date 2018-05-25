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
			case "11":
				vo = xfsyDAO.doFindSyAndXHSByVo(xfsyVO);
				break;
			case "12":
				vo = xfsyDAO.doFindSyAndXFSHByVo(xfsyVO);
				break;
			case "13":
				vo = xfsyDAO.doFindSyAndXFSCByVo(xfsyVO);
				break;
			case "21":
				vo = xfsyDAO.doFindSyAndXFMTByVo(xfsyVO);
				break;
			case "29":
				vo = xfsyDAO.doFindSyAndTRSYByVo(xfsyVO);
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
				case "1100":
					list = xfsyDAO.doFindXhsListByVO(xfsyVO);
					break;
				case "1200":
					list = xfsyDAO.doFindXfshListByVO(xfsyVO);
					break;
				case "1300":
					list = xfsyDAO.doFindXfscListByVO(xfsyVO);
					break;
				case "2100":
					list = xfsyDAO.doFindXfmtListByVO(xfsyVO);
					break;
				case "2900":
					list = xfsyDAO.doFindTrsyListByVO(xfsyVO);
					break;
				default:
					list = xfsyDAO.doFindListByVO(xfsyVO);
					break;
			}
		}

		return list;
	}
}