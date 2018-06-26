package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.GuardobjectsplanVO;

import java.util.List;

public interface GuardobjectsplanService extends BaseService<GuardobjectsplanVO>{
    /*--查询：消防保卫警卫预案.--*/
    List<GuardobjectsplanVO> doFindXfbwjwlist(GuardobjectsplanVO guardobjectsplanVO);

    /*--根据重点单位ID获取消防保卫警卫预案详情-*/
    GuardobjectsplanVO doFindDetailById(String xfbwjwId);
}