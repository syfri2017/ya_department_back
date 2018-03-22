package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XhsVO;

public interface XhsDAO extends BaseDAO<XhsVO>{
    XhsVO doFindXhsById(XhsVO xhsVO);
   // XhsVO doFindXhsById(String id);
}