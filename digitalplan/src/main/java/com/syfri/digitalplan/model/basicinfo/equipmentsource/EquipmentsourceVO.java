package com.syfri.digitalplan.model.basicinfo.equipmentsource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class EquipmentsourceVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//ID
	private String zbqcbm;	//装备器材编码
	private String zbqcmc;	//装备器材名称
	private String zbqclxdm;	//装备器材类型代码#ZBQCLB
	private String zbqclxmc;	//装备器材类型名称
	private String cllxdm;	//车辆类型代码#CLLX/CZQF
	private String cllxmc;	//车辆类型名称
	private String sfxhxzb;	//是否消耗性装备#SF
	private String ggxh;	//规格型号
	private String jldwdm;	//计量单位代码#JLDW
	private String ckj;	//参考价
	private String zl;	//重量
	private String tj;	//体积
	private String cz;	//尺寸
	private String bzh;	//比重
	private String jcph;	//检测批号
	private String kssj;	//抗烧时间
	private String zycf;	//主要成份
	private String syfw;	//适用范围
	private String zrjylbdm;	//准入检验类别代码#ZBSCZRJYLB
	private String jkzbgndls;	//进口装备国内代理商
	private String shfwdw;	//售后服务单位
	private String byzq;	//保养周期
	private String jczq;	//检查周期
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String cjsj;	//创建时间
	private String sjbb;	//数据版本
	private String ywxtbsid;	//业务系统部署ID
	private String vercol;	//版本戳
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
	public String getZbqclxdm(){
		return zbqclxdm;
	}
	public void setZbqclxdm(String zbqclxdm){
		this.zbqclxdm = zbqclxdm;
	}
	public String getZbqclxmc(){
		return zbqclxmc;
	}
	public void setZbqclxmc(String zbqclxmc){
		this.zbqclxmc = zbqclxmc;
	}
	public String getCllxdm(){
		return cllxdm;
	}
	public void setCllxdm(String cllxdm){
		this.cllxdm = cllxdm;
	}
	public String getCllxmc(){
		return cllxmc;
	}
	public void setCllxmc(String cllxmc){
		this.cllxmc = cllxmc;
	}
	public String getSfxhxzb(){
		return sfxhxzb;
	}
	public void setSfxhxzb(String sfxhxzb){
		this.sfxhxzb = sfxhxzb;
	}
	public String getGgxh(){
		return ggxh;
	}
	public void setGgxh(String ggxh){
		this.ggxh = ggxh;
	}
	public String getJldwdm(){
		return jldwdm;
	}
	public void setJldwdm(String jldwdm){
		this.jldwdm = jldwdm;
	}
	public String getCkj(){
		return ckj;
	}
	public void setCkj(String ckj){
		this.ckj = ckj;
	}
	public String getZl(){
		return zl;
	}
	public void setZl(String zl){
		this.zl = zl;
	}
	public String getTj(){
		return tj;
	}
	public void setTj(String tj){
		this.tj = tj;
	}
	public String getCz(){
		return cz;
	}
	public void setCz(String cz){
		this.cz = cz;
	}
	public String getBzh(){
		return bzh;
	}
	public void setBzh(String bzh){
		this.bzh = bzh;
	}
	public String getJcph(){
		return jcph;
	}
	public void setJcph(String jcph){
		this.jcph = jcph;
	}
	public String getKssj(){
		return kssj;
	}
	public void setKssj(String kssj){
		this.kssj = kssj;
	}
	public String getZycf(){
		return zycf;
	}
	public void setZycf(String zycf){
		this.zycf = zycf;
	}
	public String getSyfw(){
		return syfw;
	}
	public void setSyfw(String syfw){
		this.syfw = syfw;
	}
	public String getZrjylbdm(){
		return zrjylbdm;
	}
	public void setZrjylbdm(String zrjylbdm){
		this.zrjylbdm = zrjylbdm;
	}
	public String getJkzbgndls(){
		return jkzbgndls;
	}
	public void setJkzbgndls(String jkzbgndls){
		this.jkzbgndls = jkzbgndls;
	}
	public String getShfwdw(){
		return shfwdw;
	}
	public void setShfwdw(String shfwdw){
		this.shfwdw = shfwdw;
	}
	public String getByzq(){
		return byzq;
	}
	public void setByzq(String byzq){
		this.byzq = byzq;
	}
	public String getJczq(){
		return jczq;
	}
	public void setJczq(String jczq){
		this.jczq = jczq;
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
	public String getVercol(){
		return vercol;
	}
	public void setVercol(String vercol){
		this.vercol = vercol;
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