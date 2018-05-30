package com.syfri.digitalplan.dao.digitalplan;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.digitalplan.GuardobjectsplanVO;

import java.util.List;


public interface GuardobjectsplanDAO extends BaseDAO<GuardobjectsplanVO>{
/**
 * @Description:
 * @Param: [guardobjectsplanVO]
 * @Return: java.util.List<com.syfri.digitalplan.model.digitalplan.GuardobjectsplanVO>
 * @Author: zhaijianchen
 * @Modified By:
 * @Date: 2018/4/20 16:55
 */
    
    /*--根据条件查询记录.--*/
    List<GuardobjectsplanVO> doSearchByVO(GuardobjectsplanVO guardobjectsplanVO);

    /*--根据预案ID获取预案详情.--*/
    GuardobjectsplanVO doFindDetailById(String id);

}