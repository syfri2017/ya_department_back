package com.syfri.digitalplan.service.auxiliarydecision.firecalculation;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO;
import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO;

import java.util.List;

public interface FirecalculationlistService  extends BaseService<FirecalculationlistVO>{

    /**
     * @Description: 查询：火场计算.
     * @Param: [firecalculationlistVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/24 16:30
     */
    List<FirecalculationlistVO> doFindlist(FirecalculationlistVO firecalculationlistVO);

    List<FirecalculationparamVO> doFindCsById(String gsid);

    /*--删除：删除公式同时删除其参数.--*/
    void doDeleteJsgsCs(String uuid);

    /*--新增：增加公式并为公式赋予参数.--*/
    int doInsertJsgsCs(FirecalculationlistVO firecalculationlistVO);
    /*--修改：修改公式并为公式修改参数.--*/
    int doUpdateJsgsCs(FirecalculationlistVO firecalculationlistVO);
}