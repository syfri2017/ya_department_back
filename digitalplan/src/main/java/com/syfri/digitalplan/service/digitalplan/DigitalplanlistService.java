package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;

import java.util.List;

public interface DigitalplanlistService  extends BaseService<DigitalplanlistVO>{
    /**
     * @Description: 查询：预案管理.
     * @Param: [digitalplanlistVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/23 9:05
     */
    List<DigitalplanlistVO> doFindlist(DigitalplanlistVO digitalplanlistVO);
}