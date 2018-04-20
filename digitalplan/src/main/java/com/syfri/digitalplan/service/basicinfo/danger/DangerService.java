package com.syfri.digitalplan.service.basicinfo.danger;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;

import java.util.List;

public interface DangerService  extends BaseService<DangerVO>{
    /*--查询：重点单位.--*/
    List<DangerVO> doFindlist(DangerVO dangerVO);
}