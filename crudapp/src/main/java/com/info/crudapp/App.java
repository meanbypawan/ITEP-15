package com.info.crudapp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.crudapp.entity.User;
import com.info.crudapp.util.HibernateUtil;
import com.info.crudapp.util.PasswordHashUtil;

public class App {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Press 1 for user registration..");
				System.out.println("Press 2 for fetch user by id");
				System.out.println("Press 3 for update user");
				System.out.println("Press 4 for delete user");
				System.out.println("Press O for exit");
				System.out.println("Enter Your Choice");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:registerUser();
					break;
				case 2: fetchUserById();
				    break;
				case 3: updateUser();
				    break;
				case 4: deleteUser();
				    break;
				case 0:
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteUser() {
		try (SessionFactory sessionFactory = HibernateUtil.getFactory();
				Session session = sessionFactory.openSession();){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			Transaction transaction = session.beginTransaction();
			User user =  session.get(User.class, id);
		    if(user!=null) {
		    	session.remove(user);
		    	transaction.commit();
		    	System.out.println("User removed..");
		    }
		    else
		    	System.out.println("User not found...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateUser() {
		// Load --> Update ---> Save
		try(SessionFactory sessionFactory = HibernateUtil.getFactory();
				Session session = sessionFactory.openSession();){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user id");
			int id = sc.nextInt();
			
			
			Transaction transaction = session.beginTransaction();
			User user = session.get(User.class, id);
			if(user == null) {
				System.out.println("User not found");
				return;
			}
            System.out.println(user.getName()+" Enter updated name :");
			
			String name = sc.next();
			System.out.println(user.getEmail()+" Enter updated email id");
			
			String emailId = sc.next();
			
			System.out.println(user.getPassword()+" Enter updated password");
			String password = sc.next();
			
			user.setName(name);
			user.setEmail(emailId);
			user.setPassword(password);
			
			session.persist(user);
			transaction.commit();
			System.out.println("Record Updated...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void fetchUserById() {
		try (SessionFactory sessionFactory = HibernateUtil.getFactory();
				Session session = sessionFactory.openSession();){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id");
			int id = sc.nextInt();
			User user =  session.get(User.class, id);
			if(user!=null)
			 System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void registerUser() {
       try (SessionFactory sessionFactory = HibernateUtil.getFactory();
    		   Session session = sessionFactory.openSession();){
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter name");
    	   String name = sc.next();
    	   System.out.println("Enter email id");
    	   String emailId = sc.next();
    	   System.out.println("Enter password");
    	   String password = sc.next();
    	   User user = new User(name, emailId, password);
    	   Transaction transaction = session.beginTransaction();
    	   session.persist(user);
    	   transaction.commit();
    	   System.out.println("Registration Success....");
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}










