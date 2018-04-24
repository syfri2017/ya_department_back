package com.syfri.digitalplan.service.xfbwjw;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.xfbwjw.XfbwjwVO;

import java.util.List;

public interface XfbwjwService  extends BaseService<XfbwjwVO>{
    /*--查询：重点单位.--*/
    List<XfbwjwVO> doFindXfbwjwlist(XfbwjwVO xfbwjwVO);

    /*--根据重点单位ID获取重点单位详情-*/
    List<XfbwjwVO> doFindDetailById(String xfbwjwId);
}