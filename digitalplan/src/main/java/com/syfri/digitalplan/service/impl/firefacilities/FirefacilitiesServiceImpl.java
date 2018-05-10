package com.syfri.digitalplan.service.impl.firefacilities;

import com.syfri.digitalplan.model.firefacilities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.firefacilities.FirefacilitiesDAO;
import com.syfri.digitalplan.service.firefacilities.FirefacilitiesService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("firefacilitiesService")
public class FirefacilitiesServiceImpl extends BaseServiceImpl<FirefacilitiesVO> implements FirefacilitiesService {

	@Autowired
	private FirefacilitiesDAO firefacilitiesDAO;

	@Override
	public FirefacilitiesDAO getBaseDAO() {
		return firefacilitiesDAO;
	}

	/*
	* 查询安全设施列表，分类关联从表查询从表信息
	* 返回map<消防设施类型，类型对应的从表信息list>
	* by yushch 20180509
	* */
	public Map<String, List> doFindlist(FirefacilitiesVO vo) {
		List<FirefacilitiesVO> firefacilities = firefacilitiesDAO.doSearchListByVO(vo);
		Map<String,List> map = new HashMap<String,List>();
		List aqck = new ArrayList();
		List sslt = new ArrayList();
		List xfdt = new ArrayList();
		List bnc = new ArrayList();
		List yjgb = new ArrayList();
		List xfbf = new ArrayList();
		List xfsx = new ArrayList();
		List xfsc = new ArrayList();
		List snxhs = new ArrayList();
		List swxhs = new ArrayList();
		List sbjhq = new ArrayList();
		List plxt = new ArrayList();
		List lqsxt = new ArrayList();
		List gdsp = new ArrayList();
		List bgdss = new ArrayList();
		List pmbf = new ArrayList();
		List pmxhs = new ArrayList();
		List gdpmp = new ArrayList();
		List pmfsq = new ArrayList();
		List pm_bgdss = new ArrayList();
		for (FirefacilitiesVO data : firefacilities){
			String xfsslx = data.getJbxx_xfsslx();
			String xfssid = data.getJbxx_xfssid();
			switch (xfsslx){
				//安全疏散措施
				case"1000":
					break;
				case"1001":
					List list_1001 = firefacilitiesDAO.doFindAqckList(xfssid);
					for(int i=0;i<list_1001.size();i++){
						aqck.add(list_1001.get(i));
					}
					break;
				case"1002":
					List list_1002 = firefacilitiesDAO.doFindSsltList(xfssid);
					for(int i=0;i<list_1002.size();i++){
						sslt.add(list_1002.get(i));
					}
					break;
				case"1003":
					List list_1003 = firefacilitiesDAO.doFindXfdtList(xfssid);
					for(int i=0;i<list_1003.size();i++){
						xfdt.add(list_1003.get(i));
					}
					break;
				case"1004":
					List list_1004 = firefacilitiesDAO.doFindBncList(xfssid);
					for(int i=0;i<list_1004.size();i++){
						bnc.add(list_1004.get(i));
					}
					break;
				case"1005":
					List list_1005 = firefacilitiesDAO.doFindYjgbList(xfssid);
					for(int i=0;i<list_1005.size();i++){
						yjgb.add(list_1005.get(i));
					}
					break;
				//消防水系统
				case"2000":
					break;
				case"2001":
					List list_2001 = firefacilitiesDAO.doFindXfbfList(xfssid);
					for(int i=0;i<list_2001.size();i++){
						xfbf.add(list_2001.get(i));
					}
					break;
				case"2002":
					List list_2002 = firefacilitiesDAO.doFindXfsxList(xfssid);
					for(int i=0;i<list_2002.size();i++){
						xfsx.add(list_2002.get(i));
					}
					break;
				case"2003":
					List list_2003 = firefacilitiesDAO.doFindXfscList(xfssid);
					for(int i=0;i<list_2003.size();i++){
						xfsc.add(list_2003.get(i));
					}
					break;
				case"2004":
					List list_2004 = firefacilitiesDAO.doFindSnxhsList(xfssid);
					for(int i=0;i<list_2004.size();i++){
						snxhs.add(list_2004.get(i));
					}
					break;
				case"2005":
					List list_2005 = firefacilitiesDAO.doFindSwxhsList(xfssid);
					for(int i=0;i<list_2005.size();i++){
						swxhs.add(list_2005.get(i));
					}
					break;
				case"2006":
					List list_2006 = firefacilitiesDAO.doFindSbjhqList(xfssid);
					for(int i=0;i<list_2006.size();i++){
						sbjhq.add(list_2006.get(i));
					}
					break;
				case"2007":
					List list_2007 = firefacilitiesDAO.doFindPlxtList(xfssid);
					for(int i=0;i<list_2007.size();i++){
						plxt.add(list_2007.get(i));
					}
					break;
				case"2008":
					List list_2008 = firefacilitiesDAO.doFindLqsxtList(xfssid);
					for(int i=0;i<list_2008.size();i++){
						lqsxt.add(list_2008.get(i));
					}
					break;
				case"2009":
					List list_2009 = firefacilitiesDAO.doFindGdspList(xfssid);
					for(int i=0;i<list_2009.size();i++){
						gdsp.add(list_2009.get(i));
					}
					break;
				case"2010":
					List list_2010 = firefacilitiesDAO.doFindBgdssList(xfssid);
					for(int i=0;i<list_2010.size();i++){
						bgdss.add(list_2010.get(i));
					}
					break;
				//泡沫系统
				case"3000":
					break;
				case"3001":
					break;
				case"3002":
					break;
				case"3003":
					break;
				case"3004":
					break;
				case"3005":
					break;
				//蒸汽灭火系统
				case"4000":
					break;
				case"4001":
					break;
				case"4002":
					break;
				//消防控制室
				case"5000":
					break;
				//防排烟设施
				case"6000":
					break;
				case"6001":
					break;
				case"6002":
					break;
				//防火分区
				case"7000":
					break;
				//其他灭火系统
				case"8000":
					break;
				case"8001":
					break;
				case"8002":
					break;
				//其他消防设施
				case"9000":
					break;
			}
		}
		if(!aqck.isEmpty())
			map.put("1001",aqck);
		if (!sslt.isEmpty())
			map.put("1002",sslt);
		if (!xfdt.isEmpty())
			map.put("1003",xfdt);
		if (!bnc.isEmpty())
			map.put("1004",bnc);
		if(!yjgb.isEmpty())
			map.put("1005",yjgb);
		if(!xfbf.isEmpty())
			map.put("2001",xfbf);
		if(!xfsx.isEmpty())
			map.put("2002",xfsx);
		if(!xfsc.isEmpty())
			map.put("2003",xfsc);
		if(!snxhs.isEmpty())
			map.put("2004",snxhs);
		if(!swxhs.isEmpty())
			map.put("2005",swxhs);
		if(!sbjhq.isEmpty())
			map.put("2006",sbjhq);
		if(!plxt.isEmpty())
			map.put("2007",plxt);
		if(!lqsxt.isEmpty())
			map.put("2008",lqsxt);
		if(!gdsp.isEmpty())
			map.put("2009",gdsp);
		if(!bgdss.isEmpty())
			map.put("2010",bgdss);
		return map;
	}
}