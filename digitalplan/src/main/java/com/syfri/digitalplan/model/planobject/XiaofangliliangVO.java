package com.syfri.digitalplan.model.planobject;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class XiaofangliliangVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String zddwid;	//重点单位ID
	private String xfdwlx;	//单位消防队伍类型
	private String xfdwrs;	//单位消防队伍人数
	private String xfdwcls;	//单位消防队伍车辆数
	private String xfdwlxr;	//单位消防队伍联系人
	private String xfdwdh;	//单位消防队伍联系电话
	private String bz;	//单位消防队伍备注
	private String deleteFlag;	//删除标志
	private String datasource;	//数据来源[100000一体化]
	private String jdh;	//节点号
	private String sjc;	//时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3
	private String reserve4;	//备用字段4

	private String xfdwlxmc;	//单位消防队伍类型名称

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getZddwid(){
		return zddwid;
	}
	public void setZddwid(String zddwid){
		this.zddwid = zddwid;
	}
	public String getXfdwlx(){
		return xfdwlx;
	}
	public void setXfdwlx(String xfdwlx){
		this.xfdwlx = xfdwlx;
	}
	public String getXfdwrs(){
		return xfdwrs;
	}
	public void setXfdwrs(String xfdwrs){
		this.xfdwrs = xfdwrs;
	}
	public String getXfdwcls(){
		return xfdwcls;
	}
	public void setXfdwcls(String xfdwcls){
		this.xfdwcls = xfdwcls;
	}
	public String getXfdwlxr(){
		return xfdwlxr;
	}
	public void setXfdwlxr(String xfdwlxr){
		this.xfdwlxr = xfdwlxr;
	}
	public String getXfdwdh(){
		return xfdwdh;
	}
	public void setXfdwdh(String xfdwdh){
		this.xfdwdh = xfdwdh;
	}
	public String getBz(){
		return bz;
	}
	public void setBz(String bz){
		this.bz = bz;
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
	public String getXfdwlxmc() { return xfdwlxmc; }
	public void setXfdwlxmc(String xfdwlxmc) { this.xfdwlxmc = xfdwlxmc; }
}