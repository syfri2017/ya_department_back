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
                <span class="cover-code">编码:  <#if compPlanInfo.yabm??>${compPlanInfo.yabm}</#if></span>
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
                            <th width="160" style="text-align:right">预案状态：</th>
                            <td style="text-align:left"><#if compPlanInfo.yaztmc??>${compPlanInfo.yaztmc}</#if></td>
                            <th width="125" style="text-align:right">制作人姓名：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzrmc??>${compPlanInfo.zzrmc}</#if></td>
                            <th width="125" style="text-align:right">制作人职务：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzrmc??>${compPlanInfo.zzrmc}</#if></td>
                            <th width="120" style="text-align:right">制作时间：</th>
                            <td style="text-align:left"><#if compPlanInfo.zzsj??>${compPlanInfo.zzsj?substring(0,10)}</#if></td>
                        </tr>
                        <tr>
                            <th width="140" style="text-align:right">审核状态：</th>
                            <td style="text-align:left"><#if compPlanInfo.shztmc??>${compPlanInfo.shztmc}</#if></td>
                            <th width="125" style="text-align:right">审核人姓名：</th>
                            <td style="text-align:left"><#if compPlanInfo.shrmc??>${compPlanInfo.shrmc}</#if></td>
                            <th width="125" style="text-align:right">审核人职务：</th>
                            <td style="text-align:left"><#if compPlanInfo.shrmc??>${compPlanInfo.shrmc}</#if></td>
                            <th width="120" style="text-align:right">审核时间：</th>
                            <td style="text-align:left"><#if compPlanInfo.shsj??>${compPlanInfo.shsj?substring(0,10)}</#if></td>
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
                        <td width="300"><#if compZddwInfo.dwlbmc??>${compZddwInfo.dwlbmc}</#if></td>
                        <th width="120">值班电话：</th>
                        <td><#if compZddwInfo.zbdh??>${compZddwInfo.zbdh}</#if></td>
                    </tr>
                    <tr>
                        <th>总建筑面积：</th>
                        <td><#if compZddwInfo.jzmj??>${compZddwInfo.jzmj}</#if> ㎡</td>
                        <th>总占地面积：</th>
                        <td><#if compZddwInfo.zdmj??>${compZddwInfo.zdmj}</#if> ㎡</td>
                    </tr>
                </table>
                <table class="data-table">
                    <tr>
                        <th colspan="4" class="block-th">消防安全组织</th>
                    </tr>
                    <tr>
                        <th width="120">消防负责人：</th>
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
                        <td><#if compZddwInfo.blgxd??>${compZddwInfo.plqkd}</#if></td>
                    </tr>
                    <tr>
                        <th>西：</th>
                        <td><#if compZddwInfo.blgxx??>${compZddwInfo.plqkx}</#if></td>
                    </tr>
                    <tr>
                        <th>南：</th>
                        <td><#if compZddwInfo.blgxn??>${compZddwInfo.plqkn}</#if></td>
                    </tr>
                    <tr>
                        <th>北：</th>
                        <td><#if compZddwInfo.blgxb??>${compZddwInfo.plqkb}</#if></td>
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

        <!-- 灾情设定与力量部署、要点提示 -->
        <div id="zqsd" class="content-block block-level-1" data-menu-text="灾情设定与力量部署">
            <h2 class="block-header">
                <span class="header-title-inner">灾情设定与力量部署</span>
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
                                <td width="260"><#if disaster.zqdjmc??>${disaster.zqdjmc}</#if></td>
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
                            <!-- 力量部署 -->
                            <#if disaster.forcedevList??>
                                <table class="data-table">
                                    <tr>
                                        <th class="block-th">力量部署</th>
                                    </tr>
                                    <tr>
                                        <td>
                                            <table class="data-table">
                                                <tr>
                                                    <th colspan="4" style="text-align:left">
                                                        <strong>第一出动力量调集方案</strong>
                                                    </th>
                                                </tr>
                                                <#list disaster.forcedevList as forcedev>
                                                    <#if forcedev.djfalx == '1'>
                                                        <tr>
                                                            <th width="140">队站名称：</th>
                                                            <td width="260"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                                            <th width="140">停靠位置：</th>
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
                                                            <th width="140">队站名称：</th>
                                                            <td width="260"><#if forcedev.dzmc??>${forcedev.dzmc}</#if></td>
                                                            <th width="140">停靠位置：</th>
                                                            <td><#if forcedev.tkwz??>${forcedev.tkwz}</#if></td>
                                                        </tr>
                                                        <tr>
                                                            <th>车辆装备提示：</th>
                                                            <td colspan="3"><#if forcedev.clzbts??>${forcedev.clzbts}</#if></td>
                                                        </tr>
                                                    </#if>
                                                </#list>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </#if>
                            <!-- end 力量部署 -->
                            <!-- 要点提示 -->
                            <#if disaster.keypointsMap??>
                            <table class="data-table">
                                <tr>
                                    <th class="block-th">要点提示</th>
                                </tr>
                                <tr>
                                    <td>
                                        <table class="data-table">
                                            <tr>
                                                <th width="140">战术要点：</th>
                                                <td><#if disaster.keypointsMap.zsyd??>${disaster.keypointsMap.zsyd}</#if></td>
                                            </tr>
                                            <tr>
                                                <th>特别警示：</th>
                                                <td><#if disaster.keypointsMap.tbjs??>${disaster.keypointsMap.tbjs}</#if></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>

                            </#if>
                            <!-- end 要点提示 -->
                        </table>
                    </div>
                </div>
            </#if>
        </#list>
        </div>
        <!-- end 灾情设定与力量部署、要点提示 -->

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
