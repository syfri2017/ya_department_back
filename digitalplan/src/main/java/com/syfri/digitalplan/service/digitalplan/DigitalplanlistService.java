package com.syfri.digitalplan.service.digitalplan;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;

import java.util.List;

public interface DigitalplanlistService  extends BaseService<DigitalplanlistVO>{
    /**
     * @Description: 查询：预案管理.
     * @Param: [digitalplanlistVO]
     * @Return: java.util.List<com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO>
     * @Author: dongbo
     * @Modified By:
     * @Date: 2018/4/23 9:05
     */
    List<DigitalplanlistVO> doFindlist(DigitalplanlistVO digitalplanlistVO);

    /*预案审批（更新部分字段）
     *by yushch 20180426
     */
    DigitalplanlistVO doApproveUpdate(DigitalplanlistVO digitalplanlistVO);

    /**
     * @Description: 新增：预案
     * @Param: [digitalplanlistVO]
     * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/1 12:15
     */
    DigitalplanlistVO doInsertDigitalplan(DigitalplanlistVO digitalplanlistVO);

    /**
     * @Description: 修改：预案
     * @Param: [digitalplanlistVO]
     * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
     * @Author: liurui
     * @Modified By:
     * @Date: 2018/5/2 15:56
     */
    DigitalplanlistVO doUpdateDigitalplan(DigitalplanlistVO digitalplanlistVO);
}