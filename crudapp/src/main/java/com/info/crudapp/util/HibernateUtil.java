package com.info.crudapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  private static SessionFactory sessionFactory=null;
  public static SessionFactory getFactory() {
	 try { 
	  if(sessionFactory == null) {	 
	   Configuration configuration = new Configuration();
	   configuration.configure();
	   sessionFactory =  configuration.buildSessionFactory();
	  }
	  return sessionFactory;
	 }
	 catch(Exception e) {
		 e.printStackTrace();
		 throw new RuntimeException(e.getMessage());
	 }
  }
}




