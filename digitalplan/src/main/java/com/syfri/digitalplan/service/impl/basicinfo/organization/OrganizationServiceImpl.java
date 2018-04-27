package com.syfri.digitalplan.service.impl.basicinfo.organization;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.organization.OrganizationDAO;
import com.syfri.digitalplan.model.basicinfo.organization.OrganizationVO;
import com.syfri.digitalplan.service.basicinfo.organization.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


	/*--根据重点单位id获取重点单位详情--*/
	@Override
	public List<OrganizationVO> doFindDetailById(String organizationId){
		return organizationDAO.doFindDetailById(organizationId);
	}


}