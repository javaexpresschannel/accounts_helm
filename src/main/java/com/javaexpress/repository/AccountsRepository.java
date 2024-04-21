package com.javaexpress.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.javaexpress.models.Account;

public interface AccountsRepository extends CrudRepository<Account, Long>{

	Optional<Account> findByCustomerId(Integer custId);
}
