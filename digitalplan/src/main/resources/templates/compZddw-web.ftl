<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0,user-scalable=no">
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <title>重点单位预案</title>
    <link rel="stylesheet" href="/css/toolbar.css">
    <link rel="stylesheet" href="/css/catalog.css">
    <link rel="stylesheet" href="/css/dialog.css">
    <link rel="stylesheet" href="/css/viewer.min.css">
    <link rel="stylesheet" href="/css/project.css">
</head>
<body>

<div class="content-wrap">
    <div id="content">
        <div id="cover" class="content-block cover-block block-level-1" data-menu-text="封面">
            <div class="cover-body">
                <span class="cover-area">行政区划:  <#if compZddwInfo.xzqhmc??>${compZddwInfo.xzqhmc}</#if></span>
                <span class="cover-code">&nbsp;&nbsp;&nbsp;</span>
                <h4 class="cover-title"><#if compZddwInfo.dwmc??>${compZddwInfo.dwmc}</#if></h4>
                <ul class="cover-info-list">
                    <li><strong>单位性质：</strong><#if compZddwInfo.dwxzmc??>${compZddwInfo.dwxzmc}</#if></li>
                    <li><strong>防火等级：</strong><#if compZddwInfo.fhdjmc??>${compZddwInfo.fhdjmc}</#if></li>
                    <li><strong>防火责任队站：</strong><#if compZddwInfo.fhdzidmc??>${compZddwInfo.fhdzidmc}</#if></li>
                    <li><strong>灭火责任队站：</strong><#if compZddwInfo.mhdzidmc??>${compZddwInfo.mhdzidmc}</#if></li>
                </ul>
                <div class="cover-qrcode-wrap">
                    <img class="qrcode-img" src="" alt="扫码分享"/>
                </div>
                <div class="update-row">
                    <table>
                        <tr>
                            <th width="300" style="text-align:right">消防责任人：</th>
                            <td width="150" style="text-align:left"><#if compZddwInfo.xfzrr??>${compZddwInfo.xfzrr}</#if></td>
                            <th width="150" style="text-align:right">消防责任人电话：</th>
                            <td style="text-align:left"><#if compZddwInfo.xfzrrdh??>${compZddwInfo.xfzrrdh}</#if></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <!-- 单位基本情况 -->
        <div id="wdgk" class="content-block block-level-1" data-menu-text="单位基本信息">
            <h2 class="block-header">
                <span class="header-title-inner">单位基本信息</span>
            </h2>
            <div class="block-body">
                <table class="data-table">
                    <tr>
                        <th>单位名称：</th>
                        <td colspan="3"><#if compZddwInfo.dwmc??>${compZddwInfo.dwmc}</#if></td>
                    </tr>
                    <tr>
                        <th>单位地址：</th>
                        <td colspan="3"><#if compZddwInfo.dwdz??>${compZddwInfo.dwdz}</#if></td>
                    </tr>
                    <tr>
                        <th width="120">单位性质：</th>
                        <td width="300"><#if compZddwInfo.dwxzmc??>${compZddwInfo.dwxzmc}</#if></td>
                        <th width="120">值班电话：</th>
                        <td><#if compZddwInfo.zbdh??>${compZddwInfo.zbdh}</#if></td>
                    </tr>
                    <tr>
                        <th>总建筑面积：</th>
                        <td><#if compZddwInfo.jzmj??>${compZddwInfo.jzmj} ㎡</#if></td>
                        <th>总占地面积：</th>
                        <td><#if compZddwInfo.zdmj??>${compZddwInfo.zdmj} ㎡</#if></td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th colspan="4" class="block-th">消防安全组织</th>
                    </tr>
                    <tr>
                        <th width="120">消防责任人：</th>
                        <td width="300"><#if compZddwInfo.xfzrr??>${compZddwInfo.xfzrr}</#if></td>
                        <th width="120">联系方式：</th>
                        <td><#if compZddwInfo.xfzrrdh??>${compZddwInfo.xfzrrdh}</#if></td>
                    </tr>
                    <tr>
                        <th>消防管理人：</th>
                        <td><#if compZddwInfo.xfglr??>${compZddwInfo.xfglr}</#if></td>
                        <th>联系方式：</th>
                        <td><#if compZddwInfo.xfglrdh??>${compZddwInfo.xfglrdh}</#if></td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th colspan="2" class="block-th">毗邻情况</th>
                    </tr>
                    <tr>
                        <th width="64">东：</th>
                        <td><#if compZddwInfo.blgxd??>${compZddwInfo.plgxd}</#if></td>
                    </tr>
                    <tr>
                        <th>西：</th>
                        <td><#if compZddwInfo.blgxx??>${compZddwInfo.plgxx}</#if></td>
                    </tr>
                    <tr>
                        <th>南：</th>
                        <td><#if compZddwInfo.blgxn??>${compZddwInfo.plgxn}</#if></td>
                    </tr>
                    <tr>
                        <th>北：</th>
                        <td><#if compZddwInfo.blgxb??>${compZddwInfo.plgxb}</#if></td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th class="block-th">单位概况</th>
                    </tr>
                    <tr>
                        <td><#if compZddwInfo.dwgk??>${compZddwInfo.dwgk}</#if></td>
                    </tr>
                </table>
                </table>
                <table class="data-table">
                    <tr>
                        <th class="block-th">备注</th>
                    </tr>
                    <tr>
                        <td><#if compZddwInfo.bz??>${compZddwInfo.bz}</#if></td>
                    </tr>
                </table>
            </div>
        </div>
        <!-- end 单位基本情况 -->
        <!-- 预案基本情况 -->
        <div id="yaxx" class="content-block block-level-1" data-menu-text="预案基本信息">
            <h2 class="block-header">
                <span class="header-title-inner">预案基本信息</span>
            </h2>
        <#list compPlanInfo as planInfo>
            <div id="yaxx-<#if planInfo.uuid??>${planInfo.uuid}</#if>" class="sub-block block-level-2"
                 data-menu-text="<#if planInfo.yajbmc??>${planInfo.yajbmc}</#if>-<#if planInfo.yamc??>${planInfo.yamc}</#if>">
                <h3 class="sub-block-header">
                    <span class="header-title-inner">
                        ${planInfo_index+1}
                            .<#if planInfo.yajbmc??>${planInfo.yajbmc}</#if>-<#if planInfo.yamc??>${planInfo.yamc}</#if>
                    </span>
                </h3>
                <div class="sub-block-body">
                    <table class="data-table">
                        <tr>
                            <th width="120">预案编号：</th>
                            <td width="300"><#if planInfo.yabm??>${planInfo.yabm}</#if></td>
                            <th width="120">预案类型：</th>
                            <td><#if planInfo.yalxmc??>${planInfo.yalxmc}</#if></td>
                        </tr>
                        <tr>
                            <th>预案状态：</th>
                            <td><#if planInfo.yaztmc??>${planInfo.yaztmc}</#if></td>
                            <th>审核状态：</th>
                            <td><#if planInfo.shztmc??>${planInfo.shztmc}</#if></td>
                        </tr>
                        <tr>
                            <th>制作人：</th>
                            <td><#if planInfo.zzrmc??>${planInfo.zzrmc}</#if></td>
                            <th>审核人：</th>
                            <td><#if planInfo.shrmc??>${planInfo.shrmc}</#if></td>
                        </tr>
                        <tr>
                            <th>制作人职务：</th>
                            <td><#if planInfo.zzrmc??>${planInfo.zzrmc}</#if></td>
                            <th>审核人职务：</th>
                            <td><#if planInfo.shrmc??>${planInfo.shrmc}</#if></td>
                        </tr>
                        <tr>
                            <th>制作时间：</th>
                            <td><#if planInfo.zzsj??>${planInfo.zzsj?substring(0,10)}</#if></td>
                            <th>审核时间：</th>
                            <td><#if planInfo.shsj??>${planInfo.shsj?substring(0,10)}</#if></td>
                        </tr>
                        <tr>
                            <th>备注：</th>
                            <td colspan="3"><#if planInfo.bz??>${planInfo.bz}</#if></td>
                        </tr>
                    </table>
                    <#if planInfo.disasterListVo??>
                        <#list planInfo.disasterListVo as disaster>
                            <table class="data-table">
                                <tr>
                                    <th colspan="4" class="block-th">灾情设定-灾情${disaster_index+1}</th>
                                </tr>
                                <tr>
                                    <th width="120">灾情部位：</th>
                                    <td width="300"><#if disaster.zqbw??>${disaster.zqbw}</#if></td>
                                    <th width="120">灾害场所：</th>
                                    <td><#if disaster.zhcsmc??>${disaster.zhcsmc}</#if></td>
                                </tr>
                                <tr>
                                    <th>灾情等级：</th>
                                    <td><#if disaster.zqdjmc??>${disaster.zqdjmc}</#if></td>
                                    <th>火灾危险性：</th>
                                    <td><#if disaster.hzwxxmc??>${disaster.hzwxxmc}</#if></td>
                                </tr>
                                <tr>
                                    <th>起火原因：</th>
                                    <td><#if disaster.qhyymc??>${disaster.qhyymc}</#if></td>
                                    <th>燃烧物质：</th>
                                    <td><#if disaster.rswzmc??>${disaster.rswzmc}</#if></td>
                                </tr>
                                <tr>
                                    <th>起火部位高度：</th>
                                    <td><#if disaster.qhbwgd??>${disaster.qhbwgd} m</#if></td>
                                    <th>燃烧面积：</th>
                                    <td><#if disaster.rsmj??>${disaster.rsmj} ㎡</#if></td>
                                </tr>
                                <tr>
                                    <th>灾情描述：</th>
                                    <td colspan="3"><#if disaster.zqms??>${disaster.zqms}</#if></td>
                                </tr>
                                <tr>
                                    <th>灾情设定依据：</th>
                                    <td colspan="3"><#if disaster.zqsdyj??>${disaster.zqsdyj}</#if></td>
                                </tr>
                                <tr>
                                    <th>备注：</th>
                                    <td colspan="3"><#if disaster.bz??>${disaster.bz}</#if></td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <!-- 力量部署 -->
                                        <#if disaster.forcedevList??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>第一出动力量调集方案</strong>
                                                    </th>
                                                </tr>
                                                <#list disaster.forcedevList as forcedev>
                                                    <#if forcedev.djfalx == '1'>
                                                        <tr>
                                                            <th width="120">队站名称：</th>
                                                            <td width="300"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                                            <th width="120">停靠位置：</th>
                                                            <td><#if forcedev.tkwz??>${forcedev.tkwz}</#if></td>
                                                        </tr>
                                                        <tr>
                                                            <th>车辆装备提示：</th>
                                                            <td colspan="3"><#if forcedev.clzbts??>${forcedev.clzbts}</#if></td>
                                                        </tr>
                                                    </#if>
                                                </#list>
                                            </table>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>增援力量调集方案</strong>
                                                    </th>
                                                </tr>
                                                <#list disaster.forcedevList as forcedev>
                                                    <#if forcedev.djfalx == '2'>
                                                        <tr>
                                                            <th width="120">队站名称：</th>
                                                            <td width="300"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                                            <th width="120">停靠位置：</th>
                                                            <td><#if forcedev.tkwz??>${forcedev.tkwz}</#if></td>
                                                        </tr>
                                                        <tr>
                                                            <th>车辆装备提示：</th>
                                                            <td colspan="3"><#if forcedev.clzbts??>${forcedev.clzbts}</#if></td>
                                                        </tr>
                                                    </#if>
                                                </#list>
                                            </table>
                                        </#if>
                                        <!-- 要点提示 -->
                                        <#if disaster.keypointsMap??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="2" style="text-align:left">
                                                        <strong>要点提示</strong>
                                                    </th>
                                                </tr>
                                                <tr>
                                                    <th width="120">战术要点：</th>
                                                    <td><#if disaster.keypointsMap.zsyd??>${disaster.keypointsMap.zsyd}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th>特别警示：</th>
                                                    <td><#if disaster.keypointsMap.tbjs??>${disaster.keypointsMap.tbjs}</#if></td>
                                                </tr>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            </table>
                        </#list>
                    </#if>
                </div>
            </div>
        </#list>
        </div>
        <!-- end 预案基本情况 -->

        <!-- 单位建筑信息 -->
        <div id="gnfq" class="content-block block-level-1" data-menu-text="建筑和消防设施">
            <h2 class="block-header">
                <span class="header-title-inner">单位建筑信息和消防设施</span>
            </h2>
        <#list areaBuildingList as areaBuilding>
            <#if areaBuilding.jzid??>
                <div id="gnfq-<#if areaBuilding.jzid??>${areaBuilding.jzid}</#if>" class="sub-block block-level-2"
                     data-menu-text="<#if areaBuilding.jzlxmc??>${areaBuilding.jzlxmc}</#if>-<#if areaBuilding.jzmc??>${areaBuilding.jzmc}</#if>">
                    <h3 class="sub-block-header">
                    <span class="header-title-inner">
                        ${areaBuilding_index+1}
                            .<#if areaBuilding.jzlxmc??>${areaBuilding.jzlxmc}</#if>-<#if areaBuilding.jzmc??>${areaBuilding.jzmc}</#if>
                    </span>
                    </h3>
                    <div class="sub-block-body">
                        <!--基础信息(单体建筑 and 建筑群)-->
                        <#if areaBuilding.jzlx=='10'||areaBuilding.jzlx=='20'>
                            <table class="data-table">
                                <tr>
                                    <th width="120">建筑使用性质：</th>
                                    <td width="300"><#if areaBuilding.jzl_jzsyxzmc??>${areaBuilding.jzl_jzsyxzmc}</#if></td>
                                    <th width="120">建筑结构：</th>
                                    <td><#if areaBuilding.jzl_jzjgmc??>${areaBuilding.jzl_jzjgmc}</#if></td>
                                </tr>
                                <tr>
                                    <th>占地面积：</th>
                                    <td><#if areaBuilding.jzl_zdmj??>${areaBuilding.jzl_zdmj} ㎡</#if>
                                    </td>
                                    <th>建筑面积：</th>
                                    <td><#if areaBuilding.jzl_jzmj??>${areaBuilding.jzl_jzmj} ㎡</#if></td>
                                </tr>
                                <tr>
                                    <th>地上高度：</th>
                                    <td><#if areaBuilding.jzl_dsgd??>${areaBuilding.jzl_dsgd} m</#if></td>
                                    <th>地下高度：</th>
                                    <td><#if areaBuilding.jzl_dxgd??>${areaBuilding.jzl_dxgd} m</#if></td>
                                </tr>
                                <tr>
                                    <th>地上层数：</th>
                                    <td><#if areaBuilding.jzl_dscs??>${areaBuilding.jzl_dscs} 层</#if></td>
                                    <th>地下层数：</th>
                                    <td><#if areaBuilding.jzl_dxcs??>${areaBuilding.jzl_dxcs} 层</#if></td>
                                </tr>
                                <tr>
                                    <th>功能描述：</th>
                                    <td colspan="3"><#if areaBuilding.jzl_gnms??>${areaBuilding.jzl_gnms}</#if></td>
                                </tr>
                                <tr>
                                    <th>备注：</th>
                                    <td colspan="3"><#if areaBuilding.bz??>${areaBuilding.bz}</#if></td>
                                </tr>
                            </table>
                        </#if>
                        <!--基础信息(建筑群(装置类))-->
                        <#if areaBuilding.jzlx=='30'>
                            <table class="data-table">
                                <tr>
                                    <th width="120">装置名称：</th>
                                    <td width="300"><#if areaBuilding.jzmc??>${areaBuilding.jzmc}</#if></td>
                                    <th width="120">建筑结构：</th>
                                    <td><#if areaBuilding.zzl_jzjg??>${areaBuilding.zzl_jzjg}</#if></td>
                                </tr>
                                <tr>
                                    <th>占地面积：</th>
                                    <td><#if areaBuilding.zzl_zdmj??>${areaBuilding.zzl_zdmj} ㎡</#if></td>
                                    <th>装置高度：</th>
                                    <td><#if areaBuilding.zzl_zzgd??>${areaBuilding.zzl_zzgd} m</#if></td>
                                </tr>
                                <tr>
                                    <th>技术负责人：</th>
                                    <td><#if areaBuilding.zzl_jsfzr??>${areaBuilding.zzl_jsfzr}</#if></td>
                                    <th>联系方式：</th>
                                    <td><#if areaBuilding.zzl_jsfzrdh??>${areaBuilding.zzl_jsfzrdh}</#if></td>
                                </tr>
                                <tr>
                                    <th>备注：</th>
                                    <td colspan="3"><#if areaBuilding.bz??>${areaBuilding.bz}</#if></td>
                                </tr>
                                <tr>
                                    <th colspan="4" class="block-th">装置组成</th>
                                </tr>
                                <tr>
                                    <td colspan="4"><#if areaBuilding.zzl_zzzc??>${areaBuilding.zzl_zzzc}</#if></td>
                                </tr>
                                <tr>
                                    <th colspan="4" class="block-th">装置原料</th>
                                </tr>
                                <tr>
                                    <td colspan="4"><#if areaBuilding.zzl_ylxx??>${areaBuilding.zzl_ylxx}</#if></td>
                                </tr>
                                <tr>
                                    <th colspan="4" class="block-th">装置产物</th>
                                </tr>
                                <tr>
                                    <td colspan="4"><#if areaBuilding.zzl_cwxx??>${areaBuilding.zzl_cwxx}</#if></td>
                                </tr>
                                <tr>
                                    <th colspan="4" class="block-th">工艺流程描述</th>
                                </tr>
                                <tr>
                                    <td colspan="4"><#if areaBuilding.zzl_gylc??>${areaBuilding.zzl_gylc}</#if></td>
                                </tr>
                            </table>
                        </#if>
                        <!--基础信息(建筑群(储罐类))-->
                        <#if areaBuilding.jzlx=='40'>
                            <table class="data-table">
                                <tr>
                                    <th width="120">总容积：</th>
                                    <td width="300"><#if areaBuilding.cgl_zrj??>${areaBuilding.cgl_zrj} m³</#if></td>
                                    <th width="120">储罐数量：</th>
                                    <td><#if areaBuilding.cgl_cgsl??>${areaBuilding.cgl_cgsl}</#if></td>
                                </tr>
                                <tr>
                                    <th>技术负责人：</th>
                                    <td><#if areaBuilding.cgl_jsfzr??>${areaBuilding.cgl_jsfzr}</#if></td>
                                    <th>联系方式：</th>
                                    <td><#if areaBuilding.cgl_jsfzrdh??>${areaBuilding.cgl_jsfzrdh}</#if></td>
                                </tr>
                                <tr>
                                    <th>备注：</th>
                                    <td colspan="3"><#if areaBuilding.bz??>${areaBuilding.bz}</#if></td>
                                </tr>
                            </table>
                            <#if areaBuilding.ChuguanList??>
                                <table class="data-table">
                                    <tr>
                                        <th colspan="6" class="block-th">罐体信息</th>
                                    </tr>
                                    <tr>
                                        <td>
                                            <#list areaBuilding.ChuguanList as pot>
                                                <table class="data-table">
                                                    <tr>
                                                        <th colspan="6" style="text-align:left">
                                                            <strong><#if pot.cgmc??>${pot.cgmc}</#if></strong></th>
                                                    </tr>
                                                    <tr>
                                                        <th width="120">储罐名称：</th>
                                                        <td width="165"><#if pot.cgmc??>${pot.cgmc}</#if></td>
                                                        <th width="120">储罐类型：</th>
                                                        <td width="165"><#if pot.cglxmc??>${pot.cglxmc}</#if></td>
                                                        <th width="120">存储温度：</th>
                                                        <td><#if pot.ccwd??>${pot.ccwd}</#if></td>

                                                    </tr>
                                                    <tr>
                                                        <th>工作压力：</th>
                                                        <td><#if pot.gzyl??>${pot.gzyl}</#if></td>
                                                        <th>容量：</th>
                                                        <td><#if pot.cgrl??>${pot.cgrl}</#if></td>
                                                        <th>罐顶面积：</th>
                                                        <td><#if pot.gdmj??>${pot.gdmj} ㎡</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>直径：</th>
                                                        <td><#if pot.cgzj??>${pot.cgzj}</#if></td>
                                                        <th>高度：</th>
                                                        <td><#if pot.cggd??>${pot.cggd}</#if></td>
                                                        <th>周长：</th>
                                                        <td><#if pot.cgzc??>${pot.cgzc}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th colspan="6" style="text-align:left">
                                                            <strong>存储介质-<#if pot.ccjzmc??>${pot.ccjzmc}</#if></strong>
                                                        </th>
                                                    </tr>
                                                    <tr>
                                                        <th>实际储量：</th>
                                                        <td colspan="2"><#if pot.ccjzsjcl??>${pot.ccjzsjcl}</#if></td>
                                                        <th>液位高度：</th>
                                                        <td colspan="2"><#if pot.ccjzywgd??>${pot.ccjzywgd}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>理化性质：</th>
                                                        <td colspan="5"><#if pot.ccjzlhxz??>${pot.ccjzlhxz}</#if></td>
                                                    </tr>
                                                </table>
                                            </#list>
                                        </td>
                                    </tr>
                                </table>
                            </#if>
                        </#if>
                        <!--安全疏散设施-->
                        <table class="data-table">
                            <tr>
                                <th colspan="4" class="block-th">安全疏散设施</th>
                            </tr>
                            <#if areaBuilding.firefacilites['1001']?? || areaBuilding.firefacilites['1002']?? || areaBuilding.firefacilites['1003']?? ||
                            areaBuilding.firefacilites['1004']?? || areaBuilding.firefacilites['1005']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['1001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>安全出口</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['1001'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td width="120"><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                </#list>

                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['1002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>疏散楼梯</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['1002'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td width="120"><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['1003']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>消防电梯</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['1003'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td width="120"><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['1004']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="2" style="text-align:left">
                                                        <strong>避难层</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['1004'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['1005']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>应急广播</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['1005'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="120">有无应急广播：</th>
                                                        <td width="120"><#if xfss.ywyjgb??>${xfss.ywyjgb}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--消防水系统-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">消防水系统</th>
                            </tr>
                            <#if areaBuilding.firefacilites['2001']?? || areaBuilding.firefacilites['2002']?? || areaBuilding.firefacilites['2003']?? ||
                            areaBuilding.firefacilites['2004']?? || areaBuilding.firefacilites['2005']?? || areaBuilding.firefacilites['2006']?? ||
                            areaBuilding.firefacilites['2007']?? || areaBuilding.firefacilites['2008']?? || areaBuilding.firefacilites['2009']?? ||
                            areaBuilding.firefacilites['2010']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['2001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>消防泵房</strong>
                                                    </th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2001'] as xfss>
                                                    <tr>
                                                        <th width="120">位置：</th>
                                                        <td colspan="3"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th width="120">消火栓泵数量：</th>
                                                        <td width="300"><#if xfss.xhssl??>${xfss.xhssl}</#if></td>
                                                        <th width="140">消火栓最大流量：</th>
                                                        <td><#if xfss.xhszdll??>${xfss.xhszdll} L/s</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>喷淋泵数量：</th>
                                                        <td><#if xfss.blbsl??>${xfss.blbsl}</#if></td>
                                                        <th>喷淋泵最大流量：</th>
                                                        <td><#if xfss.plbzdll??>${xfss.plbzdll} L/s</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>消防水箱</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2002'] as xfss>
                                                    <tr>
                                                        <th width="120">位置：</th>
                                                        <td colspan="3"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th width="120">水箱容量：</th>
                                                        <td width="300"><#if xfss.sxrl??>${xfss.sxrl} m³</#if></td>
                                                        <th width="120">补给速度：</th>
                                                        <td><#if xfss.bjsd??>${xfss.bjsd} L/s</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2003']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>消防水池</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2003'] as xfss>
                                                    <tr>
                                                        <th width="120">位置：</th>
                                                        <td colspan="3"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th width="120">水箱容量：</th>
                                                        <td width="300"><#if xfss.sxrl??>${xfss.sxrl} m³</#if></td>
                                                        <th width="165">是否有取水口（井）：</th>
                                                        <td><#if xfss.ywqsj??>${xfss.ywqsj}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>补给速度：</th>
                                                        <td><#if xfss.bjsd??>${xfss.bjsd} L/s</#if></td>
                                                        <th>取水口（井）位置：</th>
                                                        <td><#if xfss.qsjwz??>${xfss.qsjwz}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2004']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>室内消火栓</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2004'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.sfky??>${xfss.sfky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2005']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>室外消火栓</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2005'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.sfky??>${xfss.sfky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2006']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>水泵接合器</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2006'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="120">安装形式：</th>
                                                        <td width="120"><#if xfss.azxsmc??>${xfss.azxsmc}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>型号：</th>
                                                        <td><#if xfss.xh??>${xfss.xh}</#if></td>
                                                        <th>进水口尺寸：</th>
                                                        <td><#if xfss.jskcc??>${xfss.jskcc}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2007']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>喷淋系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2007'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="120">有无喷淋系统：</th>
                                                        <td width="120"><#if xfss.ywplxt??>${xfss.ywplxt}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2008']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>冷却水系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2008'] as xfss>
                                                    <tr>
                                                        <th width="120">位置：</th>
                                                        <td colspan="3"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th width="120">供水强度：</th>
                                                        <td width="300"><#if xfss.gsqd??>${xfss.gsqd}
                                                            L/min.m2</#if></td>
                                                        <th width="140">有无冷却水系统：</th>
                                                        <td><#if xfss.ywlqsxt??>${xfss.ywlqsxt}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2009']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>固定水炮</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2009'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.isky??>${xfss.isky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['2010']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>半固定设施</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['2010'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td width="120"><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--泡沫系统-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">泡沫系统</th>
                            </tr>
                            <#if areaBuilding.firefacilites['3001']?? || areaBuilding.firefacilites['3002']?? || areaBuilding.firefacilites['3003']?? ||
                            areaBuilding.firefacilites['3004']?? || areaBuilding.firefacilites['3005']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['3001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>泡沫泵房</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['3001'] as xfss>
                                                    <tr>
                                                        <th width="120">位置：</th>
                                                        <td width="300"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="140">泡沫液类型：</th>
                                                        <td><#if xfss.pmylxmc??>${xfss.pmylxmc}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>泡沫液储量：</th>
                                                        <td><#if xfss.pmycl??>${xfss.pmycl} t</#if></td>
                                                        <th>泡沫泵最大流量：</th>
                                                        <td><#if xfss.pmbzdll??>${xfss.pmbzdll} L/s</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['3002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>泡沫消火栓</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['3002'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.isky??>${xfss.isky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['3003']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>固定泡沫炮</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['3003'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.sfky??>${xfss.sfky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['3004']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>泡沫发生器</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['3004'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                    <tr>
                                                        <th>型号：</th>
                                                        <td><#if xfss.xh??>${xfss.xh}</#if></td>
                                                        <th>流量：</th>
                                                        <td><#if xfss.ll??>${xfss.ll} L/s</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['3005']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>半固定设施</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['3005'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td width="120"><#if xfss.sl??>${xfss.sl}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--蒸汽灭火系统-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">蒸汽灭火系统</th>
                            </tr>
                            <#if areaBuilding.firefacilites['4001']?? || areaBuilding.firefacilites['4002']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['4001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>固定式蒸汽系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['4001'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">额定压力：</th>
                                                        <td width="120"><#if xfss.edyl??>${xfss.edyl} Mpa</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['4002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>半固定式蒸汽系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['4002'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td width="340"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                        <th width="80">数量：</th>
                                                        <td><#if xfss.sl??>${xfss.sl}</#if></td>
                                                        <th width="100">额定压力：</th>
                                                        <td width="120"><#if xfss.edyl??>${xfss.edyl} Mpa</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--消防控制室-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">消防控制室</th>
                            </tr>
                            <#if areaBuilding.firefacilites['5000']??>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <#list areaBuilding.firefacilites['5000'] as xfss>
                                                <tr>
                                                    <th width="150">位置：</th>
                                                    <td colspan="3"><#if xfss.wz??>${xfss.wz}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th width="150">自动报警是否可用：</th>
                                                    <td width="270"><#if xfss.iszdbj??>${xfss.iszdbj}</#if></td>
                                                    <th width="150">联动控制是否可用：</th>
                                                    <td><#if xfss.isldkz??>${xfss.isldkz}</#if></td>
                                                </tr>
                                            </#list>
                                        </table>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--防排烟措施-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">防排烟措施</th>
                            </tr>
                            <#if areaBuilding.firefacilites['6001']?? || areaBuilding.firefacilites['6002']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['6001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="2" style="text-align:left">
                                                        <strong>排烟口/出烟口</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['6001'] as xfss>
                                                    <tr>
                                                        <th width="80">位置：</th>
                                                        <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['6002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>防排烟系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['6002'] as xfss>
                                                    <tr>
                                                        <th width="120">系统启闭位置：</th>
                                                        <td><#if xfss.qbwz??>${xfss.qbwz}</#if></td>
                                                        <th width="100">是否可用：</th>
                                                        <td width="120"><#if xfss.isky??>${xfss.isky}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--防火分区-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">防火分区</th>
                            </tr>
                            <#if areaBuilding.firefacilites['7000']??>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <#list areaBuilding.firefacilites['7000'] as xfss>
                                                <tr>
                                                    <th width="120">区域位置：</th>
                                                    <td width="300"><#if xfss.qywz??>${xfss.qywz}</#if></td>
                                                    <th width="120">区域面积：</th>
                                                    <td><#if xfss.qymj??>${xfss.qymj} ㎡</#if></td>
                                                </tr>
                                                <tr>
                                                    <th>分隔设施：</th>
                                                    <td><#if xfss.fgss??>${xfss.fgss}</#if></td>
                                                    <th>分隔位置：</th>
                                                    <td><#if xfss.fgwz??>${xfss.fgwz}</#if></td>
                                                </tr>
                                            </#list>
                                        </table>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--其他灭火系统-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">其他灭火系统</th>
                            </tr>
                            <#if areaBuilding.firefacilites['8001']?? || areaBuilding.firefacilites['8002']??>
                                <tr>
                                    <td>
                                        <#if areaBuilding.firefacilites['8001']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>气体灭火系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['8001'] as xfss>
                                                    <tr>
                                                        <th width="120">起闭位置：</th>
                                                        <td width="300"><#if xfss.qbwz??>${xfss.qbwz}</#if></td>
                                                        <th width="120">作用范围：</th>
                                                        <td><#if xfss.zyfw??>${xfss.zyfw}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                        <#if areaBuilding.firefacilites['8002']??>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>干粉灭火系统</strong></th>
                                                </tr>
                                                <#list areaBuilding.firefacilites['8002'] as xfss>
                                                    <tr>
                                                        <th width="120">起闭位置：</th>
                                                        <td width="300"><#if xfss.qbwz??>${xfss.qbwz}</#if></td>
                                                        <th width="120">作用范围：</th>
                                                        <td><#if xfss.zyfw??>${xfss.zyfw}</#if></td>
                                                    </tr>
                                                </#list>
                                            </table>
                                        </#if>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                        <!--其他消防设施-->
                        <table class="data-table">
                            <tr>
                                <th class="block-th">其他消防设施</th>
                            </tr>
                            <#if areaBuilding.firefacilites['9000']??>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <#list areaBuilding.firefacilites['9000'] as xfss>
                                                <tr>
                                                    <th width="120">位置：</th>
                                                    <td><#if xfss.wz??>${xfss.wz}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th width="120">描述：</th>
                                                    <td><#if xfss.ms??>${xfss.ms}</#if></td>
                                                </tr>
                                            </#list>
                                        </table>
                                    </td>
                                </tr>
                            <#else>
                                <tr>
                                    <td>无</td>
                                </tr>
                            </#if>
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
        </div>
        <!-- end 单位建筑信息 -->

        <!-- 重点部位 -->
        <div id="zdqy" class="content-block block-level-1" data-menu-text="重点部位">
            <h2 class="block-header">
                <span class="header-title-inner">重点部位</span>
            </h2>
            <!-- 建筑类 -->
        <#list jzlpartsList as region>
            <#if region.zdbwid??>
                <div id="zdqy_jz_${region.zdbwid}" class="sub-block block-level-2"
                     data-menu-text="建筑类-${region.zdbwmc}">
                    <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                建筑类-<#if region.zdbwmc??>${region.zdbwmc}</#if>
                            </span>
                    </h3>
                    <div class="sub-block-body">
                        <table class="data-table">
                            <tr>
                                <th width="120">位置：</th>
                                <td width="300"><#if region.zdbwwz??>${region.zdbwwz}</#if></td>
                                <th width="120">使用性质：</th>
                                <td><#if region.jzl_syxz??>${region.jzl_syxz}</#if></td>
                            </tr>
                            <tr>
                                <th>建筑结构：</th>
                                <td><#if region.jzl_jzjgmc??>${region.jzl_jzjgmc}</#if></td>
                                <th>区域面积：</th>
                                <td><#if region.jzl_qymj??>${region.jzl_qymj} ㎡</#if></td>
                            </tr>
                        </table>
                        <table class="data-table">
                            <tr>
                                <th class="block-th">危险介质</th>
                            </tr>
                            <tr>
                                <td>
                                    <#if region.weixianjiezhiList??>
                                        <#list region.weixianjiezhiList as danger>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="2" style="text-align:left">
                                                        <strong><#if danger.jzmc??>${danger.jzmc}</#if></strong></th>
                                                </tr>
                                                <tr>
                                                    <th width="120">实际储量：</th>
                                                    <td><#if danger.jzsjcl??>${danger.jzsjcl}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th width="120">理化性质：</th>
                                                    <td><#if danger.jzlhtx??>${danger.jzlhtx}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th width="120">备注：</th>
                                                    <td><#if danger.bz??>${danger.bz}</#if></td>
                                                </tr>
                                            </table>
                                        </#list>
                                    </#if>
                                </td>
                            </tr>
                        </table>
                        <table class="data-table">
                            <tr>
                                <th class="block-th">危险性分析</th>
                            </tr>
                            <tr>
                                <td><#if region.wxxfx??>${region.wxxfx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">注意事项</th>
                            </tr>
                            <tr>
                                <td><#if region.zysx??>${region.zysx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">备注</th>
                            </tr>
                            <tr>
                                <td><#if region.bz??>${region.bz}</#if></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
            <!-- end 建筑类 -->
            <!-- 装置类 -->
        <#list zzlpartsList as region>
            <#if region.zdbwid??>
                <div id="zdqy_zz_${region.zdbwid}" class="sub-block block-level-2"
                     data-menu-text="装置类-${region.zdbwmc}">
                    <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                装置类 - <#if region.zdbwmc??>${region.zdbwmc}</#if>
                            </span>
                    </h3>
                    <div class="sub-block-body">
                        <table class="data-table">
                            <tr>
                                <th width="120">位置：</th>
                                <td width="300"><#if region.zdbwwz??>${region.zdbwwz}</#if></td>
                                <th width="120">建筑结构：</th>
                                <td><#if region.zzl_jzjgmc??>${region.zzl_jzjgmc}</#if></td>
                            </tr>
                            <tr>
                                <th>占地面积：</th>
                                <td><#if region.zzl_zdmj??>${region.zzl_zdmj} ㎡</#if></td>
                                <th>装置高度：</th>
                                <td><#if region.zzl_zzgd??>${region.zzl_zzgd} m</#if></td>
                            </tr>
                            <tr>
                                <th>技术负责人：</th>
                                <td><#if region.zzl_jsfzr??>${region.zzl_jsfzr}</#if></td>
                                <th>联系方式：</th>
                                <td><#if region.zzl_jsfzrdh??>${region.zzl_jsfzrdh}</#if></td>
                            </tr>
                        </table>
                        <table class="data-table">
                            <tr>
                                <th class="block-th">装置组成</th>
                            </tr>
                            <tr>
                                <td><#if region.zzl_zzzc??>${region.zzl_zzzc}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">装置原料</th>
                            </tr>
                            <tr>
                                <td><#if region.zzl_ylxx??>${region.zzl_ylxx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">装置产物</th>
                            </tr>
                            <tr>
                                <td><#if region.zzl_cwxx??>${region.zzl_cwxx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">工艺流程描述</th>
                            </tr>
                            <tr>
                                <td><#if region.zzl_gylc??>${region.zzl_gylc}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">危险性分析</th>
                            </tr>
                            <tr>
                                <td><#if region.wxxfx??>${region.wxxfx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">注意事项</th>
                            </tr>
                            <tr>
                                <td><#if region.zysx??>${region.zysx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">备注</th>
                            </tr>
                            <tr>
                                <td><#if region.bz??>${region.bz}</#if></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
            <!-- end 装置类 -->
            <!-- 储罐类 -->
        <#list cglpartsList as region>
            <#if region.zdbwid??>
                <div id="zdqy_cg_${region.zdbwid}" class="sub-block block-level-2"
                     data-menu-text="储罐类-${region.zdbwmc}">
                    <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                储罐类 - <#if region.zdbwmc??>${region.zdbwmc}</#if>
                            </span>
                    </h3>
                    <div class="sub-block-body">
                        <table class="data-table">
                            <tr>
                                <th width="120">位置：</th>
                                <td width="300"><#if region.zdbwwz??>${region.zdbwwz}</#if></td>
                                <th width="120">储罐数量：</th>
                                <td><#if region.cgl_cgsl??>${region.cgl_cgsl}</#if></td>
                            </tr>
                            <tr>
                                <th width="120">总容积：</th>
                                <td><#if region.cgl_zrj??>${region.cgl_zrj} m³</#if></td>
                                <th width="120">储罐间距：</th>
                                <td><#if region.cgl_cgjg??>${region.cgl_cgjg}</#if></td>
                            </tr>
                            <tr>
                                <th>技术负责人：</th>
                                <td><#if region.cgl_jsfzr??>${region.cgl_jsfzr}</#if></td>
                                <th>联系方式：</th>
                                <td><#if region.cgl_jsfzrdh??>${region.cgl_jsfzrdh}</#if></td>
                            </tr>
                        </table>
                        <#if region.ChuguanList??>
                            <table class="data-table">
                                <tr>
                                    <th colspan="6" class="block-th">罐体信息</th>
                                </tr>
                                <tr>
                                    <td>
                                        <#list region.ChuguanList as pot>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong><#if pot.cgmc??>${pot.cgmc}</#if></strong></th>
                                                </tr>
                                                <tr>
                                                    <th width="120">储罐名称：</th>
                                                    <td width="165"><#if pot.cgmc??>${pot.cgmc}</#if></td>
                                                    <th width="120">储罐类型：</th>
                                                    <td width="165"><#if pot.cglxmc??>${pot.cglxmc}</#if></td>
                                                    <th width="120">存储温度：</th>
                                                    <td><#if pot.ccwd??>${pot.ccwd}</#if></td>

                                                </tr>
                                                <tr>
                                                    <th width="120">工作压力：</th>
                                                    <td><#if pot.gzyl??>${pot.gzyl}</#if></td>
                                                    <th>容量：</th>
                                                    <td><#if pot.cgrl??>${pot.cgrl}</#if></td>
                                                    <th>罐顶面积：</th>
                                                    <td><#if pot.gdmj??>${pot.gdmj} ㎡</#if></td>
                                                </tr>
                                                <tr>
                                                    <th width="120">直径：</th>
                                                    <td><#if pot.cgzj??>${pot.cgzj}</#if></td>
                                                    <th>高度：</th>
                                                    <td><#if pot.cggd??>${pot.cggd}</#if></td>
                                                    <th>周长：</th>
                                                    <td><#if pot.cgzc??>${pot.cgzc}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th colspan="6" style="text-align:left">
                                                        <strong>存储介质-<#if pot.ccjzmc??>${pot.ccjzmc}</#if></strong></th>
                                                </tr>
                                                <tr>
                                                    <th width="120">实际储量：</th>
                                                    <td colspan="2"><#if pot.ccjzsjcl??>${pot.ccjzsjcl}</#if></td>
                                                    <th width="120">液位高度：</th>
                                                    <td colspan="2"><#if pot.ccjzywgd??>${pot.ccjzywgd}</#if></td>
                                                </tr>
                                                <tr>
                                                    <th>理化性质：</th>
                                                    <td colspan="5"><#if pot.ccjzlhxz??>${pot.ccjzlhxz}</#if></td>
                                                </tr>
                                            </table>
                                        </#list>
                                    </td>
                                </tr>
                            </table>
                        </#if>
                        <table class="data-table">
                            <tr>
                                <th class="block-th">危险性分析</th>
                            </tr>
                            <tr>
                                <td><#if region.wxxfx??>${region.wxxfx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">注意事项</th>
                            </tr>
                            <tr>
                                <td><#if region.zysx??>${region.zysx}</#if></td>
                            </tr>
                            <tr>
                                <th class="block-th">备注</th>
                            </tr>
                            <tr>
                                <td><#if region.bz??>${region.bz}</#if></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
            <!-- end 储罐类 -->
        </div>
        <!-- end 重点部位 -->


    </div>
</div>

<div id="sideToolbar">
    <div id="sideCatalog"></div>
</div>

<script src="/js/jquery.min.js"></script>
<script src="/js/toolbar.js"></script>
<script src="/js/catalog.js"></script>
<script src="/js/viewer.min.js"></script>
<script src="/js/screenfull.min.js"></script>
<script type="text/javascript">
    var viewportSize = {
        width: $(window).width(),
        height: $(window).height()
    }
    $(function () {
        $('#sideToolbar').sideToolbar();
        $('#sideCatalog').sideCatalog({
            content: '#content'
        });
        $('.photo-tag').each(function (index, item) {
            new Viewer(item);
        })
        var currentUrl = window.location.href;
//        var qrcodeAPI = 'http://pan.baidu.com/share/qrcode?w=150&h=150&url=';
        var qrcodeAPI = 'https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=';
        $('.qrcode-img').attr('src', qrcodeAPI + currentUrl);


        $(window).resize(function () {
            viewportResize();
        });
        viewportResize();
    });

    function viewportResize() {
        viewportSize['width'] = $(window).width();
        viewportSize['height'] = $(window).height();

        $('#catalog').css('height', viewportSize.height / 2);
        $('#sideToolbar').css('left', $('.content-block').offset().left + 910);
    }
</script>
</body>
</html>
