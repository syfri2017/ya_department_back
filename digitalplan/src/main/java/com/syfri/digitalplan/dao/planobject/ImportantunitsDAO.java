package com.syfri.digitalplan.dao.planobject;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsBuildingVO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;

public interface ImportantunitsDAO extends BaseDAO<ImportantunitsVO>{

    //通过重点单位id 获取单位中所有消防力量信息
    public List<XiaofangliliangVO> doFindXfllListByZddwId(String zddwId);

    /**
     * author lxy
     * @param vo
     * @return
     */
    public List<ImportantunitsVO> doSearchZddwListByVO(ImportantunitsVO vo);
    /*--通过重点单位id 查询包含重点单位-建筑信息关系表 by li.xue 2018/8/14.--*/
    List<ImportantunitsBuildingVO> doFindJzxxListByZddwId(String zddwid);


}