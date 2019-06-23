package com.hcl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.AccountRequestDTO;
import com.hcl.entity.Account;
import com.hcl.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService  {
@Autowired
AccountRepository accountRepository;
	@Override
	public Account createAccount(AccountRequestDTO accountRequestDTO) {
		Account account=new Account();
		BeanUtils.copyProperties(accountRequestDTO, account);
		return accountRepository.save(account) ;

		
	}

}
