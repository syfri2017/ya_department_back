package com.syfri.digitalplan.service.impl.basicinfo.firedrugsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.basicinfo.firedrugsource.FiredrugDAO;
import com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO;
import com.syfri.digitalplan.service.basicinfo.firedrugsource.FiredrugService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("firedrugService")
public class FiredrugServiceImpl extends BaseServiceImpl<FiredrugVO> implements FiredrugService {

	@Autowired
	private FiredrugDAO firedrugDAO;

	@Override
	public FiredrugDAO getBaseDAO() {
		return firedrugDAO;
	}

	/**
	 * @Description:条件查询：消防药剂
	 * @Param: [firedrugVO]
	 * @Return: java.util.List<com.syfri.digitalplan.model.basicinfo.firedrugsource.FiredrugVO>
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/20 16:55
	 */
	@Override
	public List<FiredrugVO> doFindlist(FiredrugVO firedrugVO){
		//所属队站
		if(firedrugVO.getSsdz()!=null && !"".equals(firedrugVO.getSsdz())){
			String str = firedrugVO.getSsdz().substring(0,2).toString();
			firedrugVO.setSsdz(str);
		}
		//药剂类型
		if(firedrugVO.getYjlx()!=null && !"".equals(firedrugVO.getYjlx())){
			firedrugVO.setYjlx(this.delZero(firedrugVO.getYjlx()));
		}
		return firedrugDAO.doSearchByVO(firedrugVO);
	}
	/**
	 * @Description:删除字符串结尾所有0
	 * @Param: [tempString]
	 * @Return: java.lang.String
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/4/22 21:14
	 */
	public String delZero(String tempString) {
		int initlen = tempString.length(); // 串的初始长度
		int finallen = initlen; // 串的最终长度
		int start = 0; // 串的开始位置
		int off = 0; // 串的偏移位置
		char[] val = new char[initlen];
		tempString.getChars(0, finallen, val, 0); // 保存原数据，用于判断字符

		// 找到以'0'开头的后一位
		// while ((start < finallen) && (val[off + start] == '0')) {
		// start++;
		// }
		// 找到以'0'结尾的前一位
		while ((start < finallen) && (val[off + finallen - 1] == '0')) {
			finallen--;
		}
		return ((start > 0) || (finallen < initlen)) ? tempString.substring(start, finallen)
				: tempString;
	}
}