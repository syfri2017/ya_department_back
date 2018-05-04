package com.syfri.digitalplan.model.buildingzoning;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class ChuguanVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String sjlx;	//数据类型
	private String pkid;	//建筑罐组ID/部位罐组ID
	private String cgmc;	//储罐名称
	private String cglx;	//储罐类型
	private String cgrl;	//储罐容量(m3)
	private String cgzj;	//储罐直径(m)
	private String cggd;	//储罐高度(m)
	private String cgzc;	//储罐周长(m)
	private String gdmj;	//灌顶面积(㎡)
	private String gzyl;	//工作压力
	private String ccwd;	//存储温度
	private String ccjzmc;	//存储介质名称
	private String ccjzlhtx;	//存储介质理化性质
	private String ccjzsjcl;	//存储介质实际储量(m3)
	private String ccjzywgd;	//存储机制液位高度(m)
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

	private String cglxmc;	//储罐类型名称

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
	public String getPkid(){
		return pkid;
	}
	public void setPkid(String pkid){
		this.pkid = pkid;
	}
	public String getCgmc(){
		return cgmc;
	}
	public void setCgmc(String cgmc){
		this.cgmc = cgmc;
	}
	public String getCglx(){
		return cglx;
	}
	public void setCglx(String cglx){
		this.cglx = cglx;
	}
	public String getCgrl(){
		return cgrl;
	}
	public void setCgrl(String cgrl){
		this.cgrl = cgrl;
	}
	public String getCgzj(){
		return cgzj;
	}
	public void setCgzj(String cgzj){
		this.cgzj = cgzj;
	}
	public String getCggd(){
		return cggd;
	}
	public void setCggd(String cggd){
		this.cggd = cggd;
	}
	public String getCgzc(){
		return cgzc;
	}
	public void setCgzc(String cgzc){
		this.cgzc = cgzc;
	}
	public String getGdmj(){
		return gdmj;
	}
	public void setGdmj(String gdmj){
		this.gdmj = gdmj;
	}
	public String getGzyl(){
		return gzyl;
	}
	public void setGzyl(String gzyl){
		this.gzyl = gzyl;
	}
	public String getCcwd(){
		return ccwd;
	}
	public void setCcwd(String ccwd){
		this.ccwd = ccwd;
	}
	public String getCcjzmc(){
		return ccjzmc;
	}
	public void setCcjzmc(String ccjzmc){
		this.ccjzmc = ccjzmc;
	}
	public String getCcjzlhtx(){
		return ccjzlhtx;
	}
	public void setCcjzlhtx(String ccjzlhtx){
		this.ccjzlhtx = ccjzlhtx;
	}
	public String getCcjzsjcl(){
		return ccjzsjcl;
	}
	public void setCcjzsjcl(String ccjzsjcl){
		this.ccjzsjcl = ccjzsjcl;
	}
	public String getCcjzywgd(){
		return ccjzywgd;
	}
	public void setCcjzywgd(String ccjzywgd){
		this.ccjzywgd = ccjzywgd;
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

	public String getCglxmc() {
		return cglxmc;
	}
	public void setCglxmc(String cglxmc) {
		this.cglxmc = cglxmc;
	}
}