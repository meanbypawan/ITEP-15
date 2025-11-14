package com.info.ecommerceapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.info.ecommerceapp.entity.Cart;
import com.info.ecommerceapp.entity.Product;
import com.info.ecommerceapp.entity.User;
import com.info.ecommerceapp.util.HibernateUtil;


public class CartDAO {
  public static String addToCart(int userId, int productId) {
	 String status = ""; 
	 SessionFactory sessionFactory = HibernateUtil.getFactory();
	 Transaction transaction = null;
     try (Session session = sessionFactory.openSession();){
    	transaction = session.beginTransaction(); 
    	User user =  UserDAO.findById(userId);
        if(user!=null) {
          Query<Cart> query = session.createQuery("from Cart where user.id =:userId",Cart.class);
          query.setParameter("userId", userId);
          Cart cart = query.uniqueResult();
          if(cart == null) {
        	  // First time user performing add to cart
        	  Cart c = new Cart();
        	  c.setUser(user);
        	  List<Product> list = new ArrayList<Product>();
        	  Product product = ProductDAO.findById(productId);
        	  if(product == null) {
        		  return "Product not found";
        	  }
        		  
        	  list.add(product);
        	  
        	  c.setProductList(list);
        	  
        	  session.merge(c);
        	  transaction.commit();
        	  status = "Product successfully added in cart";
          }
          else {
        	   List<Product> productList = cart.getProductList();
        	   for(Product p: productList) {
        		   if(p.getId() == productId) {
        		     return "Product is already added in cart";
        		   }
        	   }
        	   
        	   Product p = ProductDAO.findById(productId);
        	   if(p==null) {
        		   status = "Product not found";
        		   return status;
        	   }
        	   productList.add(p);
        	   
        	   cart.setProductList(productList);
        	   session.merge(cart);
        	   transaction.commit();
        	   status = "Product successfully added in cart";
          }
        }
        else 
        	status = "User not found";
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	 return status;
  }
}
