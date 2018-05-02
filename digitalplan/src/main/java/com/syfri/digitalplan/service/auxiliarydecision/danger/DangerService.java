package com.syfri.digitalplan.service.auxiliarydecision.danger;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.auxiliarydecision.danger.DangerVO;
import java.util.List;

public interface DangerService  extends BaseService<DangerVO>{
    /**
     * @Description: 查询：化学危险品.
     * @Param: [dangerVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.danger.DangerVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/20 16:45
     */
    List<DangerVO> doFindlist(DangerVO dangerVO);
}