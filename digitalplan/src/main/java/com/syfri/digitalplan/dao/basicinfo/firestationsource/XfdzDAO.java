package com.syfri.digitalplan.dao.basicinfo.firestationsource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.firestationsource.XfdzVO;

import java.util.List;

public interface XfdzDAO extends BaseDAO<XfdzVO>{
    //查询总队队站详情
    public XfdzVO doFindDzZongDDetailByVo(XfdzVO xfdzVO);
    //查询支队队站详情
    public XfdzVO doFindDzZhiDDetailByVo(XfdzVO xfdzVO);
    //查询大队队站详情
    public XfdzVO doFindDzDaDDetailByVo(XfdzVO xfdzVO);
    //查询中队队站详情
    public XfdzVO doFindDzZhongDDetailByVo(XfdzVO xfdzVO);
    //查询其他消防队伍队站详情
    public XfdzVO doFindDzQtxfdwDetailByVo(XfdzVO xfdzVO);
    //查询行政区划所在省的所有队站
    public List<XfdzVO> doSearchProvinceList(XfdzVO xfdzVO);
}