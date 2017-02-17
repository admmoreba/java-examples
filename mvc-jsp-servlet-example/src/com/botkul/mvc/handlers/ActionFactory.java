package com.botkul.mvc.handlers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
	private static Map<String, Action> actions=new HashMap<>();
	
	static {
		actions.put("POST/accountRegister", new AccountRegisterAction());
		actions.put("GET/accountRegister", new AccountRegisterAction());
		actions.put("GET/accounts", new AccountViewAction());
	}
	
	public static Action getAction(HttpServletRequest request) {
		return actions.get(request.getMethod() + request.getPathInfo());
	}
}
