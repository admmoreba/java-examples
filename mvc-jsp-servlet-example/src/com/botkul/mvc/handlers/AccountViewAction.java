package com.botkul.mvc.handlers;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.botkul.dao.AccountDao;
import com.botkul.dao.AccountDaoBean;
import com.botkul.model.Account;

public class AccountViewAction implements Action {
	AccountDao accountDao=new AccountDaoBean(); 
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String accountNo=request.getParameter("acno");
		
		if(accountNo!=null){
			Account account= accountDao.find(Long.valueOf(accountNo));
			if(account!=null){
				
				//Accounts accounts=new Accounts(Arrays.asList(account));
				request.setAttribute("accounts", Arrays.asList(account));
				return "accounts";
			}
			else {
				request.setAttribute("error", "Unknown Account Number. Please check and try again");
				return "accounts";
			}
		}
		else {
			request.setAttribute("accounts", accountDao.findAll());
			return "accounts";
		}
	}
}
