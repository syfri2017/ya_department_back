package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.ImgUploadVO;

import java.util.List;

public interface ImgUploadService extends BaseService<ImgUploadVO>{
    /*--获取所有图片类型.--*/
    List<ImgUploadVO> doFindAll();
}