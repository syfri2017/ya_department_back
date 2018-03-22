package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfscVO;

public interface XfscDAO extends BaseDAO<XfscVO>{
    XfscVO doFindXfscById(XfscVO xfscVO);
}