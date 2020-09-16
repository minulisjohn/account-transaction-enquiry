package com.igreendata.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.igreendata.account.model.AccountTransaction;
import com.igreendata.account.model.UserAccount;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Integer>{
	
	@Query(
			value = "SELECT UA.ACCOUNT_NO, UA.ACCOUNT_NAME, UA.BALANCE_DATE, UA.CURRENCY,"
					+ "CASE WHEN AT.TRANSACTION_TYPE = 'DR'"
					+ "THEN AT.TRANSACTION_AMOUNT "
					+ "END AS DR_AMOUNT,"
					+ "CASE WHEN AT.TRANSACTION_TYPE = 'CR'"
					+ "THEN AT.TRANSACTION_AMOUNT "
					+ "END AS CR_AMOUNT,"
					+ "AT.TRANSACTION_TYPE,AT.TRANSACTION_REMARKS"
					+ "FROM USER_ACCOUNTS UA, ACCOUNT_TRANSACTIONS AT "
					+ "WHERE UA.ACCOUNT_NO=AT.ACCOUNT_NO"
					+ "AND UA.ACCOUNT_NO=?1",
			nativeQuery = true)
	public List<Object> findByAccountNo(int accountNo);
	
	public List<AccountTransaction> findByUserAccount(UserAccount userAccount);
}
