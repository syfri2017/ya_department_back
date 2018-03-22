package com.syfri.digitalplan.model.basicinfo.watersource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class TrsyVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//UUID
	private String trsymc;	//天然水源名称
	private String trsywz;	//天然水源位置
	private String trsylx;	//天然水源类型
	private String sz;	//水质
	private String ywksq;	//有无枯水期
	private String sjbh;	//四季变化
	private String trsyrl;	//天然水源容量
	private String trsymj;	//天然水源面积
	private String jgid;	//机构ID
	private String czyid;	//操作员ID
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String cjsj;	//创建时间
	private String sjbb;	//数据版本
	private String ywxtbsid;	//业务系统部署ID
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
	public String getTrsymc(){
		return trsymc;
	}
	public void setTrsymc(String trsymc){
		this.trsymc = trsymc;
	}
	public String getTrsywz(){
		return trsywz;
	}
	public void setTrsywz(String trsywz){
		this.trsywz = trsywz;
	}
	public String getTrsylx(){
		return trsylx;
	}
	public void setTrsylx(String trsylx){
		this.trsylx = trsylx;
	}
	public String getSz(){
		return sz;
	}
	public void setSz(String sz){
		this.sz = sz;
	}
	public String getYwksq(){
		return ywksq;
	}
	public void setYwksq(String ywksq){
		this.ywksq = ywksq;
	}
	public String getSjbh(){
		return sjbh;
	}
	public void setSjbh(String sjbh){
		this.sjbh = sjbh;
	}
	public String getTrsyrl(){
		return trsyrl;
	}
	public void setTrsyrl(String trsyrl){
		this.trsyrl = trsyrl;
	}
	public String getTrsymj(){
		return trsymj;
	}
	public void setTrsymj(String trsymj){
		this.trsymj = trsymj;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getCzyid(){
		return czyid;
	}
	public void setCzyid(String czyid){
		this.czyid = czyid;
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
	public String getCjsj(){
		return cjsj;
	}
	public void setCjsj(String cjsj){
		this.cjsj = cjsj;
	}
	public String getSjbb(){
		return sjbb;
	}
	public void setSjbb(String sjbb){
		this.sjbb = sjbb;
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