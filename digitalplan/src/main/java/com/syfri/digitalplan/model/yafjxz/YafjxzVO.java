package com.syfri.digitalplan.model.yafjxz;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class YafjxzVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;	//UUID
	private String yaid;	//预案ID
	private String dir;	//文件目录
	private String relname;	//文件名
	private String extension;	//扩展名
	private String enabled;	//是否可用
	private String remark;	//附件备注
	private String czyid;	//操作员ID
	private String czyxm;	//操作员姓名
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String jgid;	//机构ID
	private String sjbb;	//数据版本
	private String cjsj;	//创建时间
	private String ywxtbsid;	//业务系统部署ID
	private String vercol;	//版本戳
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String byzda;	//备用字段(1)
	private String byzdb;	//备用字段(2)
	private String byzdc;	//备用字段(3)
	private String byzdd;	//备用字段(4)
	private String pkid;	//PKID

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
	public String getDir(){
		return dir;
	}
	public void setDir(String dir){
		this.dir = dir;
	}
	public String getRelname(){
		return relname;
	}
	public void setRelname(String relname){
		this.relname = relname;
	}
	public String getExtension(){
		return extension;
	}
	public void setExtension(String extension){
		this.extension = extension;
	}
	public String getEnabled(){
		return enabled;
	}
	public void setEnabled(String enabled){
		this.enabled = enabled;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
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
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
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