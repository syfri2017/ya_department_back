package com.syfri.digitalplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

	@Autowired
	protected Environment environment;

	@RequestMapping("index")
	public String index(){
		return "index";
	}

	@RequestMapping("getPath")
	public String getPath(){
		if (environment.containsProperty("server.context-path")) {
			return environment.getProperty("server.context-path");
		}else{
			return "";
		}
	}
}
