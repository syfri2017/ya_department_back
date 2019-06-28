package com.syfri.digitalplan.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Yafjxz相关配置
 *
 * @author lixiaoyang
 * @date 2018-04-20 9:23
 */
@Configuration
@ConfigurationProperties(prefix = YafjxzProperties.YAFJXZ_PREFIX)
public class YafjxzProperties {

    public static final String  YAFJXZ_PREFIX = "yafjxz";

    private String savePath = "E://test//upload//";

    private String zipPath="E://test//upload//";
    //路径最后必须有斜杠
    private String fileServerUrl= "http://localhost:80/";

    private String vueServerUrl= "http://localhost:80/";

    private String ipPort= "http://10.119.119.232:11010";
    private String action= "/attachment/filemanage/configFile!showFile.action";
    private int maxSize= 100;
    private String baseDir= "E://ya/";
    public String getIpPort() {
        return ipPort;
    }

    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getVueServerUrl() {
        return vueServerUrl;
    }

    public void setVueServerUrl(String vueServerUrl) {
        this.vueServerUrl = vueServerUrl;
    }

    public static String getYafjxzPrefix() {
        return YAFJXZ_PREFIX;
    }

    public String getFileServerUrl() {
        return fileServerUrl;
    }

    public void setFileServerUrl(String fileServerUrl) {
        this.fileServerUrl = fileServerUrl;
    }

    public String getZipPath() {
        return zipPath;
    }

    public void setZipPath(String zipPath) {
        this.zipPath = zipPath;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
