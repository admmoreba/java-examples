package com.botkul.dao;

import java.util.Collection;

import com.botkul.model.Account;

public interface AccountDao {
	public Account find(long accountNo);
	public Collection<Account> findAll();
	public Account save(Account account);
	public void delete(Account account);
}
