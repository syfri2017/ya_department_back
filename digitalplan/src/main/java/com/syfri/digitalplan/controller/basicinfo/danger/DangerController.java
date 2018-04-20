package com.syfri.digitalplan.controller.basicinfo.danger;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.digitalplan.dao.basicinfo.danger.DangerDAO;
import com.syfri.digitalplan.utils.Base64ImageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import com.syfri.digitalplan.model.basicinfo.danger.DangerVO;
import com.syfri.digitalplan.service.basicinfo.danger.DangerService;
import com.syfri.baseapi.controller.BaseController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 获取路径Controller
 * by dongbo 2018/03/26
 */

@RestController
@RequestMapping("danger")
public class DangerController  extends BaseController<DangerVO>{

	@Autowired
	protected Environment environment;

	@Autowired
	private DangerService dangerService;

	@Autowired
	private DangerDAO dangerDAO;

	@Override
	public DangerService getBaseService() {
		return this.dangerService;
	}

	@ModelAttribute
	public void Model(Model model){
		if (environment.containsProperty("server.context-path")) {
			model.addAttribute("contextPath", environment.getProperty("server.context-path"));
		}else{
			model.addAttribute("contextPath", "/");
		}
	}

	@GetMapping("")
	public String getUser(Model model, @RequestParam(value="index") String index){
		model.addAttribute("index", index);
		return "basicinfo/danger_list";
	}

	/**
	 * 根据条件获取化学危险品信息
	 */
	@ApiOperation(value="根据条件获取化学危险品信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="化学危险品对象")
	@PostMapping("/findByVO")
	public @ResponseBody ResultVO findByVO(@RequestBody DangerVO dangerVO){
		ResultVO resultVO = ResultVO.build();
		try{
			List<DangerVO> result = dangerService.doFindlist(dangerVO);
			resultVO.setResult(result);
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 跳转到化危品详情页
	 */
	@ApiOperation(value="跳转到化危品详情页",notes="页面跳转")
	@GetMapping("/detail/{pkid}")
	public String getDetailPage(Model model, @PathVariable String id){
//		model.addAttribute("index", index);
		model.addAttribute("id", id);
		return "basicinfo/danger_detail";
	}

	@ApiOperation(value="根据id获取化学危险品信息",notes="列表信息")
	@GetMapping("/doFindById/{ID}")
	public @ResponseBody ResultVO getDetail(@PathVariable String ID){
		ResultVO resultVO = ResultVO.build();
		try{
			DangerVO result = dangerService.doFindById(ID);
			//将二进制转为Base64格式字符串
			String photo64 = Base64ImageUtil.byteArr2String(result.getFlagFile());
			result.setPhoto64(photo64);
			resultVO.setResult(result);
		}catch (Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 附件上传
	 *
	 *      主表Id
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@ApiOperation(value="根据条件获取化学危险品信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="化学危险品对象")
	@RequestMapping("/insertImage")
	public @ResponseBody Map<String, Object> uploadAttachment(HttpServletRequest request)
			throws UnsupportedEncodingException {
		Map<String, Object> result = new HashMap<String, Object>();

		/*MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 获得文件
		MultipartFile multipartFile = multipartRequest.getFile("Filedata");// 与前端设置的fileDataName属性值一致
		String filename = multipartFile.getOriginalFilename();// 文件名称
		InputStream is = null;
		try {
			//读取文件流
			is = multipartFile.getInputStream();
			byte[] bytes = FileCopyUtils.copyToByteArray(is);
			DangerVO blobField = new DangerVO();
			blobField.setFlagFile(bytes);
			//保存blob字段
			this.testService.save(blobField, testId, filename);
			result.put("flag", true);
			result.put("attachmentId", blobField.getId());
			result.put("attachmentNa " +
					"  me", filename);
		} catch (IOException e) {
			e.printStackTrace();
			result.put("flag", false);
		} finally {
			IOUtils.closeQuietly(is);
		}*/
		int res = 0;
		try {
			byte[] buffer = null;
			File file = new File("d:/1.png");
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] b = new byte[1024];
			int n;
			while ((n = fis.read(b)) != -1)
			{
				bos.write(b, 0, n);
			}
			fis.close();
			bos.close();
			buffer = bos.toByteArray();

			DangerVO dangerVO=new DangerVO();
			dangerVO.setFlagFile(buffer);

			dangerDAO.doInsertImg(dangerVO);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
