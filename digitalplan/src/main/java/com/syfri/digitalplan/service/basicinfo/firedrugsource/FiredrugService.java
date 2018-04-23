package com.syfri.digitalplan.service.basicinfo.firedrugsource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;

import java.util.List;

public interface FiredrugService  extends BaseService<FiredrugVO>{

    /*--查询：消防药剂.--*/
    List<FiredrugVO> doFindlist(FiredrugVO firedrugVO);

    /*--去掉字符串结尾所有0--*/
    public String delZero(String tempString);

}