package com.info.todoapp.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
  private static EntityManagerFactory factory = null;
  public static EntityManagerFactory getFactory() {
	  try {
		  if(factory == null)
			  factory = Persistence.createEntityManagerFactory("todo-persistence");
	      return factory;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
  }
}
