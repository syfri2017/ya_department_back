package com.syfri.digitalplan.service.planobject;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.planobject.BwjwplanVO;

import java.util.List;

public interface BwjwplanService  extends BaseService<BwjwplanVO>{

    /*--查询：重点单位.--*/
    List<BwjwplanVO> doFindBwjwplanlist(BwjwplanVO bwjwplanVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<BwjwplanVO> doFindDetailById(String bwjwplanId);



}