package com.syfri.digitalplan.dao.importantparts;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;

import java.util.List;

public interface ImportantpartsDAO extends BaseDAO<ImportantpartsVO>{
    /*--根据重点单位id获取建筑类重点部位详情集合.--*/
    List<ImportantpartsVO> doFindJzlListByZddwId(String zddwId);
    /*--根据重点单位id获取装置类重点部位详情集合.--*/
    List<ImportantpartsVO> doFindZzlListByZddwId(String zddwId);
    /*--根据重点单位id获取储罐类重点部位详情集合.--*/
    List<ImportantpartsVO> doFindCglListByZddwId(String zddwId);
}