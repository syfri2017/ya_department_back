package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;

import java.util.List;

public interface DigitalplanlistDAO extends BaseDAO<DigitalplanlistVO>{

    /*
    * 预案审批（更新部分字段）
    * by yushch
    * 20180426
    * */
    public int doApproveUpdate(DigitalplanlistVO digitalplanlistVO);

    public String doFindShztmcByShzt(String shzt);

    public List<DigitalplanlistVO> doFindListByZddwId(String zddwId);
}