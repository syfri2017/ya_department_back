package com.syfri.digitalplan.service.basicinfo.watersource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.watersource.ShuiyuanVO;

import java.util.List;

public interface ShuiyuanService  extends BaseService<ShuiyuanVO>{
    /*--查询 如果shuiyuanVO为null，则获取所有水源列表.--*/
    List<ShuiyuanVO> doFindShuiyuanList(ShuiyuanVO shuiyuanVO);
    /* 查询 通过id、水源类型 查询水源信息及水源属性信息*/
    public ShuiyuanVO doFindShuiyuanById(ShuiyuanVO shuiyuanVO);

}