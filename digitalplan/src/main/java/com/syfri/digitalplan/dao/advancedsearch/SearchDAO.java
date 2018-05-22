package com.syfri.digitalplan.dao.advancedsearch;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;

public interface SearchDAO{
    //高级搜索查询建筑列表
    public List<BuildingVO> doSearchGjssDwjzListByVO(BuildingVO vo);
    //高级搜索查询建筑类建筑列表
    public List<BuildingVO> doSearchGjssJzlListByVO(BuildingVO vo);
    //高级搜索查询装置类建筑列表
    public List<BuildingVO> doSearchGjssZzlListByVO(BuildingVO vo);
    //高级搜索查询储罐类建筑列表
    public List<BuildingVO> doSearchGjssCglListByVO(BuildingVO vo);

    //高级搜索 查询预案信息
    public List<DigitalplanlistVO> doSearchGjssYaxxByVO(DigitalplanlistVO vo);
    //高级搜索 查询预案信息 重点单位列表
    public List<DigitalplanlistVO> doSearchGjssYaxxZddwByVO(DigitalplanlistVO vo);
    //高级搜索 查询预案信息 保卫警卫列表
    public List<DigitalplanlistVO> doSearchGjssYaxxBwjwByVO(DigitalplanlistVO vo);
    //高级搜索 查询预案信息 其他对象列表
    public List<DigitalplanlistVO> doSearchGjssYaxxQtdxByVO(DigitalplanlistVO vo);

    //高级搜索 查询预案对象信息
    public List<ImportantunitsVO> doSearchGjssYadxByVO(ImportantunitsVO vo);
    //高级搜索 查询预案对象信息 重点单位
    public List<ImportantunitsVO> doSearchGjssYadxZddwByVO(ImportantunitsVO vo);
    //高级搜索 查询预案对象信息 保卫警卫列表
    public List<ImportantunitsVO> doSearchGjssYadxBwjwByVO(ImportantunitsVO vo);
    //高级搜索 查询预案对象信息 其他对象列表
    public List<ImportantunitsVO> doSearchGjssYadxQtdxByVO(ImportantunitsVO vo);
}