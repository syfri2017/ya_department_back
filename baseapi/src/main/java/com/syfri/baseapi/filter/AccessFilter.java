package com.syfri.baseapi.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import javax.servlet.FilterChain;
@Component
@ServletComponentScan
@WebFilter(filterName = "accessFilter",urlPatterns = "/*")
@Order(value = 1)

public class AccessFilter implements Filter{

	private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);

	protected Environment environment;

	public AccessFilter(Environment environment){
		this.environment = environment;
	}

	public AccessFilter(){};

	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("--- AccessFilter Init ---");
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		filterChain.doFilter(servletRequest, servletResponse);
	}
	public void destroy() {
		logger.info("--- AccessFilter Destroy ---");
	}
}
