package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.CodelistVO;

import java.util.List;

public interface CodelistService  extends BaseService<CodelistVO>{

	/*--获取所有的代码集类型--*/
	List<CodelistVO> doFindCodelistType();

	/*--新增：新增代码集--*/
	int doInsertByVO(CodelistVO vo);

	/*--修改：新增代码集--*/
	int doUpdateByVO(CodelistVO vo);
}