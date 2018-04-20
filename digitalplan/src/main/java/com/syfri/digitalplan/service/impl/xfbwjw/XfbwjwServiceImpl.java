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

	@Autowired
	private XfbwjwDAO xfbwjwDAO;

	@Override
	public XfbwjwDAO getBaseDAO() {
		return xfbwjwDAO;
	}





}