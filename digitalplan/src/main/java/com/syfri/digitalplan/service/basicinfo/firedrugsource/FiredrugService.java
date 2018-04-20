package com.syfri.digitalplan.service.basicinfo.firedrugsource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;

import java.util.List;

public interface FiredrugService  extends BaseService<FiredrugVO>{

    /*--查询：重点单位.--*/
    List<FiredrugVO> doFindlist(FiredrugVO firedrugVO);

}