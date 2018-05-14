package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.KeypointsVO;

import java.util.List;

public interface KeypointsService  extends BaseService<KeypointsVO>{

    KeypointsVO doFindByPlanId(String yaid);
}