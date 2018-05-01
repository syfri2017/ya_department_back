package com.syfri.digitalplan.service.keyunits;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.keyunits.KeyunitsVO;

import java.util.List;

public interface KeyunitsService  extends BaseService<KeyunitsVO>{

    /*--查询：重点单位.--*/
    List<KeyunitsVO> doFindKeyunitlist(KeyunitsVO keyunitVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<KeyunitsVO> doFindDetailById(String keyunitId);
}