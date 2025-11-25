package com.info.crudweb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.info.crudweb.dao.AdminDAO;
import com.info.crudweb.model.Admin;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Login Servlet Called........");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    
	    Admin admin = new Admin();
	    admin.setEmail(email);
	    admin.setPassword(password);
	    PrintWriter out = response.getWriter();
	    if(AdminDAO.authenticate(admin)) {
	    	response.sendRedirect("dashboard.html");
	    }
	    else {
	    	out.print("Login Failed | Something wrong..");
	    }
	    
    }

}












