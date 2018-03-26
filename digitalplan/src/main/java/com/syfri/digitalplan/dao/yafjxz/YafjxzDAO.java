package com.syfri.digitalplan.dao.yafjxz;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.yafjxz.YafjxzVO;

public interface YafjxzDAO extends BaseDAO<YafjxzVO>{
    public void doDeletcNotIn(String oldYafjxzVOs);
}