package com.syfri.userservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Userservice程序启动类
 *
 * @author lixiaoyang
 * @date 2018年6月20日09:00:42
 */
public class UserserviceServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(UserserviceApplication.class);
    }

}
