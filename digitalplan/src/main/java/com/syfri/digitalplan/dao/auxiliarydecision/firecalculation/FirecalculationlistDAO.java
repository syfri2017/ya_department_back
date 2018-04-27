package com.syfri.digitalplan.dao.auxiliarydecision.firecalculation;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO;
import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirecalculationlistDAO extends BaseDAO<FirecalculationlistVO>{
    /**
     * @Description: 根据条件查询记录
     * @Param: [firecalculationlistVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/24 16:26
     */
    List<FirecalculationlistVO> doSearchByVO(FirecalculationlistVO firecalculationlistVO);

    List<FirecalculationparamVO> doFindCsById(String gsid);
    /*--删除公式时删除参数数据--*/
    int doDeleteJsgsCsBatch(String uuid);

    /*--新增公式时新增参数数据--*/
    int doInsertCsByVO(@Param("gsid") String gsid,@Param("params") List<FirecalculationparamVO> params);

    /*--修改公式时修改参数数据--*/
    int doUpdateCsByVO(FirecalculationparamVO firecalculationparamVO);
}