package com.syfri.userservice.service;

import com.syfri.baseapi.service.BaseService;
import com.syfri.userservice.model.ImgUploadVO;

import java.util.List;

public interface ImgUploadService extends BaseService<ImgUploadVO>{
    /**
     * @Description: 获取所有图片类型
     * @Param: []
     * @Return: java.util.List<com.syfri.userservice.model.ImgUploadVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/5/17 11:04
     */
    List<ImgUploadVO> doFindAll();

    /**
     * @Description: 查询图片名称是否已存在
     * @Param: [vo]
     * @Return: java.util.List<com.syfri.userservice.model.ImgUploadVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/5/21 10:27
     */
    List<ImgUploadVO> doSearchListByPicName(ImgUploadVO vo);
}