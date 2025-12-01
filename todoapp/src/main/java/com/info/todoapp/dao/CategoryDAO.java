package com.info.todoapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.info.todoapp.entity.Category;
import com.info.todoapp.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class CategoryDAO {
  public static boolean delete(Category category) {
	  EntityManagerFactory factory = JPAUtil.getFactory();
		EntityTransaction transaction = null;
	    try (EntityManager manager = factory.createEntityManager();){
	    	transaction = manager.getTransaction();
	    	transaction.begin();
	    	Category cat  = manager.find(Category.class, category.getId());
	    	if(cat!=null) {
	     	 manager.remove(cat);
	    	 transaction.commit();
	    	 return true;
	    	}
	    	throw new RuntimeException("Requested resource not found..");
	    }
	    catch(Exception e) {
	    	if(transaction !=null && transaction.isActive())
	    		transaction.rollback();
	    	e.printStackTrace();
	    	throw new RuntimeException(e.getMessage());
	    }  
  }
  public static List<Category> getList(){
      EntityManagerFactory factory = JPAUtil.getFactory();
	  try(EntityManager manager = factory.createEntityManager();) {
		 TypedQuery<Category> query = manager.createQuery("from Category",Category.class);
	     return query.getResultList();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
  }
  public static boolean save(Category category) {
    EntityManagerFactory factory = JPAUtil.getFactory();
	EntityTransaction transaction = null;
    try (EntityManager manager = factory.createEntityManager();){
    	transaction = manager.getTransaction();
    	transaction.begin();
    	manager.persist(category);
    	transaction.commit();
    	return true;
    }
    catch(Exception e) {
    	if(transaction !=null && transaction.isActive())
    		transaction.rollback();
    	e.printStackTrace();
    	throw new RuntimeException(e.getMessage());
    }
  }
}










