package com.syfri.digitalplan.dao.planobject;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;

import java.util.List;

public interface ImportantunitsDAO extends BaseDAO<ImportantunitsVO>{

    //通过重点单位id 获取单位中所有消防力量信息
    public List<XiaofangliliangVO> doFindXfllListByZddwId(String zddwId);
}