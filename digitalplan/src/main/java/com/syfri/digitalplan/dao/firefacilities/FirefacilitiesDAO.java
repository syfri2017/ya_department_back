package com.syfri.digitalplan.dao.firefacilities;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.firefacilities.*;

import java.util.List;

public interface FirefacilitiesDAO extends BaseDAO<FirefacilitiesVO>{
    //查询 安全疏散措施-安全出口 列表
    public List<Firefacilities_aqsscs_aqckVO> doFindAqckList(String xfssid);
    //查询 安全疏散措施-疏散楼梯 列表
    public List<Firefacilities_aqsscs_ssltVO> doFindSsltList(String xfssid);
    //查询 安全疏散措施-消防电梯 列表
    public List<Firefacilities_aqsscs_xfdtVO> doFindXfdtList(String xfssid);
    //查询 安全疏散措施-避难层 列表
    public List<Firefacilities_aqsscs_bncVO> doFindBncList(String xfssid);
    //查询 安全疏散措施-应急广播 列表
    public List<Firefacilities_aqsscs_yjgbVO> doFindYjgbList(String xfssid);

    //查询消防水系统-消防泵房 列表
    public List<Firefacilities_xfsxt_xfbfVO> doFindXfbfList(String xfssid);
    //查询 消防水系统-消防水箱 列表
    public List<Firefacilities_xfsxt_xfsxVO> doFindXfsxList(String xfssid);
    //查询 消防水系统-消防水池 列表
    public List<Firefacilities_xfsxt_xfscVO> doFindXfscList(String xfssid);
    //查询 消防水系统-室内消火栓 列表
    public List<Firefacilities_xfsxt_snxhsVO> doFindSnxhsList(String xfssid);
    //消防水系统-室外消火栓
    public List<Firefacilities_xfsxt_swxhsVO> doFindSwxhsList(String xfssid);
    //消防水系统-水泵接合器
    public List<Firefacilities_xfsxt_sbjhqVO> doFindSbjhqList(String xfssid);
    //消防水系统-喷淋系统
    public List<Firefacilities_xfsxt_plxtVO> doFindPlxtList(String xfssid);
    //消防水系统-冷却水系统
    public List<Firefacilities_xfsxt_lqsxtVO> doFindLqsxtList(String xfssid);
    //消防水系统-固定水炮
    public List<Firefacilities_xfsxt_gdspVO> doFindGdspList(String xfssid);
    //消防水系统-半固定设施
    public List<Firefacilities_xfsxt_bgdssVO> doFindBgdssList(String xfssid);
}