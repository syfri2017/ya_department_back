package com.syfri.digitalplan.service.impl.auxiliarydecision.firecalculation;

import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.digitalplan.dao.auxiliarydecision.firecalculation.FirecalculationlistDAO;
import com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO;
import com.syfri.digitalplan.service.auxiliarydecision.firecalculation.FirecalculationlistService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(rollbackFor = {Exception.class, RuntimeException.class})
@Service("firecalculationlistService")
public class FirecalculationlistServiceImpl extends BaseServiceImpl<FirecalculationlistVO> implements FirecalculationlistService {

	@Autowired
	private FirecalculationlistDAO firecalculationlistDAO;

	@Override
	public FirecalculationlistDAO getBaseDAO() {
		return firecalculationlistDAO;
	}

	/**
	 * @Description: 条件查询：火场计算查询.
	 * @Param: [firecalculationlistVO]
	 * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationlistVO>
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/24 16:37
	 */
	@Override
	public List<FirecalculationlistVO> doFindlist(FirecalculationlistVO firecalculationlistVO){
		//公式名称
		if(firecalculationlistVO.getGsmc()!=null && !"".equals(firecalculationlistVO.getGsmc())){
			firecalculationlistVO.setGsmc(firecalculationlistVO.getGsmc().toLowerCase());
		}
		return firecalculationlistDAO.doSearchByVO(firecalculationlistVO);
	}

	/**
	 * @Description: 条件查询：根据公式id查询参数信息
	 * @Param: [gsid]
	 * @Return: java.util.List<com.syfri.digitalplan.model.auxiliarydecision.firecalculation.FirecalculationparamVO>
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/27 10:02
	 */
	@Override
	public List<FirecalculationparamVO> doFindCsById(String gsid){
		return firecalculationlistDAO.doFindCsById(gsid);
	}

	/*----*/
	/**
	 * @Description: 删除：删除公式同时删除其参数.
	 * @Param: [uuid]
	 * @Return: void
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/27 10:03
	 */
	@Override
	public void doDeleteJsgsCs(String uuid){
		//输出公式表
		firecalculationlistDAO.doDeleteById(uuid);
		//删除对应参数表
		firecalculationlistDAO.doDeleteJsgsCsBatch(uuid);
	}

	/**
	 * @Description: 新增：增加公式并增加参数.
	 * @Param: [firecalculationlistVO]
	 * @Return: int
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/27 10:08
	 */
	@Override
	public int doInsertJsgsCs(FirecalculationlistVO firecalculationlistVO){

		//向公式表ZHJC_JSGS中增加数据
		firecalculationlistDAO.doInsertByVO(firecalculationlistVO);

		//向参数表ZHJC_JSGS_CS中增加数据
		firecalculationlistDAO.doInsertCsByVO(firecalculationlistVO.getUuid(),firecalculationlistVO.getFirecalculationparams());

		return 1;
	}

	/**
	 * @Description: 修改：修改公式并更新参数.
	 * @Param: [firecalculationlistVO]
	 * @Return: int
	 * @Author: dongbo
	 * @Modified By:
	 * @Date: 2018/4/27 10:08
	 */
	@Override
	public int doUpdateJsgsCs(FirecalculationlistVO firecalculationlistVO){

		//向公式表ZHJC_JSGS中更新数据
		firecalculationlistDAO.doUpdateByVO(firecalculationlistVO);

		//向参数表ZHJC_JSGS_CS中更新数据
		List<FirecalculationparamVO> params = firecalculationlistVO.getFirecalculationparams();
		for(FirecalculationparamVO param : params) {
			firecalculationlistDAO.doUpdateCsByVO(param);
		}

		return 1;
	}
}