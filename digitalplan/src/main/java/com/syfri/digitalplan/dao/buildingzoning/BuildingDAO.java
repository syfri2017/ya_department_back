package com.syfri.digitalplan.dao.buildingzoning;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.buildingzoning.WeixianjiezhiVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;

import java.util.List;

public interface BuildingDAO extends BaseDAO<BuildingVO>{
    //分区类型为10和20 查找建筑分区详情关联建筑分区-建筑类
    public BuildingVO doFindFqAndJzDetailByVo(BuildingVO vo);
    //分区类型为30 查找建筑分区详情关联建筑分区-装置类
    public BuildingVO doFindFqAndZzDetailByVo(BuildingVO vo);
    //分区型为40 查找建筑分区详情关联建筑分区-储罐类
    public BuildingVO doFindFqAndCgDetailByVo(BuildingVO vo);

    //通过建筑id 获取建筑中所有危险介质信息
    public List<WeixianjiezhiVO> doFindWeiXianJieZhiList(WeixianjiezhiVO vo);
    //通过罐组id 获取罐组中所有储罐信息
    public List<ChuguanVO> doFindChuGuanList(ChuguanVO vo);

    //通过重点单位id 查询包含分区id
    public List<String> doFindFqidListByZddwid(String zddwid);

    //高级搜索查询建筑列表
    public List<BuildingVO> doSearchGjssListByVO(BuildingVO vo);

    //高级搜索查询建筑类建筑列表
    public List<BuildingVO> doSearchGjssJzlListByVO(BuildingVO vo);
}