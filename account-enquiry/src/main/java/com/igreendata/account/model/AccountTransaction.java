package com.igreendata.account.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="account_transactions")
public class AccountTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private Date transactionDate;
	private BigDecimal transactionAmount;
	private String transactionType;
	private String transactionRemarks;
	private int userId;
	
	@ManyToOne(fetch=FetchType.LAZY)	
	@JoinColumn(name="ACCOUNT_NO")
	@JsonManagedReference
	private UserAccount userAccount;
	
	public AccountTransaction() {
		
	}

	public AccountTransaction(Date transactionDate, BigDecimal transactionAmount, String transactionType,
			String transactionRemarks, int userId, UserAccount userAccount) {
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
		this.transactionRemarks = transactionRemarks;
		this.userId = userId;
		this.userAccount = userAccount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
}
