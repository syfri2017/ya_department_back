package com.syfri.digitalplan.service.yafjxz;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.yafjxz.YafjxzVO;

public interface YafjxzService  extends BaseService<YafjxzVO>{
    public void doDeletcNotIn(String oldYafjxzVOs);
}