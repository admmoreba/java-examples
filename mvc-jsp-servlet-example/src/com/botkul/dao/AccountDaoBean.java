package com.botkul.dao;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.botkul.model.Account;
public class AccountDaoBean implements AccountDao {
	public static Map<Long, Account> accounts=new HashMap<>();
	
	static {
		accounts.put(1L,new Account(1L,"Balaji","balaji.more@synechron.com",new BigDecimal(1000)));
		accounts.put(2L,new Account(2L,"Ira","ira.more@botkul.com",new BigDecimal(2000)));
	}
	
	@Override
	public Account find(long accountNo) {
		return accounts.get(accountNo);
	}

	@Override
	public Collection<Account> findAll() {
		return Collections.unmodifiableCollection(accounts.values());
	}

	@Override
	public Account save(Account account) {
		accounts.put(account.getAccountNo(), account);
		return account;
	}

	@Override
	public void delete(Account account) {
		accounts.remove(account.getAccountNo());
	}
}
