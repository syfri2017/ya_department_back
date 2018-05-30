package com.syfri.digitalplan.model.planobject;

import com.syfri.baseapi.model.ValueObject;

import java.io.Serializable;

public class GuardobjectsVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String hdzt;	//活动主题
	private String zcbdw;	//主（承）办单位
	private String lxdh;	//联系电话
	private String zynr;	//主要内容
	private String gmdx;	//规模大小
	private String rcap;	//日程安排
	private String cxsj;	//持续时间
	private String hdcswz;	//活动场所位置
	private String zdbw;	//重点部位
	private String xfgx;	//消防管辖
	private String xfgxmc;  //消防管辖名称
	private String lsyhqk;	//临时用火情况
	private String lsydqk;	//临时用电情况
	private String lsdjpjqk;	//临时搭建棚架情况
	private String zbqk;	//周边情况
	private String xfss;	//消防设施
	private String xfsy;	//消防水源
	private String sstd;	//疏散通道
	private String xftd;	//消防通道
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String gisH;	//GIS_H
	private String glid;	//GIS关联ID
	private String jgid;	//机构ID
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

	private byte[] photo;
	private String photo64;

	private String yadxType;  //高级搜索预案对象类别（1为重点单位，2为消防保卫警卫，3为其他对象）
	private String dxmc;     //高级搜索中对象名称（对应保卫警卫中hdzt字段）
	private String dxdz;		//高级搜索中对象地址（对应保卫警卫中 hdcswz 字段）

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getHdzt(){
		return hdzt;
	}
	public void setHdzt(String hdzt){
		this.hdzt = hdzt;
	}
	public String getZcbdw(){
		return zcbdw;
	}
	public void setZcbdw(String zcbdw){
		this.zcbdw = zcbdw;
	}
	public String getLxdh(){
		return lxdh;
	}
	public void setLxdh(String lxdh){
		this.lxdh = lxdh;
	}
	public String getZynr(){
		return zynr;
	}
	public void setZynr(String zynr){
		this.zynr = zynr;
	}
	public String getGmdx(){
		return gmdx;
	}
	public void setGmdx(String gmdx){
		this.gmdx = gmdx;
	}
	public String getRcap(){
		return rcap;
	}
	public void setRcap(String rcap){
		this.rcap = rcap;
	}
	public String getCxsj(){
		return cxsj;
	}
	public void setCxsj(String cxsj){
		this.cxsj = cxsj;
	}
	public String getHdcswz(){
		return hdcswz;
	}
	public void setHdcswz(String hdcswz){
		this.hdcswz = hdcswz;
	}
	public String getZdbw(){
		return zdbw;
	}
	public void setZdbw(String zdbw){
		this.zdbw = zdbw;
	}
	public String getXfgx(){
		return xfgx;
	}
	public void setXfgx(String xfgx){
		this.xfgx = xfgx;
	}
	public String getXfgxmc() {
		return xfgxmc;
	}
	public void setXfgxmc(String xfgxmc) {
		this.xfgxmc = xfgxmc;
	}

	public String getLsyhqk(){
		return lsyhqk;
	}
	public void setLsyhqk(String lsyhqk){
		this.lsyhqk = lsyhqk;
	}
	public String getLsydqk(){
		return lsydqk;
	}
	public void setLsydqk(String lsydqk){
		this.lsydqk = lsydqk;
	}
	public String getLsdjpjqk(){
		return lsdjpjqk;
	}
	public void setLsdjpjqk(String lsdjpjqk){
		this.lsdjpjqk = lsdjpjqk;
	}
	public String getZbqk(){
		return zbqk;
	}
	public void setZbqk(String zbqk){
		this.zbqk = zbqk;
	}
	public String getXfss(){
		return xfss;
	}
	public void setXfss(String xfss){
		this.xfss = xfss;
	}
	public String getXfsy(){
		return xfsy;
	}
	public void setXfsy(String xfsy){
		this.xfsy = xfsy;
	}
	public String getSstd(){
		return sstd;
	}
	public void setSstd(String sstd){
		this.sstd = sstd;
	}
	public String getXftd(){
		return xftd;
	}
	public void setXftd(String xftd){
		this.xftd = xftd;
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
	public String getJgid(){
		return jgid;
	}
	public void setJgid(String jgid){
		this.jgid = jgid;
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

	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getPhoto64() {
		return photo64;
	}
	public void setPhoto64(String photo64) {
		this.photo64 = photo64;
	}

	public String getYadxType() {
		return yadxType;
	}
	public void setYadxType(String yadxType) {
		this.yadxType = yadxType;
	}
	public String getDxmc() {
		return dxmc;
	}
	public void setDxmc(String dxmc) {
		this.dxmc = dxmc;
	}
	public String getDxdz() {
		return dxdz;
	}
	public void setDxdz(String dxdz) {
		this.dxdz = dxdz;
	}
}