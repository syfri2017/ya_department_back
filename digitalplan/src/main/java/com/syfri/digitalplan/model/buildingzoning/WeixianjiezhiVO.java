package com.syfri.digitalplan.model.buildingzoning;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class WeixianjiezhiVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String sjlx;	//数据类型
	private String fkid;	//建筑ID/部位ID
	private String jzmc;	//危险介质名称
	private String jzsjcl;	//危险介质实际储量
	private String jzlhtx;	//危险介质理化特性
	private String jtlcms;	//危险介质备注
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

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getSjlx(){
		return sjlx;
	}
	public void setSjlx(String sjlx){
		this.sjlx = sjlx;
	}
	public String getFkid(){
		return fkid;
	}
	public void setFkid(String fkid){
		this.fkid = fkid;
	}
	public String getJzmc(){
		return jzmc;
	}
	public void setJzmc(String jzmc){
		this.jzmc = jzmc;
	}
	public String getJzsjcl(){
		return jzsjcl;
	}
	public void setJzsjcl(String jzsjcl){
		this.jzsjcl = jzsjcl;
	}
	public String getJzlhtx(){
		return jzlhtx;
	}
	public void setJzlhtx(String jzlhtx){
		this.jzlhtx = jzlhtx;
	}
	public String getJtlcms(){
		return jtlcms;
	}
	public void setJtlcms(String jtlcms){
		this.jtlcms = jtlcms;
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
}