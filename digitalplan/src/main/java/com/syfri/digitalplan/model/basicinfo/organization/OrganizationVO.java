package com.syfri.digitalplan.model.basicinfo.organization;

import com.syfri.baseapi.model.ValueObject;

import java.io.Serializable;

public class OrganizationVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String jgid;	//机构ID
	private String sjjgid;	//上级机构ID
	private String jgmc;	//机构名称
	private String jgjc;	//机构简称
	private String jgxzdm;	//机构性质代码
	private String jgdz;	//机构地址
	private String jgms;	//机构描述
	private String xzqh;	//行政区划CODE
	private String yzbm;	//邮政编码
	private String lxdh;	//联系电话
	private String czhm;	//传真号码
	private String lxr;	//联系人
	private String ssym;	//所属域名
	private String zp;	//照片
	private String zqdwbz;	//执勤单位标志[0],[1]
	private String bdLon;	//百度精度
	private String bdLat;	//百度纬度
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String gisH;	//GIS_H
	private String glid;	//关联位置ID
	private String xqglid;	//辖区管理ID
	private String jgtree;	//机构树
	private String jgqz;	//机构权重
	private String xqmj;	//辖区面积
	private String xqfw;	//辖区范围
	private String jgcxzt;	//机构撤销状态[0]已撤销,[1]未撤销
	private String jgcxsj;	//机构撤销时间
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
	public String getJgmc(){
		return jgmc;
	}
	public void setJgmc(String jgmc){
		this.jgmc = jgmc;
	}
	public String getJgjc(){
		return jgjc;
	}
	public void setJgjc(String jgjc){
		this.jgjc = jgjc;
	}
	public String getJgxzdm(){
		return jgxzdm;
	}
	public void setJgxzdm(String jgxzdm){
		this.jgxzdm = jgxzdm;
	}
	public String getJgdz(){
		return jgdz;
	}
	public void setJgdz(String jgdz){
		this.jgdz = jgdz;
	}
	public String getJgms(){
		return jgms;
	}
	public void setJgms(String jgms){
		this.jgms = jgms;
	}
	public String getXzqh(){
		return xzqh;
	}
	public void setXzqh(String xzqh){
		this.xzqh = xzqh;
	}
	public String getYzbm(){
		return yzbm;
	}
	public void setYzbm(String yzbm){
		this.yzbm = yzbm;
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
	public String getLxr(){
		return lxr;
	}
	public void setLxr(String lxr){
		this.lxr = lxr;
	}
	public String getSsym(){
		return ssym;
	}
	public void setSsym(String ssym){
		this.ssym = ssym;
	}
	public String getZp(){
		return zp;
	}
	public void setZp(String zp){
		this.zp = zp;
	}
	public String getZqdwbz(){
		return zqdwbz;
	}
	public void setZqdwbz(String zqdwbz){
		this.zqdwbz = zqdwbz;
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
	public String getXqglid(){
		return xqglid;
	}
	public void setXqglid(String xqglid){
		this.xqglid = xqglid;
	}
	public String getJgtree(){
		return jgtree;
	}
	public void setJgtree(String jgtree){
		this.jgtree = jgtree;
	}
	public String getJgqz(){
		return jgqz;
	}
	public void setJgqz(String jgqz){
		this.jgqz = jgqz;
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
	public String getJgcxzt(){
		return jgcxzt;
	}
	public void setJgcxzt(String jgcxzt){
		this.jgcxzt = jgcxzt;
	}
	public String getJgcxsj(){
		return jgcxsj;
	}
	public void setJgcxsj(String jgcxsj){
		this.jgcxsj = jgcxsj;
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