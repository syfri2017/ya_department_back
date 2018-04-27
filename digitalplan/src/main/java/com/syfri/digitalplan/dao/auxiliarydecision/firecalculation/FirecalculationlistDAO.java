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

    /**
     * @Description: 根据公式id查询参数
     * @Param: [gsid]
     * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:54
     */
    List<FirecalculationparamVO> doFindCsById(String gsid);

    /**
     * @Description: 删除公式时删除参数数据-
     * @Param: [uuid]
     * @Return: int
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:55
     */
    int doDeleteJsgsCsBatch(String uuid);

    /**
     * @Description: 新增公式时新增参数数据-
     * @Param: [gsid, params]
     * @Return: int
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:55
     */
    int doInsertCsByVO(@Param("gsid") String gsid,@Param("params") List<FirecalculationparamVO> params);
    
    /**
     * @Description: 修改公式时修改参数数据
     * @Param: [firecalculationparamVO]
     * @Return: int
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/27 9:55
     */
    int doUpdateCsByVO(FirecalculationparamVO firecalculationparamVO);
}