package com.syfri.digitalplan.model.basicinfo.watersource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class XfmtVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//UUID
	private String trsyid;	//天然水源ID
	private String sybgc;	//水源标高差
	private String tcwz;	//停车位置
	private String tcsl;	//停车数量
	private String jgid;	//机构ID
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjbb;	//数据版本
	private String cjsj;	//创建时间
	private String ywxtbsid;	//业务系统部署ID
	private String sjc;	//时间戳
	private String bz;	//备注
	private String vercol;	//版本戳
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3

	public String getPkid(){
		return pkid;
	}
	public void setPkid(String pkid){
		this.pkid = pkid;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getTrsyid(){
		return trsyid;
	}
	public void setTrsyid(String trsyid){
		this.trsyid = trsyid;
	}
	public String getSybgc(){
		return sybgc;
	}
	public void setSybgc(String sybgc){
		this.sybgc = sybgc;
	}
	public String getTcwz(){
		return tcwz;
	}
	public void setTcwz(String tcwz){
		this.tcwz = tcwz;
	}
	public String getTcsl(){
		return tcsl;
	}
	public void setTcsl(String tcsl){
		this.tcsl = tcsl;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getJlzt(){
		return jlzt;
	}
	public void setJlzt(String jlzt){
		this.jlzt = jlzt;
	}
	public String getCszt(){
		return cszt;
	}
	public void setCszt(String cszt){
		this.cszt = cszt;
	}
	public String getSjbb(){
		return sjbb;
	}
	public void setSjbb(String sjbb){
		this.sjbb = sjbb;
	}
	public String getCjsj(){
		return cjsj;
	}
	public void setCjsj(String cjsj){
		this.cjsj = cjsj;
	}
	public String getYwxtbsid(){
		return ywxtbsid;
	}
	public void setYwxtbsid(String ywxtbsid){
		this.ywxtbsid = ywxtbsid;
	}
	public String getSjc(){
		return sjc;
	}
	public void setSjc(String sjc){
		this.sjc = sjc;
	}
	public String getBz(){
		return bz;
	}
	public void setBz(String bz){
		this.bz = bz;
	}
	public String getVercol(){
		return vercol;
	}
	public void setVercol(String vercol){
		this.vercol = vercol;
	}
	public String getTbjdh(){
		return tbjdh;
	}
	public void setTbjdh(String tbjdh){
		this.tbjdh = tbjdh;
	}
	public String getTbsjc(){
		return tbsjc;
	}
	public void setTbsjc(String tbsjc){
		this.tbsjc = tbsjc;
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
}