package com.syfri.digitalplan.model.digitalplan;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class Digitalplan_distributeVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//undefined
	private String jgid;	//undefined
	private String sjjgid;	//undefined
	private String cjrid;	//undefined
	private String cjrmc;	//undefined
	private String cjsj;	//undefined
	private String xgrid;	//undefined
	private String xgrmc;	//undefined
	private String xgsj;	//undefined
	private String deleteFlag;	//undefined
	private String datasource;	//undefined
	private String bz;	//undefined
	private String jdh;	//undefined
	private String sjc;	//undefined
	private String reserve1;	//undefined
	private String reserve2;	//undefined
	private String reserve3;	//undefined
	private String reserve4;	//undefined

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
	}
	public String getSjjgid(){
		return sjjgid;
	}
	public void setSjjgid(String sjjgid){
		this.sjjgid = sjjgid;
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