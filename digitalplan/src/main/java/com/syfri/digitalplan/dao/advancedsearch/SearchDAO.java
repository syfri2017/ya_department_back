package com.syfri.digitalplan.dao.advancedsearch;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;
import com.syfri.digitalplan.model.buildingzoning.WeixianjiezhiVO;

import java.util.List;

public interface SearchDAO{

    //高级搜索查询建筑列表
    public List<BuildingVO> doSearchGjssListByVO(BuildingVO vo);

    //高级搜索查询建筑类建筑列表
    public List<BuildingVO> doSearchGjssJzlListByVO(BuildingVO vo);
    //高级搜索查询装置类建筑列表
    public List<BuildingVO> doSearchGjssZzlListByVO(BuildingVO vo);
    //高级搜索查询储罐类建筑列表
    public List<BuildingVO> doSearchGjssCglListByVO(BuildingVO vo);

}