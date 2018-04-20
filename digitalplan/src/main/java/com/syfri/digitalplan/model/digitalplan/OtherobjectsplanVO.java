package com.syfri.digitalplan.model.digitalplan;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class OtherobjectsplanVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String yabh;	//预案编号
	private String yasxh;	//预案顺序号
	private String yabbh;	//预案版本号
	private String yalxdm;	//预案类型代码
	private String yamc;	//预案名称
	private String yajb;	//预案级别
	private String dxid;	//对象ID
	private String dxmc;	//对象名称
	private String bwid;	//部位ID
	private String bwmc;	//部位名称
	private String sfkqy;	//是否跨区域[0否，1是]
	private String jgid;	//制作机构ID
	private String jgbm;	//制作机构编码
	private String jgmc;	//制作机构名称
	private String zzrid;	//制作人ID
	private String zzrmc;	//制作人名称
	private String zzsj;	//制作时间
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

	private String yalxmc;
	private String sfkqymc;

	private String cjsj_begintime;
	private String cjsj_endtime;

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getYabh(){
		return yabh;
	}
	public void setYabh(String yabh){
		this.yabh = yabh;
	}
	public String getYasxh(){
		return yasxh;
	}
	public void setYasxh(String yasxh){
		this.yasxh = yasxh;
	}
	public String getYabbh(){
		return yabbh;
	}
	public void setYabbh(String yabbh){
		this.yabbh = yabbh;
	}
	public String getYalxdm(){
		return yalxdm;
	}
	public void setYalxdm(String yalxdm){
		this.yalxdm = yalxdm;
	}
	public String getYamc(){
		return yamc;
	}
	public void setYamc(String yamc){
		this.yamc = yamc;
	}
	public String getYajb(){
		return yajb;
	}
	public void setYajb(String yajb){
		this.yajb = yajb;
	}
	public String getDxid(){
		return dxid;
	}
	public void setDxid(String dxid){
		this.dxid = dxid;
	}
	public String getDxmc(){
		return dxmc;
	}
	public void setDxmc(String dxmc){
		this.dxmc = dxmc;
	}
	public String getBwid(){
		return bwid;
	}
	public void setBwid(String bwid){
		this.bwid = bwid;
	}
	public String getBwmc(){
		return bwmc;
	}
	public void setBwmc(String bwmc){
		this.bwmc = bwmc;
	}
	public String getSfkqy(){
		return sfkqy;
	}
	public void setSfkqy(String sfkqy){
		this.sfkqy = sfkqy;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getJgbm(){
		return jgbm;
	}
	public void setJgbm(String jgbm){
		this.jgbm = jgbm;
	}
	public String getJgmc(){
		return jgmc;
	}
	public void setJgmc(String jgmc){
		this.jgmc = jgmc;
	}
	public String getZzrid(){
		return zzrid;
	}
	public void setZzrid(String zzrid){
		this.zzrid = zzrid;
	}
	public String getZzrmc(){
		return zzrmc;
	}
	public void setZzrmc(String zzrmc){
		this.zzrmc = zzrmc;
	}
	public String getZzsj(){
		return zzsj;
	}
	public void setZzsj(String zzsj){
		this.zzsj = zzsj;
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

	public String getYalxmc() { return yalxmc; }
	public void setYalxmc(String yalxmc) { this.yalxmc = yalxmc; }
	public String getSfkqymc() { return sfkqymc; }
	public void setSfkqymc(String sfkqymc) { this.sfkqymc = sfkqymc; }

	public String getCjsj_begintime() {
		return cjsj_begintime;
	}

	public void setCjsj_begintime(String cjsj_begintime) {
		this.cjsj_begintime = cjsj_begintime;
	}

	public String getCjsj_endtime() {
		return cjsj_endtime;
	}

	public void setCjsj_endtime(String cjsj_endtime) {
		this.cjsj_endtime = cjsj_endtime;
	}
}