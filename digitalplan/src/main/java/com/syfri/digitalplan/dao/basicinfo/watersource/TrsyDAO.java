package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.TrsyVO;

public interface TrsyDAO extends BaseDAO<TrsyVO>{
    TrsyVO doFindTrsyById(TrsyVO trsyVO);
}