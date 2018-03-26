package com.syfri.digitalplan.controller.yafjxz;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.digitalplan.model.yafjxz.YafjxzVO;
import com.syfri.digitalplan.service.yafjxz.YafjxzService;
import com.syfri.digitalplan.utils.DateUtil;
import com.syfri.digitalplan.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("yafjxz")
public class YafjxzController {

	@Autowired
	private YafjxzService yafjxzService;

	private static final String SFOLDER_NAME = "E://test//upload//";

	/**
	 *上传文件
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/upload")
	@ResponseBody
	public void upload(HttpServletRequest request, HttpServletResponse response
			, com.syfri.digitalplan.model.yafjxz.YafjxzVO yafjxzVO) {
		System.out.println("id:"+yafjxzVO.getYaid());
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Iterator<String> iterator = multipartRequest.getFileNames();

		while (iterator.hasNext()) {
			MultipartFile multipartFile = multipartRequest.getFile(iterator.next());

			// 获取文件名
			String fileName = multipartFile.getOriginalFilename();

			if("".equals(multipartFile.getOriginalFilename())) throw new RuntimeException("文件为空");
			InputStream is = null;
			try {
				is = multipartFile.getInputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 文件上传固定的路径
			StringBuffer relativePath=new StringBuffer(SFOLDER_NAME);
			//新建的文件夹名称（日期+UUID）
			//123456为行政代码
			StringBuffer new_folder=new StringBuffer("123456/").append(DateUtil.NowDateToString("yyyy-MM-dd"))
					.append("/").append(StringUtils.getUUId()).append("/");

			String folderName=relativePath.append(new_folder).toString();
			//创建文件夹
			File dir = new File(folderName);

			if (!dir.exists()) {
				dir.mkdirs();
			}

			// 获取文件的后缀名
			String suffixName = fileName.substring(fileName.lastIndexOf("."));
			//数据库要存的数据
			String dbPath=new_folder.append(fileName).toString();
			System.out.println(dbPath);

			//文件全路径
			StringBuffer allPath=new StringBuffer(folderName).append(fileName);

			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(allPath.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			byte[] b = new byte[1024];
			try {
				while((is.read(b)) != -1){
					fos.write(b);
				}
				if (is != null) {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				fos.close();
				is.close();
				//插入数据
				com.syfri.digitalplan.model.yafjxz.YafjxzVO yafjxz =new com.syfri.digitalplan.model.yafjxz.YafjxzVO();
				yafjxz.setId(StringUtils.getUUId());
				yafjxz.setYaid(yafjxzVO.getYaid());
				yafjxz.setDir(dbPath);
				yafjxz.setExtension(suffixName);
				yafjxz.setRelname(fileName);
				yafjxzService.doInsertByVO(yafjxz);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@RequestMapping(value = "/deleteById")
	public @ResponseBody ResultVO deleteById(@RequestBody String pkid) {
		ResultVO resultVO = ResultVO.build();
		com.syfri.digitalplan.model.yafjxz.YafjxzVO yafjxz=yafjxzService.doFindById(pkid);
		int dr=yafjxzService.doDeleteById(pkid);

		if(dr>0){
			StringBuffer sb=new StringBuffer(SFOLDER_NAME).append(yafjxz.getDir());
			File file=new File(sb.toString());
			if(file.exists()){
				boolean rf=file.delete();
				if(rf){
					resultVO.setMsg("删除成功");
				}
			}
		}
		return resultVO;
	}

	/**
	 *
	 * @param response
	 * @param fileName 文件名称（数据库存的dir字段内容 ）
	 */

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void download(HttpServletResponse response, String fileName) {

//		response.setHeader("content-type", "application/octet-stream");
//		response.setContentType("application/octet-stream");
//		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		response.setHeader("content-type", "text/html");
		response.setContentType("text/html");
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		byte[] buff = new byte[1024];
		BufferedInputStream bis = null;
		OutputStream os = null;
		try {
			os = response.getOutputStream();
			bis = new BufferedInputStream(new FileInputStream(new File(SFOLDER_NAME
					+ fileName)));
			int i = bis.read(buff);
			while (i != -1) {
				os.write(buff, 0, buff.length);
				os.flush();
				i = bis.read(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@RequestMapping(value = "/list")
	@ResponseBody
	public ResultVO list(@RequestBody com.syfri.digitalplan.model.yafjxz.YafjxzVO yafjxzVO) {
		ResultVO resultVO = ResultVO.build();
		List<com.syfri.digitalplan.model.yafjxz.YafjxzVO> yafjxzVOs=yafjxzService.doSearchListByVO(yafjxzVO);
		resultVO.setResult(yafjxzVOs);
		return resultVO;
	}
}