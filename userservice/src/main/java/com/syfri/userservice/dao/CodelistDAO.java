package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.CodelistVO;

import java.util.List;

public interface CodelistDAO extends BaseDAO<CodelistVO>{

	/*--获取所有的代码集类型--*/
	List<CodelistVO> doFindCodelistType();
}