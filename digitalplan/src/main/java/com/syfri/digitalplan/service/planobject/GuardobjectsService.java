package com.syfri.digitalplan.service.planobject;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.planobject.GuardobjectsVO;

import java.util.List;

public interface GuardobjectsService extends BaseService<GuardobjectsVO>{

    /*--查询：重点单位.--*/
    List<GuardobjectsVO> doFindBwjwplanlist(GuardobjectsVO guardobjectsVO);

    /*--根据重点单位ID获取重点单位详情-*/
    GuardobjectsVO doFindDetailById(String bwjwplanId);



}