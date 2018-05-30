package com.syfri.digitalplan.service.impl.digitalplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.digitalplan.GuardobjectsplanVO;
import com.syfri.digitalplan.dao.digitalplan.GuardobjectsplanDAO;
import com.syfri.digitalplan.service.digitalplan.GuardobjectsplanService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfbwjwService")
public class GuardobjectsplanServiceImpl extends BaseServiceImpl<GuardobjectsplanVO> implements GuardobjectsplanService {
/**
 * @Description:
 * @Param: 
 * @Return: 
 * @Author: zhaijianchen
 * @Modified By:
 * @Date: 2018/4/20 16:56
 */
	
	@Autowired
	private GuardobjectsplanDAO guardobjectsplanDAO;

	@Override
	public GuardobjectsplanDAO getBaseDAO() {
		return guardobjectsplanDAO;
	}
	/*--条件查询：重点单位.--*/
	@Override
	public List<GuardobjectsplanVO> doFindXfbwjwlist(GuardobjectsplanVO guardobjectsplanVO){
		return guardobjectsplanDAO.doSearchByVO(guardobjectsplanVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public GuardobjectsplanVO doFindDetailById(String xfbwjwId) {
		return guardobjectsplanDAO.doFindDetailById(xfbwjwId);
	}


}