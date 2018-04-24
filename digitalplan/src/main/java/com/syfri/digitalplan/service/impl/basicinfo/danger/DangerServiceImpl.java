package com.syfri.digitalplan.service.impl.basicinfo.danger;

import com.syfri.digitalplan.dao.basicinfo.danger.DangerDAO;
import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;
import com.syfri.digitalplan.service.basicinfo.danger.DangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syfri.baseapi.service.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("dangerService")
public class DangerServiceImpl extends BaseServiceImpl<DangerVO> implements DangerService {

	@Autowired
	private DangerDAO dangerDAO;

	@Override
	public DangerDAO getBaseDAO() {
		return dangerDAO;
	}
	/**
	 * @Description: 条件查询：危化品.
	 * @Param: [dangerVO]
	 * @Return: java.util.List<com.syfri.digitalplan.model.basicinfo.danger.DangerVO>
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/20 16:46
	 */
	@Override
	public List<DangerVO> doFindlist(DangerVO dangerVO){
		//英文名
		if(dangerVO.getEnglishName()!=null && !"".equals(dangerVO.getEnglishName())){
			dangerVO.setEnglishName(dangerVO.getEnglishName().toLowerCase());
		}
		return dangerDAO.doSearchByVO(dangerVO);
	}
}