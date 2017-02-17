package com.botkul.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Accounts {
	List<Account> accounts=new ArrayList<>();

	public Accounts(Collection<Account> accounts){
		this.accounts=(List<Account>) accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
