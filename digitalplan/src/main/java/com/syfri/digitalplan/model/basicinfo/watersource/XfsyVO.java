package com.syfri.digitalplan.model.basicinfo.watersource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class XfsyVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String sybh;	//水源编号
	private String symc;	//水源名称
	private String sydz;	//水源地址
	private String sylx;	//水源类型
	private String sysxxxid;	//水源属性信息ID
	private String gxdz;	//管辖队站
	private String gxdzmc;	//管辖队站名称
	private String xzqy;	//行政区划CODE
	private String qsxs;	//取水形式
	private String kyzt;	//可用状态
	private String xz;	//性质
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String gisH;	//GIS_H
	private String glid;	//GIS关联ID
	private String bdLon;	//百度精度
	private String bdLat;	//百度纬度
	private String ssld;	//所属路段
	private String jzsj;	//建造时间
	private String qysj;	//启用时间
	private String blgxd;	//毗邻情况(东)
	private String blgxn;	//毗邻情况(南)
	private String blgxx;	//毗邻情况(西)
	private String blgxb;	//毗邻情况(北)
	private String cjrid;	//创建人ID
	private String cjrmc;	//创建人名称
	private String cjsj;	//创建时间
	private String xgrid;	//修改人ID
	private String xgrmc;	//修改人姓名
	private String xgsj;	//修改时间
	private String deleteFlag;	//删除标志
	private String datasource;	//数据来源[100000一体化]
	private String bz;	//备注
	private String jdh;	//节点号
	private String sjc;	//时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3
	private String reserve4;	//备用字段4

	private String sylxmc;  //水源类型名称
	private String xzmc;  //水源性质名称
	private String xzqymc;    //行政区域名称
	private String kyztmc;

    //消火栓属性信息
    private String xhs_uuid;	//主键
    private String xhs_gwid;	//所属管网
    private String xhs_szxs;	//设置形式
    private String xhs_gsdw;	//供水单位
    private String xhs_lxfs;	//联系方式
    private String xhs_gwxs;	//管网形式
    private String xhs_gwzj;	//管网直径
    private String xhs_gwyl;	//管网压力
    private String xhs_jkxs;	//接口形式
    private String xhs_jkkj;	//接口口径
    private String xhs_ll;	//流量
    private String xhs_cjrid;	//创建人ID
    private String xhs_cjrmc;	//创建人名称
    private String xhs_cjsj;	//创建时间
    private String xhs_xgrid;	//修改人ID
    private String xhs_xgrmc;	//修改人姓名
    private String xhs_xgsj;	//修改时间
    private String xhs_deleteFlag;	//删除标志
    private String xhs_datasource;	//数据来源[100000一体化]
    private String xhs_bz;	//备注
    private String xhs_jdh;	//节点号
    private String xhs_sjc;	//时间戳
    private String xhs_reserve1;	//备用字段1
    private String xhs_reserve2;	//备用字段2
    private String xhs_reserve3;	//备用字段3
    private String xhs_reserve4;	//备用字段4

	private String xhs_szxsmc; //设置形式名称
	private String xhs_gwxsmc;  //管网形式名称
	private String xhs_jkxsmc;  //接口形式名称

    //消防水池属性信息
    private String xfsc_uuid;	//主键
    private String xfsc_sybgc;	//水源标高差
    private String xfsc_rl;	//储水量
    private String xfsc_jsll;	//进水流量
    private String xfsc_qszdll;	//取水最大流量(L/S)
    private String xfsc_gwxs;	//管网形式
    private String xfsc_tcwz;	//停车位置
    private String xfsc_tcsl;	//停车数量
    private String xfsc_cjrid;	//创建人ID
    private String xfsc_cjrmc;	//创建人名称
    private String xfsc_cjsj;	//创建时间
    private String xfsc_xgrid;	//修改人ID
    private String xfsc_xgrmc;	//修改人姓名
    private String xfsc_xgsj;	//修改时间
    private String xfsc_deleteFlag;	//删除标志
    private String xfsc_datasource;	//数据来源[100000一体化]
    private String xfsc_bz;	//备注
    private String xfsc_jdh;	//节点号
    private String xfsc_sjc;	//时间戳
    private String xfsc_reserve1;	//备用字段1
    private String xfsc_reserve2;	//备用字段2
    private String xfsc_reserve3;	//备用字段3
    private String xfsc_reserve4;	//备用字段4

	private String xfsc_gwxsmc;	//管网形式名称

    //消防水鹤属性信息
    private String xfsh_uuid;	//主键
    private String xfsh_gwid;	//所属管网
    private String xfsh_szxs;	//管网直径
    private String xfsh_gwyl;	//管网压力
    private String xfsh_shgd;	//水鹤高度
    private String xfsh_ll;	//流量
    private String xfsh_jsgzj;	//进水管直径
    private String xfsh_csgzj;	//出水管直径
    private String xfsh_jscd;	//加水车道
    private String xfsh_cjrid;	//创建人ID
    private String xfsh_cjrmc;	//创建人名称
    private String xfsh_cjsj;	//创建时间
    private String xfsh_xgrid;	//修改人ID
    private String xfsh_xgrmc;	//修改人姓名
    private String xfsh_xgsj;	//修改时间
    private String xfsh_deleteFlag;	//删除标志
    private String xfsh_datasource;	//数据来源[100000一体化]
    private String xfsh_bz;	//备注
    private String xfsh_jdh;	//节点号
    private String xfsh_sjc;	//时间戳
    private String xfsh_reserve1;	//备用字段1
    private String xfsh_reserve2;	//备用字段2
    private String xfsh_reserve3;	//备用字段3
    private String xfsh_reserve4;	//备用字段4

	private String xfsh_jscdmc;	//加水车道名称

    //消防码头属性信息
    private String xfmt_uuid;	//主键
    private String xfmt_sybgc;	//水源标高差（取水口与水面高差）
    private String xfmt_tcwz;	//停车位置
    private String xfmt_tcsl;	//停车数量（同时取水车辆数）
    private String xfmt_ksq;	//枯水期
    private String xfmt_sz;	//水质
    private String xfmt_cjrid;	//创建人ID
    private String xfmt_cjrmc;	//创建人名称
    private String xfmt_cjsj;	//创建时间
    private String xfmt_xgrid;	//修改人ID
    private String xfmt_xgrmc;	//修改人姓名
    private String xfmt_xgsj;	//修改时间
    private String xfmt_deleteFlag;	//删除标志
    private String xfmt_datasource;	//数据来源[100000一体化]
    private String xfmt_bz;	//备注
    private String xfmt_jdh;	//节点号
    private String xfmt_sjc;	//时间戳
    private String xfmt_reserve1;	//备用字段1
    private String xfmt_reserve2;	//备用字段2
    private String xfmt_reserve3;	//备用字段3
    private String xfmt_reserve4;	//备用字段4

	private String xfmt_ksqmc;	//枯水期名称
	private String xfmt_szmc;	//水质名称

    //天然水源属性信息
    private String trsy_uuid;	//主键
    private String trsy_trsylx;	//天然水源类型
    private String trsy_sz;	//水质
    private String trsy_ywksq;	//有无枯水期
    private String trsy_sjbh;	//四季变化
    private String trsy_trsyrl;	//天然水源容量
    private String trsy_trsymj;	//天然水源面积
    private String trsy_xssd;	//吸水深度(m)
    private String trsy_cjrid;	//创建人ID
    private String trsy_cjrmc;	//创建人名称
    private String trsy_cjsj;	//创建时间
    private String trsy_xgrid;	//修改人ID
    private String trsy_xgrmc;	//修改人姓名
    private String trsy_xgsj;	//修改时间
    private String trsy_deleteFlag;	//删除标志
    private String trsy_datasource;	//数据来源[100000一体化]
    private String trsy_bz;	//备注
    private String trsy_jdh;	//节点号
    private String trsy_sjc;	//时间戳
    private String trsy_reserve1;	//备用字段1
    private String trsy_reserve2;	//备用字段2
    private String trsy_reserve3;	//备用字段3
    private String trsy_reserve4;	//备用字段4

	private String trsy_trsylxmc;	//天然水源类型名称
	private String trsy_szmc;	//水质名称
	private String trsy_ywksqmc;	//有无枯水期名称

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getSybh(){
		return sybh;
	}
	public void setSybh(String sybh){
		this.sybh = sybh;
	}
	public String getSymc(){
		return symc;
	}
	public void setSymc(String symc){
		this.symc = symc;
	}
	public String getSydz(){
		return sydz;
	}
	public void setSydz(String sydz){
		this.sydz = sydz;
	}
	public String getSylx(){
		return sylx;
	}
	public void setSylx(String sylx){
		this.sylx = sylx;
	}
	public String getSysxxxid(){
		return sysxxxid;
	}
	public void setSysxxxid(String sysxxxid){
		this.sysxxxid = sysxxxid;
	}
	public String getGxdz(){
		return gxdz;
	}
	public void setGxdz(String gxdz){
		this.gxdz = gxdz;
	}
	public String getGxdzmc(){
		return gxdzmc;
	}
	public void setGxdzmc(String gxdzmc){
		this.gxdzmc = gxdzmc;
	}
	public String getXzqy(){
		return xzqy;
	}
	public void setXzqy(String xzqy){
		this.xzqy = xzqy;
	}
	public String getQsxs(){
		return qsxs;
	}
	public void setQsxs(String qsxs){
		this.qsxs = qsxs;
	}
	public String getKyzt(){
		return kyzt;
	}
	public void setKyzt(String kyzt){
		this.kyzt = kyzt;
	}
	public String getXz(){
		return xz;
	}
	public void setXz(String xz){
		this.xz = xz;
	}
	public String getGisX(){
		return gisX;
	}
	public void setGisX(String gisX){
		this.gisX = gisX;
	}
	public String getGisY(){
		return gisY;
	}
	public void setGisY(String gisY){
		this.gisY = gisY;
	}
	public String getGisH(){
		return gisH;
	}
	public void setGisH(String gisH){
		this.gisH = gisH;
	}
	public String getGlid(){
		return glid;
	}
	public void setGlid(String glid){
		this.glid = glid;
	}
	public String getBdLon(){
		return bdLon;
	}
	public void setBdLon(String bdLon){
		this.bdLon = bdLon;
	}
	public String getBdLat(){
		return bdLat;
	}
	public void setBdLat(String bdLat){
		this.bdLat = bdLat;
	}
	public String getSsld(){
		return ssld;
	}
	public void setSsld(String ssld){
		this.ssld = ssld;
	}
	public String getJzsj(){
		return jzsj;
	}
	public void setJzsj(String jzsj){
		this.jzsj = jzsj;
	}
	public String getQysj(){
		return qysj;
	}
	public void setQysj(String qysj){
		this.qysj = qysj;
	}
	public String getBlgxd(){
		return blgxd;
	}
	public void setBlgxd(String blgxd){
		this.blgxd = blgxd;
	}
	public String getBlgxn(){
		return blgxn;
	}
	public void setBlgxn(String blgxn){
		this.blgxn = blgxn;
	}
	public String getBlgxx(){
		return blgxx;
	}
	public void setBlgxx(String blgxx){
		this.blgxx = blgxx;
	}
	public String getBlgxb(){
		return blgxb;
	}
	public void setBlgxb(String blgxb){
		this.blgxb = blgxb;
	}
	public String getCjrid(){
		return cjrid;
	}
	public void setCjrid(String cjrid){
		this.cjrid = cjrid;
	}
	public String getCjrmc(){
		return cjrmc;
	}
	public void setCjrmc(String cjrmc){
		this.cjrmc = cjrmc;
	}
	public String getCjsj(){
		return cjsj;
	}
	public void setCjsj(String cjsj){
		this.cjsj = cjsj;
	}
	public String getXgrid(){
		return xgrid;
	}
	public void setXgrid(String xgrid){
		this.xgrid = xgrid;
	}
	public String getXgrmc(){
		return xgrmc;
	}
	public void setXgrmc(String xgrmc){
		this.xgrmc = xgrmc;
	}
	public String getXgsj(){
		return xgsj;
	}
	public void setXgsj(String xgsj){
		this.xgsj = xgsj;
	}
	public String getDeleteFlag(){
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag){
		this.deleteFlag = deleteFlag;
	}
	public String getDatasource(){
		return datasource;
	}
	public void setDatasource(String datasource){
		this.datasource = datasource;
	}
	public String getBz(){
		return bz;
	}
	public void setBz(String bz){
		this.bz = bz;
	}
	public String getJdh(){
		return jdh;
	}
	public void setJdh(String jdh){
		this.jdh = jdh;
	}
	public String getSjc(){
		return sjc;
	}
	public void setSjc(String sjc){
		this.sjc = sjc;
	}
	public String getReserve1(){
		return reserve1;
	}
	public void setReserve1(String reserve1){
		this.reserve1 = reserve1;
	}
	public String getReserve2(){
		return reserve2;
	}
	public void setReserve2(String reserve2){
		this.reserve2 = reserve2;
	}
	public String getReserve3(){
		return reserve3;
	}
	public void setReserve3(String reserve3){
		this.reserve3 = reserve3;
	}
	public String getReserve4(){
		return reserve4;
	}
	public void setReserve4(String reserve4){
		this.reserve4 = reserve4;
	}

    public String getXhs_uuid() {
        return xhs_uuid;
    }
    public void setXhs_uuid(String xhs_uuid) {
        this.xhs_uuid = xhs_uuid;
    }
    public String getXhs_gwid() {
        return xhs_gwid;
    }
    public void setXhs_gwid(String xhs_gwid) {
        this.xhs_gwid = xhs_gwid;
    }
    public String getXhs_szxs() {
        return xhs_szxs;
    }
    public void setXhs_szxs(String xhs_szxs) {
        this.xhs_szxs = xhs_szxs;
    }
    public String getXhs_gsdw() {
        return xhs_gsdw;
    }
    public void setXhs_gsdw(String xhs_gsdw) {
        this.xhs_gsdw = xhs_gsdw;
    }
    public String getXhs_lxfs() {
        return xhs_lxfs;
    }
    public void setXhs_lxfs(String xhs_lxfs) {
        this.xhs_lxfs = xhs_lxfs;
    }
    public String getXhs_gwxs() {
        return xhs_gwxs;
    }
    public void setXhs_gwxs(String xhs_gwxs) {
        this.xhs_gwxs = xhs_gwxs;
    }
    public String getXhs_gwzj() {
        return xhs_gwzj;
    }
    public void setXhs_gwzj(String xhs_gwzj) {
        this.xhs_gwzj = xhs_gwzj;
    }
    public String getXhs_gwyl() {
        return xhs_gwyl;
    }
    public void setXhs_gwyl(String xhs_gwyl) {
        this.xhs_gwyl = xhs_gwyl;
    }
    public String getXhs_jkxs() {
        return xhs_jkxs;
    }
    public void setXhs_jkxs(String xhs_jkxs) {
        this.xhs_jkxs = xhs_jkxs;
    }
    public String getXhs_jkkj() {
        return xhs_jkkj;
    }
    public void setXhs_jkkj(String xhs_jkkj) {
        this.xhs_jkkj = xhs_jkkj;
    }
    public String getXhs_ll() {
        return xhs_ll;
    }
    public void setXhs_ll(String xhs_ll) {
        this.xhs_ll = xhs_ll;
    }
    public String getXhs_cjrid() {
        return xhs_cjrid;
    }
    public void setXhs_cjrid(String xhs_cjrid) {
        this.xhs_cjrid = xhs_cjrid;
    }
    public String getXhs_cjrmc() {
        return xhs_cjrmc;
    }
    public void setXhs_cjrmc(String xhs_cjrmc) {
        this.xhs_cjrmc = xhs_cjrmc;
    }
    public String getXhs_cjsj() {
        return xhs_cjsj;
    }
    public void setXhs_cjsj(String xhs_cjsj) {
        this.xhs_cjsj = xhs_cjsj;
    }
    public String getXhs_xgrid() {
        return xhs_xgrid;
    }
    public void setXhs_xgrid(String xhs_xgrid) {
        this.xhs_xgrid = xhs_xgrid;
    }
    public String getXhs_xgrmc() {
        return xhs_xgrmc;
    }
    public void setXhs_xgrmc(String xhs_xgrmc) {
        this.xhs_xgrmc = xhs_xgrmc;
    }
    public String getXhs_xgsj() {
        return xhs_xgsj;
    }
    public void setXhs_xgsj(String xhs_xgsj) {
        this.xhs_xgsj = xhs_xgsj;
    }
    public String getXhs_deleteFlag() {
        return xhs_deleteFlag;
    }
    public void setXhs_deleteFlag(String xhs_deleteFlag) {
        this.xhs_deleteFlag = xhs_deleteFlag;
    }
    public String getXhs_datasource() {
        return xhs_datasource;
    }
    public void setXhs_datasource(String xhs_datasource) {
        this.xhs_datasource = xhs_datasource;
    }
    public String getXhs_bz() {
        return xhs_bz;
    }
    public void setXhs_bz(String xhs_bz) {
        this.xhs_bz = xhs_bz;
    }
    public String getXhs_jdh() {
        return xhs_jdh;
    }
    public void setXhs_jdh(String xhs_jdh) {
        this.xhs_jdh = xhs_jdh;
    }
    public String getXhs_sjc() {
        return xhs_sjc;
    }
    public void setXhs_sjc(String xhs_sjc) {
        this.xhs_sjc = xhs_sjc;
    }
    public String getXhs_reserve1() {
        return xhs_reserve1;
    }
    public void setXhs_reserve1(String xhs_reserve1) {
        this.xhs_reserve1 = xhs_reserve1;
    }
    public String getXhs_reserve2() {
        return xhs_reserve2;
    }
    public void setXhs_reserve2(String xhs_reserve2) {
        this.xhs_reserve2 = xhs_reserve2;
    }
    public String getXhs_reserve3() {
        return xhs_reserve3;
    }
    public void setXhs_reserve3(String xhs_reserve3) {
        this.xhs_reserve3 = xhs_reserve3;
    }
    public String getXhs_reserve4() {
        return xhs_reserve4;
    }
    public void setXhs_reserve4(String xhs_reserve4) {
        this.xhs_reserve4 = xhs_reserve4;
    }

    public String getXfsc_uuid() {
        return xfsc_uuid;
    }
    public void setXfsc_uuid(String xfsc_uuid) {
        this.xfsc_uuid = xfsc_uuid;
    }
    public String getXfsc_sybgc() {
        return xfsc_sybgc;
    }
    public void setXfsc_sybgc(String xfsc_sybgc) {
        this.xfsc_sybgc = xfsc_sybgc;
    }
    public String getXfsc_rl() {
        return xfsc_rl;
    }
    public void setXfsc_rl(String xfsc_rl) {
        this.xfsc_rl = xfsc_rl;
    }
    public String getXfsc_jsll() {
        return xfsc_jsll;
    }
    public void setXfsc_jsll(String xfsc_jsll) {
        this.xfsc_jsll = xfsc_jsll;
    }
    public String getXfsc_qszdll() {
        return xfsc_qszdll;
    }
    public void setXfsc_qszdll(String xfsc_qszdll) {
        this.xfsc_qszdll = xfsc_qszdll;
    }
    public String getXfsc_gwxs() {
        return xfsc_gwxs;
    }
    public void setXfsc_gwxs(String xfsc_gwxs) {
        this.xfsc_gwxs = xfsc_gwxs;
    }
    public String getXfsc_tcwz() {
        return xfsc_tcwz;
    }
    public void setXfsc_tcwz(String xfsc_tcwz) {
        this.xfsc_tcwz = xfsc_tcwz;
    }
    public String getXfsc_tcsl() {
        return xfsc_tcsl;
    }
    public void setXfsc_tcsl(String xfsc_tcsl) {
        this.xfsc_tcsl = xfsc_tcsl;
    }
    public String getXfsc_cjrid() {
        return xfsc_cjrid;
    }
    public void setXfsc_cjrid(String xfsc_cjrid) {
        this.xfsc_cjrid = xfsc_cjrid;
    }
    public String getXfsc_cjrmc() {
        return xfsc_cjrmc;
    }
    public void setXfsc_cjrmc(String xfsc_cjrmc) {
        this.xfsc_cjrmc = xfsc_cjrmc;
    }
    public String getXfsc_cjsj() {
        return xfsc_cjsj;
    }
    public void setXfsc_cjsj(String xfsc_cjsj) {
        this.xfsc_cjsj = xfsc_cjsj;
    }
    public String getXfsc_xgrid() {
        return xfsc_xgrid;
    }
    public void setXfsc_xgrid(String xfsc_xgrid) {
        this.xfsc_xgrid = xfsc_xgrid;
    }
    public String getXfsc_xgrmc() {
        return xfsc_xgrmc;
    }
    public void setXfsc_xgrmc(String xfsc_xgrmc) {
        this.xfsc_xgrmc = xfsc_xgrmc;
    }
    public String getXfsc_xgsj() {
        return xfsc_xgsj;
    }
    public void setXfsc_xgsj(String xfsc_xgsj) {
        this.xfsc_xgsj = xfsc_xgsj;
    }
    public String getXfsc_deleteFlag() {
        return xfsc_deleteFlag;
    }
    public void setXfsc_deleteFlag(String xfsc_deleteFlag) {
        this.xfsc_deleteFlag = xfsc_deleteFlag;
    }
    public String getXfsc_datasource() {
        return xfsc_datasource;
    }
    public void setXfsc_datasource(String xfsc_datasource) {
        this.xfsc_datasource = xfsc_datasource;
    }
    public String getXfsc_bz() {
        return xfsc_bz;
    }
    public void setXfsc_bz(String xfsc_bz) {
        this.xfsc_bz = xfsc_bz;
    }
    public String getXfsc_jdh() {
        return xfsc_jdh;
    }
    public void setXfsc_jdh(String xfsc_jdh) {
        this.xfsc_jdh = xfsc_jdh;
    }
    public String getXfsc_sjc() {
        return xfsc_sjc;
    }
    public void setXfsc_sjc(String xfsc_sjc) {
        this.xfsc_sjc = xfsc_sjc;
    }
    public String getXfsc_reserve1() {
        return xfsc_reserve1;
    }
    public void setXfsc_reserve1(String xfsc_reserve1) {
        this.xfsc_reserve1 = xfsc_reserve1;
    }
    public String getXfsc_reserve2() {
        return xfsc_reserve2;
    }
    public void setXfsc_reserve2(String xfsc_reserve2) {
        this.xfsc_reserve2 = xfsc_reserve2;
    }
    public String getXfsc_reserve3() {
        return xfsc_reserve3;
    }
    public void setXfsc_reserve3(String xfsc_reserve3) {
        this.xfsc_reserve3 = xfsc_reserve3;
    }
    public String getXfsc_reserve4() {
        return xfsc_reserve4;
    }
    public void setXfsc_reserve4(String xfsc_reserve4) {
        this.xfsc_reserve4 = xfsc_reserve4;
    }

    public String getXfsh_uuid() {
        return xfsh_uuid;
    }
    public void setXfsh_uuid(String xfsh_uuid) {
        this.xfsh_uuid = xfsh_uuid;
    }
    public String getXfsh_gwid() {
        return xfsh_gwid;
    }
    public void setXfsh_gwid(String xfsh_gwid) {
        this.xfsh_gwid = xfsh_gwid;
    }
    public String getXfsh_szxs() {
        return xfsh_szxs;
    }
    public void setXfsh_szxs(String xfsh_szxs) {
        this.xfsh_szxs = xfsh_szxs;
    }
    public String getXfsh_gwyl() {
        return xfsh_gwyl;
    }
    public void setXfsh_gwyl(String xfsh_gwyl) {
        this.xfsh_gwyl = xfsh_gwyl;
    }
    public String getXfsh_shgd() {
        return xfsh_shgd;
    }
    public void setXfsh_shgd(String xfsh_shgd) {
        this.xfsh_shgd = xfsh_shgd;
    }
    public String getXfsh_ll() {
        return xfsh_ll;
    }
    public void setXfsh_ll(String xfsh_ll) {
        this.xfsh_ll = xfsh_ll;
    }
    public String getXfsh_jsgzj() {
        return xfsh_jsgzj;
    }
    public void setXfsh_jsgzj(String xfsh_jsgzj) {
        this.xfsh_jsgzj = xfsh_jsgzj;
    }
    public String getXfsh_csgzj() {
        return xfsh_csgzj;
    }
    public void setXfsh_csgzj(String xfsh_csgzj) {
        this.xfsh_csgzj = xfsh_csgzj;
    }
    public String getXfsh_jscd() {
        return xfsh_jscd;
    }
    public void setXfsh_jscd(String xfsh_jscd) {
        this.xfsh_jscd = xfsh_jscd;
    }
    public String getXfsh_cjrid() {
        return xfsh_cjrid;
    }
    public void setXfsh_cjrid(String xfsh_cjrid) {
        this.xfsh_cjrid = xfsh_cjrid;
    }
    public String getXfsh_cjrmc() {
        return xfsh_cjrmc;
    }
    public void setXfsh_cjrmc(String xfsh_cjrmc) {
        this.xfsh_cjrmc = xfsh_cjrmc;
    }
    public String getXfsh_cjsj() {
        return xfsh_cjsj;
    }
    public void setXfsh_cjsj(String xfsh_cjsj) {
        this.xfsh_cjsj = xfsh_cjsj;
    }
    public String getXfsh_xgrid() {
        return xfsh_xgrid;
    }
    public void setXfsh_xgrid(String xfsh_xgrid) {
        this.xfsh_xgrid = xfsh_xgrid;
    }
    public String getXfsh_xgrmc() {
        return xfsh_xgrmc;
    }
    public void setXfsh_xgrmc(String xfsh_xgrmc) {
        this.xfsh_xgrmc = xfsh_xgrmc;
    }
    public String getXfsh_xgsj() {
        return xfsh_xgsj;
    }
    public void setXfsh_xgsj(String xfsh_xgsj) {
        this.xfsh_xgsj = xfsh_xgsj;
    }
    public String getXfsh_deleteFlag() {
        return xfsh_deleteFlag;
    }
    public void setXfsh_deleteFlag(String xfsh_deleteFlag) {
        this.xfsh_deleteFlag = xfsh_deleteFlag;
    }
    public String getXfsh_datasource() {
        return xfsh_datasource;
    }
    public void setXfsh_datasource(String xfsh_datasource) {
        this.xfsh_datasource = xfsh_datasource;
    }
    public String getXfsh_bz() {
        return xfsh_bz;
    }
    public void setXfsh_bz(String xfsh_bz) {
        this.xfsh_bz = xfsh_bz;
    }
    public String getXfsh_jdh() {
        return xfsh_jdh;
    }
    public void setXfsh_jdh(String xfsh_jdh) {
        this.xfsh_jdh = xfsh_jdh;
    }
    public String getXfsh_sjc() {
        return xfsh_sjc;
    }
    public void setXfsh_sjc(String xfsh_sjc) {
        this.xfsh_sjc = xfsh_sjc;
    }
    public String getXfsh_reserve1() {
        return xfsh_reserve1;
    }
    public void setXfsh_reserve1(String xfsh_reserve1) {
        this.xfsh_reserve1 = xfsh_reserve1;
    }
    public String getXfsh_reserve2() {
        return xfsh_reserve2;
    }
    public void setXfsh_reserve2(String xfsh_reserve2) {
        this.xfsh_reserve2 = xfsh_reserve2;
    }
    public String getXfsh_reserve3() {
        return xfsh_reserve3;
    }
    public void setXfsh_reserve3(String xfsh_reserve3) {
        this.xfsh_reserve3 = xfsh_reserve3;
    }
    public String getXfsh_reserve4() {
        return xfsh_reserve4;
    }
    public void setXfsh_reserve4(String xfsh_reserve4) {
        this.xfsh_reserve4 = xfsh_reserve4;
    }

    public String getXfmt_uuid() {
        return xfmt_uuid;
    }
    public void setXfmt_uuid(String xfmt_uuid) {
        this.xfmt_uuid = xfmt_uuid;
    }
    public String getXfmt_sybgc() {
        return xfmt_sybgc;
    }
    public void setXfmt_sybgc(String xfmt_sybgc) {
        this.xfmt_sybgc = xfmt_sybgc;
    }
    public String getXfmt_tcwz() {
        return xfmt_tcwz;
    }
    public void setXfmt_tcwz(String xfmt_tcwz) {
        this.xfmt_tcwz = xfmt_tcwz;
    }
    public String getXfmt_tcsl() {
        return xfmt_tcsl;
    }
    public void setXfmt_tcsl(String xfmt_tcsl) {
        this.xfmt_tcsl = xfmt_tcsl;
    }
    public String getXfmt_ksq() {
        return xfmt_ksq;
    }
    public void setXfmt_ksq(String xfmt_ksq) {
        this.xfmt_ksq = xfmt_ksq;
    }
    public String getXfmt_sz() {
        return xfmt_sz;
    }
    public void setXfmt_sz(String xfmt_sz) {
        this.xfmt_sz = xfmt_sz;
    }
    public String getXfmt_cjrid() {
        return xfmt_cjrid;
    }
    public void setXfmt_cjrid(String xfmt_cjrid) {
        this.xfmt_cjrid = xfmt_cjrid;
    }
    public String getXfmt_cjrmc() {
        return xfmt_cjrmc;
    }
    public void setXfmt_cjrmc(String xfmt_cjrmc) {
        this.xfmt_cjrmc = xfmt_cjrmc;
    }
    public String getXfmt_cjsj() {
        return xfmt_cjsj;
    }
    public void setXfmt_cjsj(String xfmt_cjsj) {
        this.xfmt_cjsj = xfmt_cjsj;
    }
    public String getXfmt_xgrid() {
        return xfmt_xgrid;
    }
    public void setXfmt_xgrid(String xfmt_xgrid) {
        this.xfmt_xgrid = xfmt_xgrid;
    }
    public String getXfmt_xgrmc() {
        return xfmt_xgrmc;
    }
    public void setXfmt_xgrmc(String xfmt_xgrmc) {
        this.xfmt_xgrmc = xfmt_xgrmc;
    }
    public String getXfmt_xgsj() {
        return xfmt_xgsj;
    }
    public void setXfmt_xgsj(String xfmt_xgsj) {
        this.xfmt_xgsj = xfmt_xgsj;
    }
    public String getXfmt_deleteFlag() {
        return xfmt_deleteFlag;
    }
    public void setXfmt_deleteFlag(String xfmt_deleteFlag) {
        this.xfmt_deleteFlag = xfmt_deleteFlag;
    }
    public String getXfmt_datasource() {
        return xfmt_datasource;
    }
    public void setXfmt_datasource(String xfmt_datasource) {
        this.xfmt_datasource = xfmt_datasource;
    }
    public String getXfmt_bz() {
        return xfmt_bz;
    }
    public void setXfmt_bz(String xfmt_bz) {
        this.xfmt_bz = xfmt_bz;
    }
    public String getXfmt_jdh() {
        return xfmt_jdh;
    }
    public void setXfmt_jdh(String xfmt_jdh) {
        this.xfmt_jdh = xfmt_jdh;
    }
    public String getXfmt_sjc() {
        return xfmt_sjc;
    }
    public void setXfmt_sjc(String xfmt_sjc) {
        this.xfmt_sjc = xfmt_sjc;
    }
    public String getXfmt_reserve1() {
        return xfmt_reserve1;
    }
    public void setXfmt_reserve1(String xfmt_reserve1) {
        this.xfmt_reserve1 = xfmt_reserve1;
    }
    public String getXfmt_reserve2() {
        return xfmt_reserve2;
    }
    public void setXfmt_reserve2(String xfmt_reserve2) {
        this.xfmt_reserve2 = xfmt_reserve2;
    }
    public String getXfmt_reserve3() {
        return xfmt_reserve3;
    }
    public void setXfmt_reserve3(String xfmt_reserve3) {
        this.xfmt_reserve3 = xfmt_reserve3;
    }
    public String getXfmt_reserve4() {
        return xfmt_reserve4;
    }
    public void setXfmt_reserve4(String xfmt_reserve4) {
        this.xfmt_reserve4 = xfmt_reserve4;
    }

    public String getTrsy_uuid() {
        return trsy_uuid;
    }
    public void setTrsy_uuid(String trsy_uuid) {
        this.trsy_uuid = trsy_uuid;
    }
    public String getTrsy_trsylx() {
        return trsy_trsylx;
    }
    public void setTrsy_trsylx(String trsy_trsylx) {
        this.trsy_trsylx = trsy_trsylx;
    }
    public String getTrsy_sz() {
        return trsy_sz;
    }
    public void setTrsy_sz(String trsy_sz) {
        this.trsy_sz = trsy_sz;
    }
    public String getTrsy_ywksq() {
        return trsy_ywksq;
    }
    public void setTrsy_ywksq(String trsy_ywksq) {
        this.trsy_ywksq = trsy_ywksq;
    }
    public String getTrsy_sjbh() {
        return trsy_sjbh;
    }
    public void setTrsy_sjbh(String trsy_sjbh) {
        this.trsy_sjbh = trsy_sjbh;
    }
    public String getTrsy_trsyrl() {
        return trsy_trsyrl;
    }
    public void setTrsy_trsyrl(String trsy_trsyrl) {
        this.trsy_trsyrl = trsy_trsyrl;
    }
    public String getTrsy_trsymj() {
        return trsy_trsymj;
    }
    public void setTrsy_trsymj(String trsy_trsymj) {
        this.trsy_trsymj = trsy_trsymj;
    }
    public String getTrsy_xssd() {
        return trsy_xssd;
    }
    public void setTrsy_xssd(String trsy_xssd) {
        this.trsy_xssd = trsy_xssd;
    }
    public String getTrsy_cjrid() {
        return trsy_cjrid;
    }
    public void setTrsy_cjrid(String trsy_cjrid) {
        this.trsy_cjrid = trsy_cjrid;
    }
    public String getTrsy_cjrmc() {
        return trsy_cjrmc;
    }
    public void setTrsy_cjrmc(String trsy_cjrmc) {
        this.trsy_cjrmc = trsy_cjrmc;
    }
    public String getTrsy_cjsj() {
        return trsy_cjsj;
    }
    public void setTrsy_cjsj(String trsy_cjsj) {
        this.trsy_cjsj = trsy_cjsj;
    }
    public String getTrsy_xgrid() {
        return trsy_xgrid;
    }
    public void setTrsy_xgrid(String trsy_xgrid) {
        this.trsy_xgrid = trsy_xgrid;
    }
    public String getTrsy_xgrmc() {
        return trsy_xgrmc;
    }
    public void setTrsy_xgrmc(String trsy_xgrmc) {
        this.trsy_xgrmc = trsy_xgrmc;
    }
    public String getTrsy_xgsj() {
        return trsy_xgsj;
    }
    public void setTrsy_xgsj(String trsy_xgsj) {
        this.trsy_xgsj = trsy_xgsj;
    }
    public String getTrsy_deleteFlag() {
        return trsy_deleteFlag;
    }
    public void setTrsy_deleteFlag(String trsy_deleteFlag) {
        this.trsy_deleteFlag = trsy_deleteFlag;
    }
    public String getTrsy_datasource() {
        return trsy_datasource;
    }
    public void setTrsy_datasource(String trsy_datasource) {
        this.trsy_datasource = trsy_datasource;
    }
    public String getTrsy_bz() {
        return trsy_bz;
    }
    public void setTrsy_bz(String trsy_bz) {
        this.trsy_bz = trsy_bz;
    }
    public String getTrsy_jdh() {
        return trsy_jdh;
    }
    public void setTrsy_jdh(String trsy_jdh) {
        this.trsy_jdh = trsy_jdh;
    }
    public String getTrsy_sjc() {
        return trsy_sjc;
    }
    public void setTrsy_sjc(String trsy_sjc) {
        this.trsy_sjc = trsy_sjc;
    }
    public String getTrsy_reserve1() {
        return trsy_reserve1;
    }
    public void setTrsy_reserve1(String trsy_reserve1) {
        this.trsy_reserve1 = trsy_reserve1;
    }
    public String getTrsy_reserve2() {
        return trsy_reserve2;
    }
    public void setTrsy_reserve2(String trsy_reserve2) {
        this.trsy_reserve2 = trsy_reserve2;
    }
    public String getTrsy_reserve3() {
        return trsy_reserve3;
    }
    public void setTrsy_reserve3(String trsy_reserve3) {
        this.trsy_reserve3 = trsy_reserve3;
    }
    public String getTrsy_reserve4() {
        return trsy_reserve4;
    }
    public void setTrsy_reserve4(String trsy_reserve4) {
        this.trsy_reserve4 = trsy_reserve4;
    }

	public String getSylxmc() {
		return sylxmc;
	}
	public void setSylxmc(String sylxmc) {
		this.sylxmc = sylxmc;
	}
	public String getXzmc() {
		return xzmc;
	}
	public void setXzmc(String xzmc) {
		this.xzmc = xzmc;
	}
	public String getXzqymc() {
		return xzqymc;
	}
	public void setXzqymc(String xzqymc) {
		this.xzqymc = xzqymc;
	}
	public String getXhs_szxsmc() {
		return xhs_szxsmc;
	}
	public void setXhs_szxsmc(String xhs_szxsmc) {
		this.xhs_szxsmc = xhs_szxsmc;
	}
	public String getXhs_gwxsmc() {
		return xhs_gwxsmc;
	}
	public void setXhs_gwxsmc(String xhs_gwxsmc) {
		this.xhs_gwxsmc = xhs_gwxsmc;
	}
	public String getXhs_jkxsmc() {
		return xhs_jkxsmc;
	}
	public void setXhs_jkxsmc(String xhs_jkxsmc) {
		this.xhs_jkxsmc = xhs_jkxsmc;
	}
	public String getXfsc_gwxsmc() {
		return xfsc_gwxsmc;
	}
	public void setXfsc_gwxsmc(String xfsc_gwxsmc) {
		this.xfsc_gwxsmc = xfsc_gwxsmc;
	}
	public String getXfsh_jscdmc() {
		return xfsh_jscdmc;
	}
	public void setXfsh_jscdmc(String xfsh_jscdmc) {
		this.xfsh_jscdmc = xfsh_jscdmc;
	}
	public String getXfmt_ksqmc() {
		return xfmt_ksqmc;
	}
	public void setXfmt_ksqmc(String xfmt_ksqmc) {
		this.xfmt_ksqmc = xfmt_ksqmc;
	}
	public String getXfmt_szmc() {
		return xfmt_szmc;
	}
	public void setXfmt_szmc(String xfmt_szmc) {
		this.xfmt_szmc = xfmt_szmc;
	}
	public String getTrsy_trsylxmc() {
		return trsy_trsylxmc;
	}
	public void setTrsy_trsylxmc(String trsy_trsylxmc) {
		this.trsy_trsylxmc = trsy_trsylxmc;
	}
	public String getTrsy_szmc() {
		return trsy_szmc;
	}
	public void setTrsy_szmc(String trsy_szmc) {
		this.trsy_szmc = trsy_szmc;
	}
	public String getTrsy_ywksqmc() {
		return trsy_ywksqmc;
	}
	public void setTrsy_ywksqmc(String trsy_ywksqmc) {
		this.trsy_ywksqmc = trsy_ywksqmc;
	}

	public String getKyztmc() {
		return kyztmc;
	}

	public void setKyztmc(String kyztmc) {
		this.kyztmc = kyztmc;
	}
}