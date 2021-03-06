package com.syfri.digitalplan.model.digitalplan;

import java.io.Serializable;
import java.util.List;

import com.syfri.baseapi.model.ValueObject;

public class DistributeVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键
	private String jgid;	//机构ID
	private String yaid;	//预案ID
	private List<String> ffzd;  //接受前台传递的机构字符串
	private String deleteFlag;	//删除标志
	private String datasource;	//数据来源[100000一体化]
	private String sjc;	//时间戳
	private String jdh;	//节点号
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
	public String getYaid(){
		return yaid;
	}
	public void setYaid(String yaid){
		this.yaid = yaid;
	}
	public List<String> getFfzd() {
		return ffzd;
	}
	public void setFfzd(List<String> ffzd) {
		this.ffzd = ffzd;
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
	public String getSjc(){
		return sjc;
	}
	public void setSjc(String sjc){
		this.sjc = sjc;
	}
	public String getJdh(){
		return jdh;
	}
	public void setJdh(String jdh){
		this.jdh = jdh;
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