package com.syfri.digitalplan.dao.basicinfo.equipstocksource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.equipstocksource.EquipstocksourceVO;

import java.util.List;

public interface EquipstocksourceDAO extends BaseDAO<EquipstocksourceVO>{

    /*--根据条件查询记录.--*/
    List<EquipstocksourceVO> doSearchByVO(EquipstocksourceVO equipstocksourceVO);

    /*--根据装备id获取装备详情.--*/
    List<EquipstocksourceVO> doFindDetailById(String id);

}