package com.syfri.digitalplan.dao.basicinfo.equipmentsource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipmentsourceVO;

import java.util.List;

public interface EquipmentsourceDAO extends BaseDAO<EquipmentsourceVO>{

    /*--根据条件查询记录.--*/
    List<EquipmentsourceVO> doSearchByVO(EquipmentsourceVO equipmentsourceVO);

    /*--根据装备id获取装备详情.--*/
    List<EquipmentsourceVO> doFindDetailById(String id);

}