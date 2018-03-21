package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.CodelistDetailVO;
import com.syfri.userservice.model.CodelistVO;

import java.util.List;

public interface CodelistService  extends BaseService<CodelistVO>{

	/*--根据代码类型获取代码集--*/
	List<CodelistDetailVO> doFindDetail(String codeid);

	/*--查询：代码集.--*/
	List<CodelistVO> doFindCodelist(CodelistVO codelistVO);

	/*--新增：代码集.--*/
	CodelistVO doInsertCodelist(CodelistVO codelistVO);

	/*--修改：代码集.--*/
	CodelistVO doUpdateCodelist(CodelistVO codelistVO);

	/*--删除：代码集.--*/
	void doDeleteCodelist(String codeid);

	/*--查询从表：根据代码集详情对象查询.--*/
	List<CodelistDetailVO> doFindCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--新增从表：.--*/
	CodelistDetailVO doInsertCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--修改从表：.--*/
	CodelistDetailVO doUpdateCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--删除从表：根据主键删除.--*/
	void doDeleteCodelistDetail(String pkid);

	/*--根据代码类型查询代码集.--*/
	List<CodelistDetailVO> doFindCodelistByType(String codetype);
}