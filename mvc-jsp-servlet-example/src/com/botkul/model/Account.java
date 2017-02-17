package com.botkul.model;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Account {
	private long accountNo;
	private String name;
	private String email;
	private BigDecimal balance;
	
	public Account(long accountNo,String name,String email, BigDecimal balance){
		this.accountNo=accountNo;
		this.name=name;
		this.email=email;
		this.balance=balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString(){
		return String.format("AccountNo:%d, Name:%s, Email:%s,Balance:%s",accountNo,name,email, NumberFormat.getCurrencyInstance().format(balance));
	}
}
