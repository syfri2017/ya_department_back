package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.GuardobjectsplanVO;

import java.util.List;

public interface GuardobjectsplanService extends BaseService<GuardobjectsplanVO>{
    /*--查询：重点单位.--*/
    List<GuardobjectsplanVO> doFindXfbwjwlist(GuardobjectsplanVO guardobjectsplanVO);

    /*--根据重点单位ID获取重点单位详情-*/
    GuardobjectsplanVO doFindDetailById(String xfbwjwId);
}