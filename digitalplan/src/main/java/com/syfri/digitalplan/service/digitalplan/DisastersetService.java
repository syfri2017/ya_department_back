package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.DisastersetVO;

import java.util.List;

public interface DisastersetService  extends BaseService<DisastersetVO>{

    List<DisastersetVO> doFindByPlanId(String yaid);

}