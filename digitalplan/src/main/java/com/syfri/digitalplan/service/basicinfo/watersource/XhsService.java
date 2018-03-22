package com.syfri.digitalplan.service.basicinfo.watersource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.watersource.XhsVO;

public interface XhsService  extends BaseService<XhsVO>{
    public XhsVO doFindXhsById(XhsVO xhsVO);

    /*--根据水源ID取消火栓Map.
    XhsVO getXhsByShuiyuanId(String id);--*/
}