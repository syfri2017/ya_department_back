package com.syfri.digitalplan.dao.planobject;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.planobject.GuardobjectsVO;

import java.util.List;

public interface GuardobjectsDAO extends BaseDAO<GuardobjectsVO>{
    /*--根据条件查询记录.--*/
    List<GuardobjectsVO> doSearchByVO(GuardobjectsVO guardobjectsVO);

    /*--根据重点单位id获取重点单位详情.--*/
    GuardobjectsVO doFindDetailById(String bwjwplanId);


}