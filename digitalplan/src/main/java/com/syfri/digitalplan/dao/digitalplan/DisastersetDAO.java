package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.DisastersetVO;

import java.util.List;

public interface DisastersetDAO extends BaseDAO<DisastersetVO>{

    List<DisastersetVO> doFindByPlanId(String yaid);

}