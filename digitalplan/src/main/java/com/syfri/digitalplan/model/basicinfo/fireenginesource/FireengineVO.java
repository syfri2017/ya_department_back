package com.syfri.digitalplan.model.basicinfo.fireenginesource;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class FireengineVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//单件装备信息
	private String id;	//ID
	private String djzbbm;	//单件装备编码
	private String zbmc;	//装备名称
	private String zbbm;	//装备编码
	private String sjzbbm;	//上级装备编码
	private String zblxdm;	//装备类型代码
	private String djzbzkdm;	//单件装备状况代码
	private String ssxfjgid;	//所属消防机构
	private String gpsbh;	//GPS编号
	private String cldjdm;	//车辆等级代码
	private String cphm;	//车牌号码
	private String ggxh;	//规格号码
	private String zcbh;	//资产编号
	private String ckj;	//参考价
	private String sb;	//商标
	private String ys;	//颜色
	private String gbdm;	//国别代码
	private String sccjid;	//生产厂家代码
	private String sccjmc;	//生产厂家名称
	private String jkgn;	//进口装备国内代理商
	private String shfw;	//售后服务
	private String zrrid;	//责任人ID
	private String zrrxm;	//责任人姓名
	private String ccrq;	//出厂日期
	private String zbrq;	//装备日期
	private String bfrq;	//报废日期
	private String yxqz;	//有效期至
	private String ljyxsj;	//累计运输时间
	private String ljsycs;	//累计使用次数
	private String bcbyrq;	//本次保养日期
	private String xcbyrq;	//下次保养日期
	private String cjh;	//车架号
	private String fdjbh;	//发动机编号
	private String pch;	//批次号
	private String jldwdm;	//计量单位代码
	private String sfyyxl;	//是否用于训练
	private String sdzt;	//锁定状态
	private String clztdmMh;	//车辆状态代码_灭火
	private String clztmcMh;	//车辆状态名称_灭火
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String bz;	//备注
	private String dthh;	//电台呼号
	private String ajbh;	//案件编号
	private String sfzp;	//是否装配
	private String sfzhdkqy;	//是否跨支队
	private String sfzdkqy;	//是否跨总队
	private String clbh;	//车辆编号
	private String cjsj;	//创建时间
	private String sjbb;	//数据版本
	private String ywxtbsid;	//业务系统部署
	private String jcjgzt;	//检查结果状态
	private String cljc;	//车辆简称
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
	public String getDjzbbm(){
		return djzbbm;
	}
	public void setDjzbbm(String djzbbm){
		this.djzbbm = djzbbm;
	}
	public String getZbmc(){
		return zbmc;
	}
	public void setZbmc(String zbmc){
		this.zbmc = zbmc;
	}
	public String getZbbm(){
		return zbbm;
	}
	public void setZbbm(String zbbm){
		this.zbbm = zbbm;
	}
	public String getSjzbbm(){
		return sjzbbm;
	}
	public void setSjzbbm(String sjzbbm){
		this.sjzbbm = sjzbbm;
	}
	public String getZblxdm(){
		return zblxdm;
	}
	public void setZblxdm(String zblxdm){
		this.zblxdm = zblxdm;
	}
	public String getDjzbzkdm(){
		return djzbzkdm;
	}
	public void setDjzbzkdm(String djzbzkdm){
		this.djzbzkdm = djzbzkdm;
	}
	public String getSsxfjgid(){
		return ssxfjgid;
	}
	public void setSsxfjgid(String ssxfjgid){
		this.ssxfjgid = ssxfjgid;
	}
	public String getGpsbh(){
		return gpsbh;
	}
	public void setGpsbh(String gpsbh){
		this.gpsbh = gpsbh;
	}
	public String getCldjdm(){
		return cldjdm;
	}
	public void setCldjdm(String cldjdm){
		this.cldjdm = cldjdm;
	}
	public String getCphm(){
		return cphm;
	}
	public void setCphm(String cphm){
		this.cphm = cphm;
	}
	public String getGgxh(){
		return ggxh;
	}
	public void setGgxh(String ggxh){
		this.ggxh = ggxh;
	}
	public String getZcbh(){
		return zcbh;
	}
	public void setZcbh(String zcbh){
		this.zcbh = zcbh;
	}
	public String getCkj(){
		return ckj;
	}
	public void setCkj(String ckj){
		this.ckj = ckj;
	}
	public String getSb(){
		return sb;
	}
	public void setSb(String sb){
		this.sb = sb;
	}
	public String getYs(){
		return ys;
	}
	public void setYs(String ys){
		this.ys = ys;
	}
	public String getGbdm(){
		return gbdm;
	}
	public void setGbdm(String gbdm){
		this.gbdm = gbdm;
	}
	public String getSccjid(){
		return sccjid;
	}
	public void setSccjid(String sccjid){
		this.sccjid = sccjid;
	}
	public String getSccjmc(){
		return sccjmc;
	}
	public void setSccjmc(String sccjmc){
		this.sccjmc = sccjmc;
	}
	public String getJkgn(){
		return jkgn;
	}
	public void setJkgn(String jkgn){
		this.jkgn = jkgn;
	}
	public String getShfw(){
		return shfw;
	}
	public void setShfw(String shfw){
		this.shfw = shfw;
	}
	public String getZrrid(){
		return zrrid;
	}
	public void setZrrid(String zrrid){
		this.zrrid = zrrid;
	}
	public String getZrrxm(){
		return zrrxm;
	}
	public void setZrrxm(String zrrxm){
		this.zrrxm = zrrxm;
	}
	public String getCcrq(){
		return ccrq;
	}
	public void setCcrq(String ccrq){
		this.ccrq = ccrq;
	}
	public String getZbrq(){
		return zbrq;
	}
	public void setZbrq(String zbrq){
		this.zbrq = zbrq;
	}
	public String getBfrq(){
		return bfrq;
	}
	public void setBfrq(String bfrq){
		this.bfrq = bfrq;
	}
	public String getYxqz(){
		return yxqz;
	}
	public void setYxqz(String yxqz){
		this.yxqz = yxqz;
	}
	public String getLjyxsj(){
		return ljyxsj;
	}
	public void setLjyxsj(String ljyxsj){
		this.ljyxsj = ljyxsj;
	}
	public String getLjsycs(){
		return ljsycs;
	}
	public void setLjsycs(String ljsycs){
		this.ljsycs = ljsycs;
	}
	public String getBcbyrq(){
		return bcbyrq;
	}
	public void setBcbyrq(String bcbyrq){
		this.bcbyrq = bcbyrq;
	}
	public String getXcbyrq(){
		return xcbyrq;
	}
	public void setXcbyrq(String xcbyrq){
		this.xcbyrq = xcbyrq;
	}
	public String getCjh(){
		return cjh;
	}
	public void setCjh(String cjh){
		this.cjh = cjh;
	}
	public String getFdjbh(){
		return fdjbh;
	}
	public void setFdjbh(String fdjbh){
		this.fdjbh = fdjbh;
	}
	public String getPch(){
		return pch;
	}
	public void setPch(String pch){
		this.pch = pch;
	}
	public String getJldwdm(){
		return jldwdm;
	}
	public void setJldwdm(String jldwdm){
		this.jldwdm = jldwdm;
	}
	public String getSfyyxl(){
		return sfyyxl;
	}
	public void setSfyyxl(String sfyyxl){
		this.sfyyxl = sfyyxl;
	}
	public String getSdzt(){
		return sdzt;
	}
	public void setSdzt(String sdzt){
		this.sdzt = sdzt;
	}
	public String getClztdmMh(){
		return clztdmMh;
	}
	public void setClztdmMh(String clztdmMh){
		this.clztdmMh = clztdmMh;
	}
	public String getClztmcMh(){
		return clztmcMh;
	}
	public void setClztmcMh(String clztmcMh){
		this.clztmcMh = clztmcMh;
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
	public String getDthh(){
		return dthh;
	}
	public void setDthh(String dthh){
		this.dthh = dthh;
	}
	public String getAjbh(){
		return ajbh;
	}
	public void setAjbh(String ajbh){
		this.ajbh = ajbh;
	}
	public String getSfzp(){
		return sfzp;
	}
	public void setSfzp(String sfzp){
		this.sfzp = sfzp;
	}
	public String getSfzhdkqy(){
		return sfzhdkqy;
	}
	public void setSfzhdkqy(String sfzhdkqy){
		this.sfzhdkqy = sfzhdkqy;
	}
	public String getSfzdkqy(){
		return sfzdkqy;
	}
	public void setSfzdkqy(String sfzdkqy){
		this.sfzdkqy = sfzdkqy;
	}
	public String getClbh(){
		return clbh;
	}
	public void setClbh(String clbh){
		this.clbh = clbh;
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
	public String getJcjgzt(){
		return jcjgzt;
	}
	public void setJcjgzt(String jcjgzt){
		this.jcjgzt = jcjgzt;
	}
	public String getCljc(){
		return cljc;
	}
	public void setCljc(String cljc){
		this.cljc = cljc;
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