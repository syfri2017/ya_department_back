package com.syfri.digitalplan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Param:
 * @Return:
 * @Author: liurui
 * @Modified By:
 * @Date: 2018/5/10 17:55
 */
@Component
@ConfigurationProperties(prefix = "share")
public class ShareConfig {

	private String urlPrefix;
	private String zddwPostfix;
    private String zddwTemplateNamePrefix;

    public String getUrlPrefix() {
        return urlPrefix;
    }

    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix;
    }

    public String getZddwPostfix() {
        return zddwPostfix;
    }

    public void setZddwPostfix(String zddwPostfix) {
        this.zddwPostfix = zddwPostfix;
    }

    public String getZddwTemplateNamePrefix() {
        return zddwTemplateNamePrefix;
    }

    public void setZddwTemplateNamePrefix(String zddwTemplateNamePrefix) {
        this.zddwTemplateNamePrefix = zddwTemplateNamePrefix;
    }
}
