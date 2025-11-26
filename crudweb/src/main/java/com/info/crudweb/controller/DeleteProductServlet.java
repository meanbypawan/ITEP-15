package com.info.crudweb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.info.crudweb.dao.ProductDAO;

public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    out.print("Delete Product Sevlet");
	    String id = request.getParameter("id");
	    if(ProductDAO.remove(Integer.parseInt(id)))
	    	response.sendRedirect("./ViewProductServlet");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
