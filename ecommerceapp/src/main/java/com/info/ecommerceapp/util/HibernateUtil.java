package com.info.ecommerceapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  private static SessionFactory factory = null;
  public static SessionFactory getFactory() {
	  try {
		  if(factory == null)
			  factory = new Configuration().configure().buildSessionFactory();
		  return factory; 
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
  }
}
