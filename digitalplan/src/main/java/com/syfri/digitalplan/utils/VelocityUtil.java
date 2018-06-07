package com.syfri.digitalplan.utils;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.net.URLEncoder;  
import java.util.Properties;  

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.velocity.Template;  
import org.apache.velocity.VelocityContext;  
import org.apache.velocity.app.VelocityEngine;
import org.springframework.util.ClassUtils;

public class VelocityUtil {
    private static final Object LOCK = new Object();  
    
    /** 
     * word文件 
     */  
    public static final int WORD_FILE = 1;  
    /** 
     * excel文件 
     */  
    public static final int EXCEL_FILE = 2;  
      
    private static VelocityEngine ve;  
      
    private static VelocityUtil v ;  
      
    private VelocityUtil(String templateFolder) {  
        Properties properties = new Properties();  
        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, templateFolder);  
        ve = new VelocityEngine();  
        ve.init(properties);  
        ve.init();  
    }  
 
   private static void check(HttpServletRequest request) {  
       if (v == null) {  
           synchronized (LOCK) {
               //tomcat下
               //v = new VelocityUtil(request.getServletContext().getRealPath("/")+"templates");
               //springboot下
               v = new VelocityUtil(ClassUtils.getDefaultClassLoader().getResource("").getPath()+"templates");
           }
       }  
        
   }  
 
 
   /** 
    * 创建 word 文档 
    * 必须先设置response导出配置，然后解析模版，否则会出问题 
    * @throws IOException  
    */  
   public static void createDoc(String templateName, VelocityContext vc,HttpServletRequest request, HttpServletResponse response,String docFileName,int fileType) throws IOException {  
 //    response.resetBuffer();  
         
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
         
         
       //解析模版  
       check(request);  
       Template template = ve.getTemplate(templateName, "UTF-8");  
       PrintWriter write = response.getWriter();  
       template.merge(vc, write);  
         
         
       if(write != null){  
           write.flush();  
           write.close();  
       }  
   }  
}
