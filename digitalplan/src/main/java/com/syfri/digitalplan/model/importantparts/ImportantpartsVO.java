package com.syfri.digitalplan.model.importantparts;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class ImportantpartsVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	//重点部位基本信息
	private String zdbwid;	//重点部位ID（主键）
	private String zddwid;	//重点单位ID
	private String zdbwlx;	//重点部位类型
	private String zdbwmc;	//重点部位名称
	private String zdbwwz;	//重点部位位置
	private String wxxfx;	//危险性分析
	private String zysx;	//注意事项
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

	//建筑类重点部位信息
	private String jzl_uuid;	//主键
	private String jzl_zdbwid;	//重点部位ID
	private String jzl_syxz;	//使用性质
	private String jzl_jzjg;	//建筑结构
	private String jzl_qymj;	//区域面积(㎡)
	private String jzl_gnms;	//功能描述
	private String jzl_cjrid;	//创建人ID
	private String jzl_cjrmc;	//创建人名称
	private String jzl_cjsj;	//创建时间
	private String jzl_xgrid;	//修改人ID
	private String jzl_xgrmc;	//修改人姓名
	private String jzl_xgsj;	//修改时间
	private String jzl_deleteFlag;	//删除标志
	private String jzl_datasource;	//数据来源[100000一体化]
	private String jzl_bz;	//备注
	private String jzl_jdh;	//节点号
	private String jzl_sjc;	//时间戳
	private String jzl_reserve1;	//备用字段1
	private String jzl_reserve2;	//备用字段2
	private String jzl_reserve3;	//备用字段3
	private String jzl_reserve4;	//备用字段4

	//装置类重点部位信息
	private String zzl_uuid;	//主键
	private String zzl_zdbwid;	//重点部位ID
	private String zzl_jzjg;	//建筑结构
	private String zzl_zdmj;	//占地面积(㎡)
	private String zzl_zzgd;	//装置高度(m)
	private String zzl_jsfzr;	//技术负责人
	private String zzl_jsfzrdh;	//技术负责人电话
	private String zzl_gylc;	//工艺流程
	private String zzl_cjrid;	//创建人ID
	private String zzl_cjrmc;	//创建人名称
	private String zzl_cjsj;	//创建时间
	private String zzl_xgrid;	//修改人ID
	private String zzl_xgrmc;	//修改人姓名
	private String zzl_xgsj;	//修改时间
	private String zzl_deleteFlag;	//删除标志
	private String zzl_datasource;	//数据来源[100000一体化]
	private String zzl_bz;	//备注
	private String zzl_jdh;	//节点号
	private String zzl_sjc;	//时间戳
	private String zzl_reserve1;	//备用字段1
	private String zzl_reserve2;	//备用字段2
	private String zzl_reserve3;	//备用字段3
	private String zzl_reserve4;	//备用字段4

	//储罐类重点部位信息
	private String cgl_uuid;	//主键
	private String cgl_zdbwid;	//重点部位ID
	private String cgl_zrj;	//总容积(m3)
	private String cgl_cgsl;	//储罐数量
	private String cgl_cgjg;	//储罐间隔
	private String cgl_ccjzms;	//存储介质描述
	private String cgl_jsfzr;	//技术负责人
	private String cgl_jsfzrdh;	//技术负责人电话
	private String cgl_blgxd;	//罐组毗邻情况(东)
	private String cgl_blgxn;	//罐组毗邻情况(南)
	private String cgl_blgxx;	//罐组毗邻情况(西)
	private String cgl_blgxb;	//罐组毗邻情况(北)
	private String cgl_cjrid;	//创建人ID
	private String cgl_cjrmc;	//创建人名称
	private String cgl_cjsj;	//创建时间
	private String cgl_xgrid;	//修改人ID
	private String cgl_xgrmc;	//修改人姓名
	private String cgl_xgsj;	//修改时间
	private String cgl_deleteFlag;	//删除标志
	private String cgl_datasource;	//数据来源[100000一体化]
	private String cgl_bz;	//备注
	private String cgl_jdh;	//节点号
	private String cgl_sjc;	//时间戳
	private String cgl_reserve1;	//备用字段1
	private String cgl_reserve2;	//备用字段2
	private String cgl_reserve3;	//备用字段3
	private String cgl_reserve4;	//备用字段4

	public String getZdbwid(){
		return zdbwid;
	}
	public void setZdbwid(String zdbwid){
		this.zdbwid = zdbwid;
	}
	public String getZddwid(){
		return zddwid;
	}
	public void setZddwid(String zddwid){
		this.zddwid = zddwid;
	}
	public String getZdbwlx(){
		return zdbwlx;
	}
	public void setZdbwlx(String zdbwlx){
		this.zdbwlx = zdbwlx;
	}
	public String getZdbwmc(){
		return zdbwmc;
	}
	public void setZdbwmc(String zdbwmc){
		this.zdbwmc = zdbwmc;
	}
	public String getZdbwwz(){
		return zdbwwz;
	}
	public void setZdbwwz(String zdbwwz){
		this.zdbwwz = zdbwwz;
	}
	public String getWxxfx(){
		return wxxfx;
	}
	public void setWxxfx(String wxxfx){
		this.wxxfx = wxxfx;
	}
	public String getZysx(){
		return zysx;
	}
	public void setZysx(String zysx){
		this.zysx = zysx;
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

	public String getJzl_uuid() {
		return jzl_uuid;
	}

	public void setJzl_uuid(String jzl_uuid) {
		this.jzl_uuid = jzl_uuid;
	}

	public String getJzl_zdbwid() {
		return jzl_zdbwid;
	}

	public void setJzl_zdbwid(String jzl_zdbwid) {
		this.jzl_zdbwid = jzl_zdbwid;
	}

	public String getJzl_syxz() {
		return jzl_syxz;
	}

	public void setJzl_syxz(String jzl_syxz) {
		this.jzl_syxz = jzl_syxz;
	}

	public String getJzl_jzjg() {
		return jzl_jzjg;
	}

	public void setJzl_jzjg(String jzl_jzjg) {
		this.jzl_jzjg = jzl_jzjg;
	}

	public String getJzl_qymj() {
		return jzl_qymj;
	}

	public void setJzl_qymj(String jzl_qymj) {
		this.jzl_qymj = jzl_qymj;
	}

	public String getJzl_gnms() {
		return jzl_gnms;
	}

	public void setJzl_gnms(String jzl_gnms) {
		this.jzl_gnms = jzl_gnms;
	}

	public String getJzl_cjrid() {
		return jzl_cjrid;
	}

	public void setJzl_cjrid(String jzl_cjrid) {
		this.jzl_cjrid = jzl_cjrid;
	}

	public String getJzl_cjrmc() {
		return jzl_cjrmc;
	}

	public void setJzl_cjrmc(String jzl_cjrmc) {
		this.jzl_cjrmc = jzl_cjrmc;
	}

	public String getJzl_cjsj() {
		return jzl_cjsj;
	}

	public void setJzl_cjsj(String jzl_cjsj) {
		this.jzl_cjsj = jzl_cjsj;
	}

	public String getJzl_xgrid() {
		return jzl_xgrid;
	}

	public void setJzl_xgrid(String jzl_xgrid) {
		this.jzl_xgrid = jzl_xgrid;
	}

	public String getJzl_xgrmc() {
		return jzl_xgrmc;
	}

	public void setJzl_xgrmc(String jzl_xgrmc) {
		this.jzl_xgrmc = jzl_xgrmc;
	}

	public String getJzl_xgsj() {
		return jzl_xgsj;
	}

	public void setJzl_xgsj(String jzl_xgsj) {
		this.jzl_xgsj = jzl_xgsj;
	}

	public String getJzl_deleteFlag() {
		return jzl_deleteFlag;
	}

	public void setJzl_deleteFlag(String jzl_deleteFlag) {
		this.jzl_deleteFlag = jzl_deleteFlag;
	}

	public String getJzl_datasource() {
		return jzl_datasource;
	}

	public void setJzl_datasource(String jzl_datasource) {
		this.jzl_datasource = jzl_datasource;
	}

	public String getJzl_bz() {
		return jzl_bz;
	}

	public void setJzl_bz(String jzl_bz) {
		this.jzl_bz = jzl_bz;
	}

	public String getJzl_jdh() {
		return jzl_jdh;
	}

	public void setJzl_jdh(String jzl_jdh) {
		this.jzl_jdh = jzl_jdh;
	}

	public String getJzl_sjc() {
		return jzl_sjc;
	}

	public void setJzl_sjc(String jzl_sjc) {
		this.jzl_sjc = jzl_sjc;
	}

	public String getJzl_reserve1() {
		return jzl_reserve1;
	}

	public void setJzl_reserve1(String jzl_reserve1) {
		this.jzl_reserve1 = jzl_reserve1;
	}

	public String getJzl_reserve2() {
		return jzl_reserve2;
	}

	public void setJzl_reserve2(String jzl_reserve2) {
		this.jzl_reserve2 = jzl_reserve2;
	}

	public String getJzl_reserve3() {
		return jzl_reserve3;
	}

	public void setJzl_reserve3(String jzl_reserve3) {
		this.jzl_reserve3 = jzl_reserve3;
	}

	public String getJzl_reserve4() {
		return jzl_reserve4;
	}

	public void setJzl_reserve4(String jzl_reserve4) {
		this.jzl_reserve4 = jzl_reserve4;
	}

	public String getZzl_uuid() {
		return zzl_uuid;
	}

	public void setZzl_uuid(String zzl_uuid) {
		this.zzl_uuid = zzl_uuid;
	}

	public String getZzl_zdbwid() {
		return zzl_zdbwid;
	}

	public void setZzl_zdbwid(String zzl_zdbwid) {
		this.zzl_zdbwid = zzl_zdbwid;
	}

	public String getZzl_jzjg() {
		return zzl_jzjg;
	}

	public void setZzl_jzjg(String zzl_jzjg) {
		this.zzl_jzjg = zzl_jzjg;
	}

	public String getZzl_zdmj() {
		return zzl_zdmj;
	}

	public void setZzl_zdmj(String zzl_zdmj) {
		this.zzl_zdmj = zzl_zdmj;
	}

	public String getZzl_zzgd() {
		return zzl_zzgd;
	}

	public void setZzl_zzgd(String zzl_zzgd) {
		this.zzl_zzgd = zzl_zzgd;
	}

	public String getZzl_jsfzr() {
		return zzl_jsfzr;
	}

	public void setZzl_jsfzr(String zzl_jsfzr) {
		this.zzl_jsfzr = zzl_jsfzr;
	}

	public String getZzl_jsfzrdh() {
		return zzl_jsfzrdh;
	}

	public void setZzl_jsfzrdh(String zzl_jsfzrdh) {
		this.zzl_jsfzrdh = zzl_jsfzrdh;
	}

	public String getZzl_gylc() {
		return zzl_gylc;
	}

	public void setZzl_gylc(String zzl_gylc) {
		this.zzl_gylc = zzl_gylc;
	}

	public String getZzl_cjrid() {
		return zzl_cjrid;
	}

	public void setZzl_cjrid(String zzl_cjrid) {
		this.zzl_cjrid = zzl_cjrid;
	}

	public String getZzl_cjrmc() {
		return zzl_cjrmc;
	}

	public void setZzl_cjrmc(String zzl_cjrmc) {
		this.zzl_cjrmc = zzl_cjrmc;
	}

	public String getZzl_cjsj() {
		return zzl_cjsj;
	}

	public void setZzl_cjsj(String zzl_cjsj) {
		this.zzl_cjsj = zzl_cjsj;
	}

	public String getZzl_xgrid() {
		return zzl_xgrid;
	}

	public void setZzl_xgrid(String zzl_xgrid) {
		this.zzl_xgrid = zzl_xgrid;
	}

	public String getZzl_xgrmc() {
		return zzl_xgrmc;
	}

	public void setZzl_xgrmc(String zzl_xgrmc) {
		this.zzl_xgrmc = zzl_xgrmc;
	}

	public String getZzl_xgsj() {
		return zzl_xgsj;
	}

	public void setZzl_xgsj(String zzl_xgsj) {
		this.zzl_xgsj = zzl_xgsj;
	}

	public String getZzl_deleteFlag() {
		return zzl_deleteFlag;
	}

	public void setZzl_deleteFlag(String zzl_deleteFlag) {
		this.zzl_deleteFlag = zzl_deleteFlag;
	}

	public String getZzl_datasource() {
		return zzl_datasource;
	}

	public void setZzl_datasource(String zzl_datasource) {
		this.zzl_datasource = zzl_datasource;
	}

	public String getZzl_bz() {
		return zzl_bz;
	}

	public void setZzl_bz(String zzl_bz) {
		this.zzl_bz = zzl_bz;
	}

	public String getZzl_jdh() {
		return zzl_jdh;
	}

	public void setZzl_jdh(String zzl_jdh) {
		this.zzl_jdh = zzl_jdh;
	}

	public String getZzl_sjc() {
		return zzl_sjc;
	}

	public void setZzl_sjc(String zzl_sjc) {
		this.zzl_sjc = zzl_sjc;
	}

	public String getZzl_reserve1() {
		return zzl_reserve1;
	}

	public void setZzl_reserve1(String zzl_reserve1) {
		this.zzl_reserve1 = zzl_reserve1;
	}

	public String getZzl_reserve2() {
		return zzl_reserve2;
	}

	public void setZzl_reserve2(String zzl_reserve2) {
		this.zzl_reserve2 = zzl_reserve2;
	}

	public String getZzl_reserve3() {
		return zzl_reserve3;
	}

	public void setZzl_reserve3(String zzl_reserve3) {
		this.zzl_reserve3 = zzl_reserve3;
	}

	public String getZzl_reserve4() {
		return zzl_reserve4;
	}

	public void setZzl_reserve4(String zzl_reserve4) {
		this.zzl_reserve4 = zzl_reserve4;
	}

	public String getCgl_uuid() {
		return cgl_uuid;
	}

	public void setCgl_uuid(String cgl_uuid) {
		this.cgl_uuid = cgl_uuid;
	}

	public String getCgl_zdbwid() {
		return cgl_zdbwid;
	}

	public void setCgl_zdbwid(String cgl_zdbwid) {
		this.cgl_zdbwid = cgl_zdbwid;
	}

	public String getCgl_zrj() {
		return cgl_zrj;
	}

	public void setCgl_zrj(String cgl_zrj) {
		this.cgl_zrj = cgl_zrj;
	}

	public String getCgl_cgsl() {
		return cgl_cgsl;
	}

	public void setCgl_cgsl(String cgl_cgsl) {
		this.cgl_cgsl = cgl_cgsl;
	}

	public String getCgl_cgjg() {
		return cgl_cgjg;
	}

	public void setCgl_cgjg(String cgl_cgjg) {
		this.cgl_cgjg = cgl_cgjg;
	}

	public String getCgl_ccjzms() {
		return cgl_ccjzms;
	}

	public void setCgl_ccjzms(String cgl_ccjzms) {
		this.cgl_ccjzms = cgl_ccjzms;
	}

	public String getCgl_jsfzr() {
		return cgl_jsfzr;
	}

	public void setCgl_jsfzr(String cgl_jsfzr) {
		this.cgl_jsfzr = cgl_jsfzr;
	}

	public String getCgl_jsfzrdh() {
		return cgl_jsfzrdh;
	}

	public void setCgl_jsfzrdh(String cgl_jsfzrdh) {
		this.cgl_jsfzrdh = cgl_jsfzrdh;
	}

	public String getCgl_blgxd() {
		return cgl_blgxd;
	}

	public void setCgl_blgxd(String cgl_blgxd) {
		this.cgl_blgxd = cgl_blgxd;
	}

	public String getCgl_blgxn() {
		return cgl_blgxn;
	}

	public void setCgl_blgxn(String cgl_blgxn) {
		this.cgl_blgxn = cgl_blgxn;
	}

	public String getCgl_blgxx() {
		return cgl_blgxx;
	}

	public void setCgl_blgxx(String cgl_blgxx) {
		this.cgl_blgxx = cgl_blgxx;
	}

	public String getCgl_blgxb() {
		return cgl_blgxb;
	}

	public void setCgl_blgxb(String cgl_blgxb) {
		this.cgl_blgxb = cgl_blgxb;
	}

	public String getCgl_cjrid() {
		return cgl_cjrid;
	}

	public void setCgl_cjrid(String cgl_cjrid) {
		this.cgl_cjrid = cgl_cjrid;
	}

	public String getCgl_cjrmc() {
		return cgl_cjrmc;
	}

	public void setCgl_cjrmc(String cgl_cjrmc) {
		this.cgl_cjrmc = cgl_cjrmc;
	}

	public String getCgl_cjsj() {
		return cgl_cjsj;
	}

	public void setCgl_cjsj(String cgl_cjsj) {
		this.cgl_cjsj = cgl_cjsj;
	}

	public String getCgl_xgrid() {
		return cgl_xgrid;
	}

	public void setCgl_xgrid(String cgl_xgrid) {
		this.cgl_xgrid = cgl_xgrid;
	}

	public String getCgl_xgrmc() {
		return cgl_xgrmc;
	}

	public void setCgl_xgrmc(String cgl_xgrmc) {
		this.cgl_xgrmc = cgl_xgrmc;
	}

	public String getCgl_xgsj() {
		return cgl_xgsj;
	}

	public void setCgl_xgsj(String cgl_xgsj) {
		this.cgl_xgsj = cgl_xgsj;
	}

	public String getCgl_deleteFlag() {
		return cgl_deleteFlag;
	}

	public void setCgl_deleteFlag(String cgl_deleteFlag) {
		this.cgl_deleteFlag = cgl_deleteFlag;
	}

	public String getCgl_datasource() {
		return cgl_datasource;
	}

	public void setCgl_datasource(String cgl_datasource) {
		this.cgl_datasource = cgl_datasource;
	}

	public String getCgl_bz() {
		return cgl_bz;
	}

	public void setCgl_bz(String cgl_bz) {
		this.cgl_bz = cgl_bz;
	}

	public String getCgl_jdh() {
		return cgl_jdh;
	}

	public void setCgl_jdh(String cgl_jdh) {
		this.cgl_jdh = cgl_jdh;
	}

	public String getCgl_sjc() {
		return cgl_sjc;
	}

	public void setCgl_sjc(String cgl_sjc) {
		this.cgl_sjc = cgl_sjc;
	}

	public String getCgl_reserve1() {
		return cgl_reserve1;
	}

	public void setCgl_reserve1(String cgl_reserve1) {
		this.cgl_reserve1 = cgl_reserve1;
	}

	public String getCgl_reserve2() {
		return cgl_reserve2;
	}

	public void setCgl_reserve2(String cgl_reserve2) {
		this.cgl_reserve2 = cgl_reserve2;
	}

	public String getCgl_reserve3() {
		return cgl_reserve3;
	}

	public void setCgl_reserve3(String cgl_reserve3) {
		this.cgl_reserve3 = cgl_reserve3;
	}

	public String getCgl_reserve4() {
		return cgl_reserve4;
	}

	public void setCgl_reserve4(String cgl_reserve4) {
		this.cgl_reserve4 = cgl_reserve4;
	}
}