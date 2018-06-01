package com.syfri.digitalplan.model.basicinfo.firestationsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class ZhongdVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String dzid;	//队站ID
	private String xyrs;	//现役人数
	private String zfzzxfys;	//政府专职消防员数
	private String mrzqrs;	//每日执勤人数
	private String zdzxm;	//中队长姓名
	private String zdzlxfs;	//中队长联系方式
	private String zdyxm;	//指导员姓名
	private String zdylxfs;	//指导员联系方式
	private String fzdyxm;	//副指导员姓名
	private String fzdylxfs;	//副指导员联系方式
	private String fzdzxm1;	//副中队长一姓名
	private String fzdzlxfs1;	//副中队长一联系方式
	private String fzdzxm2;	//副中队长二姓名
	private String fzdzlxfs2;	//副中队长二联系方式
	private String fzdzxm3;	//副中队长三姓名
	private String fzdzlxfs3;	//副中队长三联系方式
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
	public String getXyrs(){
		return xyrs;
	}
	public void setXyrs(String xyrs){
		this.xyrs = xyrs;
	}
	public String getZfzzxfys(){
		return zfzzxfys;
	}
	public void setZfzzxfys(String zfzzxfys){
		this.zfzzxfys = zfzzxfys;
	}
	public String getMrzqrs(){
		return mrzqrs;
	}
	public void setMrzqrs(String mrzqrs){
		this.mrzqrs = mrzqrs;
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
	public String getZdyxm(){
		return zdyxm;
	}
	public void setZdyxm(String zdyxm){
		this.zdyxm = zdyxm;
	}
	public String getZdylxfs(){
		return zdylxfs;
	}
	public void setZdylxfs(String zdylxfs){
		this.zdylxfs = zdylxfs;
	}
	public String getFzdyxm(){
		return fzdyxm;
	}
	public void setFzdyxm(String fzdyxm){
		this.fzdyxm = fzdyxm;
	}
	public String getFzdylxfs(){
		return fzdylxfs;
	}
	public void setFzdylxfs(String fzdylxfs){
		this.fzdylxfs = fzdylxfs;
	}
	public String getFzdzxm1(){
		return fzdzxm1;
	}
	public void setFzdzxm1(String fzdzxm1){
		this.fzdzxm1 = fzdzxm1;
	}
	public String getFzdzlxfs1(){
		return fzdzlxfs1;
	}
	public void setFzdzlxfs1(String fzdzlxfs1){
		this.fzdzlxfs1 = fzdzlxfs1;
	}
	public String getFzdzxm2(){
		return fzdzxm2;
	}
	public void setFzdzxm2(String fzdzxm2){
		this.fzdzxm2 = fzdzxm2;
	}
	public String getFzdzlxfs2(){
		return fzdzlxfs2;
	}
	public void setFzdzlxfs2(String fzdzlxfs2){
		this.fzdzlxfs2 = fzdzlxfs2;
	}
	public String getFzdzxm3(){
		return fzdzxm3;
	}
	public void setFzdzxm3(String fzdzxm3){
		this.fzdzxm3 = fzdzxm3;
	}
	public String getFzdzlxfs3(){
		return fzdzlxfs3;
	}
	public void setFzdzlxfs3(String fzdzlxfs3){
		this.fzdzlxfs3 = fzdzlxfs3;
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