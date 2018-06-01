package com.syfri.digitalplan.model.basicinfo.firestationsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class QtxfdwVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String dzid;	//队站ID
	private String xfdyzrs;	//消防队员总人数
	private String mrzqrs;	//每日执勤人数
	private String gxdw;	//管辖单位
	private String gxdwlxfs;	//管辖单位联系方式
	private String dzxm;	//队长姓名
	private String dzlxfs;	//队长联系方式
	private String deleteFlag;	//删除标志
	private String datasource;	//数据来源[10000000一体化]
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
	public String getDzid(){
		return dzid;
	}
	public void setDzid(String dzid){
		this.dzid = dzid;
	}
	public String getXfdyzrs(){
		return xfdyzrs;
	}
	public void setXfdyzrs(String xfdyzrs){
		this.xfdyzrs = xfdyzrs;
	}
	public String getMrzqrs(){
		return mrzqrs;
	}
	public void setMrzqrs(String mrzqrs){
		this.mrzqrs = mrzqrs;
	}
	public String getGxdw(){
		return gxdw;
	}
	public void setGxdw(String gxdw){
		this.gxdw = gxdw;
	}
	public String getGxdwlxfs(){
		return gxdwlxfs;
	}
	public void setGxdwlxfs(String gxdwlxfs){
		this.gxdwlxfs = gxdwlxfs;
	}
	public String getDzxm(){
		return dzxm;
	}
	public void setDzxm(String dzxm){
		this.dzxm = dzxm;
	}
	public String getDzlxfs(){
		return dzlxfs;
	}
	public void setDzlxfs(String dzlxfs){
		this.dzlxfs = dzlxfs;
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