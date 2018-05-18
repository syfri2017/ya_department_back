package com.syfri.digitalplan.service.advancedsearch;

import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import java.util.List;

public interface SearchService {
    public List<BuildingVO> doSearchGjssListByVO(BuildingVO vo);
}