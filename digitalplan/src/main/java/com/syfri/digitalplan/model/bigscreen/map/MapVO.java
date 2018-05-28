package com.syfri.digitalplan.model.bigscreen.map;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class MapVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String rq;	//日期（年月日）
	private String xzqh;	//行政区划
	private String xzqhmc;	//行政区划名称
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y

	private String dwmc;	//danweimingcheng
	private String dwdz;
	private String xfzrr;
	private String zbdh;

	private String zddwsl;	//重点单位数量
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3
	private String reserve4;	//备用字段4




	public String getZbdh() {

		return zbdh;
	}

	public void setZbdh(String zbdh) {
		this.zbdh = zbdh;
	}

	public String getXfzrr() {

		return xfzrr;
	}

	public void setXfzrr(String xfzrr) {
		this.xfzrr = xfzrr;
	}

	public String getDwdz() {

		return dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}
	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}



	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getRq(){
		return rq;
	}
	public void setRq(String rq){
		this.rq = rq;
	}
	public String getXzqh(){
		return xzqh;
	}
	public void setXzqh(String xzqh){
		this.xzqh = xzqh;
	}
	public String getXzqhmc(){
		return xzqhmc;
	}
	public void setXzqhmc(String xzqhmc){
		this.xzqhmc = xzqhmc;
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
	public String getZddwsl(){
		return zddwsl;
	}
	public void setZddwsl(String zddwsl){
		this.zddwsl = zddwsl;
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