package com.syfri.digitalplan.dao.basicinfo.firedrugsource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;

import java.util.List;

public interface FiredrugDAO extends BaseDAO<FiredrugVO>{

    /*--根据条件查询记录.--*/
    List<FiredrugVO> doSearchByVO(FiredrugVO firedrugVO);

}