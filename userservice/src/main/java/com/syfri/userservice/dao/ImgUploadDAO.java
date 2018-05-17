package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.ImgUploadVO;

import java.util.List;

public interface ImgUploadDAO extends BaseDAO<ImgUploadVO>{

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
     * @Description: 上传图片
     * @Param: [imgUploadVO]
     * @Return: void
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/20 16:45
     */
    void doInsertImg(ImgUploadVO imgUploadVO);
}