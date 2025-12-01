package com.info.todoapp.dao;

import java.util.List;

import com.info.todoapp.entity.Admin;
import com.info.todoapp.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class AdminDAO {
   public static Admin authenticate(Admin admin) {
	   EntityManagerFactory factory = JPAUtil.getFactory();
	   try (EntityManager manager = factory.createEntityManager();){
		  TypedQuery<Admin> query =  manager.createQuery("from Admin where email=:email and password =:password",Admin.class);
	      query.setParameter("email", admin.getEmail());
	      query.setParameter("password", admin.getPassword());
	      List<Admin> list =  query.getResultList();
	      if(list.size() == 0)
	    	  return null;
	      admin = list.get(0);
	      return admin;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	       throw new RuntimeException(e.getMessage());
	   }
   }
} 
