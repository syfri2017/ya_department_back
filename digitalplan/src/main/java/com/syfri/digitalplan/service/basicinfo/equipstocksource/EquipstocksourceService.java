package com.syfri.digitalplan.service.basicinfo.equipstocksource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.equipstocksource.EquipstocksourceVO;

import java.util.List;

public interface EquipstocksourceService  extends BaseService<EquipstocksourceVO>{

    /*--查询：重点单位.--*/
    List<EquipstocksourceVO> doFindlist(EquipstocksourceVO equipstocksourceVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<EquipstocksourceVO> doFindDetailById(String id);

}