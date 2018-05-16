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
                <span class="cover-code">编码:  <#if compPlanInfo.yabh??>${compPlanInfo.yabh}</#if></span>
                <h4 class="cover-title"><#if compPlanInfo.yamc??>${compPlanInfo.yamc}</#if></h4>
                <ul class="cover-info-list">
                    <li><strong>预案对象：</strong><#if compZddwInfo.dwmc??>${compZddwInfo.dwmc}</#if></li>
                    <li><strong>预案类型：</strong><#if compPlanInfo.yalxmc??>${compPlanInfo.yalxmc}</#if></li>
                    <li><strong>预案级别：</strong><#if compPlanInfo.yajbmc??>${compPlanInfo.yajbmc}</#if></li>
                </ul>
                <div class="cover-qrcode-wrap">
                    <img class="qrcode-img" src="" alt="扫码分享"/>
                </div>
                <div class="update-row">
                    <table>
                        <tr>
                            <th width="140" style="text-align:right">预案状态：</th>
                            <td style="text-align:left"><#if compPlanInfo.yaztmc??>${compPlanInfo.yaztmc}</#if></td>
                            <th width="125" style="text-align:right">制作人姓名：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzrmc??>${compPlanInfo.zzrmc}</#if></td>
                            <th width="125" style="text-align:right">制作人职务：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzrmc??>${compPlanInfo.zzrmc}</#if></td>
                            <th width="120" style="text-align:right">制作时间：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzsj??>${compPlanInfo.zzsj}</#if></td>
                        </tr>
                        <tr>
                            <th width="140" style="text-align:right">审核状态：</th>
                            <td style="text-align:left"><#if compPlanInfo.shztmc??>${compPlanInfo.shztmc}</#if></td>
                            <th width="125" style="text-align:right">审核人姓名：</th>
                            <td style="text-align:left"><#if compPlanInfo.shrmc??>${compPlanInfo.shrmc}</#if></td>
                            <th width="125" style="text-align:right">审核人职务：</th>
                            <td style="text-align:left"><#if compPlanInfo.shrmc??>${compPlanInfo.shrmc}</#if></td>
                            <th width="120" style="text-align:right">审核时间：</th>
                            <td style="text-align:left"><#if compPlanInfo.shsj??>${compPlanInfo.shsj}</#if></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <!-- 单位基本情况 -->
        <div id="wdgk" class="content-block block-level-1" data-menu-text="基本情况">
            <h2 class="block-header">
                <span class="header-title-inner">单位基本情况</span>
            </h2>
            <div class="block-body">
                <table class="data-table">
                    <tr>
                        <th>单位名称：</th>
                        <td colspan="3">${compZddwInfo.dwmc}</td>
                    </tr>
                    <tr>
                        <th>单位地址：</th>
                        <td colspan="3">${compZddwInfo.dwdz}</td>
                    </tr>
                    <tr>
                        <th width="120">单位性质：</th>
                        <td><#if compZddwInfo.dwlbmc??>${compZddwInfo.dwlbmc}</#if></td>
                        <th width="120">值班电话：</th>
                        <td><#if compZddwInfo.zbdh??>${compZddwInfo.zbdh}</#if></td>
                    </tr>
                    <tr>
                        <th width="120">总建筑面积：</th>
                        <td><#if compZddwInfo.jzmj??>${compZddwInfo.jzmj}</#if> ㎡</td>
                        <th width="120">总占地面积：</th>
                        <td><#if compZddwInfo.zdmj??>${compZddwInfo.zdmj}</#if> ㎡</td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th colspan="4" class="block-th">消防安全组织</th>
                    </tr>
                    <tr>
                        <th width="120">消防负责人：</th>
                        <td><#if compZddwInfo.xfzrr??>${compZddwInfo.xfzrr}</#if></td>
                        <th width="120">联系方式：</th>
                        <td><#if compZddwInfo.xfzrrdh??>${compZddwInfo.xfzrrdh}</#if></td>
                    </tr>
                    <tr>
                        <th>消防管理人：</th>
                        <td><#if compZddwInfo.xfglr??>${compZddwInfo.xfglr}</#if></td>
                        <th>联系方式：</th>
                        <td><#if compZddwInfo.xfglrdh??>${compZddwInfo.xfglrdh}</#if></td>
                    </tr>
                <#--<tr>-->
                <#--<th>微型消防站：</th>-->
                <#--<td>--</td>-->
                <#--<th>联系方式：</th>-->
                <#--<td>--</td>-->
                <#--</tr>-->
                </table>
                <table class="data-table">
                    <tr>
                        <th colspan="2" class="block-th">毗邻情况</th>
                    </tr>
                    <tr>
                        <th width="64">东：</th>
                        <td><#if compZddwInfo.blgxd??>${compZddwInfo.blgxd}</#if></td>
                    </tr>
                    <tr>
                        <th>西：</th>
                        <td><#if compZddwInfo.blgxx??>${compZddwInfo.blgxx}</#if></td>
                    </tr>
                    <tr>
                        <th>南：</th>
                        <td><#if compZddwInfo.blgxn??>${compZddwInfo.blgxn}</#if></td>
                    </tr>
                    <tr>
                        <th>北：</th>
                        <td><#if compZddwInfo.blgxb??>${compZddwInfo.blgxb}</#if></td>
                    </tr>
                </table>
            <#--<table class="data-table">-->
            <#--<tr>-->
            <#--<th class="block-th">周边危险源</th>-->
            <#--</tr>-->
            <#--<tr>-->
            <#--<td>--</td>-->
            <#--</tr>-->
            <#--</table>-->
                <table class="data-table">
                    <tr>
                        <th class="block-th">单位概况</th>
                    </tr>
                    <tr>
                        <td><#if compZddwInfo.dwgk??>${compZddwInfo.dwgk}</#if></td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th class="block-th">功能分区总体描述</th>
                    </tr>
                    <tr>
                        <td><#if compZddwInfo.jzflmc??>${compZddwInfo.jzflmc}</#if></td>
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

        <!-- 单位建筑信息 -->
        <#--<div id="gnfq" class="content-block block-level-1" data-menu-text="建筑和消防设施">-->
            <#--<h2 class="block-header">-->
                <#--<span class="header-title-inner">单位建筑信息和消防设施</span>-->
            <#--</h2>-->
            <#--<!-- 单体建筑 and 建筑群（建筑类） &ndash;&gt;-->
        <#--<#list areaBuildingList as areaBuilding>-->
            <#--<#if areaBuilding.compZddwPartDTO??>-->
                <#--<div id="gnfq-${areaBuilding.compZddwPartDTO.uuid}" class="sub-block block-level-2" data-menu-text="-->
    <#--<#if areaBuilding.compZddwPartDTO.name??>-->
    <#--建筑类-${areaBuilding.compZddwPartDTO.name}-->
    <#--</#if>">-->
                    <#--<h3 class="sub-block-header">-->
    <#--<span class="header-title-inner">单体建筑 --->
        <#--<#if areaBuilding.compZddwPartDTO.name??>-->
        <#--${areaBuilding.compZddwPartDTO.name}-->
        <#--</#if></span>-->
                        <#--<!-- <span class="header-title-inner">建筑群（建筑类） - {{建筑名称}}</span> &ndash;&gt;-->
                        <#--<!-- 这两个下面显示的字段一样 &ndash;&gt;-->
                    <#--</h3>-->
                    <#--<div class="sub-block-body">-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th width="120">建筑使用性质：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.syxz??>-->
                                        <#--<#list syxzMap?keys as k>-->
                                            <#--<#if k == areaBuilding.compZddwPartDTO.syxz>-->
                                                <#--<#if (syxzMap[k].oKey?? && syxzMap[k].tKey?? && syxzMap[k].sKey??)>-->
                                                <#--${syxzMap[k].oKey} / ${syxzMap[k].tKey} / ${syxzMap[k].sKey}-->
                                                <#--<#else>-->
                                                    <#--<#if (syxzMap[k].oKey?? && syxzMap[k].tKey??)>-->
                                                    <#--${syxzMap[k].oKey} / ${syxzMap[k].tKey}-->
                                                    <#--<#else>-->
                                                        <#--<#if syxzMap[k].oKey??>-->
                                                        <#--${syxzMap[k].oKey}-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--</#if>-->
                                            <#--</#if>-->
                                        <#--</#list>-->
                                    <#--</#if></td>-->
                                <#--<th width="120">建筑结构：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.jzjg??>-->
    <#--<#list dictionaryMap?keys as k>-->
                                        <#--<#if k == areaBuilding.compZddwPartDTO.jzjg>-->
                                        <#--${dictionaryMap[k]}-->
                                        <#--</#if>-->
                                    <#--</#list>-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th>占地面积：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.zdmj??>-->
                                    <#--${areaBuilding.compZddwPartDTO.zdmj}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--㎡-->
                                <#--</td>-->
                                <#--<th>建筑面积：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.zjzmj??>-->
                                    <#--${areaBuilding.compZddwPartDTO.zjzmj}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--㎡-->
                                <#--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th>地上高度：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.heightDs??>-->
                                    <#--${areaBuilding.compZddwPartDTO.heightDs}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--米-->
                                <#--</td>-->
                                <#--<th>地下高度：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.heightDx??>-->
                                    <#--${areaBuilding.compZddwPartDTO.heightDx}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--米-->
                                <#--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th>地上层数：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.floorDs??>-->
                                    <#--${areaBuilding.compZddwPartDTO.floorDs}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--层-->
                                <#--</td>-->
                                <#--<th>地下层数：</th>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.floorDx??>-->
                                    <#--${areaBuilding.compZddwPartDTO.floorDx}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--层-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">功能分区(或楼层)说明</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.subCompZddwPartDTOWrappers??>-->
                                        <#--<#list areaBuilding.subCompZddwPartDTOWrappers as subPart>-->
                                            <#--<strong class="tag-item">-->
                                                <#--<#if subPart.compZddwPartDTO??>-->
    <#--<#if subPart.compZddwPartDTO.partType == "ZDDW_BUILDING_FLOOR">-->
                                                <#--${subPart.compZddwPartDTO.name}-->
                                                <#--</#if>-->
    <#--</#if>-->
                                            <#--</strong>-->
                                        <#--</#list>-->
                                    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">备注</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#if areaBuilding.compZddwPartDTO.remark??>-->
    <#--${areaBuilding.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="4" class="block-th">安全疏散设施</th>-->
                            <#--<#list facilityList as facility>-->
                                <#--<#if facility.compZddwPartDTO??>-->
                                    <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaBuilding.compZddwPartDTO.uuid>-->
                                        <#--<#if facility.compZddwPartDTO.partType == "ZDDW_SECURITY_EXIT">-->
                                            <#--<tr>-->
                                                <#--<th width="120">安全出口：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_EVACUATION_STAIR">-->
                                            <#--<tr>-->
                                                <#--<th width="120">疏散楼梯：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_ELEVATOR">-->
                                            <#--<tr>-->
                                                <#--<th width="120">消防电梯：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_YJGB_SYSTEM">-->
                                            <#--<tr>-->
                                                <#--<th width="120">应急广播：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.isHaving>-->
                                                        <#--有-->
                                                    <#--<#else>-->
                                                        <#--无-->
                                                    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--</#if>-->
                                    <#--</#if>-->
                                <#--</#if>-->
                            <#--</#list>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">消防控制室</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="4" class="block-th">防排烟设施</th>-->
                            <#--<#list facilityList as facility>-->
                                <#--<#if facility.compZddwPartDTO??>-->
                                    <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaBuilding.compZddwPartDTO.uuid>-->
                                        <#--<#if facility.compZddwPartDTO.partType == "ZDDW_FPY_SYSTEM">-->
                                            <#--<tr>-->
                                                <#--<th width="120">防排烟系统：</th>-->
                                                <#--<td><#if facility.compZddwPartDTO.isHaving>-->
                                                    <#--有-->
                                                <#--<#else>-->
                                                    <#--无-->
                                                <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--</#if>-->
                                    <#--</#if>-->
                                <#--</#if>-->
                            <#--</#list>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th colspan="2" class="block-th">其他消防设施</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th width="120">位置：</th>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th width="120">描述：</th>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th colspan="4" class="block-th">消防水系统</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#list facilityList as facility>-->
                                        <#--<#if facility.compZddwPartDTO??>-->
                                            <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaBuilding.compZddwPartDTO.uuid>-->
                                                <#--<#if facility.compZddwPartDTO.partType == "ZDDW_FIRE_XFBF">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="6" style="text-align:left">-->
                                                                <#--<strong>消防泵房</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">位置：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                            <#--<th width="120">消火栓泵流量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.xhsbLl??>-->
                                                                <#--${facility.compZddwPartDTO.xhsbLl}-->
                                                                <#--</#if>-->
                                                                <#--L/s-->
                                                            <#--</td>-->
                                                            <#--<th width="120">喷淋泵流量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.plbLl??>-->
                                                                <#--${facility.compZddwPartDTO.plbLl}-->
                                                                <#--</#if>-->
                                                                <#--L/s-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">消火栓泵数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.xhsbSl??>-->
    <#--${facility.compZddwPartDTO.xhsbSl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">喷淋泵数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.plbSl??>-->
    <#--${facility.compZddwPartDTO.plbSl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_SX">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="4" style="text-align:left">-->
                                                                <#--<strong>消防水箱</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">容量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.capacityTotal??>-->
                                                                <#--${facility.compZddwPartDTO.capacityTotal}-->
                                                                <#--</#if>-->
                                                                <#--m³-->
                                                            <#--</td>-->
                                                            <#--<th width="120">补给方式：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.supplyMode??>-->
    <#--${facility.compZddwPartDTO.supplyMode}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_SC">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="4" style="text-align:left">-->
                                                                <#--<strong>消防水池</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">容量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.capacityTotal??>-->
                                                                <#--${facility.compZddwPartDTO.capacityTotal}-->
                                                                <#--</#if>-->
                                                                <#--m³-->
                                                            <#--</td>-->
                                                            <#--<th width="120">补给方式：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.supplyMode??>-->
    <#--${facility.compZddwPartDTO.supplyMode}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("栓")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>消火栓</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("消防水炮")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>固定消防水炮</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("半固定")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>半固定设施</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_PUMP_ADAPTER">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="4" style="text-align:left">-->
                                                                <#--<strong>水泵接合器</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">数量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                            <#--<th width="120">位置：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">分区描述：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.fqms??>-->
    <#--${facility.compZddwPartDTO.fqms}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_ZDPS_SYSTEM">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th style="text-align:left"><strong>喷淋系统</strong></th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.isHaving>-->
                                                                    <#--有-->
                                                                <#--<#else>-->
                                                                    <#--无-->
                                                                <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                <#--</#if>-->
                                            <#--</#if>-->
                                        <#--</#if>-->
                                    <#--</#list>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">其他灭火系统</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#list facilityList as facility>-->
                                        <#--<#if facility.compZddwPartDTO??>-->
                                            <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaBuilding.compZddwPartDTO.uuid>-->
                                                <#--<#if facility.compZddwPartDTO.partType == "ZDDW_QT_SYSTEM">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="2" style="text-align:left">-->
                                                                <#--<strong>气体灭火系统</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="120">位置：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.qywz??>-->
    <#--${facility.compZddwPartDTO.qywz}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="120">作用范围：</th>-->
                                                            <#--<td>--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气源位置：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.qywz??>-->
    <#--${facility.compZddwPartDTO.qywz}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气体供给强度：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.gjqd??>-->
    <#--${facility.compZddwPartDTO.gjqd}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气体额定供给压力：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.gjyl??>-->
    <#--${facility.compZddwPartDTO.gjyl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">灭火气体种类：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.mhqtzl??>-->
    <#--${facility.compZddwPartDTO.mhqtzl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--</#if>-->
                                            <#--</#if>-->
                                        <#--</#if>-->
                                    <#--</#list>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="2" style="text-align:left">-->
                                                <#--<strong>干粉灭火系统</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">位置：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">作用范围：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                    <#--</div>-->
                <#--</div>-->
                <#--<!-- end 单体建筑 and 建筑群（建筑类） &ndash;&gt;-->
            <#--</#if>-->
        <#--</#list>-->
            <#--<!-- 建筑群（装置类） &ndash;&gt;-->
        <#--<#list areaDeviceList as areaDevice>-->
            <#--<#if areaDevice.compZddwPartDTO??>-->
                <#--<div id="gnfq-${areaDevice.compZddwPartDTO.uuid}" class="sub-block block-level-2"-->
                     <#--data-menu-text="装置类-${areaDevice.compZddwPartDTO.name}">-->
                    <#--<h3 class="sub-block-header">-->
    <#--<span class="header-title-inner">建筑群（装置类） --->
        <#--<#if areaDevice.compZddwPartDTO.name??>-->
        <#--${areaDevice.compZddwPartDTO.name}-->
        <#--</#if></span>-->
                    <#--</h3>-->
                    <#--<div class="sub-block-body">-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th width="120">装置名称：</th>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.name??>-->
    <#--${areaDevice.compZddwPartDTO.name}-->
    <#--</#if>-->
                                <#--</td>-->
                                <#--<th width="120">建筑结构：</th>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.jzjg??>-->
    <#--<#list dictionaryMap?keys as k>-->
                                        <#--<#if k == areaDevice.compZddwPartDTO.jzjg>-->
                                        <#--${dictionaryMap[k]}-->
                                        <#--</#if>-->
                                    <#--</#list>-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th>占地面积：</th>-->
                                <#--<td>-- ㎡</td>-->
                                <#--<th>地上高度：</th>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.heightDs??>-->
                                    <#--${areaDevice.compZddwPartDTO.heightDs}-->
                                    <#--<#else>-->
                                        <#--0-->
                                    <#--</#if>-->
                                    <#--米-->
                                <#--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th>技术负责人：</th>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.jsfzr??>-->
    <#--${areaDevice.compZddwPartDTO.jsfzr}-->
    <#--</#if>-->
                                <#--</td>-->
                                <#--<th>联系方式：</th>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.jsfzrContact??>-->
    <#--${areaDevice.compZddwPartDTO.jsfzrContact}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">装置组成（组成单元）</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.zzzc??>-->
    <#--${areaDevice.compZddwPartDTO.zzzc}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">物料信息</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="2" style="text-align:left"><strong>物料名称</strong> 储量：---->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">理化性质：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">工艺流程描述</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td><#if areaDevice.compZddwPartDTO.gylcms??>-->
    <#--${areaDevice.compZddwPartDTO.gylcms}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">关键阀组说明</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.gjfmwz??>-->
    <#--${areaDevice.compZddwPartDTO.gjfmwz}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">备注</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#if areaDevice.compZddwPartDTO.remark??>-->
    <#--${areaDevice.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th colspan="4" class="block-th">安全疏散设施</th>-->
                            <#--</tr>-->
                            <#--<#list facilityList as facility>-->
                                <#--<#if facility.compZddwPartDTO??>-->
                                    <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaDevice.compZddwPartDTO.uuid>-->
                                        <#--<#if facility.compZddwPartDTO.partType == "ZDDW_SECURITY_EXIT">-->
                                            <#--<tr>-->
                                                <#--<th width="120">安全出口：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_EVACUATION_STAIR">-->
                                            <#--<tr>-->
                                                <#--<th width="120">疏散楼梯：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_ELEVATOR">-->
                                            <#--<tr>-->
                                                <#--<th width="120">消防电梯：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                <#--</td>-->
                                                <#--<th width="120">位置：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_YJGB_SYSTEM">-->
                                            <#--<tr>-->
                                                <#--<th width="120">应急广播：</th>-->
                                                <#--<td>-->
                                                    <#--<#if facility.compZddwPartDTO.isHaving>-->
                                                        <#--有-->
                                                    <#--<#else>-->
                                                        <#--无-->
                                                    <#--</#if>-->
                                                <#--</td>-->
                                            <#--</tr>-->
                                        <#--</#if>-->
                                    <#--</#if>-->
                                <#--</#if>-->
                            <#--</#list>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">消防控制室</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">泡沫灭火系统</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="6" style="text-align:left">-->
                                                <#--<strong>泡沫泵房</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">位置：</th>-->
                                            <#--<td colspan="5">--</td>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">泵流量：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">泡沫液类型：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">泡沫液储量：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="4" style="text-align:left">-->
                                                <#--<strong>泡沫栓</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">数量：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">是否可用：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="4" style="text-align:left">-->
                                                <#--<strong>固定泡沫炮</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">数量：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">是否可用：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="4" style="text-align:left">-->
                                                <#--<strong>半固定设施</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">数量：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">是否可用：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="4" style="text-align:left">-->
                                                <#--<strong>泡沫发生器</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="80">型号：</th>-->
                                            <#--<td>--</td>-->
                                            <#--<th width="120">是否可用：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th colspan="2" class="block-th">其他消防设施</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th width="120">位置：</th>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<th width="120">描述：</th>-->
                                <#--<td>--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th colspan="4" class="block-th">消防水系统</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#list facilityList as facility>-->
                                        <#--<#if facility.compZddwPartDTO??>-->
                                            <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaDevice.compZddwPartDTO.uuid>-->
                                                <#--<#if facility.compZddwPartDTO.partType == "ZDDW_FIRE_XFBF">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="6" style="text-align:left">-->
                                                                <#--<strong>消防泵房</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">位置：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                            <#--<th width="120">消火栓泵流量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.xhsbLl??>-->
                                                                <#--${facility.compZddwPartDTO.xhsbLl}-->
                                                                <#--</#if>-->
                                                                <#--L/s-->
                                                            <#--</td>-->
                                                            <#--<th width="120">喷淋泵流量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.plbLl??>-->
                                                                <#--${facility.compZddwPartDTO.plbLl}-->
                                                                <#--</#if>-->
                                                                <#--L/s-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">消火栓泵数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.xhsbSl??>-->
    <#--${facility.compZddwPartDTO.xhsbSl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">喷淋泵数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.plbSl??>-->
    <#--${facility.compZddwPartDTO.plbSl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_SC">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="4" style="text-align:left">-->
                                                                <#--<strong>消防水池</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="80">容量：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.capacityTotal??>-->
                                                                <#--${facility.compZddwPartDTO.capacityTotal}-->
                                                                <#--</#if>-->
                                                                <#--m³-->
                                                            <#--</td>-->
                                                            <#--<th width="120">补给方式：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.supplyMode??>-->
    <#--${facility.compZddwPartDTO.supplyMode}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">数量：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("栓")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>消火栓</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("消防水炮")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>固定消防水炮</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_FIRE_INDOOR_XHS">-->
                                                    <#--<#if facility.compZddwPartDTO.name??>-->
                                                        <#--<#if facility.compZddwPartDTO.name?contains("半固定")>-->
                                                            <#--<table class="data-table">-->
                                                                <#--<tr>-->
                                                                    <#--<th colspan="4" style="text-align:left">-->
                                                                        <#--<strong>半固定设施</strong>-->
                                                                        <#--<span class="more-btn"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                                    <#--</th>-->
                                                                <#--</tr>-->
                                                                <#--<tr>-->
                                                                    <#--<th width="80">数量：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.count??>-->
    <#--${facility.compZddwPartDTO.count}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                    <#--<th width="120">是否可用：</th>-->
                                                                    <#--<td>-->
                                                                        <#--<#if facility.compZddwPartDTO.snxhsStatus??>-->
    <#--${facility.compZddwPartDTO.snxhsStatus}-->
    <#--</#if>-->
                                                                    <#--</td>-->
                                                                <#--</tr>-->
                                                            <#--</table>-->
                                                            <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                                <#--<div class="dialog-content">-->
                                                                    <#--<header class="dialog-header">-->
                                                                        <#--<h4 class="dialog-title"></h4>-->
                                                                        <#--<span class="close"-->
                                                                              <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                                    <#--</header>-->
                                                                    <#--<div class="dialog-body">-->
                                                                        <#--<div class="dialog-content-inner">-->
                                                                            <#--<table class="data-table">-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">名称：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.name??>-->
    <#--${facility.compZddwPartDTO.name}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">位置：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.location??>-->
    <#--${facility.compZddwPartDTO.location}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                                <#--<tr>-->
                                                                                    <#--<th width="120">备注：</th>-->
                                                                                    <#--<td>-->
                                                                                        <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                                    <#--</td>-->
                                                                                <#--</tr>-->
                                                                            <#--</table>-->
                                                                        <#--</div>-->
                                                                    <#--</div>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</#if>-->
                                                    <#--</#if>-->
                                                <#--<#elseif facility.compZddwPartDTO.partType == "ZDDW_ZDPS_SYSTEM">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th style="text-align:left"><strong>喷淋系统</strong></th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.isHaving>-->
                                                                    <#--有-->
                                                                <#--<#else>-->
                                                                    <#--无-->
                                                                <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                <#--</#if>-->
                                            <#--</#if>-->
                                        <#--</#if>-->
                                    <#--</#list>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                        <#--<table class="data-table">-->
                            <#--<tr>-->
                                <#--<th class="block-th">其他灭火系统</th>-->
                            <#--</tr>-->
                            <#--<tr>-->
                                <#--<td>-->
                                    <#--<#list facilityList as facility>-->
                                        <#--<#if facility.compZddwPartDTO??>-->
                                            <#--<#if facility.compZddwPartDTO.belongToPartUuid == areaDevice.compZddwPartDTO.uuid>-->
                                                <#--<#if facility.compZddwPartDTO.partType == "ZDDW_QT_SYSTEM">-->
                                                    <#--<table class="data-table">-->
                                                        <#--<tr>-->
                                                            <#--<th colspan="2" style="text-align:left">-->
                                                                <#--<strong>气体灭火系统</strong>-->
                                                                <#--<span class="more-btn"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').show()">查看详情</span>-->
                                                            <#--</th>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="120">位置：</th>-->
                                                            <#--<td>-->
                                                                <#--<#if facility.compZddwPartDTO.qywz??>-->
    <#--${facility.compZddwPartDTO.qywz}-->
    <#--</#if>-->
                                                            <#--</td>-->
                                                        <#--</tr>-->
                                                        <#--<tr>-->
                                                            <#--<th width="120">作用范围：</th>-->
                                                            <#--<td>--</td>-->
                                                        <#--</tr>-->
                                                    <#--</table>-->
                                                    <#--<div id="${facility.compZddwPartDTO.uuid}" class="dialog">-->
                                                        <#--<div class="dialog-content">-->
                                                            <#--<header class="dialog-header">-->
                                                                <#--<h4 class="dialog-title"></h4>-->
                                                                <#--<span class="close"-->
                                                                      <#--onclick="$('#${facility.compZddwPartDTO.uuid}').hide()">×</span>-->
                                                            <#--</header>-->
                                                            <#--<div class="dialog-body">-->
                                                                <#--<div class="dialog-content-inner">-->
                                                                    <#--<table class="data-table">-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气源位置：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.qywz??>-->
    <#--${facility.compZddwPartDTO.qywz}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气体供给强度：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.gjqd??>-->
    <#--${facility.compZddwPartDTO.gjqd}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">气体额定供给压力：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.gjyl??>-->
    <#--${facility.compZddwPartDTO.gjyl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">灭火气体种类：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.mhqtzl??>-->
    <#--${facility.compZddwPartDTO.mhqtzl}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                        <#--<tr>-->
                                                                            <#--<th width="120">备注：</th>-->
                                                                            <#--<td>-->
                                                                                <#--<#if facility.compZddwPartDTO.remark??>-->
    <#--${facility.compZddwPartDTO.remark}-->
    <#--</#if>-->
                                                                            <#--</td>-->
                                                                        <#--</tr>-->
                                                                    <#--</table>-->
                                                                <#--</div>-->
                                                            <#--</div>-->
                                                        <#--</div>-->
                                                    <#--</div>-->
                                                <#--</#if>-->
                                            <#--</#if>-->
                                        <#--</#if>-->
                                    <#--</#list>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="2" style="text-align:left">-->
                                                <#--<strong>干粉灭火系统</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">位置：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">作用范围：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                    <#--<table class="data-table">-->
                                        <#--<tr>-->
                                            <#--<th colspan="2" style="text-align:left">-->
                                                <#--<strong>蒸汽灭火系统</strong>-->
                                                <#--<span class="more-btn">查看详情</span>-->
                                            <#--</th>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">位置：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                        <#--<tr>-->
                                            <#--<th width="120">作用范围：</th>-->
                                            <#--<td>--</td>-->
                                        <#--</tr>-->
                                    <#--</table>-->
                                <#--</td>-->
                            <#--</tr>-->
                        <#--</table>-->
                    <#--</div>-->
                <#--</div>-->
                <#--<!-- end 建筑群（装置类） &ndash;&gt;-->
            <#--</#if>-->
        <#--</#list>-->
            <#--<!-- 建筑群（储罐类） &ndash;&gt;-->
            <#--<div id="gnfq_3" class="sub-block block-level-2" data-menu-text="储罐类-储罐名称">-->
                <#--<h3 class="sub-block-header">-->
                    <#--<span class="header-title-inner">建筑群（储罐类） - 储罐名称</span>-->
                <#--</h3>-->
                <#--<div class="sub-block-body">-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th width="120">储罐区名称：</th>-->
                            <#--<td>--</td>-->
                            <#--<th width="120">储罐编号：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th>技术负责人：</th>-->
                            <#--<td>--</td>-->
                            <#--<th>联系方式：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="6" class="block-th">罐体信息</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th width="120">储罐类型：</th>-->
                            <#--<td>--</td>-->
                            <#--<th width="120">存储温度：</th>-->
                            <#--<td>--</td>-->
                            <#--<th width="120">工作压力：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th>容量：</th>-->
                            <#--<td>--</td>-->
                            <#--<th>罐顶面积：</th>-->
                            <#--<td>-- ㎡</td>-->
                            <#--<th>储罐间距：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th>直径：</th>-->
                            <#--<td>--</td>-->
                            <#--<th>高度：</th>-->
                            <#--<td>--</td>-->
                            <#--<th>周长：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">存储介质</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left"><strong>名称</strong></th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">实际储量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">液位高度：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th>理化性质：</th>-->
                                        <#--<td colspan="3">--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                            <#--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">关键阀组说明</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">备注</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<!-- 以下设施部分，和建筑群（装置类）相同 &ndash;&gt;-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="4" class="block-th">安全疏散设施</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th width="120">安全出口：</th>-->
                            <#--<td>--</td>-->
                            <#--<th width="120">位置：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">消防控制室</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">泡沫灭火系统</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="6" style="text-align:left">-->
                                            <#--<strong>泡沫泵房</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">位置：</th>-->
                                        <#--<td colspan="5">--</td>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">泵流量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">泡沫液类型：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">泡沫液储量：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>泡沫栓</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>固定泡沫炮</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>半固定设施</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>泡沫发生器</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">型号：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                            <#--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="2" class="block-th">其他消防设施</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th width="120">位置：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<th width="120">描述：</th>-->
                            <#--<td>--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th colspan="4" class="block-th">消防水系统</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="6" style="text-align:left">-->
                                            <#--<strong>消防泵房</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">位置：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">消火栓泵流量：</th>-->
                                        <#--<td>-- L/s</td>-->
                                        <#--<th width="120">喷淋泵流量：</th>-->
                                        <#--<td>-- L/s</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>消防水池</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">容量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">补给方式：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>消火栓</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>固定消防水炮</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="4" style="text-align:left">-->
                                            <#--<strong>半固定设施</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="80">数量：</th>-->
                                        <#--<td>--</td>-->
                                        <#--<th width="120">是否可用：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th style="text-align:left"><strong>喷淋系统</strong></th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                            <#--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                    <#--<table class="data-table">-->
                        <#--<tr>-->
                            <#--<th class="block-th">其他灭火系统</th>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="2" style="text-align:left">-->
                                            <#--<strong>气体灭火系统</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">位置：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">作用范围：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="2" style="text-align:left">-->
                                            <#--<strong>干粉灭火系统</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">位置：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">作用范围：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                                <#--<table class="data-table">-->
                                    <#--<tr>-->
                                        <#--<th colspan="2" style="text-align:left">-->
                                            <#--<strong>蒸汽灭火系统</strong>-->
                                            <#--<span class="more-btn">查看详情</span>-->
                                        <#--</th>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">位置：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                    <#--<tr>-->
                                        <#--<th width="120">作用范围：</th>-->
                                        <#--<td>--</td>-->
                                    <#--</tr>-->
                                <#--</table>-->
                            <#--</td>-->
                        <#--</tr>-->
                    <#--</table>-->
                <#--</div>-->
            <#--</div>-->
            <#--<!-- end建筑群（储罐类） &ndash;&gt;-->
        <#--</div>-->
        <!-- end 单位建筑信息 -->

        <!-- 重点部位 -->
        <div id="zdqy" class="content-block block-level-1" data-menu-text="重点部位">
            <h2 class="block-header">
                <span class="header-title-inner">重点部位</span>
            </h2>
            <!-- 建筑类 -->
            <#list jzlpartsList as region>
                <#if region.zdbwid??>
                    <div id="zdqy_jz_${region.zdbwid}" class="sub-block block-level-2" data-menu-text="建筑类-${region.zdbwmc}">
                        <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                ${region_index+1} - 建筑类 - <#if region.zdbwmc??>${region.zdbwmc}</#if>
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
                                    <td><#if region.jzl_jzjg??>${region.jzl_jzjg}</#if></td>
                                    <th>区域面积：</th>
                                    <td><#if region.jzl_qymj??>${region.jzl_qymj}</#if>㎡</td>
                                </tr>
                            </table>
                            <table class="data-table">
                                <tr><th class="block-th">危险介质</th></tr>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <tr>
                                                <th colspan="2" style="text-align:left"><strong>名称</strong></th>
                                            </tr>
                                            <tr>
                                                <th width="120">实际储量：</th>
                                                <td>--</td>
                                            </tr>
                                            <tr>
                                                <th width="120">理化性质：</th>
                                                <td>--</td>
                                            </tr>
                                            <tr>
                                                <th width="120">备注：</th>
                                                <td>--</td>
                                            </tr>
                                        </table>
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
                    <div id="zdqy_zz_${region.zdbwid}" class="sub-block block-level-2" data-menu-text="装置类-${region.zdbwmc}">
                        <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                ${region_index+1} - 装置类 - <#if region.zdbwmc??>${region.zdbwmc}</#if>
                            </span>
                        </h3>
                        <div class="sub-block-body">
                            <table class="data-table">
                                <tr>
                                    <th width="120">位置：</th>
                                    <td width="300"><#if region.zdbwwz??>${region.zdbwwz}</#if></td>
                                    <th width="120">建筑结构：</th>
                                    <td><#if region.zzl_jzjg??>${region.zzl_jzjg}</#if></td>
                                </tr>
                                <tr>
                                    <th>占地面积：</th>
                                    <td><#if region.zzl_zdmj??>${region.zzl_zdmj}</#if> ㎡</td>
                                    <th>装置高度：</th>
                                    <td><#if region.zzl_zzgd??>${region.zzl_zzgd}</#if> 米</td>
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
                                    <td>--</td>
                                </tr>
                                <tr>
                                    <th class="block-th">装置原料</th>
                                </tr>
                                <tr>
                                    <td>--</td>
                                </tr>
                                <tr>
                                    <th class="block-th">装置产物</th>
                                </tr>
                                <tr>
                                    <td>--</td>
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
                    <div id="zdqy_cg_${region.zdbwid}" class="sub-block block-level-2" data-menu-text="储罐类-${region.zdbwmc}">
                        <h3 class="sub-block-header">
                            <span class="header-title-inner">
                                ${region_index+1} - 储罐类 - <#if region.zdbwmc??>${region.zdbwmc}</#if>
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
                                    <td><#if region.cgl_zrj??>${region.cgl_zrj}</#if></td>
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
                            <table class="data-table">
                                <tr>
                                    <th colspan="6" class="block-th">罐体信息</th>
                                </tr>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <tr>
                                                <th colspan="6" style="text-align:left"><strong>罐体名称</strong></th>
                                            </tr>
                                            <tr>
                                                <th width="120">罐体名称：</th>
                                                <td width="165">--</td>
                                                <th width="120">储罐类型：</th>
                                                <td width="165">--</td>
                                                <th width="120">存储温度：</th>
                                                <td>--</td>

                                            </tr>
                                            <tr>
                                                <th width="120">工作压力：</th>
                                                <td>--</td>
                                                <th>容量：</th>
                                                <td>--</td>
                                                <th>罐顶面积：</th>
                                                <td>-- ㎡</td>
                                            </tr>
                                            <tr>
                                                <th width="120">直径：</th>
                                                <td>--</td>
                                                <th>高度：</th>
                                                <td>--</td>
                                                <th>周长：</th>
                                                <td>--</td>
                                            </tr>
                                            <tr>
                                                <th colspan="6" style="text-align:left"><strong>存储介质</strong></th>
                                            </tr>
                                            <tr>
                                                <th width="120">实际储量：</th>
                                                <td colspan="2">--</td>
                                                <th width="120">液位高度：</th>
                                                <td colspan="2">--</td>
                                            </tr>
                                            <tr>
                                                <th>理化性质：</th>
                                                <td colspan="5">--</td>
                                            </tr>
                                        </table>
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
            <!-- end 储罐类 -->
        </div>
        <!-- end 重点部位 -->

        <!-- 灾情设定 -->
        <div id="zqsd" class="content-block block-level-1" data-menu-text="灾情设定">
            <h2 class="block-header">
                <span class="header-title-inner">灾情设定</span>
            </h2>
        <#list disastersetList as disaster>
            <#if disaster??>
                <div id="zzbs_1" class="sub-block block-level-2" data-menu-text="灾情部位-${disaster.zqbw}">
                    <h3 class="sub-block-header">
                        <span class="header-title-inner">灾情部位-<#if disaster.zqbw??>${disaster.zqbw}</#if></span>
                    </h3>
                    <div class="sub-block-body">
                        <table class="data-table">
                            <tr>
                                <th width="140">灾害场所：</th>
                                <td colspan="3"><#if disaster.zhcsmc??>${disaster.zhcsmc}</#if></td>
                            </tr>
                            <tr>
                                <th>灾情等级：</th>
                                <td width="250"><#if disaster.zqdjmc??>${disaster.zqdjmc}</#if></td>
                                <th width="170">工业建筑火灾危险性：</th>
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
                                <td><#if disaster.qhbwgd??>${disaster.qhbwgd}</#if></td>
                                <th>燃烧面积：</th>
                                <td><#if disaster.rsmj??>${disaster.rsmj}</#if></td>
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
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
        </div>
        <!-- end 灾情设定 -->

        <!-- 力量部署 -->
        <div id="zzbs" class="content-block block-level-1" data-menu-text="力量部署">
            <h2 class="block-header">
                <span class="header-title-inner">力量部署</span>
            </h2>
            <div id="zzbs_1" class="sub-block block-level-2" data-menu-text="第一出动力量调集方案">
                <h3 class="sub-block-header">
                    <span class="header-title-inner">第一出动力量调集方案</span>
                </h3>
            <#list forcedevList as forcedev>
                <#if forcedev??>
                    <#if forcedev.djfalx == '1'>
                        <div class="sub-block-body">
                            <table class="data-table">
                                <tr>
                                    <th width="140">队站名称：</th>
                                    <td width="250"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                    <th width="140">停靠位置：</th>
                                    <td><#if forcedev.tkwz??>${forcedev.tkwz}</#if></td>
                                </tr>
                                <tr>
                                    <th>车辆装备提示：</th>
                                    <td colspan="3"><#if forcedev.clzbts??>${forcedev.clzbts}</#if></td>
                                </tr>
                            </table>
                        </div>
                    </#if>
                </#if>
            </#list>
            </div>
            <div id="zzbs_2" class="sub-block block-level-2" data-menu-text="增援力量调集方案">
                <h3 class="sub-block-header">
                    <span class="header-title-inner">增援力量调集方案</span>
                </h3>
            <#list forcedevList as forcedev>
                <#if forcedev??>
                    <#if forcedev.djfalx == '2'>
                        <div class="sub-block-body">
                            <table class="data-table">
                                <tr>
                                    <th width="140">队站名称：</th>
                                    <td width="250"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                    <th width="140">停靠位置：</th>
                                    <td><#if forcedev.tkwz??>${forcedev.tkwz}</#if></td>
                                </tr>
                                <tr>
                                    <th>车辆装备提示：</th>
                                    <td colspan="3"><#if forcedev.clzbts??>${forcedev.clzbts}</#if></td>
                                </tr>
                            </table>
                        </div>
                    </#if>
                </#if>
            </#list>
            </div>
        </div>
        <!-- end 力量部署 -->

        <!-- 要点提示 -->
        <div id="ydts" class="content-block block-level-1" data-menu-text="要点提示">
            <h2 class="block-header">
                <span class="header-title-inner">要点提示</span>
            </h2>
            <#if keypointsInfo??>
            <div class="sub-block-body">
                <table class="data-table">
                    <tr>
                        <th class="block-th">战术要点</th>
                    </tr>
                    <tr>
                        <td><#if keypointsInfo.zsyd??>${keypointsInfo.zsyd}</#if></td>
                    </tr>
                    <tr>
                        <th class="block-th">特别警示</th>
                    </tr>
                    <tr>
                        <td><#if keypointsInfo.tbjs??>${keypointsInfo.tbjs}</#if></td>
                    </tr>
                </table>
            </div>
            </#if>
        </div>
        <!-- end 要点提示 -->

        <!-- 这段注释说不定以后能用上 -->
        <!-- <div id="xgzy" class="content-block block-level-1" data-menu-text="相关资源">
            <h2 class="block-header">
                <span class="header-title-inner">相关资源</span>
            </h2>
            <div class="block-body">
                <table class="data-table">
                    <tr>
                        <td style="text-align:center">
                            <a href="#" class="attachment-item file-type-doc" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-xls" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-ppt" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-pdf" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-txt" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-img" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-video" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-audio" target="_blank">{{文件名}}</a>
                            <a href="#" class="attachment-item file-type-unkonwn" target="_blank">{{文件名}}</a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>

        <div id="gjts" class="content-block block-level-1" data-menu-text="关键图示">
            <h2 class="block-header">
                <span class="header-title-inner">关键图示</span>
            </h2>
            <div class="block-body">
                <table class="data-table">
                    <tr>
                        <td style="text-align:center">
                            <ul class="images-wrap">
                                <li style="background-image:url('')">
                                    <img src="" alt="{{描述}}" />
                                </li>
                                <li style="background-image:url('')">
                                    <img src="" alt="{{描述}}" />
                                </li>
                                <li style="background-image:url('')">
                                    <img src="" alt="{{描述}}" />
                                </li>
                            </ul>
                        </td>
                    </tr>
                </table>
            </div>
        </div> -->

    <#--<div id="qjmy" class="content-block block-level-1" data-menu-text="全景漫游">-->
    <#--<h2 class="block-header">-->
    <#--<span class="header-title-inner">全景漫游</span>-->
    <#--</h2>-->
    <#--<#if panoList??>-->
    <#--<#list panoList as pano>-->
    <#--<div class="block-body" style="text-align:center;">-->
    <#--<a href="${pano.publishUrl}" class="pano-item" target="_blank">-->
    <#--<span class="pano-item-title">全景漫游</span>-->
    <#--&lt;#&ndash;<span class="pano-item-desc">{漫游描述}</span>&ndash;&gt;-->
    <#--</a>-->
    <#--</div>-->
    <#--</#list>-->
    <#--</#if>-->
    <#--</div>-->
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
        var qrcodeAPI = 'http://pan.baidu.com/share/qrcode?w=150&h=150&url=';
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
