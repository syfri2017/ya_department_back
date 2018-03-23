package com.syfri.digitalplan.model;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class DigitalplanlistVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;	//UUID
	private String yaid;	//预案ID
	private String mbid;	//模板ID
	private String yazl;	//预案种类
	private String yabh;	//预案编号
	private String yasxh;	//预案顺序号
	private String gxbbh;	//类型与内容项对应
	private String yabbh;	//预案版本号
	private String bmdj;	//保密等级
	private String yalxdm;	//预案类型代码
	private String yamc;	//预案名称
	private String dxid;	//对象ID
	private String bwid;	//部位ID
	private String yaztdm;	//预案状态代码
	private String dxlxdm;	//对象类型代码
	private String sfkqy;	//是否跨区域
	private String zzrid;	//制作人ID
	private String zzrmc;	//制作人名称
	private String zzdwid;	//制作单位ID
	private String zzdwmc;	//制作单位名称
	private String zzrq;	//制作日期
	private String czyid;	//数据操作人编号
	private String czyxm;	//数据操作人姓名
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String sfmya;	//是否母预案
	private String jgid;	//机构ID
	private String jgmc;	//机构名称
	private String dxmc;	//对象名称
	private String bwmc;	//部位名称
	private String sfwlsj;	//是否外部系统数据
	private String czjg;	//操作机构
	private String sjbb;	//数据版本
	private String cjsj;	//创建时间
	private String ywxtbsid;	//业务系统部署
	private String jksjbb;	//基库数据版本
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String byzda;	//备用字段(1)
	private String byzdb;	//备用字段(2)
	private String byzdc;	//备用字段(3)
	private String byzdd;	//备用字段(4)
	private String pkid;	//ID

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getYaid(){
		return yaid;
	}
	public void setYaid(String yaid){
		this.yaid = yaid;
	}
	public String getMbid(){
		return mbid;
	}
	public void setMbid(String mbid){
		this.mbid = mbid;
	}
	public String getYazl(){
		return yazl;
	}
	public void setYazl(String yazl){
		this.yazl = yazl;
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
	public String getGxbbh(){
		return gxbbh;
	}
	public void setGxbbh(String gxbbh){
		this.gxbbh = gxbbh;
	}
	public String getYabbh(){
		return yabbh;
	}
	public void setYabbh(String yabbh){
		this.yabbh = yabbh;
	}
	public String getBmdj(){
		return bmdj;
	}
	public void setBmdj(String bmdj){
		this.bmdj = bmdj;
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
	public String getDxid(){
		return dxid;
	}
	public void setDxid(String dxid){
		this.dxid = dxid;
	}
	public String getBwid(){
		return bwid;
	}
	public void setBwid(String bwid){
		this.bwid = bwid;
	}
	public String getYaztdm(){
		return yaztdm;
	}
	public void setYaztdm(String yaztdm){
		this.yaztdm = yaztdm;
	}
	public String getDxlxdm(){
		return dxlxdm;
	}
	public void setDxlxdm(String dxlxdm){
		this.dxlxdm = dxlxdm;
	}
	public String getSfkqy(){
		return sfkqy;
	}
	public void setSfkqy(String sfkqy){
		this.sfkqy = sfkqy;
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
	public String getZzdwid(){
		return zzdwid;
	}
	public void setZzdwid(String zzdwid){
		this.zzdwid = zzdwid;
	}
	public String getZzdwmc(){
		return zzdwmc;
	}
	public void setZzdwmc(String zzdwmc){
		this.zzdwmc = zzdwmc;
	}
	public String getZzrq(){
		return zzrq;
	}
	public void setZzrq(String zzrq){
		this.zzrq = zzrq;
	}
	public String getCzyid(){
		return czyid;
	}
	public void setCzyid(String czyid){
		this.czyid = czyid;
	}
	public String getCzyxm(){
		return czyxm;
	}
	public void setCzyxm(String czyxm){
		this.czyxm = czyxm;
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
	public String getSfmya(){
		return sfmya;
	}
	public void setSfmya(String sfmya){
		this.sfmya = sfmya;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getJgmc(){
		return jgmc;
	}
	public void setJgmc(String jgmc){
		this.jgmc = jgmc;
	}
	public String getDxmc(){
		return dxmc;
	}
	public void setDxmc(String dxmc){
		this.dxmc = dxmc;
	}
	public String getBwmc(){
		return bwmc;
	}
	public void setBwmc(String bwmc){
		this.bwmc = bwmc;
	}
	public String getSfwlsj(){
		return sfwlsj;
	}
	public void setSfwlsj(String sfwlsj){
		this.sfwlsj = sfwlsj;
	}
	public String getCzjg(){
		return czjg;
	}
	public void setCzjg(String czjg){
		this.czjg = czjg;
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
	public String getJksjbb(){
		return jksjbb;
	}
	public void setJksjbb(String jksjbb){
		this.jksjbb = jksjbb;
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
	public String getByzda(){
		return byzda;
	}
	public void setByzda(String byzda){
		this.byzda = byzda;
	}
	public String getByzdb(){
		return byzdb;
	}
	public void setByzdb(String byzdb){
		this.byzdb = byzdb;
	}
	public String getByzdc(){
		return byzdc;
	}
	public void setByzdc(String byzdc){
		this.byzdc = byzdc;
	}
	public String getByzdd(){
		return byzdd;
	}
	public void setByzdd(String byzdd){
		this.byzdd = byzdd;
	}
	public String getPkid(){
		return pkid;
	}
	public void setPkid(String pkid){
		this.pkid = pkid;
	}
}