package com.syfri.digitalplan.model.keyunits;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class KeyunitVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;	//UUID
	private String fhdwid;	//防火单位ID
	private String dwmc;	//单位名称
	private String dwpyjc;	//单位拼音简称
	private String jjsyz;	//经济所有制
	private String dwclsj;	//单位成立时间
	private String dwdj;	//单位等级
	private String dwxz;	//单位性质
	private String dwlxdm;	//单位类型代码
	private String dwlxdmmc;	//单位类型代码名称
	private String xzqy;	//行政区域
	private String frdb;	//法人代表
	private String frdbsfz;	//法人代表身份证
	private String frdbdh;	//法人电话
	private String aqzrr;	//安全责任人
	private String aqzrrsfz;	//责任人身份证
	private String aqzrrdh;	//责任人电话
	private String dwdzyx;	//单位电子邮箱
	private String aqglr;	//安全管理人
	private String aqglrsfz;	//管理人身份证
	private String aqglrdh;	//管理人电话
	private String zjzxfglr;	//专兼职消防管理人
	private String zjzxfglrsfz;	//专兼职消防管理人身份证
	private String zjzxfglrdh;	//专兼职消防管理人电话
	private String dwdz;	//单位地址
	private String dwdh;	//单位电话
	private String yzbm;	//单位邮政编码
	private String gdzc;	//固定资产
	private String zgrs;	//职工人数
	private String zdmj;	//占地面积
	private String jzmj;	//建筑面积
	private String dwzsx;	//单位主属性
	private String dwcsx;	//单位次属性
	private String zdxfss;	//自动消防设施情况
	private String xfgxjgid;	//消防管辖机构ID
	private String xfgxjgname;	//消防管辖机构名称
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String dlwz;	//地理位置
	private String jzsl;	//建筑数量
	private String czyid;	//操作员ID
	private String jgid;	//机构ID
	private String jgname;	//机构名称
	private String cszt;	//传输状态
	private String jlzt;	//记录状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String sjbb;	//数据版本
	private String cjsj;	//创建时间
	private String ywxtbsid;	//业务系统部署ID
	private String glid;	//关联ID
	private String vercol;	//版本戳
	private String jksjbb;	//基库数据版本
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String byzda;	//备用字段(1)
	private String byzdb;	//备用字段(2)
	private String byzdc;	//备用字段(3)
	private String byzdd;	//备用字段(4)
	private String pkid;	//ID
	private String exteriorurl;	//undefined

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getFhdwid(){
		return fhdwid;
	}
	public void setFhdwid(String fhdwid){
		this.fhdwid = fhdwid;
	}
	public String getDwmc(){
		return dwmc;
	}
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	public String getDwpyjc(){
		return dwpyjc;
	}
	public void setDwpyjc(String dwpyjc){
		this.dwpyjc = dwpyjc;
	}
	public String getJjsyz(){
		return jjsyz;
	}
	public void setJjsyz(String jjsyz){
		this.jjsyz = jjsyz;
	}
	public String getDwclsj(){
		return dwclsj;
	}
	public void setDwclsj(String dwclsj){
		this.dwclsj = dwclsj;
	}
	public String getDwdj(){
		return dwdj;
	}
	public void setDwdj(String dwdj){
		this.dwdj = dwdj;
	}
	public String getDwxz(){
		return dwxz;
	}
	public void setDwxz(String dwxz){
		this.dwxz = dwxz;
	}
	public String getDwlxdm(){
		return dwlxdm;
	}
	public void setDwlxdm(String dwlxdm){
		this.dwlxdm = dwlxdm;
	}
	public String getDwlxdmmc(){
		return dwlxdmmc;
	}
	public void setDwlxdmmc(String dwlxdmmc){
		this.dwlxdmmc = dwlxdmmc;
	}
	public String getXzqy(){
		return xzqy;
	}
	public void setXzqy(String xzqy){
		this.xzqy = xzqy;
	}
	public String getFrdb(){
		return frdb;
	}
	public void setFrdb(String frdb){
		this.frdb = frdb;
	}
	public String getFrdbsfz(){
		return frdbsfz;
	}
	public void setFrdbsfz(String frdbsfz){
		this.frdbsfz = frdbsfz;
	}
	public String getFrdbdh(){
		return frdbdh;
	}
	public void setFrdbdh(String frdbdh){
		this.frdbdh = frdbdh;
	}
	public String getAqzrr(){
		return aqzrr;
	}
	public void setAqzrr(String aqzrr){
		this.aqzrr = aqzrr;
	}
	public String getAqzrrsfz(){
		return aqzrrsfz;
	}
	public void setAqzrrsfz(String aqzrrsfz){
		this.aqzrrsfz = aqzrrsfz;
	}
	public String getAqzrrdh(){
		return aqzrrdh;
	}
	public void setAqzrrdh(String aqzrrdh){
		this.aqzrrdh = aqzrrdh;
	}
	public String getDwdzyx(){
		return dwdzyx;
	}
	public void setDwdzyx(String dwdzyx){
		this.dwdzyx = dwdzyx;
	}
	public String getAqglr(){
		return aqglr;
	}
	public void setAqglr(String aqglr){
		this.aqglr = aqglr;
	}
	public String getAqglrsfz(){
		return aqglrsfz;
	}
	public void setAqglrsfz(String aqglrsfz){
		this.aqglrsfz = aqglrsfz;
	}
	public String getAqglrdh(){
		return aqglrdh;
	}
	public void setAqglrdh(String aqglrdh){
		this.aqglrdh = aqglrdh;
	}
	public String getZjzxfglr(){
		return zjzxfglr;
	}
	public void setZjzxfglr(String zjzxfglr){
		this.zjzxfglr = zjzxfglr;
	}
	public String getZjzxfglrsfz(){
		return zjzxfglrsfz;
	}
	public void setZjzxfglrsfz(String zjzxfglrsfz){
		this.zjzxfglrsfz = zjzxfglrsfz;
	}
	public String getZjzxfglrdh(){
		return zjzxfglrdh;
	}
	public void setZjzxfglrdh(String zjzxfglrdh){
		this.zjzxfglrdh = zjzxfglrdh;
	}
	public String getDwdz(){
		return dwdz;
	}
	public void setDwdz(String dwdz){
		this.dwdz = dwdz;
	}
	public String getDwdh(){
		return dwdh;
	}
	public void setDwdh(String dwdh){
		this.dwdh = dwdh;
	}
	public String getYzbm(){
		return yzbm;
	}
	public void setYzbm(String yzbm){
		this.yzbm = yzbm;
	}
	public String getGdzc(){
		return gdzc;
	}
	public void setGdzc(String gdzc){
		this.gdzc = gdzc;
	}
	public String getZgrs(){
		return zgrs;
	}
	public void setZgrs(String zgrs){
		this.zgrs = zgrs;
	}
	public String getZdmj(){
		return zdmj;
	}
	public void setZdmj(String zdmj){
		this.zdmj = zdmj;
	}
	public String getJzmj(){
		return jzmj;
	}
	public void setJzmj(String jzmj){
		this.jzmj = jzmj;
	}
	public String getDwzsx(){
		return dwzsx;
	}
	public void setDwzsx(String dwzsx){
		this.dwzsx = dwzsx;
	}
	public String getDwcsx(){
		return dwcsx;
	}
	public void setDwcsx(String dwcsx){
		this.dwcsx = dwcsx;
	}
	public String getZdxfss(){
		return zdxfss;
	}
	public void setZdxfss(String zdxfss){
		this.zdxfss = zdxfss;
	}
	public String getXfgxjgid(){
		return xfgxjgid;
	}
	public void setXfgxjgid(String xfgxjgid){
		this.xfgxjgid = xfgxjgid;
	}
	public String getXfgxjgname(){
		return xfgxjgname;
	}
	public void setXfgxjgname(String xfgxjgname){
		this.xfgxjgname = xfgxjgname;
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
	public String getDlwz(){
		return dlwz;
	}
	public void setDlwz(String dlwz){
		this.dlwz = dlwz;
	}
	public String getJzsl(){
		return jzsl;
	}
	public void setJzsl(String jzsl){
		this.jzsl = jzsl;
	}
	public String getCzyid(){
		return czyid;
	}
	public void setCzyid(String czyid){
		this.czyid = czyid;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getJgname(){
		return jgname;
	}
	public void setJgname(String jgname){
		this.jgname = jgname;
	}
	public String getCszt(){
		return cszt;
	}
	public void setCszt(String cszt){
		this.cszt = cszt;
	}
	public String getJlzt(){
		return jlzt;
	}
	public void setJlzt(String jlzt){
		this.jlzt = jlzt;
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
	public String getGlid(){
		return glid;
	}
	public void setGlid(String glid){
		this.glid = glid;
	}
	public String getVercol(){
		return vercol;
	}
	public void setVercol(String vercol){
		this.vercol = vercol;
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
	public String getExteriorurl(){
		return exteriorurl;
	}
	public void setExteriorurl(String exteriorurl){
		this.exteriorurl = exteriorurl;
	}

	private String begintime;	//录入开始时间
	private String endtime;	//录入结束时间
	public String getBegintime(){
		return begintime;
	}
	public void setBegintime(String begintime){
		this.begintime = begintime;
	}
	public String getEndtime(){
		return endtime;
	}
	public void setEndtime(String endtime){
		this.endtime = endtime;
	}

//	private String yamc;	//预案名称
//	private String yabh;	//预案编号
//	private String bwmc;	//部位名称
//	private String bmdj;	//保密等级
//	private String zzrmc;	//制作人名称
//	private String zzrq;	//制作日期
//	private String czyxm;	//数据操作人姓名
//	private String dxmc;	//对象名称
//	private String czjg;	//操作机构
}