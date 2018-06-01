package com.syfri.digitalplan.model.basicinfo.firestationsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class ZhidVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String dzid;	//队站ID
	private String xygbrs;	//现役官兵人数
	private String zfzzxfys;	//政府专职消防员数
	private String xfwys;	//消防文员数
	private String xxdads;	//下辖大队数
	private String xxzhongds;	//下辖中队数
	private String sfdljj;	//是否独立接警[0]否[1]是
	private String zdzxm;	//支队长姓名
	private String zdzlxfs;	//支队长联系方式
	private String zdzwxm;	//支队政委姓名
	private String zdzwlxfs;	//支队政委联系方式
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
	public String getXygbrs(){
		return xygbrs;
	}
	public void setXygbrs(String xygbrs){
		this.xygbrs = xygbrs;
	}
	public String getZfzzxfys(){
		return zfzzxfys;
	}
	public void setZfzzxfys(String zfzzxfys){
		this.zfzzxfys = zfzzxfys;
	}
	public String getXfwys(){
		return xfwys;
	}
	public void setXfwys(String xfwys){
		this.xfwys = xfwys;
	}
	public String getXxdads(){
		return xxdads;
	}
	public void setXxdads(String xxdads){
		this.xxdads = xxdads;
	}
	public String getXxzhongds(){
		return xxzhongds;
	}
	public void setXxzhongds(String xxzhongds){
		this.xxzhongds = xxzhongds;
	}
	public String getSfdljj(){
		return sfdljj;
	}
	public void setSfdljj(String sfdljj){
		this.sfdljj = sfdljj;
	}
	public String getZdzxm(){
		return zdzxm;
	}
	public void setZdzxm(String zdzxm){
		this.zdzxm = zdzxm;
	}
	public String getZdzlxfs(){
		return zdzlxfs;
	}
	public void setZdzlxfs(String zdzlxfs){
		this.zdzlxfs = zdzlxfs;
	}
	public String getZdzwxm(){
		return zdzwxm;
	}
	public void setZdzwxm(String zdzwxm){
		this.zdzwxm = zdzwxm;
	}
	public String getZdzwlxfs(){
		return zdzwlxfs;
	}
	public void setZdzwlxfs(String zdzwlxfs){
		this.zdzwlxfs = zdzwlxfs;
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