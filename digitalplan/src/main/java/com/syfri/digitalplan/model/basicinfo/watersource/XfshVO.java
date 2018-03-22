package com.syfri.digitalplan.model.basicinfo.watersource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class XfshVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//UUID
	private String 所属管网;	//所属管网
	private String 管网直径;	//管网直径
	private String 管网压力;	//管网压力
	private String 水鹤高度;	//水鹤高度
	private String 流量;	//流量
	private String 进水管直径;	//进水管直径
	private String 出水管直径;	//出水管直径
	private String 加水车道;	//加水车道
	private String 机构id;	//机构ID
	private String 记录状态;	//记录状态
	private String 传输状态;	//传输状态
	private String 数据版本;	//数据版本
	private String 创建时间;	//创建时间
	private String 业务系统部署id;	//业务系统部署ID
	private String 时间戳;	//时间戳
	private String 备注;	//备注
	private String 版本戳;	//版本戳
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3

	public String getPkid(){
		return pkid;
	}
	public void setPkid(String pkid){
		this.pkid = pkid;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String get所属管网(){
		return 所属管网;
	}
	public void set所属管网(String 所属管网){
		this.所属管网 = 所属管网;
	}
	public String get管网直径(){
		return 管网直径;
	}
	public void set管网直径(String 管网直径){
		this.管网直径 = 管网直径;
	}
	public String get管网压力(){
		return 管网压力;
	}
	public void set管网压力(String 管网压力){
		this.管网压力 = 管网压力;
	}
	public String get水鹤高度(){
		return 水鹤高度;
	}
	public void set水鹤高度(String 水鹤高度){
		this.水鹤高度 = 水鹤高度;
	}
	public String get流量(){
		return 流量;
	}
	public void set流量(String 流量){
		this.流量 = 流量;
	}
	public String get进水管直径(){
		return 进水管直径;
	}
	public void set进水管直径(String 进水管直径){
		this.进水管直径 = 进水管直径;
	}
	public String get出水管直径(){
		return 出水管直径;
	}
	public void set出水管直径(String 出水管直径){
		this.出水管直径 = 出水管直径;
	}
	public String get加水车道(){
		return 加水车道;
	}
	public void set加水车道(String 加水车道){
		this.加水车道 = 加水车道;
	}
	public String get机构id(){
		return 机构id;
	}
	public void set机构id(String 机构id){
		this.机构id = 机构id;
	}
	public String get记录状态(){
		return 记录状态;
	}
	public void set记录状态(String 记录状态){
		this.记录状态 = 记录状态;
	}
	public String get传输状态(){
		return 传输状态;
	}
	public void set传输状态(String 传输状态){
		this.传输状态 = 传输状态;
	}
	public String get数据版本(){
		return 数据版本;
	}
	public void set数据版本(String 数据版本){
		this.数据版本 = 数据版本;
	}
	public String get创建时间(){
		return 创建时间;
	}
	public void set创建时间(String 创建时间){
		this.创建时间 = 创建时间;
	}
	public String get业务系统部署id(){
		return 业务系统部署id;
	}
	public void set业务系统部署id(String 业务系统部署id){
		this.业务系统部署id = 业务系统部署id;
	}
	public String get时间戳(){
		return 时间戳;
	}
	public void set时间戳(String 时间戳){
		this.时间戳 = 时间戳;
	}
	public String get备注(){
		return 备注;
	}
	public void set备注(String 备注){
		this.备注 = 备注;
	}
	public String get版本戳(){
		return 版本戳;
	}
	public void set版本戳(String 版本戳){
		this.版本戳 = 版本戳;
	}
	public String getTbjdh(){
		return tbjdh;
	}
	public void setTbjdh(String tbjdh){
		this.tbjdh = tbjdh;
	}
	public String getTbsjc(){
		return tbsjc;
	}
	public void setTbsjc(String tbsjc){
		this.tbsjc = tbsjc;
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
}