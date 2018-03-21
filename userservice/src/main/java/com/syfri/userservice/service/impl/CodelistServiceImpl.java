package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.CodelistDetailVO;
import com.syfri.userservice.utils.CurrentUserUtil;
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

	/*--根据代码类型获取代码集--*/
	@Override
	public List<CodelistDetailVO> doFindDetail(String codeid) {
		return codelistDAO.doFindDetail(codeid);
	}

	/*--查询：代码集.--*/
	@Override
	public List<CodelistVO> doFindCodelist(CodelistVO codelistVO){
		if(codelistVO.getCodetype()!=null && !"".equals(codelistVO.getCodetype())){
			codelistVO.setCodetype(codelistVO.getCodetype().toUpperCase());
		}
		return codelistDAO.doSearchByVO(codelistVO);
	}

	/*--新增：代码集.--*/
	@Override
	public CodelistVO doInsertCodelist(CodelistVO codelistVO){
		codelistVO.setCreateId(CurrentUserUtil.getCurrentUserId());
		codelistVO.setCreateName(CurrentUserUtil.getCurrentUserName());
		if(codelistVO.getLanguage() == null || codelistVO.getLanguage() == ""){
			codelistVO.setLanguage("zh_CN");
		}
		codelistDAO.doInsertByVO(codelistVO);
		return codelistVO;
	}

	/*--修改：代码集.--*/
	@Override
	public CodelistVO doUpdateCodelist(CodelistVO codelistVO){
		codelistVO.setAlterId(CurrentUserUtil.getCurrentUserId());
		codelistVO.setAlterName(CurrentUserUtil.getCurrentUserName());
		codelistDAO.doUpdateByVO(codelistVO);
		return codelistVO;
	}

	/*--删除：代码集.--*/
	@Override
	public void doDeleteCodelist(String codeid){
		codelistDAO.doDeleteById(codeid);
		codelistDAO.doDeleteCodelistDetailBatch(codeid);
	}

	/*--查询：根据代码集详情对象查询.--*/
	@Override
	public List<CodelistDetailVO> doFindCodelistDetail(CodelistDetailVO codelistDetailVO){
		return codelistDAO.doFindCodelistDetail(codelistDetailVO);
	}

	/*--新增从表：.--*/
	@Override
	public CodelistDetailVO doInsertCodelistDetail(CodelistDetailVO codelistDetailVO){
		codelistDetailVO.setCreateId(CurrentUserUtil.getCurrentUserId());
		codelistDetailVO.setCreateName(CurrentUserUtil.getCurrentUserName());
		codelistDAO.doInsertCodelistDetail(codelistDetailVO);
		return codelistDetailVO;
	}

	/*--修改从表：.--*/
	@Override
	public CodelistDetailVO doUpdateCodelistDetail(CodelistDetailVO codelistDetailVO){
		codelistDetailVO.setAlterId(CurrentUserUtil.getCurrentUserId());
		codelistDetailVO.setAlterName(CurrentUserUtil.getCurrentUserName());
		codelistDAO.doUpdateCodelistDetail(codelistDetailVO);
		return codelistDetailVO;
	}

	/*--删除从表：根据主键山粗.--*/
	@Override
	public void doDeleteCodelistDetail(String pkid){
		codelistDAO.doDeleteCodelistDetail(pkid);
	}

	/*--根据代码类型查询代码集.--*/
	@Override
	public List<CodelistDetailVO> doFindCodelistByType(String codetype){
		return codelistDAO.doFindCodelistByType(codetype);
	}
}