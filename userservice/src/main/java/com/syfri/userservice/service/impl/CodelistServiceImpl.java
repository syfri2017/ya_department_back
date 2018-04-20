package com.syfri.userservice.service.impl;

import com.syfri.userservice.model.CodelistDetailVO;
import com.syfri.userservice.model.CodelistTree;
import com.syfri.userservice.utils.CurrentUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.CodelistDAO;
import com.syfri.userservice.model.CodelistVO;
import com.syfri.userservice.service.CodelistService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/*--根据代码类型获取车辆类型.--*/
	@Override
	public List<CodelistTree> doFindCarTypesByType(String codetype) {
		// 目的树
		List<CodelistTree> codelistTrees = new ArrayList<>();
		// 源数据
		List<CodelistDetailVO> codelistDetailVOs = codelistDAO.doFindCodelistByType(codetype);
		// 每级占位数
		List<Integer> digits = new ArrayList();
		digits.add(1);
		digits.add(2);
		digits.add(4);
		digits.add(6);
		digits.add(8);

		if(codelistDetailVOs!=null && codelistDetailVOs.size()>0){
			for(CodelistDetailVO codelistDetailVO : codelistDetailVOs){
				// 选出第一级类别
				if (codelistDetailVO.getCodeValue().replace("0","").length()==digits.get(0)) {
					CodelistTree tree = new CodelistTree();
					tree.setCodeName(codelistDetailVO.getCodeName());
					tree.setCodeValue(codelistDetailVO.getCodeValue());
					List<CodelistTree> children = new ArrayList();
					for(CodelistDetailVO codelistDetailVO2 : codelistDetailVOs){
						// 选出第二级类别
						if (codelistDetailVO2.getCodeValue().replace("0","").length()==digits.get(1)) {
							if (codelistDetailVO2.getCodeValue().substring(0,digits.get(0)).equals(codelistDetailVO.getCodeValue().substring(0,digits.get(0)))) {
								CodelistTree tree2 = new CodelistTree();
								tree2.setCodeName(codelistDetailVO2.getCodeName());
								tree2.setCodeValue(codelistDetailVO2.getCodeValue());
								List<CodelistTree> children2 = new ArrayList();
								for(CodelistDetailVO codelistDetailVO3 : codelistDetailVOs){
									// 选出第三级类别
									if (codelistDetailVO3.getCodeValue().substring(0,digits.get(1)).equals(codelistDetailVO2.getCodeValue().substring(0,digits.get(1)))) {
										if (!codelistDetailVO3.getCodeValue().substring(0,digits.get(2)).equals(codelistDetailVO2.getCodeValue().substring(0,digits.get(2)))) {
											if (codelistDetailVO3.getCodeValue().substring(digits.get(2),codelistDetailVO3.getCodeValue().length()).equals("0000")) {
												CodelistTree tree3 = new CodelistTree();
												tree3.setCodeName(codelistDetailVO3.getCodeName());
												tree3.setCodeValue(codelistDetailVO3.getCodeValue());
												List<CodelistTree> children3 = new ArrayList();
												for (CodelistDetailVO codelistDetailVO4 : codelistDetailVOs) {
													// 选出第四级类别
													if (codelistDetailVO4.getCodeValue().substring(0, digits.get(2)).equals(codelistDetailVO3.getCodeValue().substring(0, digits.get(2)))) {
														if (!codelistDetailVO4.getCodeValue().substring(0, digits.get(3)).equals(codelistDetailVO3.getCodeValue().substring(0, digits.get(3)))) {
															if (codelistDetailVO4.getCodeValue().substring(digits.get(3), codelistDetailVO4.getCodeValue().length()).equals("00")) {
																CodelistTree tree4 = new CodelistTree();
																tree4.setCodeName(codelistDetailVO4.getCodeName());
																tree4.setCodeValue(codelistDetailVO4.getCodeValue());
																List<CodelistTree> children4 = new ArrayList();
																for (CodelistDetailVO codelistDetailVO5 : codelistDetailVOs) {
																	// 选出第五级类别
																	if (codelistDetailVO5.getCodeValue().substring(0, digits.get(3)).equals(codelistDetailVO4.getCodeValue().substring(0, digits.get(3)))) {
																		if (!codelistDetailVO5.getCodeValue().equals(codelistDetailVO4.getCodeValue())) {
																			CodelistTree tree5 = new CodelistTree();
																			tree5.setCodeName(codelistDetailVO5.getCodeName());
																			tree5.setCodeValue(codelistDetailVO5.getCodeValue());
																			children4.add(tree5);
																		}
																	}
																}
																tree4.setChildren(children4);
																children3.add(tree4);
															}
														}
													}
												}
												tree3.setChildren(children3);
												children2.add(tree3);
											}
										}
									}
								}
								tree2.setChildren(children2);
								children.add(tree2);
							}
						}
					}
					tree.setChildren(children);
					codelistTrees.add(tree);
				}
			}
		}
		return codelistTrees;
	}

	/*--根据代码类型获取车辆状态.--*/
	@Override
	public List<CodelistTree> doFindCarStatesByType(String codetype) {
		// 目的树
		List<CodelistTree> codelistTrees = new ArrayList<>();
		// 源数据
		List<CodelistDetailVO> codelistDetailVOs = codelistDAO.doFindCodelistByType(codetype);
		// 每级占位数
		List<Integer> digits = new ArrayList();
		digits.add(2);
		digits.add(4);

		if(codelistDetailVOs!=null && codelistDetailVOs.size()>0){
			for(CodelistDetailVO codelistDetailVO : codelistDetailVOs){
				// 选出第一级类别
				if (codelistDetailVO.getCodeValue().length()==digits.get(0)) {
					CodelistTree tree = new CodelistTree();
					tree.setCodeName(codelistDetailVO.getCodeName());
					tree.setCodeValue(codelistDetailVO.getCodeValue());
					List<CodelistTree> children = new ArrayList();
					for(CodelistDetailVO codelistDetailVO2 : codelistDetailVOs){
						// 选出第二级类别
						if(codelistDetailVO2.getCodeValue().length()==digits.get(1)) {
							if(codelistDetailVO2.getCodeValue().substring(0,digits.get(0)).equals(codelistDetailVO.getCodeValue().substring(0,digits.get(0)))) {
								CodelistTree tree2 = new CodelistTree();
								tree2.setCodeName(codelistDetailVO2.getCodeName());
								tree2.setCodeValue(codelistDetailVO2.getCodeValue());
								children.add(tree2);
							}
						}
					}
					tree.setChildren(children);
					codelistTrees.add(tree);
				}
			}
		}
		return codelistTrees;
	}

	/*--根据代码类型获取树状资源.--*/
	@Override
	public List<CodelistTree> doFindCodelistTreeByType(String codetype) {
		// 目的树
		List<CodelistTree> codelistTrees = new ArrayList<>();
		// 源数据
		List<CodelistDetailVO> codelistDetailVOs = codelistDAO.doFindCodelistByType(codetype);
		// 每级占位数
		List<Integer> digits = new ArrayList();
		digits.add(1);
		digits.add(2);

		if(codelistDetailVOs!=null && codelistDetailVOs.size()>0){
			for(CodelistDetailVO codelistDetailVO : codelistDetailVOs){
				// 选出第一级类别
				if (codelistDetailVO.getCodeValue().replace("0","").length()==digits.get(0)) {
					CodelistTree tree = new CodelistTree();
					tree.setCodeName(codelistDetailVO.getCodeName());
					tree.setCodeValue(codelistDetailVO.getCodeValue());
					List<CodelistTree> children = new ArrayList();
					for(CodelistDetailVO codelistDetailVO2 : codelistDetailVOs){
						// 选出第二级类别
						if (codelistDetailVO2.getCodeValue().replace("0","").length()==digits.get(1)) {
							if(codelistDetailVO2.getCodeValue().substring(0,1).equals(codelistDetailVO.getCodeValue().substring(0,1))) {
								CodelistTree tree2 = new CodelistTree();
								tree2.setCodeName(codelistDetailVO2.getCodeName());
								tree2.setCodeValue(codelistDetailVO2.getCodeValue());
								children.add(tree2);
							}
						}
					}
					tree.setChildren(children);
					codelistTrees.add(tree);
				}
			}
		}
		return codelistTrees;
	}
}