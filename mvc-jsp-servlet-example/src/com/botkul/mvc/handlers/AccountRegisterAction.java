package com.botkul.mvc.handlers;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.botkul.dao.AccountDao;
import com.botkul.dao.AccountDaoBean;
import com.botkul.model.Account;

public class AccountRegisterAction implements Action {
	AccountDao accountDao=new AccountDaoBean();
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String accountNo=request.getParameter("accountNo");
		
		if (accountNo!=null) {
			Account account=new Account(Long.valueOf(accountNo), request.getParameter("name"),
					request.getParameter("email"), new BigDecimal(request.getParameter("balance")));
			accountDao.save(account);
			return "accounts";
		}
		else {
			return "accountRegister";
		}
	}

}
