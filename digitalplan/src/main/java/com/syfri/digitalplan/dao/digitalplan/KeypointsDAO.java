package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.KeypointsVO;

import java.util.List;

public interface KeypointsDAO extends BaseDAO<KeypointsVO>{

    List<KeypointsVO> doFindByPlanId(String yaid);
}