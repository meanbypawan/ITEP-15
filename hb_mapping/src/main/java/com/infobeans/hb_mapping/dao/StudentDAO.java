package com.infobeans.hb_mapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.infobeans.hb_mapping.entity.Student;
import com.infobeans.hb_mapping.service.GetSessionFactory;


public class StudentDAO {
  public static boolean save(Student s) {
	 try {
		 SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();
		 Session session =  sessionFactory.openSession();
	     Transaction transaction =  session.beginTransaction();
		 session.persist(s);
		 transaction.commit();
		 session.close();
		 GetSessionFactory.shutDown(sessionFactory);
	     return true;
	 }
	 catch(Exception e) {
		 e.printStackTrace();
		 return false;
	 }
  }
}
