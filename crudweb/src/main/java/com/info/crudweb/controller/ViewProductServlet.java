package com.info.crudweb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.info.crudweb.dao.ProductDAO;
import com.info.crudweb.model.Product;

public class ViewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ViewProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  out.print("<html>");
	  out.print("<body>");
	  out.print("  <a href='add_product.html'>Add product</a>&nbsp;&nbsp;&nbsp;\n"
	  		+ "  <a href='./ViewProductServlet'>View product</a>");
	  ArrayList<Product> list =  ProductDAO.getProductList();
	  out.print("<table border='1' width='100%'>");
	  out.print("<tr>");
	  out.print("<td>Id</td>");
	  out.print("<td>Title</td>");
	  out.print("<td>Brand</td>");
	  out.print("<td>Price</td>");
	  out.print("<td>Edit</td>");
	  out.print("<td>Delete</td>");
	  out.print("</tr>");
	  for(Product p : list) {
		  out.print("<tr>");
		  out.print("<td>"+p.getId()+"</td>");
		  out.print("<td>"+p.getTitle()+"</td>");
		  out.print("<td>"+p.getBrand()+"</td>");
		  out.print("<td>"+p.getPrice()+"</td>");
		  out.print("<td><button>Edit</button></td>");
		  out.print("<td><a href='./DeleteProductServlet?id="+p.getId()+"'><button>Delete</button></a></td>");
		  out.print("</tr>");
		     
	  }
	  out.print("</table>");
	  out.print("</body>");
	  out.print("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
