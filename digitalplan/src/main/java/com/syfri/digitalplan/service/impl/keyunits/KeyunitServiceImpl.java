package com.syfri.digitalplan.service.impl.keyunits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.keyunits.KeyunitDAO;
import com.syfri.digitalplan.model.keyunits.KeyunitVO;
import com.syfri.digitalplan.service.keyunits.KeyunitService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("keyunitService")
public class KeyunitServiceImpl extends BaseServiceImpl<KeyunitVO> implements KeyunitService {

	@Autowired
	private KeyunitDAO keyunitDAO;

	@Override
	public KeyunitDAO getBaseDAO() {
		return keyunitDAO;
	}

	/*--条件查询：重点单位.--*/
	@Override
	public List<KeyunitVO> doFindKeyunitlist(KeyunitVO keyunitVO){
		if(keyunitVO.getDwmc()!=null && !"".equals(keyunitVO.getDwmc())){
			keyunitVO.setDwmc(keyunitVO.getDwmc().toUpperCase());
		}
		return keyunitDAO.doSearchByVO(keyunitVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<KeyunitVO> doFindDetailById(String keyunitId) {
		return keyunitDAO.doFindDetailById(keyunitId);
	}
}