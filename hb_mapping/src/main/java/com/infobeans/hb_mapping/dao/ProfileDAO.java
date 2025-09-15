package com.infobeans.hb_mapping.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.infobeans.hb_mapping.entity.Profile;
import com.infobeans.hb_mapping.entity.Student;
import com.infobeans.hb_mapping.service.GetSessionFactory;

public class ProfileDAO {
   public static boolean save(Profile p, int studentId) {
	   Transaction transaction = null;
	   SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();
	   try (Session session = sessionFactory.openSession();){
		transaction = session.beginTransaction();
		session.persist(p);   
		//session.flush();
		Student s =  session.get(Student.class, studentId);
	    if(s == null)
	    	throw new RuntimeException();
	    s.setProfile(p);
	    transaction.commit();
	    return true;
	   }
	   catch(Exception e) {
		   if(transaction!=null)
			   transaction.rollback();
		   e.printStackTrace();
	   }
	   return false;
   }
}
