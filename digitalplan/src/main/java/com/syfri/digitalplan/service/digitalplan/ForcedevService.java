package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.ForcedevVO;

import java.util.List;

public interface ForcedevService  extends BaseService<ForcedevVO>{

    List<ForcedevVO> doFindByPlanId(String yaid);
}