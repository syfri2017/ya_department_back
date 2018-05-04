package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.ForcedevVO;

import java.util.List;

public interface ForcedevDAO extends BaseDAO<ForcedevVO>{

    List<ForcedevVO> doFindByPlanId(String yaid);

}