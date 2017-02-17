package com.botkul.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.botkul.mvc.handlers.Action;
import com.botkul.mvc.handlers.ActionFactory;

public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
				Action action=ActionFactory.getAction(request);
				if(action==null) {
					response.setStatus(404);
					throw new ServletException("Requested resource not found!!!");
				}
				
				String view=action.execute(request, response);
				if (view.equals(request.getPathInfo().substring(1))) {
					request.getRequestDispatcher("/WEB-INF/"+ view +".jsp").forward(request, response);
				}
				else {
					response.sendRedirect(view);
				}
			
		} catch (Exception e) {
			throw new ServletException("Executing action failed. ",e);
		}
	} 
}
