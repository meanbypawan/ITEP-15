package com.info.testhql;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.testhql.entity.User;
import com.info.testhql.util.HibernateUtil;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;


public class App {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Press 1 for insertion...");
				System.out.println("Press 2 for fetch all users");
				System.out.println("Press 3 for fetch by id");
				System.out.println("Press 4 for login..");
				System.out.println("Press 0 for exit...");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					insert();
					break;
				case 2: fetchAll();break;		
				case 3: fetchById();break;
				case 4: login();break;
				case 0:
					System.exit(0);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void login() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		try(Session session = sessionFactory.openSession();) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter email id");
			String email = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			TypedQuery<User> query =  session.createQuery("from User where email=:email and password=:password",User.class);
		    query.setParameter("email", email);
		    query.setParameter("password", password);
		    User user = query.getSingleResult();
		    System.out.println("Login Success....");
		}
		catch(NoResultException nre) {
			System.out.println("Invalid email and password");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void fetchById() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		try(Session session = sessionFactory.openSession();) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter user id");
		  int userKiId = sc.nextInt();
		  TypedQuery<User> query=session.createQuery("from User where id=:userId",User.class);
		  query.setParameter("userId", userKiId);
		  User user =  query.getSingleResult();
		  System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    public static void fetchAll() {
    	SessionFactory sessionFactory = HibernateUtil.getFactory();
    	try (Session session = sessionFactory.openSession();){
    		TypedQuery<User> query =  session.createQuery("from User",User.class);
    	    List<User> userList =  query.getResultList();
    	    for(User user : userList)
    	    	System.out.println(user.getId()+" "+ user.getName()+"  "+user.getEmail());
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	public static void insert() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession();) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter email id");
			String email = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			transaction = session.beginTransaction();
			User user = new User();
			user.setEmail(email);
			user.setName(name);
			user.setPassword(password);
			session.persist(user);
			transaction.commit();
			System.out.println("User saved...");
		} catch (Exception e) {
			if (transaction != null && transaction.isActive())
				transaction.rollback();
			e.printStackTrace();
		}
	}
}
