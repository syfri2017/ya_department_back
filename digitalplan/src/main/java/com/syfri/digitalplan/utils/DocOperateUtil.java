package com.syfri.digitalplan.utils;

import org.springframework.util.FileCopyUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
/**
 * Download Excel Util
 */
public class DocOperateUtil {
    /** 
     * word文件 
     */  
    public static final int WORD_FILE = 1;  
    /** 
     * excel文件 
     */  
    public static final int EXCEL_FILE = 2;  
    
    /** 
     * 创建文档 
     * 必须先设置response导出配置，然后解析模版，否则会出问题 
     * @throws IOException  
     */  
    public static void downloadDoc(InputStream inputStream,HttpServletRequest request, HttpServletResponse response,String docFileName,int fileType) throws IOException {  
        //设置导出  
          
        response.addHeader("Cache-Control","no-cache");  
        response.setCharacterEncoding("UTF-8");  
        if( WORD_FILE == fileType){  
            response.setContentType("application/vnd.ms-word;charset=UTF-8");  
        }else if(EXCEL_FILE == fileType){  
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");  
        }else{  
            response.setContentType("application/octet-stream");  
        }  
          
         
        String ua = request.getHeader("user-agent");  
        ua = ua == null ? null : ua.toLowerCase();  
        if(ua != null && (ua.indexOf("firefox") > 0 || ua.indexOf("safari")>0)){  
            try {  
                docFileName = new String(docFileName.getBytes(),"ISO8859-1");  
                 response.addHeader("Content-Disposition","attachment;filename=" + docFileName);  
            } catch (Exception e) {  
                e.printStackTrace();
            }  
        }else{  
            try {  
                docFileName = URLEncoder.encode(docFileName, "utf-8");  
                response.addHeader("Content-Disposition","attachment;filename=" + docFileName);  
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
