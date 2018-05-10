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

    //泡沫系统-泡沫泵房
    public List<Firefacilities_pmxt_pmbfVO> doFindPmbfList(String xfssid);
    //泡沫系统-泡沫消火栓
    public List<Firefacilities_pmxt_pmxhsVO> doFindPmxhsList(String xfssid);
    //泡沫系统-固定泡沫炮
    public List<Firefacilities_pmxt_gdpmpVO> doFindGdpmpList(String xfssid);
    //泡沫系统-泡沫发生器
    public List<Firefacilities_pmxt_pmfsqVO> doFindPmfsqList(String xfssid);
    //泡沫系统-半固定设施
    public List<Firefacilities_pmxt_bgdssVO> doFindPmBgdssList(String xfssid);

    //蒸汽灭火系统-固定式
    public List<Firefacilities_zqmhxt_gdsVO> doFindGdsList(String xfssid);
    //蒸汽灭火系统-半固定式
    public List<Firefacilities_zqmhxt_bgdsVO> doFindBgdsList(String xfssid);
    //消防控制室
    public List<Firefacilities_xfkzsVO> doFindXfkzsList(String xfssid);
    //防排烟措施-排烟口/出烟口
    public List<Firefacilities_fpycs_pycykVO> doFindPycykList(String xfssid);
    //防排烟措施-防排烟系统
    public List<Firefacilities_fpycs_fpyxtVO> doFindFpyxtList(String xfssid);
    //防火分区
    public List<Firefacilities_fhfqVO> doFindFhfqList(String xfssid);
    //其他灭火系统-气体灭火系统
    public List<Firefacilities_qtmhxt_qtmhxtVO> doFindQtmhxtList(String xfssid);
    //其他灭火系统-干粉灭火系统
    public List<Firefacilities_qtmhxt_gfmhxtVO> doFindGfmhxtList(String xfssid);
    //其他消防设施
    public List<Firefacilities_qtxfssVO> doFindQtxfssList(String xfssid);
}