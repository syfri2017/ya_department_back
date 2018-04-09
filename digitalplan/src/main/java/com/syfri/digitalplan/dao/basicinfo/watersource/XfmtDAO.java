package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfmtVO;
import java.util.List;

public interface XfmtDAO extends BaseDAO<XfmtVO>{
    public XfmtVO doFindXfmtById(XfmtVO xfmtVO);
}