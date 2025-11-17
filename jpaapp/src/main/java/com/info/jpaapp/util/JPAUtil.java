package com.info.jpaapp.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
   private static EntityManagerFactory factory = null;
   public static EntityManagerFactory getFactory() {
	   try {
		   if(factory == null)
			   factory = Persistence.createEntityManagerFactory("my-persistence-unit");
		   return factory;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   throw new RuntimeException(e.getMessage());
	   }
   }
}
