package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.CodelistDetailVO;
import com.syfri.userservice.model.CodelistVO;

import java.util.List;

public interface CodelistDAO extends BaseDAO<CodelistVO>{

	/*--根据代码值类型获取代码值.--*/
	List<CodelistDetailVO> doFindDetail(String codeid);

	/*--根据对象查询记录.--*/
	List<CodelistVO> doSearchByVO(CodelistVO codelistVO);

	/*--查询：根据代码集详情对象查询.--*/
	List<CodelistDetailVO> doFindCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--新增从表：.--*/
	int doInsertCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--修改从表：.--*/
	int doUpdateCodelistDetail(CodelistDetailVO codelistDetailVO);

	/*--删除从表：根据主键删除.--*/
	int doDeleteCodelistDetail(String pkid);

	/*--删除从表：根据codeid删除.--*/
	int doDeleteCodelistDetailBatch(String pkid);
}