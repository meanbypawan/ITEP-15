package com.info.jpaapp;

import java.util.List;
import java.util.Scanner;

import com.info.jpaapp.entity.StudentCourse;
import com.info.jpaapp.entity.StudentCourseKey;
import com.info.jpaapp.entity.User;
import com.info.jpaapp.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        try {
          while(true) { 	
           System.out.println("Press 1 for save");
           System.out.println("Press 2 for login");
           System.out.println("Press 3 for fetch by id");
           System.out.println("Press 4 for testing second level cache..");
           System.out.println("Press 5 for insert student course");
           System.out.println("Press 0 for exit");
           System.out.println("Enter your choice");
           int choice = sc.nextInt();
           switch(choice) {
           case 1: insert();break;
           case 2: login();break;
           case 3: fetchById();break;
           case 4: testCache(); break;
           case 5: insertStudentCourse();break;
           case 0: System.exit(0);
           }
          }
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
    public static void insertStudentCourse() {
    	EntityManagerFactory factory = JPAUtil.getFactory();
    	try (EntityManager manager = factory.createEntityManager();){
    	  EntityTransaction transaction = manager.getTransaction();
    	  transaction.begin();
    	  StudentCourse sc = new StudentCourse();
    	  
    	  StudentCourseKey key = new StudentCourseKey();
    	  key.setCourseId(200);
    	  key.setStudentId(100);
    	  
    	  sc.setKey(key);
    	  sc.setCourseName("Java FullStack");
    	  sc.setStudentName("Atul");
    	 
    	  manager.persist(sc);
    	  transaction.commit();
    	  System.out.println("Record Inserted...");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public static void testCache() {
      	EntityManagerFactory factory1 = JPAUtil.getFactory();
    	EntityManager manager1 = factory1.createEntityManager();
    	User user =  manager1.find(User.class, 1); // DB-query
    	System.out.println(user.getEmail()+"  "+user.getName());
    	manager1.close();
    	
    	EntityManagerFactory factory2 = JPAUtil.getFactory();
    	EntityManager manager2 = factory2.createEntityManager();
    	User user2 =  manager2.find(User.class, 1); // DB-query
    	System.out.println(user2.getEmail()+"  "+user2.getName());
        manager2.close();
    }
    public static void fetchById() {
    	EntityManagerFactory factory = JPAUtil.getFactory();
    	try (EntityManager manager = factory.createEntityManager();){
    	 	User user = manager.find(User.class, 1);
    	    System.out.println(user.getName()+"  "+user.getAge());
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public static void login() {
    	EntityManagerFactory factory  = JPAUtil.getFactory();
    	try (EntityManager manager = factory.createEntityManager();){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter email id");
    	 String emailId = sc.next();
    	 System.out.println("Enter password");
    	 String password = sc.next();
    	 TypedQuery<User> query = manager.createQuery("from User where email =:email and password=:password",User.class);
    	 query.setParameter("email", emailId);
    	 query.setParameter("password", password);
    	 
    	 List<User>userList =  query.getResultList();
    	 if(userList.size()!= 0) {
    		 System.out.println("Login success...");
    	 }
    	 else
    		 System.out.println("Invalid user (invalid email id and password)");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public static void insert() {
       EntityManagerFactory factory = JPAUtil.getFactory(); 	
       EntityTransaction transaction = null;
       try (EntityManager manager = factory.createEntityManager();){
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter name");
    	   String name = sc.next();
    	   System.out.println("Enter password");
    	   String password = sc.next();
    	   System.out.println("Enter email id");
    	   String emailid = sc.next();
    	   System.out.println("Enter age");
    	   int age = sc.nextInt();
    	   User user = new User();
    	   user.setAge(age);
    	   user.setEmail(emailid);
    	   user.setName(name);
    	   user.setPassword(password);
    	   transaction = manager.getTransaction();
    	   transaction.begin();
    	   
    	   manager.persist(user);
    	   transaction.commit();
    	   System.out.println("Record saved....");
    	   
       }
       catch(Exception e) {
    	   e.printStackTrace();
    	   if(transaction!=null && transaction.isActive())
    		   transaction.rollback();
       }
    }
}














