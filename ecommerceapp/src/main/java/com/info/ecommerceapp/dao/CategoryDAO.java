package com.info.ecommerceapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.ecommerceapp.entity.Category;
import com.info.ecommerceapp.util.HibernateUtil;

public class CategoryDAO {
   public static boolean save(Category category) {
	   SessionFactory sessionFactory = HibernateUtil.getFactory();
	   try (Session session = sessionFactory.openSession();){
		   Transaction transaction = session.beginTransaction();
		   session.persist(category);
		   transaction.commit();
		   return true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return false;
   }
}
