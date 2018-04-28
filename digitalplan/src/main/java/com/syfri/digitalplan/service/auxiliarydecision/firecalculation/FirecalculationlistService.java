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

    /**
     * @Description: 查询：根据公式id查询参数信息
     * @Param: [gsid]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:57
     */
    List<FirecalculationparamVO> doFindCsById(String gsid);

    /**
     * @Description: 删除：删除公式同时删除其参数.
     * @Param: [uuid]
     * @Return: void
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:58
     */
    void doDeleteJsgsCs(String uuid);

    /**
     * @Description: 新增：增加公式并为公式赋予参数.
     * @Param: [firecalculationlistVO]
     * @Return: int
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:58
     */
    int doInsertJsgsCs(FirecalculationlistVO firecalculationlistVO);

    /**
     * @Description: 修改：修改公式并为公式修改参数.
     * @Param: [firecalculationlistVO]
     * @Return: int
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:59
     */
    int doUpdateJsgsCs(FirecalculationlistVO firecalculationlistVO);
}