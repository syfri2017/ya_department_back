package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.ShuiyuanVO;

import java.util.List;

public interface ShuiyuanDAO extends BaseDAO<ShuiyuanVO>{
    /*获取水源，如果ShuiyuanVO为null，则获取所有水源列表.*/
    List<ShuiyuanVO> doFindShuiyuanList(ShuiyuanVO shuiyuanVO);

    ShuiyuanVO doFindShuiyuanById(ShuiyuanVO shuiyuanVO);
}