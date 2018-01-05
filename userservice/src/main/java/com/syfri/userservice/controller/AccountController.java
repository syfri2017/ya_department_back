package com.syfri.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syfri.userservice.model.AccountVO;
import com.syfri.userservice.service.AccountService;
import com.syfri.baseapi.controller.BaseController;

@RestController
@RequestMapping("account")
public class AccountController  extends BaseController<AccountVO>{

	@Autowired
	private AccountService accountService;

	@Override
	public AccountService getBaseService() {
		return this.accountService;
	}

}
