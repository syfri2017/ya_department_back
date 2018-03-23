package com.syfri.digitalplan.service.impl.basicinfo.watersource;

import com.syfri.digitalplan.dao.basicinfo.watersource.ShuiyuanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.basicinfo.watersource.ShuiyuanVO;
import com.syfri.digitalplan.service.basicinfo.watersource.ShuiyuanService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Console;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("shuiyuanService")
public class ShuiyuanServiceImpl extends BaseServiceImpl<ShuiyuanVO> implements ShuiyuanService {

	@Autowired
	private ShuiyuanDAO shuiyuanDAO;

	@Override
	public ShuiyuanDAO getBaseDAO() {
		return shuiyuanDAO;
	}

	/*--查询：根据查询条件获取水源列表 水源类型为多选值--.*/
	@Override
	public List<ShuiyuanVO> doFindShuiyuanList(ShuiyuanVO shuiyuanVO) {
		String str = shuiyuanVO.getSylx();
		if(!(str.isEmpty())){
			str = str.substring(0,str.length()-1);
			shuiyuanVO.setSylx(str);
		}
		return shuiyuanDAO.doFindShuiyuanList(shuiyuanVO);
	}

	public ShuiyuanVO doFindShuiyuanById(ShuiyuanVO shuiyuanVO) {
		return shuiyuanDAO.doFindShuiyuanById(shuiyuanVO);
	}
}