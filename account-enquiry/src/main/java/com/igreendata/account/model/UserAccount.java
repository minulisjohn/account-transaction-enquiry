package com.igreendata.account.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="user_accounts")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNo;
	private String accountName;
	private String accountType;
	private String currency;
	private int userId;	
	private Date creationDate;
	private int createdBy;
	private BigDecimal availablebalance;
	private Date balanceDate;
	
	@OneToMany(mappedBy = "userAccount", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<AccountTransaction> accountTransactions;
	
	public UserAccount() {

	}

	public UserAccount(String accountName, String accountType, String currency, int userId, Date creationDate,
			int createdBy, BigDecimal availablebalance, Date balanceDate) {
		this.accountName = accountName;
		this.accountType = accountType;
		this.currency = currency;
		this.userId = userId;
		this.creationDate = creationDate;
		this.createdBy = createdBy;
		this.availablebalance = availablebalance;
		this.balanceDate = balanceDate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getAvailablebalance() {
		return availablebalance;
	}

	public void setAvailablebalance(BigDecimal availablebalance) {
		this.availablebalance = availablebalance;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public List<AccountTransaction> getAccountTransactions() {
		return accountTransactions;
	}

	public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
		this.accountTransactions = accountTransactions;
	}

}
