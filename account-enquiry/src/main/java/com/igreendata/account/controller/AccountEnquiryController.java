package com.igreendata.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.igreendata.account.model.AccountTransaction;
import com.igreendata.account.model.UserAccount;
import com.igreendata.account.service.AccountEnquiryService;


@RestController
public class AccountEnquiryController {
	
	@Autowired
	AccountEnquiryService accountEnquiryService;
	
	// Controller method for fetching all the accounts for the logged in user
	@GetMapping("/accounts/user/{userId}")
	public List<UserAccount> userAccounts(@PathVariable int userId) {
		return accountEnquiryService.fetchUserAccounts(userId);
		
	}
	
	// Controller method for fetching all the transactions for the selected account
	@GetMapping("/transactions/account/{accountNo}")
	public List<AccountTransaction> accountTransactions(@PathVariable int accountNo) {
		return accountEnquiryService.fetchAccountTransactions(accountNo);
		
	}
	
}
