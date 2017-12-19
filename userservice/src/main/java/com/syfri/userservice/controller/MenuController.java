package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.MenuVO;
import com.syfri.userservice.service.MenuService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("menu")
public class MenuController  extends BaseController<MenuVO>{

	@Autowired
	private MenuService menuService;

	@Override
	public MenuService getBaseService() {
		return this.menuService;
	}

}
