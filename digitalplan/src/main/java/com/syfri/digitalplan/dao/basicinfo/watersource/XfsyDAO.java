package com.syfri.digitalplan.dao.basicinfo.watersource;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.basicinfo.watersource.XfsyVO;

import java.util.List;

public interface XfsyDAO extends BaseDAO<XfsyVO>{
    public XfsyVO doFindSyAndSxByVo(XfsyVO vo);
    public XfsyVO doFindSyAndXHSByVo(XfsyVO vo);
    public XfsyVO doFindSyAndXFSCByVo(XfsyVO vo);
    public XfsyVO doFindSyAndXFSHByVo(XfsyVO vo);
    public XfsyVO doFindSyAndXFMTByVo(XfsyVO vo);
    public XfsyVO doFindSyAndTRSYByVo(XfsyVO vo);

    public List<XfsyVO> doFindListByVO(XfsyVO vo);
    public List<XfsyVO> doFindXhsListByVO(XfsyVO vo);
    public List<XfsyVO> doFindXfshListByVO(XfsyVO vo);
    public List<XfsyVO> doFindXfscListByVO(XfsyVO vo);
    public List<XfsyVO> doFindXfmtListByVO(XfsyVO vo);
    public List<XfsyVO> doFindTrsyListByVO(XfsyVO vo);

}