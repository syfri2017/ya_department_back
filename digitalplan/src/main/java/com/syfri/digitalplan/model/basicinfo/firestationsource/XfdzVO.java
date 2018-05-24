package com.syfri.digitalplan.model.basicinfo.firestationsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class XfdzVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String dzid;	//队站/机构ID（主键）
	private String sjdzid;	//上级队站/机构ID
	private String dzlx;	//队站类型
	private String dzbm;	//队站编码
	private String dzmc;	//队站名称
	private String dzjc;	//队站简称
	private String dzdz;	//队站地址
	private String bdLon;	//百度精度
	private String bdLat;	//百度纬度
	private String xzqh;	//行政区划CODE（到区县）
	private String lxr;	//联系人
	private String lxdh;	//联系电话/值班电话
	private String czhm;	//传真号码
	private String sxdsl;	//所辖队数量
	private String xygbrs;	//现役官兵人数（大、支、总）/消防队人数
	private String zfzzxfys;	//政府专职消防员数（大、支、总）
	private String zfwys;	//消防文员数（大、支、总）
	private String xygbsl;	//现役干部数量
	private String wzgysl;	//文职雇员数量
	private String zqrs;	//每日执勤人数
	private String zdymc;	//指导员/政委名称
	private String zdydh;	//指导员/政委电话
	private String dzcm;	//队长姓名
	private String dzdh;	//队长电话
	private String zqcl;	//执勤车辆（台）
	private String mhjl;	//灭火剂量（t）
	private String sysl;	//水源数量
	private String zddwsl;	//重点单位数量
	private String xqmj;	//辖区面积/管辖单位
	private String xqfw;	//辖区范围
	private String sfdljj;	//是否独立接警（大、支）
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

	private String xzqhmc;	//行政区划CODE（到区县）
	private String dzlxmc;	//队站类型名称

	public String getDzid(){
		return dzid;
	}
	public void setDzid(String dzid){
		this.dzid = dzid;
	}
	public String getSjdzid(){
		return sjdzid;
	}
	public void setSjdzid(String sjdzid){
		this.sjdzid = sjdzid;
	}
	public String getDzlx(){
		return dzlx;
	}
	public void setDzlx(String dzlx){
		this.dzlx = dzlx;
	}
	public String getDzbm(){
		return dzbm;
	}
	public void setDzbm(String dzbm){
		this.dzbm = dzbm;
	}
	public String getDzmc(){
		return dzmc;
	}
	public void setDzmc(String dzmc){
		this.dzmc = dzmc;
	}
	public String getDzjc(){
		return dzjc;
	}
	public void setDzjc(String dzjc){
		this.dzjc = dzjc;
	}
	public String getDzdz(){
		return dzdz;
	}
	public void setDzdz(String dzdz){
		this.dzdz = dzdz;
	}
	public String getBdLon(){
		return bdLon;
	}
	public void setBdLon(String bdLon){
		this.bdLon = bdLon;
	}
	public String getBdLat(){
		return bdLat;
	}
	public void setBdLat(String bdLat){
		this.bdLat = bdLat;
	}
	public String getXzqh(){
		return xzqh;
	}
	public void setXzqh(String xzqh){
		this.xzqh = xzqh;
	}
	public String getLxr(){
		return lxr;
	}
	public void setLxr(String lxr){
		this.lxr = lxr;
	}
	public String getLxdh(){
		return lxdh;
	}
	public void setLxdh(String lxdh){
		this.lxdh = lxdh;
	}
	public String getCzhm(){
		return czhm;
	}
	public void setCzhm(String czhm){
		this.czhm = czhm;
	}
	public String getSxdsl(){
		return sxdsl;
	}
	public void setSxdsl(String sxdsl){
		this.sxdsl = sxdsl;
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
	public String getZfwys(){
		return zfwys;
	}
	public void setZfwys(String zfwys){
		this.zfwys = zfwys;
	}
	public String getXygbsl(){
		return xygbsl;
	}
	public void setXygbsl(String xygbsl){
		this.xygbsl = xygbsl;
	}
	public String getWzgysl(){
		return wzgysl;
	}
	public void setWzgysl(String wzgysl){
		this.wzgysl = wzgysl;
	}
	public String getZqrs(){
		return zqrs;
	}
	public void setZqrs(String zqrs){
		this.zqrs = zqrs;
	}
	public String getZdymc(){
		return zdymc;
	}
	public void setZdymc(String zdymc){
		this.zdymc = zdymc;
	}
	public String getZdydh(){
		return zdydh;
	}
	public void setZdydh(String zdydh){
		this.zdydh = zdydh;
	}
	public String getDzcm(){
		return dzcm;
	}
	public void setDzcm(String dzcm){
		this.dzcm = dzcm;
	}
	public String getDzdh(){
		return dzdh;
	}
	public void setDzdh(String dzdh){
		this.dzdh = dzdh;
	}
	public String getZqcl(){
		return zqcl;
	}
	public void setZqcl(String zqcl){
		this.zqcl = zqcl;
	}
	public String getMhjl(){
		return mhjl;
	}
	public void setMhjl(String mhjl){
		this.mhjl = mhjl;
	}
	public String getSysl(){
		return sysl;
	}
	public void setSysl(String sysl){
		this.sysl = sysl;
	}
	public String getZddwsl(){
		return zddwsl;
	}
	public void setZddwsl(String zddwsl){
		this.zddwsl = zddwsl;
	}
	public String getXqmj(){
		return xqmj;
	}
	public void setXqmj(String xqmj){
		this.xqmj = xqmj;
	}
	public String getXqfw(){
		return xqfw;
	}
	public void setXqfw(String xqfw){
		this.xqfw = xqfw;
	}
	public String getSfdljj(){
		return sfdljj;
	}
	public void setSfdljj(String sfdljj){
		this.sfdljj = sfdljj;
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

	public String getXzqhmc() {
		return xzqhmc;
	}
	public void setXzqhmc(String xzqhmc) {
		this.xzqhmc = xzqhmc;
	}
	public String getDzlxmc() {
		return dzlxmc;
	}
	public void setDzlxmc(String dzlxmc) {
		this.dzlxmc = dzlxmc;
	}
}