package com.syfri.digitalplan.dao.yafjxz;

import com.syfri.baseapi.dao.BaseDAO;
import com.syfri.digitalplan.model.yafjxz.YaxxzlVO;

import java.util.List;

public interface YaxxzlDAO extends BaseDAO<YaxxzlVO> {
    List<YaxxzlVO> doFindHisByPlanId(String yaid);

    /**
     * 根据机构id查询附件
     * @param jgid
     * @return
     */
    List<YaxxzlVO> doSearchListXxzlYaByVO(String jgid);

    String doSearchOrgs(String jgid);
}