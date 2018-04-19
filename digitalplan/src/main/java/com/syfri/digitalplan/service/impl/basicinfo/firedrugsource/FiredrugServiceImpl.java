package com.syfri.digitalplan.service.impl.basicinfo.firedrugsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.firedrugsource.FiredrugDAO;
import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;
import com.syfri.digitalplan.service.basicinfo.firedrugsource.FiredrugService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("firedrugService")
public class FiredrugServiceImpl extends BaseServiceImpl<FiredrugVO> implements FiredrugService {

	@Autowired
	private FiredrugDAO firedrugDAO;

	@Override
	public FiredrugDAO getBaseDAO() {
		return firedrugDAO;
	}

	/*--条件查询：重点单位.--*/
	@Override
	public List<FiredrugVO> doFindlist(FiredrugVO firedrugVO){
		//所属队站
		if(firedrugVO.getSsdz()!=null && !"".equals(firedrugVO.getSsdz())){
			firedrugVO.setSsdz(firedrugVO.getSsdz().toUpperCase());
		}
		//药剂类型
		if(firedrugVO.getYjlx()!=null && !"".equals(firedrugVO.getYjlx())){
			firedrugVO.setYjlx(firedrugVO.getYjlx().toUpperCase());
		}
		return firedrugDAO.doSearchByVO(firedrugVO);
	}
}