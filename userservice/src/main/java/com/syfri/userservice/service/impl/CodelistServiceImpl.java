package com.syfri.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.CodelistDAO;
import com.syfri.userservice.model.CodelistVO;
import com.syfri.userservice.service.CodelistService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("codelistService")
public class CodelistServiceImpl extends BaseServiceImpl<CodelistVO> implements CodelistService {

	@Autowired
	private CodelistDAO codelistDAO;

	@Override
	public CodelistDAO getBaseDAO() {
		return codelistDAO;
	}

	/*--获取所有的代码集类型--*/
	@Override
	public List<CodelistVO> doFindCodelistType() {
		return codelistDAO.doFindCodelistType();
	}
}