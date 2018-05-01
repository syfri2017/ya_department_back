package com.syfri.digitalplan.model.keyunits;

import java.io.Serializable;

import com.syfri.baseapi.model.ValueObject;

public class KeyunitsVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String uuid;	//主键（单位ID）
	private String dwmc;	//单位名称
	private String dwlb;	//单位类别
	private String dwclsj;	//单位成立时间
	private String dwdz;	//单位地址
	private String dzlj;	//路/街
	private String dzh;	//号
	private String dwgk;	//单位概况
	private String xzqh;	//行政区划CODE（到区县）
	private String zbdh;	//值班电话
	private String yzbm;	//邮政编码
	private String dzyx;	//电子邮箱
	private String gdzc;	//固定资产
	private String zgrs;	//职工人数
	private String fhdj;	//防火等级（代码集）
	private String fhdzid;	//防火队站ID
	private String fhdzmc;	//防火队站名称
	private String mhdzid;	//灭火队站ID
	private String mhdzmc;	//灭火队站名称
	private String xfzrr;	//消防责任人
	private String xfzrrsfz;	//消防责任人身份证
	private String xfzrrdh;	//消防责任人电话
	private String xfglr;	//消防管理人
	private String xfglrsfz;	//消防管理人身份证
	private String xfglrdh;	//消防管理人电话
	private String xfdwlx;	//单位消防队伍类型
	private String xfdwrs;	//单位消防队伍人数
	private String xfdwcls;	//单位消防队伍车辆数
	private String xfdwlxr;	//单位消防队伍联系人
	private String xfdwdh;	//单位消防队伍联系电话
	private String xfdwbz;	//单位消防队伍备注
	private String xfsssl;	//单位自动消防设施数量
	private String jzfl;	//建筑分类（单体建筑/建筑群）
	private String jzsl;	//建筑数量
	private String zdmj;	//占地面积
	private String jzmj;	//建筑面积
	private String gisX;	//GIS_X
	private String gisY;	//GIS_Y
	private String lon;	//经度
	private String lat;	//纬度
	private String blgxd;	//毗邻情况(东)
	private String blgxn;	//毗邻情况(南)
	private String blgxx;	//毗邻情况(西)
	private String blgxb;	//毗邻情况(北)
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

	public String getUuid(){
		return uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getDwmc(){
		return dwmc;
	}
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	public String getDwlb(){
		return dwlb;
	}
	public void setDwlb(String dwlb){
		this.dwlb = dwlb;
	}
	public String getDwclsj(){
		return dwclsj;
	}
	public void setDwclsj(String dwclsj){
		this.dwclsj = dwclsj;
	}
	public String getDwdz(){
		return dwdz;
	}
	public void setDwdz(String dwdz){
		this.dwdz = dwdz;
	}
	public String getDzlj(){
		return dzlj;
	}
	public void setDzlj(String dzlj){
		this.dzlj = dzlj;
	}
	public String getDzh(){
		return dzh;
	}
	public void setDzh(String dzh){
		this.dzh = dzh;
	}
	public String getDwgk(){
		return dwgk;
	}
	public void setDwgk(String dwgk){
		this.dwgk = dwgk;
	}
	public String getXzqh(){
		return xzqh;
	}
	public void setXzqh(String xzqh){
		this.xzqh = xzqh;
	}
	public String getZbdh(){
		return zbdh;
	}
	public void setZbdh(String zbdh){
		this.zbdh = zbdh;
	}
	public String getYzbm(){
		return yzbm;
	}
	public void setYzbm(String yzbm){
		this.yzbm = yzbm;
	}
	public String getDzyx(){
		return dzyx;
	}
	public void setDzyx(String dzyx){
		this.dzyx = dzyx;
	}
	public String getGdzc(){
		return gdzc;
	}
	public void setGdzc(String gdzc){
		this.gdzc = gdzc;
	}
	public String getZgrs(){
		return zgrs;
	}
	public void setZgrs(String zgrs){
		this.zgrs = zgrs;
	}
	public String getFhdj(){
		return fhdj;
	}
	public void setFhdj(String fhdj){
		this.fhdj = fhdj;
	}
	public String getFhdzid(){
		return fhdzid;
	}
	public void setFhdzid(String fhdzid){
		this.fhdzid = fhdzid;
	}
	public String getFhdzmc(){
		return fhdzmc;
	}
	public void setFhdzmc(String fhdzmc){
		this.fhdzmc = fhdzmc;
	}
	public String getMhdzid(){
		return mhdzid;
	}
	public void setMhdzid(String mhdzid){
		this.mhdzid = mhdzid;
	}
	public String getMhdzmc(){
		return mhdzmc;
	}
	public void setMhdzmc(String mhdzmc){
		this.mhdzmc = mhdzmc;
	}
	public String getXfzrr(){
		return xfzrr;
	}
	public void setXfzrr(String xfzrr){
		this.xfzrr = xfzrr;
	}
	public String getXfzrrsfz(){
		return xfzrrsfz;
	}
	public void setXfzrrsfz(String xfzrrsfz){
		this.xfzrrsfz = xfzrrsfz;
	}
	public String getXfzrrdh(){
		return xfzrrdh;
	}
	public void setXfzrrdh(String xfzrrdh){
		this.xfzrrdh = xfzrrdh;
	}
	public String getXfglr(){
		return xfglr;
	}
	public void setXfglr(String xfglr){
		this.xfglr = xfglr;
	}
	public String getXfglrsfz(){
		return xfglrsfz;
	}
	public void setXfglrsfz(String xfglrsfz){
		this.xfglrsfz = xfglrsfz;
	}
	public String getXfglrdh(){
		return xfglrdh;
	}
	public void setXfglrdh(String xfglrdh){
		this.xfglrdh = xfglrdh;
	}
	public String getXfdwlx(){
		return xfdwlx;
	}
	public void setXfdwlx(String xfdwlx){
		this.xfdwlx = xfdwlx;
	}
	public String getXfdwrs(){
		return xfdwrs;
	}
	public void setXfdwrs(String xfdwrs){
		this.xfdwrs = xfdwrs;
	}
	public String getXfdwcls(){
		return xfdwcls;
	}
	public void setXfdwcls(String xfdwcls){
		this.xfdwcls = xfdwcls;
	}
	public String getXfdwlxr(){
		return xfdwlxr;
	}
	public void setXfdwlxr(String xfdwlxr){
		this.xfdwlxr = xfdwlxr;
	}
	public String getXfdwdh(){
		return xfdwdh;
	}
	public void setXfdwdh(String xfdwdh){
		this.xfdwdh = xfdwdh;
	}
	public String getXfdwbz(){
		return xfdwbz;
	}
	public void setXfdwbz(String xfdwbz){
		this.xfdwbz = xfdwbz;
	}
	public String getXfsssl(){
		return xfsssl;
	}
	public void setXfsssl(String xfsssl){
		this.xfsssl = xfsssl;
	}
	public String getJzfl(){
		return jzfl;
	}
	public void setJzfl(String jzfl){
		this.jzfl = jzfl;
	}
	public String getJzsl(){
		return jzsl;
	}
	public void setJzsl(String jzsl){
		this.jzsl = jzsl;
	}
	public String getZdmj(){
		return zdmj;
	}
	public void setZdmj(String zdmj){
		this.zdmj = zdmj;
	}
	public String getJzmj(){
		return jzmj;
	}
	public void setJzmj(String jzmj){
		this.jzmj = jzmj;
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
	public String getLon(){
		return lon;
	}
	public void setLon(String lon){
		this.lon = lon;
	}
	public String getLat(){
		return lat;
	}
	public void setLat(String lat){
		this.lat = lat;
	}
	public String getBlgxd(){
		return blgxd;
	}
	public void setBlgxd(String blgxd){
		this.blgxd = blgxd;
	}
	public String getBlgxn(){
		return blgxn;
	}
	public void setBlgxn(String blgxn){
		this.blgxn = blgxn;
	}
	public String getBlgxx(){
		return blgxx;
	}
	public void setBlgxx(String blgxx){
		this.blgxx = blgxx;
	}
	public String getBlgxb(){
		return blgxb;
	}
	public void setBlgxb(String blgxb){
		this.blgxb = blgxb;
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

	private String dwlbmc;	//单位类别转码
	public String getDwlbmc(){
		return dwlbmc;
	}
	public void setDwlbmc(String dwlbmc){
		this.dwlbmc = dwlbmc;
	}

	private String xzqhmc;	//行政区划转码
	public String getXzqhmc(){
		return xzqhmc;
	}
	public void setXzqhmc(String xzqhmc){
		this.xzqhmc = xzqhmc;
	}
}