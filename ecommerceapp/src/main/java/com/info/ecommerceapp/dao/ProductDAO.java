package com.info.ecommerceapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.ecommerceapp.entity.Category;
import com.info.ecommerceapp.entity.Product;
import com.info.ecommerceapp.util.HibernateUtil;

public class ProductDAO {
	public static Product findById(int id) {
		   Product p = null;
		   SessionFactory sessionFactory = HibernateUtil.getFactory();
		   try (Session session = sessionFactory.openSession();){
			 p =  session.get(Product.class, id);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   return p;
	   }
   public static boolean save(Product p) {
	   SessionFactory sessionFactory = HibernateUtil.getFactory();
	   try (Session session = sessionFactory.openSession();){
		   Transaction transaction = session.beginTransaction();
		   session.persist(p);
		   transaction.commit();
		   return true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return false;
   }
}
