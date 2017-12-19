package com.syfri.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfri.baseapi.service.impl.BaseServiceImpl;
import com.syfri.userservice.dao.MenuDAO;
import com.syfri.userservice.model.MenuVO;
import com.syfri.userservice.service.MenuService;

@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<MenuVO> implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	public MenuDAO getBaseDAO() {
		return menuDAO;
	}
}