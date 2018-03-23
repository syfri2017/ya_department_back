package com.syfri.digitalplan.model.basicinfo.danger;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class DangerVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//PKID
	private String id;	//ID
	private String name;	//名称
	private String englishName;	//英文名
	private String cas;	//CAS登记号
	private String rtecs;	//RTECS号
	private String un;	//UN编号
	private String dangerId;	//中国危险货物编号
	private String expression;	//分子式
	private String type;	//类型号
	private String flag;	//包装标志
	private String alias;	//别名
	private String gbId;	//国标号
	private String property;	//性状
	private String airDetermine;	//空气中允许极限及测定
	private String waterDetermine;	//水中允许极限及测定
	private String tabu;	//禁忌物/禁忌
	private String thesaurus;	//同义词
	private String symptom;	//危险性/症状
	private String firstaid;	//急救措施/灭火
	private String defendWay;	//防护措施
	private String dispose;	//处置措施
	private String store;	//储存
	private String leakWay;	//泄漏处理
	private String traffic;	//运输
	private String remark;	//附注
	private String sjbb;	//数据版本
	private String cjsj;	//创建时间
	private String ywxtbsid;	//业务系统部署ID
	private String jlzt;	//记录状态
	private String cszt;	//传输状态
	private String sjc;	//时间戳
	private String vercol;	//版本戳
	private String tbjdh;	//同步节点号
	private String tbsjc;	//同步时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3
	private String dmz;	//类型名

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
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getEnglishName(){
		return englishName;
	}
	public void setEnglishName(String englishName){
		this.englishName = englishName;
	}
	public String getCas(){
		return cas;
	}
	public void setCas(String cas){
		this.cas = cas;
	}
	public String getRtecs(){
		return rtecs;
	}
	public void setRtecs(String rtecs){
		this.rtecs = rtecs;
	}
	public String getUn(){
		return un;
	}
	public void setUn(String un){
		this.un = un;
	}
	public String getDangerId(){
		return dangerId;
	}
	public void setDangerId(String dangerId){
		this.dangerId = dangerId;
	}
	public String getExpression(){
		return expression;
	}
	public void setExpression(String expression){
		this.expression = expression;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getFlag(){
		return flag;
	}
	public void setFlag(String flag){
		this.flag = flag;
	}
	public String getAlias(){
		return alias;
	}
	public void setAlias(String alias){
		this.alias = alias;
	}
	public String getGbId(){
		return gbId;
	}
	public void setGbId(String gbId){
		this.gbId = gbId;
	}
	public String getProperty(){
		return property;
	}
	public void setProperty(String property){
		this.property = property;
	}
	public String getAirDetermine(){
		return airDetermine;
	}
	public void setAirDetermine(String airDetermine){
		this.airDetermine = airDetermine;
	}
	public String getWaterDetermine(){
		return waterDetermine;
	}
	public void setWaterDetermine(String waterDetermine){
		this.waterDetermine = waterDetermine;
	}
	public String getTabu(){
		return tabu;
	}
	public void setTabu(String tabu){
		this.tabu = tabu;
	}
	public String getThesaurus(){
		return thesaurus;
	}
	public void setThesaurus(String thesaurus){
		this.thesaurus = thesaurus;
	}
	public String getSymptom(){
		return symptom;
	}
	public void setSymptom(String symptom){
		this.symptom = symptom;
	}
	public String getFirstaid(){
		return firstaid;
	}
	public void setFirstaid(String firstaid){
		this.firstaid = firstaid;
	}
	public String getDefendWay(){
		return defendWay;
	}
	public void setDefendWay(String defendWay){
		this.defendWay = defendWay;
	}
	public String getDispose(){
		return dispose;
	}
	public void setDispose(String dispose){
		this.dispose = dispose;
	}
	public String getStore(){
		return store;
	}
	public void setStore(String store){
		this.store = store;
	}
	public String getLeakWay(){
		return leakWay;
	}
	public void setLeakWay(String leakWay){
		this.leakWay = leakWay;
	}
	public String getTraffic(){
		return traffic;
	}
	public void setTraffic(String traffic){
		this.traffic = traffic;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getSjbb(){
		return sjbb;
	}
	public void setSjbb(String sjbb){
		this.sjbb = sjbb;
	}
	public String getCjsj(){
		return cjsj;
	}
	public void setCjsj(String cjsj){
		this.cjsj = cjsj;
	}
	public String getYwxtbsid(){
		return ywxtbsid;
	}
	public void setYwxtbsid(String ywxtbsid){
		this.ywxtbsid = ywxtbsid;
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
	public String getDmz(){ return dmz; }
	public void setDmz(String dmz){
		this.dmz = dmz;
	}
}