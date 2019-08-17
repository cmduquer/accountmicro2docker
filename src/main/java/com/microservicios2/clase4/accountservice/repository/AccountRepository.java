package com.microservicios2.clase4.accountservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservicios2.clase4.accountservice.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	List<Account> findAllByCustomerId(Integer customerId);
	
	List<Account> findAllByAccountType(String accountType);
	
	List<Account> findByBank(String bank);
	
	Account findAccountByAccountId(Integer accountId);
}