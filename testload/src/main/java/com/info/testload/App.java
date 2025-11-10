package com.info.testload;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.testload.entity.User;
import com.info.testload.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for insert");
			System.out.println("Press 2 for fetch user");
			System.out.println("Press 0 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				fetch();
				break;
			case 0:
				System.exit(0);
			}
		}
	}
    public static void fetch() {
    	SessionFactory sessionFactory  = HibernateUtil.getFactory();
    	try (Session session = sessionFactory.openSession();){
    	 	//User user =  session.load(User.class, 1); // user : {}
    		//System.out.println(user.getEmail());  
    	 	User user = session.load(User.class, 10);
    	 	System.out.println(user);  
    	 	
    	 	//System.out.println(user);
    		/*
    		User user = session.get(User.class, 1); // Database operation
    	 	System.out.println(user.getName()+"  "+user.getEmail());
    	 	
    	 	User user2 = session.get(User.class, 1); // 
    	 	System.out.println(user2.getName()+"  "+user2.getEmail());
    	 	*/
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	public static void insert() {
		Scanner sc = new Scanner(System.in);
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession();) {
			transaction = session.beginTransaction();
			System.out.println("Enter name");
			String name = sc.next();

			System.out.println("Enter email id");
			String email = sc.next();

			System.out.println("Enter aadhar no");
			String aadharNo = sc.next();

			System.out.println("Enter password");
			String password = sc.next();

			User user = new User();
			user.setEmail(email);
			user.setName(name);
			user.setAadharNo(aadharNo);
			user.setPassword(password); // Transient

			session.persist(user); // Persistant
			user.setName("Hello...."); // Datanse reflect
			transaction.commit();
			System.out.println("Record Inserted...");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null && transaction.isActive())
				transaction.rollback();
		}
	}
}
