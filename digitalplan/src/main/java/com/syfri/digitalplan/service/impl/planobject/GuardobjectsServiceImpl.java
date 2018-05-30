package com.syfri.digitalplan.service.impl.planobject;

import com.syfri.digitalplan.model.planobject.GuardobjectsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.planobject.GuardobjectsDAO;
import com.syfri.digitalplan.service.planobject.GuardobjectsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("bwjwplanService")
public class GuardobjectsServiceImpl extends BaseServiceImpl<GuardobjectsVO> implements GuardobjectsService {

	@Autowired
	private GuardobjectsDAO guardobjectsDAO;

	@Override
	public GuardobjectsDAO getBaseDAO() {
		return guardobjectsDAO;
	}

	/*--查询：保卫警卫--*/
	public List<GuardobjectsVO> doFindBwjwplanlist(GuardobjectsVO guardobjectsVO){
		return guardobjectsDAO.doSearchByVO(guardobjectsVO);
	}

	/*--根据重点单位ID获取保卫警卫详情-*/
	public GuardobjectsVO doFindDetailById(String bwjwplanId){
          return guardobjectsDAO.doFindDetailById(bwjwplanId);
	}


}