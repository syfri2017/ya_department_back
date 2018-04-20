package com.syfri.digitalplan.service.basicinfo.watersource;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.watersource.XfsyVO;

import java.util.List;

public interface XfsyService  extends BaseService<XfsyVO>{
    public XfsyVO doFindSyAndSxByVo(XfsyVO xfsyVO);
    public List<XfsyVO> doFindListByVO(XfsyVO xfsyVO);
}