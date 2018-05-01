package com.syfri.digitalplan.dao.planobject;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.planobject.BwjwplanVO;

import java.util.List;

public interface BwjwplanDAO extends BaseDAO<BwjwplanVO>{
    /*--根据条件查询记录.--*/
    List<BwjwplanVO> doSearchByVO(BwjwplanVO bwjwplanVO);

    /*--根据重点单位id获取重点单位详情.--*/
    List<BwjwplanVO> doFindDetailById(String bwjwplanId);


}