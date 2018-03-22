package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfshVO;

public interface XfshDAO extends BaseDAO<XfshVO>{
    XfshVO doFindXfshById(XfshVO xfshVO);
}