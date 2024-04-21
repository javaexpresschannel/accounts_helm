package com.javaexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.Account;
import com.javaexpress.repository.AccountsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountsService {
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	public Account fetch(Integer customerId) {
		log.info("AccountsService fetch method executed");
		return accountsRepository.findByCustomerId(customerId)
				.orElseThrow(() -> new RuntimeException("Customer Id not found"));
	}

}
