package com.syfri.userservice.dao;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.userservice.model.ImgUploadVO;

import java.util.List;

public interface ImgUploadDAO extends BaseDAO<ImgUploadVO>{
    /*--获取所有角色.--*/
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