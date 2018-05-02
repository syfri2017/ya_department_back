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

	/**
	 * @Description: 条件查询：预案查询.
	 * @Param: [digitalplanlistVO]
	 * @Return: java.util.List<com.syfri.digitalplan.moel.digitalplan.DigitalplanlistVO>
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/20 16:04
	 */
	@Override
	public List<DigitalplanlistVO> doFindlist(DigitalplanlistVO digitalplanlistVO){
		//预案名称
		if(digitalplanlistVO.getYamc()!=null && !"".equals(digitalplanlistVO.getYamc())){
			digitalplanlistVO.setYamc(digitalplanlistVO.getYamc().toLowerCase());
		}
		//对象名称
		if(digitalplanlistVO.getDxmc()!=null && !"".equals(digitalplanlistVO.getDxmc())){
			digitalplanlistVO.setDxmc(digitalplanlistVO.getDxmc().toLowerCase());
		}
		return digitalplanlistDAO.doSearchByVO(digitalplanlistVO);
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
		digitalplanlistVO.setCjsj(shsj);
		digitalplanlistDAO.doUpdateByVO(digitalplanlistVO);
		return digitalplanlistVO;
	}
}