package com.syfri.digitalplan.model.basicinfo.fireenginesource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class FireengineVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String clbm;	//车辆编码
	private String clmc;	//车辆名称
	private String ssdz;	//所属队站
	private String ssdzmc;	//所属队站名称
	private String xzqy;	//行政区划CODE（到区县）
	private String cllx;	//车辆类型CLLX
	private String cphm;	//车牌号码
	private String clzt;	//车辆状态（代码）
	private String sccj;	//生产厂家
	private String jglgd;	//举高类车辆高度（m）
	private String sbll;	//水泵流量（L/s）
	private String zsl;	//载水量（t）
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
	private String cllxmc;	//车辆类型（名称）
	private String clztmc;	//车辆状态（名称）

	private String sbll_min;
	private String sbll_max;
	private String zsl_min;
	private String zsl_max;
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y

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

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getClbm(){
		return clbm;
	}
	public void setClbm(String clbm){
		this.clbm = clbm;
	}
	public String getClmc(){
		return clmc;
	}
	public void setClmc(String clmc){
		this.clmc = clmc;
	}
	public String getSsdz(){
		return ssdz;
	}
	public void setSsdz(String ssdz){
		this.ssdz = ssdz;
	}
	public String getSsdzmc(){
		return ssdzmc;
	}
	public void setSsdzmc(String ssdzmc){
		this.ssdzmc = ssdzmc;
	}
	public String getXzqy(){
		return xzqy;
	}
	public void setXzqy(String xzqy){
		this.xzqy = xzqy;
	}
	public String getCllx(){
		return cllx;
	}
	public void setCllx(String cllx){
		this.cllx = cllx;
	}
	public String getCphm(){
		return cphm;
	}
	public void setCphm(String cphm){
		this.cphm = cphm;
	}
	public String getClzt(){
		return clzt;
	}
	public void setClzt(String clzt){
		this.clzt = clzt;
	}
	public String getSccj(){
		return sccj;
	}
	public void setSccj(String sccj){
		this.sccj = sccj;
	}
	public String getJglgd(){
		return jglgd;
	}
	public void setJglgd(String jglgd){
		this.jglgd = jglgd;
	}
	public String getSbll(){
		return sbll;
	}
	public void setSbll(String sbll){
		this.sbll = sbll;
	}
	public String getZsl(){
		return zsl;
	}
	public void setZsl(String zsl){
		this.zsl = zsl;
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

	public String getCllxmc() { return cllxmc; }
	public void setCllxmc(String cllxmc) { this.cllxmc = cllxmc; }
	public String getClztmc() {	return clztmc; }
	public void setClztmc(String clztmc) { this.clztmc = clztmc; }

	public String getSbll_min() { return sbll_min; }
	public void setSbll_min(String sbll_min) { this.sbll_min = sbll_min; }
	public String getSbll_max() { return sbll_max; }
	public void setSbll_max(String sbll_max) { this.sbll_max = sbll_max; }
	public String getZsl_min() { return zsl_min; }
	public void setZsl_min(String zsl_min) { this.zsl_min = zsl_min; }
	public String getZsl_max() { return zsl_max; }
	public void setZsl_max(String zsl_max) { this.zsl_max = zsl_max; }
}