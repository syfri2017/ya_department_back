package com.syfri.digitalplan.dao.xfbwjw;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.xfbwjw.XfbwjwVO;

import java.util.List;

public interface XfbwjwDAO extends BaseDAO<XfbwjwVO>{

    /*--根据条件查询记录.--*/
    List<XfbwjwVO> doSearchByVO(XfbwjwVO xfbwjwVO);

    /*--根据装备id获取装备详情.--*/
    List<XfbwjwVO> doFindDetailById(String id);

}