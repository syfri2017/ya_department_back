package com.syfri.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.ImgUploadDAO;
import com.syfri.userservice.model.ImgUploadVO;
import com.syfri.userservice.service.ImgUploadService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("imguploadService")
public class ImgUploadServiceImpl extends BaseServiceImpl<ImgUploadVO> implements ImgUploadService {

	@Autowired
	private ImgUploadDAO imgUploadDAO;

	@Override
	public ImgUploadDAO getBaseDAO() {
		return imgUploadDAO;
	}

	/*--获取所有角色.--*/
	@Override
	public List<ImgUploadVO> doFindAll(){
		return imgUploadDAO.doFindAll();
	}
}