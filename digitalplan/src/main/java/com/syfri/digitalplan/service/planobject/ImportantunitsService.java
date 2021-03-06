package com.syfri.digitalplan.service.planobject;

import com.syfri.baseapi.service.BaseService;
import com.syfri.digitalplan.model.basicinfo.fireenginesource.FireengineVO;
import com.syfri.digitalplan.model.buildingzoning.BuildingVO;
import com.syfri.digitalplan.model.importantparts.ImportantpartsVO;
import com.syfri.digitalplan.model.planobject.XiaofangliliangVO;
import com.syfri.digitalplan.model.planobject.ImportantunitsVO;
import com.syfri.digitalplan.model.yafjxz.YaxxzlVO;

import java.util.List;
import java.util.Map;

public interface ImportantunitsService  extends BaseService<ImportantunitsVO>{

    //通过重点单位id 查询包含消防队伍详情
    public List<XiaofangliliangVO> doFindXfllListByZddwId(String zddwId);

    //通过重点单位 查询包含分区详情
    public List<BuildingVO> doFindBuildingDetailsByVo(ImportantunitsVO vo);

    //通过重点单位 查询包含消防设施详情
    public Map<String, List> doFindFireFacilitiesDetailsByVo(ImportantunitsVO vo);

    //通过重点单位 查询建筑分区详情包含消防设施详情
    public List<BuildingVO> doFindBuildingDetailsAndFirefacilitiesByVo(ImportantunitsVO vo);

    /**
     * author lxy
     * @param vo
     * @return
     */
    public List<ImportantunitsVO> doSearchZddwListByVO(ImportantunitsVO vo);

    /*--根据重点单位ID查询单位建筑信息详情 by li.xue 2018/8/16--*/
    List<BuildingVO> doFindJzxxDetailByZddwId(String zddwid);
    /**
     * 通过重点单位Gis坐标 查询周围1公里水源信息
     * author liurui
     */
    Map<String, List> doFindXfsyListByZddwGis(ImportantunitsVO vo);

    /**
     * 通过重点单位Gis坐标 查询周围1公里车辆信息
     * author liurui
     */
    List<FireengineVO> doFindXfclListByZddwGis(ImportantunitsVO vo);

    /**
     * 通过重点单位id查询历史附件信息列表
     * author huangrui
     */
    List<YaxxzlVO> doFindHisPlanListByVo(ImportantunitsVO vo);
}