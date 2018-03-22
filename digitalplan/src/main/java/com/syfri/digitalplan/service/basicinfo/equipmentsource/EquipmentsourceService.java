package com.syfri.digitalplan.service.basicinfo.equipmentsource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipmentsourceVO;

import java.util.List;

public interface EquipmentsourceService  extends BaseService<EquipmentsourceVO>{

    /*--查询：重点单位.--*/
    List<EquipmentsourceVO> doFindlist(EquipmentsourceVO equipmentsourceVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<EquipmentsourceVO> doFindDetailById(String id);

}