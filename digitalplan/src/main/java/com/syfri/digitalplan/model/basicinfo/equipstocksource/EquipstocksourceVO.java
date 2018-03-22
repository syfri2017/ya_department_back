package com.syfri.digitalplan.model.basicinfo.equipstocksource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class EquipstocksourceVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//ID
	private String ckid;	//仓库ID
	private String ckmc;	//仓库名称
	private String hwid;	//货位ID
	private String hwmc;	//货位名称
	private String zbqcbm;	//装备器材编码
	private String zbqcmc;	//装备器材名称
	private String ggxh;	//规格型号
	private String pch;	//批次号
	private String yxqz;	//有效期至
	private String djzbid;	//单件装备ID
	private String djzbbm;	//单件装备编码
	private String zcbh;	//资产编号
	private String cph;	//车牌号
	private String zbztdm;	//装备状态代码
	private String sfkzz;	//是否可作战
	private String sfsc;	//是否上车
	private String kcsl;	//库存数量
	private String lysl;	//领用数量
	private String zzsl;	//装载数量
	private String wxsl;	//维修数量
	private String ztsl;	//在途数量
	private String jldw;	//计量单位代码
	private String dj;	//单价
	private String je;	//金额
	private String ymxzid;	//原明细账ID
	private String tzjlid;	//台账记录ID
	private String zzdjzbid;	//装载单件装备ID
	private String zzdjzbbm;	//装载单件装备编码
	private String bysj;	//保养时间
	private String jcsj;	//检查时间
	private String jzsj;	//建账时间
	private String ssxfjgid;	//所属消防机构
	private String ssxfjgmc;	//所属消防机构名称
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String cjsj;	//创建时间
	private String sjbb;	//数据版本
	private String ywxtbsid;	//业务系统部署ID
	private String jksjbb;	//基库数据版本
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
	public String getCkid(){
		return ckid;
	}
	public void setCkid(String ckid){
		this.ckid = ckid;
	}
	public String getCkmc(){
		return ckmc;
	}
	public void setCkmc(String ckmc){
		this.ckmc = ckmc;
	}
	public String getHwid(){
		return hwid;
	}
	public void setHwid(String hwid){
		this.hwid = hwid;
	}
	public String getHwmc(){
		return hwmc;
	}
	public void setHwmc(String hwmc){
		this.hwmc = hwmc;
	}
	public String getZbqcbm(){
		return zbqcbm;
	}
	public void setZbqcbm(String zbqcbm){
		this.zbqcbm = zbqcbm;
	}
	public String getZbqcmc(){
		return zbqcmc;
	}
	public void setZbqcmc(String zbqcmc){
		this.zbqcmc = zbqcmc;
	}
	public String getGgxh(){
		return ggxh;
	}
	public void setGgxh(String ggxh){
		this.ggxh = ggxh;
	}
	public String getPch(){
		return pch;
	}
	public void setPch(String pch){
		this.pch = pch;
	}
	public String getYxqz(){
		return yxqz;
	}
	public void setYxqz(String yxqz){
		this.yxqz = yxqz;
	}
	public String getDjzbid(){
		return djzbid;
	}
	public void setDjzbid(String djzbid){
		this.djzbid = djzbid;
	}
	public String getDjzbbm(){
		return djzbbm;
	}
	public void setDjzbbm(String djzbbm){
		this.djzbbm = djzbbm;
	}
	public String getZcbh(){
		return zcbh;
	}
	public void setZcbh(String zcbh){
		this.zcbh = zcbh;
	}
	public String getCph(){
		return cph;
	}
	public void setCph(String cph){
		this.cph = cph;
	}
	public String getZbztdm(){
		return zbztdm;
	}
	public void setZbztdm(String zbztdm){
		this.zbztdm = zbztdm;
	}
	public String getSfkzz(){
		return sfkzz;
	}
	public void setSfkzz(String sfkzz){
		this.sfkzz = sfkzz;
	}
	public String getSfsc(){
		return sfsc;
	}
	public void setSfsc(String sfsc){
		this.sfsc = sfsc;
	}
	public String getKcsl(){
		return kcsl;
	}
	public void setKcsl(String kcsl){
		this.kcsl = kcsl;
	}
	public String getLysl(){
		return lysl;
	}
	public void setLysl(String lysl){
		this.lysl = lysl;
	}
	public String getZzsl(){
		return zzsl;
	}
	public void setZzsl(String zzsl){
		this.zzsl = zzsl;
	}
	public String getWxsl(){
		return wxsl;
	}
	public void setWxsl(String wxsl){
		this.wxsl = wxsl;
	}
	public String getZtsl(){
		return ztsl;
	}
	public void setZtsl(String ztsl){
		this.ztsl = ztsl;
	}
	public String getJldw(){
		return jldw;
	}
	public void setJldw(String jldw){
		this.jldw = jldw;
	}
	public String getDj(){
		return dj;
	}
	public void setDj(String dj){
		this.dj = dj;
	}
	public String getJe(){
		return je;
	}
	public void setJe(String je){
		this.je = je;
	}
	public String getYmxzid(){
		return ymxzid;
	}
	public void setYmxzid(String ymxzid){
		this.ymxzid = ymxzid;
	}
	public String getTzjlid(){
		return tzjlid;
	}
	public void setTzjlid(String tzjlid){
		this.tzjlid = tzjlid;
	}
	public String getZzdjzbid(){
		return zzdjzbid;
	}
	public void setZzdjzbid(String zzdjzbid){
		this.zzdjzbid = zzdjzbid;
	}
	public String getZzdjzbbm(){
		return zzdjzbbm;
	}
	public void setZzdjzbbm(String zzdjzbbm){
		this.zzdjzbbm = zzdjzbbm;
	}
	public String getBysj(){
		return bysj;
	}
	public void setBysj(String bysj){
		this.bysj = bysj;
	}
	public String getJcsj(){
		return jcsj;
	}
	public void setJcsj(String jcsj){
		this.jcsj = jcsj;
	}
	public String getJzsj(){
		return jzsj;
	}
	public void setJzsj(String jzsj){
		this.jzsj = jzsj;
	}
	public String getSsxfjgid(){
		return ssxfjgid;
	}
	public void setSsxfjgid(String ssxfjgid){
		this.ssxfjgid = ssxfjgid;
	}
	public String getSsxfjgmc(){
		return ssxfjgmc;
	}
	public void setSsxfjgmc(String ssxfjgmc){
		this.ssxfjgmc = ssxfjgmc;
	}
	public String getJlzt(){
		return jlzt;
	}
	public void setJlzt(String jlzt){
		this.jlzt = jlzt;
	}
	public String getCszt(){
		return cszt;
	}
	public void setCszt(String cszt){
		this.cszt = cszt;
	}
	public String getSjc(){
		return sjc;
	}
	public void setSjc(String sjc){
		this.sjc = sjc;
	}
	public String getBz(){
		return bz;
	}
	public void setBz(String bz){
		this.bz = bz;
	}
	public String getCjsj(){
		return cjsj;
	}
	public void setCjsj(String cjsj){
		this.cjsj = cjsj;
	}
	public String getSjbb(){
		return sjbb;
	}
	public void setSjbb(String sjbb){
		this.sjbb = sjbb;
	}
	public String getYwxtbsid(){
		return ywxtbsid;
	}
	public void setYwxtbsid(String ywxtbsid){
		this.ywxtbsid = ywxtbsid;
	}
	public String getJksjbb(){
		return jksjbb;
	}
	public void setJksjbb(String jksjbb){
		this.jksjbb = jksjbb;
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