package com.igreendata.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.igreendata.account.exception.InvalidRequestException;
import com.igreendata.account.model.AccountTransaction;
import com.igreendata.account.model.UserAccount;
import com.igreendata.account.repository.AccountRepository;
import com.igreendata.account.repository.AccountTransactionRepository;

@Component
public class AccountEnquiryService {
	
	@Autowired
	AccountRepository accountRepo;
	@Autowired
	AccountTransactionRepository accountTransactionRepo;
	
	//Service method for fetching accounts for the logged in user
	public List<UserAccount> fetchUserAccounts(int userId) {
		return accountRepo.findByUserId(userId);
	}
	
	//Service method for fetching all the transactions for the selected account
	public List<AccountTransaction> fetchAccountTransactions(int accountNo) {
		UserAccount userAccount = accountRepo.findByAccountNo(accountNo);
		if (userAccount == null) {
			throw new InvalidRequestException("The passed in account no is not available");
		}
		return accountTransactionRepo.findByUserAccount(userAccount);
	}
}
