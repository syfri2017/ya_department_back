package com.syfri.digitalplan.model.digitalplan;

import java.io.Serializable;
import java.util.List;

import com.syfri.baseapi.model.ValueObject;

public class DisastersetVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String zqid;	//主键
	private String yaid;	//预案ID
	private String zdbwid;	//重点单位ID
	private String jzid;	//建筑分区ID
	private String zqbw;	//灾情部位
	private String zqdj;	//灾情等级
	private String qhyy;	//起火原因
	private String gyjzhzwxx;	//工业建筑火灾危险性
	private String zhcs;	//灾害场所
	private String rswz;	//燃烧物质
	private String qhbwgd;	//起火部位高度
	private String rsmj;	//燃烧面积
	private String zqms;	//灾情描述
	private String zqsdyj;	//灾情设定依据
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


	public String getZqid(){
		return zqid;
	}
	public void setZqid(String zqid){
		this.zqid = zqid;
	}
	public String getYaid(){
		return yaid;
	}
	public void setYaid(String yaid){
		this.yaid = yaid;
	}
	public String getZdbwid(){
		return zdbwid;
	}
	public void setZdbwid(String zdbwid){
		this.zdbwid = zdbwid;
	}
	public String getJzid(){
		return jzid;
	}
	public void setJzid(String jzid){
		this.jzid = jzid;
	}
	public String getZqbw(){
		return zqbw;
	}
	public void setZqbw(String zqbw){
		this.zqbw = zqbw;
	}
	public String getZqdj(){
		return zqdj;
	}
	public void setZqdj(String zqdj){
		this.zqdj = zqdj;
	}
	public String getQhyy(){
		return qhyy;
	}
	public void setQhyy(String qhyy){
		this.qhyy = qhyy;
	}
	public String getGyjzhzwxx(){
		return gyjzhzwxx;
	}
	public void setGyjzhzwxx(String gyjzhzwxx){
		this.gyjzhzwxx = gyjzhzwxx;
	}
	public String getZhcs(){
		return zhcs;
	}
	public void setZhcs(String zhcs){
		this.zhcs = zhcs;
	}
	public String getRswz(){
		return rswz;
	}
	public void setRswz(String rswz){
		this.rswz = rswz;
	}
	public String getQhbwgd(){
		return qhbwgd;
	}
	public void setQhbwgd(String qhbwgd){
		this.qhbwgd = qhbwgd;
	}
	public String getRsmj(){
		return rsmj;
	}
	public void setRsmj(String rsmj){
		this.rsmj = rsmj;
	}
	public String getZqms(){
		return zqms;
	}
	public void setZqms(String zqms){
		this.zqms = zqms;
	}
	public String getZqsdyj(){
		return zqsdyj;
	}
	public void setZqsdyj(String zqsdyj){
		this.zqsdyj = zqsdyj;
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

	private String zqdjmc;	//灾情等级
	private String rswzmc;	//燃烧物质
	private String zhcsmc;	//灾害场所
	private String qhyymc;	//起火原因
	private String hzwxxmc;	//工业建筑火灾危险性
	private List<ForcedevVO> forcedevList;	//力量部署list
	private KeypointsVO keypointsMap;	//要点提示Map

	public String getZqdjmc(){
		return zqdjmc;
	}
	public void setZqdjmc(String zqdjmc){
		this.zqdjmc = zqdjmc;
	}
	public String getRswzmc(){
		return rswzmc;
	}
	public void setRswzmc(String rswzmc){
		this.rswzmc = rswzmc;
	}
	public String getZhcsmc(){
		return zhcsmc;
	}
	public void setZhcsmc(String zhcsmc){
		this.zhcsmc = zhcsmc;
	}
	public String getQhyymc(){
		return qhyymc;
	}
	public void setQhyymc(String qhyymc){
		this.qhyymc = qhyymc;
	}
	public String getHzwxxmc(){
		return hzwxxmc;
	}
	public void setHzwxxmc(String hzwxxmc){
		this.hzwxxmc = hzwxxmc;
	}
	public List<ForcedevVO> getForcedevList() { return forcedevList; }
	public void setForcedevList(List<ForcedevVO> forcedevList) { this.forcedevList = forcedevList; }
	public KeypointsVO getKeypointsMap() { return keypointsMap; }
	public void setKeypointsMap(KeypointsVO keypointsMap) { this.keypointsMap = keypointsMap; }


}