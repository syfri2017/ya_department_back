package com.syfri.digitalplan.dao.firefacilities;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.firefacilities.*;

import java.util.List;

public interface FirefacilitiesDAO extends BaseDAO<FirefacilitiesVO>{
    //查询安全出口列表
    public List<Firefacilities_aqsscs_aqckVO> doFindAqckList(String xfssid);
    //查询疏散楼梯列表
    public List<Firefacilities_aqsscs_ssltVO> doFindSsltList(String xfssid);
    //查询消防电梯列表
    public List<Firefacilities_aqsscs_xfdtVO> doFindXfdtList(String xfssid);
    //查询避难层列表
    public List<Firefacilities_aqsscs_bncVO> doFindBncList(String xfssid);
    //查询应急广播列表
    public List<Firefacilities_aqsscs_yjgbVO> doFindYjgbList(String xfssid);
}