package com.igreendata.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igreendata.account.model.UserAccount;

@Repository
public interface AccountRepository extends JpaRepository<UserAccount, Integer>{
	
	public List<UserAccount> findByUserId(int userId);
	public UserAccount findByAccountNo(int accountNo);
	
}
