package com.syfri.digitalplan.service.keyunits;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.keyunits.KeyunitVO;

import java.util.List;

public interface KeyunitService  extends BaseService<KeyunitVO>{

    /*--查询：重点单位.--*/
    List<KeyunitVO> doFindKeyunitlist(KeyunitVO keyunitVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<KeyunitVO> doFindDetailById(String keyunitId);
}