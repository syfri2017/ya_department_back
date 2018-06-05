package com.syfri.digitalplan.service.impl.digitalplan;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.DistributeDAO;
import com.syfri.digitalplan.model.digitalplan.DistributeVO;
import com.syfri.digitalplan.service.digitalplan.DistributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("distributeService")
public class DistributeServiceImpl extends BaseServiceImpl<DistributeVO> implements DistributeService {

	@Autowired
	private DistributeDAO distributeDAO;

	@Override
	public DistributeDAO getBaseDAO() {
		return distributeDAO;
	}

	/*向组织机构预案中间表批量插入数据*/
	@Override
	public DistributeVO doInsertDistributeVO(DistributeVO distributeVO){
		//删除原来的预案分发数据
		distributeDAO.doDeleteByYaid(distributeVO.getYaid());
		List jgjcList = distributeVO.getFfzd();
		for(int i=0;i<jgjcList.size();i++){
			distributeVO.setJgid((String) jgjcList.get(i));
			distributeDAO.doInsertDistributeVO(distributeVO);
		}
		return distributeVO;
	}

	/*根据预案ID查询分发的总队*/
	@Override
	public List<String> doFindFfzd(String yaid){
		return distributeDAO.doFindFfzd(yaid);
	}
}