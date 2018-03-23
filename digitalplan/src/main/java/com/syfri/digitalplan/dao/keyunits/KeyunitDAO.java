package com.syfri.digitalplan.dao.keyunits;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.keyunits.KeyunitVO;

import java.util.List;

public interface KeyunitDAO extends BaseDAO<KeyunitVO>{

    /*--根据条件查询记录.--*/
    List<KeyunitVO> doSearchByVO(KeyunitVO keyunitVO);

    /*--根据重点单位id获取重点单位详情.--*/
    List<KeyunitVO> doFindDetailById(String keyunitId);
}