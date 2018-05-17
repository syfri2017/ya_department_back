package com.syfri.digitalplan.service.impl.digitalplan;

import com.syfri.digitalplan.dao.digitalplan.DigitalplanlistDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO;
import com.syfri.digitalplan.service.digitalplan.DigitalplanlistService;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("digitalplanlistService")
public class DigitalplanlistServiceImpl extends BaseServiceImpl<DigitalplanlistVO> implements DigitalplanlistService {

	@Autowired
	private DigitalplanlistDAO digitalplanlistDAO;


	@Override
	public DigitalplanlistDAO getBaseDAO() {
		return digitalplanlistDAO;
	}

	/*
	* 预案审批（更新部分字段）
	* by yushch 20180426
	*/
	public DigitalplanlistVO doApproveUpdate(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String shsj = sdf.format(date);
		digitalplanlistVO.setShsj(shsj);
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
		String shzt = digitalplanlistVO.getShzt();
		String shztmc = digitalplanlistDAO.doFindShztmcByShzt(shzt);
		digitalplanlistVO.setShztmc(shztmc);
		return digitalplanlistVO;
	}

	/**
	 * @Description: 新增：预案
	 * @Param: [digitalplanlistVO]
	 * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/5/2 16:05
	 */
	@Override
	public DigitalplanlistVO doInsertDigitalplan(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String shsj = sdf.format(date);
		digitalplanlistVO.setZzsj(shsj);
		digitalplanlistVO.setDeleteFlag("N");
		digitalplanlistDAO.doInsertByVO(digitalplanlistVO);
		return digitalplanlistVO;
	}

	/**
	 * @Description: 修改：预案
	 * @Param: [digitalplanlistVO]
	 * @Return: com.syfri.digitalplan.model.digitalplan.DigitalplanlistVO
	 * @Author: liurui
	 * @Modified By:
	 * @Date: 2018/5/2 16:05
	 */
	@Override
	public DigitalplanlistVO doUpdateDigitalplan(DigitalplanlistVO digitalplanlistVO){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String shsj = sdf.format(date);
		if(digitalplanlistVO.getYazt().equals("03")){
			digitalplanlistVO.setZzsj(shsj);
		}else if(digitalplanlistVO.getYazt().equals("01")){
			digitalplanlistVO.setXgsj(shsj);
		}
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
		return digitalplanlistVO;
	}
}