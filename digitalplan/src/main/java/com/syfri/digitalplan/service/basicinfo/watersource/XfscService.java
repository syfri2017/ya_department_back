package com.syfri.digitalplan.service.basicinfo.watersource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.watersource.XfscVO;

public interface XfscService  extends BaseService<XfscVO>{
    public XfscVO doFindXfscById(XfscVO xfscVO);
}