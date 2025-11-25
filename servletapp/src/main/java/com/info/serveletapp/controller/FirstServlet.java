package com.info.serveletapp.controller;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet{
    ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method Called.....");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	  System.out.println("Init Method Called......");
	  this.config = config;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("Service Method Called............");
	    String m1 = config.getInitParameter("m1");
	    String m2 = config.getInitParameter("m2");
	    System.out.println("M1 : "+m1);
	    System.out.println("M2 : "+m2);
	    
	    ServletContext context =  config.getServletContext();
	    String message = context.getInitParameter("Global_Message");
	    String message2 = context.getInitParameter("Global_Message_2");
	    System.out.println(message);
	    System.out.println(message2);
	}
  
}







