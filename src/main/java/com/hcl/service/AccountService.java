package com.hcl.service;

import com.hcl.dto.AccountRequestDTO;
import com.hcl.entity.Account;

public interface AccountService {

	Account createAccount(AccountRequestDTO accountRequestDTO);

}
