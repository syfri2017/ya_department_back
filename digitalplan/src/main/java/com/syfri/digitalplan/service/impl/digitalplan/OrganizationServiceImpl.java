package com.syfri.digitalplan.service.impl.digitalplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.digitalplan.OrganizationDAO;
import com.syfri.digitalplan.model.digitalplan.OrganizationVO;
import com.syfri.digitalplan.service.digitalplan.OrganizationService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("organizationService")
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationVO> implements OrganizationService {

	@Autowired
	private OrganizationDAO organizationDAO;

	@Override
	public OrganizationDAO getBaseDAO() {
		return organizationDAO;
	}

//	/*--条件查询：重点单位.--*/
//	@Override
//	public List<OrganizationVO> doFindOrganizationlist(OrganizationVO organizationVO){
//		return organizationDAO.doSearchByVO(organizationVO);
//	}
//
	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<OrganizationVO> doFindDetailById(String organizationId){
		return organizationDAO.doFindDetailById(organizationId);
	}


}