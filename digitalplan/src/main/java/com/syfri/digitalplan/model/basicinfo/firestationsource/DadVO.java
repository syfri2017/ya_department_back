package com.syfri.digitalplan.model.basicinfo.firestationsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class DadVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String dzid;	//队站ID
	private String xygbrs;	//现役官兵人数
	private String zfzzxfys;	//政府专职消防员数
	private String xfwys;	//消防文员数
	private String xxzhongds;	//下辖中队数
	private String sfdljj;	//是否独立接警[0]否[1]是
	private String ddzxm;	//大队长姓名
	private String ddzlxfs;	//大队长联系方式
	private String jdyxm;	//教导员姓名
	private String jdylxfs;	//教导员联系方式
	private String fddzxm;	//副大队长姓名
	private String fddzlxfs;	//副大队长联系方式
	private String fjdyxm;	//副教导员姓名
	private String fjdylxfs;	//副教导员联系方式
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
	public String getDdzxm(){
		return ddzxm;
	}
	public void setDdzxm(String ddzxm){
		this.ddzxm = ddzxm;
	}
	public String getDdzlxfs(){
		return ddzlxfs;
	}
	public void setDdzlxfs(String ddzlxfs){
		this.ddzlxfs = ddzlxfs;
	}
	public String getJdyxm(){
		return jdyxm;
	}
	public void setJdyxm(String jdyxm){
		this.jdyxm = jdyxm;
	}
	public String getJdylxfs(){
		return jdylxfs;
	}
	public void setJdylxfs(String jdylxfs){
		this.jdylxfs = jdylxfs;
	}
	public String getFddzxm(){
		return fddzxm;
	}
	public void setFddzxm(String fddzxm){
		this.fddzxm = fddzxm;
	}
	public String getFddzlxfs(){
		return fddzlxfs;
	}
	public void setFddzlxfs(String fddzlxfs){
		this.fddzlxfs = fddzlxfs;
	}
	public String getFjdyxm(){
		return fjdyxm;
	}
	public void setFjdyxm(String fjdyxm){
		this.fjdyxm = fjdyxm;
	}
	public String getFjdylxfs(){
		return fjdylxfs;
	}
	public void setFjdylxfs(String fjdylxfs){
		this.fjdylxfs = fjdylxfs;
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