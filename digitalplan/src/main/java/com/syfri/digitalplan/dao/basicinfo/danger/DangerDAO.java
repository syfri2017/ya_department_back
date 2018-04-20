package com.syfri.digitalplan.dao.basicinfo.danger;

import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.equipmentsource.EquipmentsourceVO;

import java.util.List;

public interface DangerDAO extends BaseDAO<DangerVO>{
    /*--根据条件查询记录.--*/
    List<DangerVO> doSearchByVO(DangerVO dangerVO);

    void doInsertImg(DangerVO dangerVO);
}