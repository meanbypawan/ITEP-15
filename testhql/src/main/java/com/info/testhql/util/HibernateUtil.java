package com.info.testhql.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   private static SessionFactory sessionFactory = null;
   public static SessionFactory getFactory() {
	   try {
		   if(sessionFactory == null)
			   sessionFactory = new Configuration().configure().buildSessionFactory();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   throw new RuntimeException(e.getMessage());
	   }
	   return sessionFactory;
   }
}
