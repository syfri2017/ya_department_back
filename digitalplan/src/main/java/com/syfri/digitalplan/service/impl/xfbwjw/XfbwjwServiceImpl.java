package com.syfri.digitalplan.service.impl.xfbwjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.xfbwjw.XfbwjwVO;
import com.syfri.digitalplan.dao.xfbwjw.XfbwjwDAO;
import com.syfri.digitalplan.service.xfbwjw.XfbwjwService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("xfbwjwService")
public class XfbwjwServiceImpl extends BaseServiceImpl<XfbwjwVO> implements XfbwjwService {
/**
 * @Description:
 * @Param: 
 * @Return: 
 * @Author: zhaijianchen
 * @Modified By:
 * @Date: 2018/4/20 16:56
 */
	
	@Autowired
	private XfbwjwDAO xfbwjwDAO;

	@Override
	public XfbwjwDAO getBaseDAO() {
		return xfbwjwDAO;
	}
	/*--条件查询：重点单位.--*/
	@Override
	public List<XfbwjwVO> doFindXfbwjwlist(XfbwjwVO xfbwjwVO){
		return xfbwjwDAO.doSearchByVO(xfbwjwVO);
	}

	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<XfbwjwVO> doFindDetailById(String xfbwjwId) {
		return xfbwjwDAO.doFindDetailById(xfbwjwId);
	}


}