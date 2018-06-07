package com.syfri.digitalplan.service.basicinfo.firestationsource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.firestationsource.XfdzVO;

import java.util.List;

public interface XfdzService  extends BaseService<XfdzVO>{
    public XfdzVO doFindDzDetailByVo(XfdzVO xfdzVO);
    public List<XfdzVO> doSearchProvinceList(XfdzVO xfdzVO);
}