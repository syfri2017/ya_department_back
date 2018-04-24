package com.syfri.digitalplan.utils;

import org.springframework.util.FileCopyUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @Description:
 * @Author: lixiaoyang
 * @Modified By:
 * @Date: 2018/4/20 15:31
 */
public class DownloadUtil {

    /***
     * @Description: 浏览器下载压缩文件
     * @Param: [inputStream, request, response, fileName（文件名，例如：我是压缩文件.zip）]
     * @Return: void
     * @Author: lixiaoayng
     * @Modified By:
     * @Date: 2018/4/20 15:39
     */
    public static void zip(InputStream inputStream, HttpServletRequest request, HttpServletResponse response, String fileName) throws IOException {
        //设置导出

        response.addHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-zip-compressed;charset=UTF-8");

        String ua = request.getHeader("user-agent");
        ua = ua == null ? null : ua.toLowerCase();
        if(ua != null && (ua.indexOf("firefox") > 0 || ua.indexOf("safari")>0)){
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
                response.addHeader("Content-Disposition","attachment;filename=" + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                fileName = URLEncoder.encode(fileName, "utf-8");
                response.addHeader("Content-Disposition","attachment;filename=" + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
