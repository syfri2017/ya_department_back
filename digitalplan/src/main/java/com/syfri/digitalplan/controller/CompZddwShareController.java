package com.syfri.digitalplan.controller;

import com.syfri.digitalplan.model.planobject.ImportantunitsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.digitalplan.service.planobject.ImportantunitsService;
import com.syfri.digitalplan.service.digitalplan.DigitalplanlistService;
import com.syfri.digitalplan.service.digitalplan.DisastersetService;
import com.syfri.digitalplan.service.digitalplan.ForcedevService;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 数字化预案分享
 * @Param:
 * @Return:
 * @Author: liurui
 * @Modified By:
 * @Date: 2018/5/8 10:24
 */
@Controller
@RequestMapping("/planShare")
@Api("重点单位共享")
public class CompZddwShareController {
    private static final Logger logger = LoggerFactory.getLogger(CompZddwShareController.class);

//    @Autowired
//    ShareConfig shareConfig;

    @Autowired
    private DigitalplanlistService digitalplanlistService;

    @Autowired
    private ImportantunitsService importantunitsService;

    @Autowired
    private DisastersetService disastersetService;

    @Autowired
    private ForcedevService forcedevService;

    @ApiOperation(value = "获取重点单位共享信息", notes = "根据url的districtCode和uuid来指定获取对象，并根据传过来的target信息来确定输出目标")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "districtCode", value = "行政区域", required = true, dataType = "String", paramType
//                    = "path"),
            @ApiImplicitParam(name = "uuid", value = "重点单位标识", required = true, dataType = "String", paramType =
                    "path"),
            @ApiImplicitParam(name = "target", value = "输出目标(PC端:web/移动端:dev)", required = true, dataType = "String",
                    paramType = "path")
    })
    @GetMapping("/page/{uuid}/{target}")
    public String getPage(Model model,
                          @PathVariable("uuid") String uuid,
                          @PathVariable("target") String target) {
        String result = null;

        logger.debug(String.format("[IN] uuid: %s target: %s", uuid, target));

//        Map<String, Object> conditions = new HashMap<String, Object>();
//        conditions.put("uuid", uuid);

        Map<String,ImportantunitsVO> zddwWrapperMap = new HashMap<String,ImportantunitsVO>();
//        String url = shareConfig.getUrlPrefix() + shareConfig.getZddwPostfix();
//        JSONObject params = new JSONObject(conditions);
//        MediaType mediaType = MediaType.APPLICATION_FORM_URLENCODED;
//        String jsonStr = RestTemplateUtil.post(url, params, mediaType, String.class);

//        zddwWrapperMap = convertJson2Map(jsonStr);
//        if (zddwWrapperMap == null) {
//            logger.warn(String.format(" zddwWrapperMap is null !"));
//
//            return "error";
//        }
//        zddwWrapperMap.put("compZddwInfo",importantpartsService.doFindById(uuid));
        String zddwid = digitalplanlistService.doFindById(uuid).getDxid();
        // 预案基础信息
        model.addAttribute("compPlanInfo", digitalplanlistService.doFindById(uuid));
        // 重点单位基础信息
        model.addAttribute("compZddwInfo", importantunitsService.doFindById(zddwid));
        // 灾情设定
        model.addAttribute("disastersetList", disastersetService.doFindByPlanId(uuid));
        // 力量部署
        model.addAttribute("forcedevList", forcedevService.doFindByPlanId(uuid));
//        // 功能分区-建筑
//        model.addAttribute("areaBuildingList", zddwWrapperMap.get("areaBuildingList"));
//        // 功能分区-装置
//        model.addAttribute("areaDeviceList", zddwWrapperMap.get("areaDeviceList"));
//        // 消防设施
//        model.addAttribute("facilityList", zddwWrapperMap.get("facilityList"));
//        // 重点区域
//        model.addAttribute("regionList", zddwWrapperMap.get("regionList"));
//        // 数据字典
//        model.addAttribute("dictionaryMap", zddwWrapperMap.get("dictionaryMap"));
//        // 所属功能区，所属楼层
//        model.addAttribute("belongMap", zddwWrapperMap.get("belongMap"));
//        // 关键图示
//        model.addAttribute("keyIllustrationList", zddwWrapperMap.get("keyIllustrationList"));
//        // 全景漫游
//        model.addAttribute("panoList", zddwWrapperMap.get("panoList"));
//        // 旧版预案 // 现场照片
//        model.addAttribute("pictureList", zddwWrapperMap.get("pictureList"));
//        model.addAttribute("attachList", zddwWrapperMap.get("attachList"));
//
//        // 功能区类型转换
//        model.addAttribute("areaPartTypeMap", zddwWrapperMap.get("areaPartTypeMap"));
//        // 使用性质转换
//        model.addAttribute("syxzMap", zddwWrapperMap.get("syxzMap"));
//        // 所在平面图转换
//        model.addAttribute("szpmtMap", zddwWrapperMap.get("szpmtMap"));

//        result = shareConfig.getZddwTemplateNamePrefix() + "-" + target;
        result = "compPlan" + "-" + target;

        logger.debug(String.format("[OUT]"));

        return result;
    }

//    private Map<String, Object> convertJson2Map(String jsonStr) {
//        Map<String, Object> res = null;
//        try {
//            Gson gson = new Gson();
//            res = gson.fromJson(jsonStr, new TypeToken<Map<String, Object>>() {
//            }.getType());
//        } catch (JsonSyntaxException e) {
//        }
//
//        return res;
//    }
}
