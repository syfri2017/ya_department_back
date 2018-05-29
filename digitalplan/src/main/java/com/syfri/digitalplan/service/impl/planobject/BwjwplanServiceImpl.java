package com.syfri.digitalplan.service.impl.planobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.planobject.BwjwplanDAO;
import com.syfri.digitalplan.model.planobject.BwjwplanVO;
import com.syfri.digitalplan.service.planobject.BwjwplanService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("bwjwplanService")
public class BwjwplanServiceImpl extends BaseServiceImpl<BwjwplanVO> implements BwjwplanService {

	@Autowired
	private BwjwplanDAO bwjwplanDAO;

	@Override
	public BwjwplanDAO getBaseDAO() {
		return bwjwplanDAO;
	}

	/*--查询：保卫警卫--*/
	public List<BwjwplanVO> doFindBwjwplanlist(BwjwplanVO bwjwplanVO){
		return bwjwplanDAO.doSearchByVO(bwjwplanVO);
	}

	/*--根据重点单位ID获取保卫警卫详情-*/
	public BwjwplanVO doFindDetailById(String bwjwplanId){
          return bwjwplanDAO.doFindDetailById(bwjwplanId);
	}


}