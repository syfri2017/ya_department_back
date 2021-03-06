package com.syfri.digitalplan.model.planobject;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class OtherobjectsVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String dxmc;	//对象名称
	private String dxdz;	//对象地址
	private String lxdh;	//联系电话
	private String xfgx;	//消防管辖
	private String xfgxmc;  //消防管辖名称
	private String jbqk;	//基本情况
	private String zywxx;	//主要危险性
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String gisH;	//GIS_H
	private String glid;	//GIS关联ID
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

	private String yadxType;  //高级搜索预案对象类别（1为重点单位，2为消防保卫警卫，3为其他对象）

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getDxmc(){
		return dxmc;
	}
	public void setDxmc(String dxmc){
		this.dxmc = dxmc;
	}
	public String getDxdz(){
		return dxdz;
	}
	public void setDxdz(String dxdz){
		this.dxdz = dxdz;
	}
	public String getLxdh(){
		return lxdh;
	}
	public void setLxdh(String lxdh){
		this.lxdh = lxdh;
	}
	public String getXfgx(){
		return xfgx;
	}
	public void setXfgx(String xfgx){
		this.xfgx = xfgx;
	}
	public String getJbqk(){
		return jbqk;
	}
	public void setJbqk(String jbqk){
		this.jbqk = jbqk;
	}
	public String getZywxx(){
		return zywxx;
	}
	public void setZywxx(String zywxx){
		this.zywxx = zywxx;
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

	public String getYadxType() {
		return yadxType;
	}
	public void setYadxType(String yadxType) {
		this.yadxType = yadxType;
	}
	public String getXfgxmc() {
		return xfgxmc;
	}
	public void setXfgxmc(String xfgxmc) {
		this.xfgxmc = xfgxmc;
	}
}