package com.syfri.digitalplan.model.auxiliarydecision.firecalculation;

import java.io.Serializable;
import java.util.List;
import com.syfri.baseapi.model.ValueObject;

public class FirecalculationlistVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String gsmc;	//公式名称
	private String gslb;	//公式类别
	private String gssm;	//公式说明
	private String jsgs;	//计算公式
	private String jsgsdw;	//计算公式单位
	private String sfqy;	//是否启用[0]否，[1]是
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
	private String lbmc;	//公式类别名称
	private String csmc;	//参数名称
	private String cslxmc;	//参数类型名称
	private String jldw;	//计量单位名称
	private String mrz;	//默认值
	private List<FirecalculationparamVO> firecalculationparams;  //计算参数

	public List<FirecalculationparamVO> getFirecalculationparams() {
		return firecalculationparams;
	}

	public void setFirecalculationparams(List<FirecalculationparamVO> firecalculationparams) {
		this.firecalculationparams = firecalculationparams;
	}

	public String getLbmc() {
		return lbmc;
	}

	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}

	public String getCsmc() {
		return csmc;
	}

	public void setCsmc(String csmc) {
		this.csmc = csmc;
	}

	public String getCslxmc() {
		return cslxmc;
	}

	public void setCslxmc(String cslxmc) {
		this.cslxmc = cslxmc;
	}

	public String getJldw() {
		return jldw;
	}

	public void setJldw(String jldw) {
		this.jldw = jldw;
	}

	public String getMrz() {
		return mrz;
	}

	public void setMrz(String mrz) {
		this.mrz = mrz;
	}

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getGsmc(){
		return gsmc;
	}
	public void setGsmc(String gsmc){
		this.gsmc = gsmc;
	}
	public String getGslb(){
		return gslb;
	}
	public void setGslb(String gslb){
		this.gslb = gslb;
	}
	public String getGssm(){
		return gssm;
	}
	public void setGssm(String gssm){
		this.gssm = gssm;
	}
	public String getJsgs(){
		return jsgs;
	}
	public void setJsgs(String jsgs){
		this.jsgs = jsgs;
	}
	public String getJsgsdw(){
		return jsgsdw;
	}
	public void setJsgsdw(String jsgsdw){
		this.jsgsdw = jsgsdw;
	}
	public String getSfqy(){
		return sfqy;
	}
	public void setSfqy(String sfqy){
		this.sfqy = sfqy;
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