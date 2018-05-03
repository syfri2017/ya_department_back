package com.syfri.digitalplan.service.impl.importantparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.importantparts.ImportantpartsDAO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.service.importantparts.ImportantpartsService;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("importantpartsService")
public class ImportantpartsServiceImpl extends BaseServiceImpl<ImportantpartsVO> implements ImportantpartsService {

	@Autowired
	private ImportantpartsDAO importantpartsDAO;

	@Override
	public ImportantpartsDAO getBaseDAO() {
		return importantpartsDAO;
	}

	/*--根据重点单位id获取建筑类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindJzlListByZddwId(String zddwId) {
		return this.importantpartsDAO.doFindJzlListByZddwId(zddwId);
	}
	/*--根据重点单位id获取装置类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindZzlListByZddwId(String zddwId) {
		return this.importantpartsDAO.doFindZzlListByZddwId(zddwId);
	}
	/*--根据重点单位id获取储罐类重点部位详情集合.--*/
	@Override
	public List<ImportantpartsVO> doFindCglListByZddwId(String zddwId) {
		return this.importantpartsDAO.doFindCglListByZddwId(zddwId);
	}
}