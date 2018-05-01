package com.syfri.digitalplan.service.impl.keyunits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.keyunits.KeyunitsDAO;
import com.syfri.digitalplan.model.keyunits.KeyunitsVO;
import com.syfri.digitalplan.service.keyunits.KeyunitsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("keyunitsService")
public class KeyunitsServiceImpl extends BaseServiceImpl<KeyunitsVO> implements KeyunitsService {

	@Autowired
	private KeyunitsDAO keyunitsDAO;

	@Override
	public KeyunitsDAO getBaseDAO() {
		return keyunitsDAO;
	}

	/*--条件查询：重点单位.--*/
	@Override
	public List<KeyunitsVO> doFindKeyunitlist(KeyunitsVO keyunitsVO){
		return keyunitsDAO.doSearchByVO(keyunitsVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<KeyunitsVO> doFindDetailById(String keyunitId) {
		return keyunitsDAO.doFindDetailById(keyunitId);
	}
}