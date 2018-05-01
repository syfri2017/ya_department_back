package com.syfri.digitalplan.dao.keyunits;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.keyunits.KeyunitsVO;

import java.util.List;

public interface KeyunitsDAO extends BaseDAO<KeyunitsVO>{

    /*--根据条件查询记录.--*/
    List<KeyunitsVO> doSearchByVO(KeyunitsVO keyunitsVO);

    /*--根据重点单位id获取重点单位详情.--*/
    List<KeyunitsVO> doFindDetailById(String keyunitId);

}