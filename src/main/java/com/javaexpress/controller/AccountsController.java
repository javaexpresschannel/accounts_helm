package com.javaexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.models.Account;
import com.javaexpress.service.AccountsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/accounts")
public class AccountsController {

	@Autowired
	private AccountsService accountsService;
	
	@GetMapping("/{customerId}")
	public Account fetchAccountDetails(@PathVariable Integer customerId) {
		log.info("AccountsController fetchAccountDetails {} ",customerId);
		return accountsService.fetch(customerId);
	}
}
