package com.hcl.service;

import com.hcl.dto.TransactionReqDTO;
import com.hcl.entity.Transaction;

public interface TransactionService {
	 FundTransaferResponse fundTransfer(TransactionReqDTO transactionReqDTO);

}
