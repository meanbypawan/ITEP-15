package com.info.todoapp.util;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AuthFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
	  HttpServletRequest request = (HttpServletRequest)req;
	  HttpServletResponse response = (HttpServletResponse)res;
      HttpSession session = request.getSession();
      Object loginStatus =  session.getAttribute("isLoggedIn");
	  if(loginStatus !=null) {
		  chain.doFilter(request, response);
	  }
	  else
		 response.sendRedirect("index.jsp");  
	}

}





















