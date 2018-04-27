package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;

import java.util.List;

public interface DigitalplanlistDAO extends BaseDAO<DigitalplanlistVO>{
    /**
     * @Description: 根据条件查询记录
     * @Param: [digitalplanlistVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/23 9:04
     */
    List<DigitalplanlistVO> doSearchByVO(DigitalplanlistVO digitalplanlistVO);

    /*
    * 预案审批（更新部分字段）
    * by yushch
    * 20180426
    * */
    public int doApproveUpdate(DigitalplanlistVO digitalplanlistVO);
}