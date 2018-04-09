package com.syfri.digitalplan.service.basicinfo.watersource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.watersource.XfmtVO;
import java.util.List;

public interface XfmtService  extends BaseService<XfmtVO>{
    public XfmtVO doFindXfmtById(XfmtVO xfmtVO);
}