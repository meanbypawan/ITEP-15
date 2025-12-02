package com.info.todoapp.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.info.todoapp.entity.Category;
import com.info.todoapp.entity.Task;
import com.info.todoapp.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class TaskDAO {
  public static boolean save(Task task) {
	  EntityManagerFactory factory = JPAUtil.getFactory();
	  EntityTransaction transaction = null;
	  try(EntityManager manager = factory.createEntityManager();) {
		  transaction = manager.getTransaction();
		  transaction.begin();
		  long date =  System.currentTimeMillis();
		  SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		  String createdDate = sd.format(new Date(date));
	      task.setCreatedDate(createdDate);
	      Category category =  manager.find(Category.class, task.getCategoryId());
	      task.setCategory(category);
	      task.setStatus("Pending");
	      manager.persist(task);
	      transaction.commit();
	      return true;
	  }
	  catch(Exception e) {
		  if(transaction!=null && transaction.isActive())
			  transaction.rollback();
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
  }
}









