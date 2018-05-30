package com.syfri.digitalplan.dao.xfbwjw;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.xfbwjw.XfbwjwVO;

import java.util.List;


public interface XfbwjwDAO extends BaseDAO<XfbwjwVO>{
/**
 * @Description:
 * @Param: [xfbwjwVO]
 * @Return: java.util.List<com.syfri.digitalplan.model.xfbwjw.XfbwjwVO>
 * @Author: zhaijianchen
 * @Modified By:
 * @Date: 2018/4/20 16:55
 */
    
    /*--根据条件查询记录.--*/
    List<XfbwjwVO> doSearchByVO(XfbwjwVO xfbwjwVO);

    /*--根据预案ID获取预案详情.--*/
    XfbwjwVO doFindDetailById(String id);

}