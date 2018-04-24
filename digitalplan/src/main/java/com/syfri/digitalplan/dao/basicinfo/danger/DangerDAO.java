package com.syfri.digitalplan.dao.basicinfo.danger;

import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;
import com.syfri.baseapi.dao.BaseDAO;
import java.util.List;

public interface DangerDAO extends BaseDAO<DangerVO>{
    /**
     * @Description: 根据条件查询记录
     * @Param: [dangerVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.basicinfo.danger.DangerVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/20 16:45
     */
    List<DangerVO> doSearchByVO(DangerVO dangerVO);

    /**
     * @Description: 上传图片
     * @Param: [dangerVO]
     * @Return: void
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/20 16:45
     */
    void doInsertImg(DangerVO dangerVO);
}