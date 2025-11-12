package com.info.mappingdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.mappingdemo.entity.Category;
import com.info.mappingdemo.entity.Course;
import com.info.mappingdemo.entity.Passport;
import com.info.mappingdemo.entity.Product;
import com.info.mappingdemo.entity.Student;
import com.info.mappingdemo.entity.User;
import com.info.mappingdemo.util.HibernateUtil;

import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for insert...");
			System.out.println("Press 2 for fetch Passport Detail...");
			System.out.println("Press 3 for inserting category");
			System.out.println("Press 4 for inserting product");
			System.out.println("Press 5 for fetch category");
			System.out.println("Press 6 for saving student ");
			System.out.println("Press 0 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				fetchPassportDetail();
				break;
			case 3: insertCategory();break;
			case 4: insertProduct(); break;
			case 5: fetchCategory();break;
			case 6: saveStudent();break;
			case 0:
				System.exit(0);
			}
		}
	}
	public static void saveStudent() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		try (Session session = sessionFactory.openSession();){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter student name");
	       String name = sc.next();
	       
	       Course c1 = new Course();
	       c1.setCourseName("Java FullStack");
	       
	       Course c2 = new Course();
	       c2.setCourseName("MERN FullStack");
	       
	       Student s1 = new Student();
	       s1.setName(name);
	       
	       List<Course> courseList = new ArrayList<Course>();
	       courseList.add(c1);
	       courseList.add(c2);
	       s1.setCourseList(courseList);
	       
	       Transaction transaction = session.beginTransaction();
	       session.persist(s1);
	       transaction.commit();
	       System.out.println("Record saved...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void fetchCategory() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		try (Session session = sessionFactory.openSession();){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter category id");
			int categoryId = sc.nextInt();
			Category category =  session.get(Category.class, categoryId);
		    if(category != null) {
		    	String categoryName=  category.getCategoryName();
		    	List<Product> productList =  category.getProductList();
		    	System.out.println(categoryName);
		    	for(Product p : productList)
		    		System.out.println(p.getTitle()+" "+p.getPrice());
		    }
		    else
		    	System.out.println("Category not found");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insertCategory() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		Scanner sc = new Scanner(System.in);
		try (Session session = sessionFactory.openSession();){
			System.out.println("Enter category name..");
			String name = sc.next();
			Category c = new Category();
			c.setCategoryName(name);
			Transaction transaction = session.beginTransaction();
			session.persist(c);
			transaction.commit();
			System.out.println("Category saved...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insertProduct() {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		Scanner sc = new Scanner(System.in);
		try (Session session = sessionFactory.openSession();){
		   System.out.println("Enter category id");
		   int categoryId = sc.nextInt();
		   Category c = session.get(Category.class, categoryId);
		   if(c!=null) {
			   Transaction transaction = session.beginTransaction();
			   System.out.println("Enter product title");
			   String title = sc.next();
			   System.out.println("Enter product price");
			   int price = sc.nextInt();
			   Product p = new Product();
			   p.setPrice(price);
			   p.setTitle(title);
			   p.setCategory(c);
			   session.persist(p);
			   transaction.commit();
			   System.out.println("Product saved...");
		   }
		   else
			   System.out.println("Category Not Found");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void fetchPassportDetail() {
		SessionFactory sessionFactory  = HibernateUtil.getFactory();
		try (Session session = sessionFactory.openSession();){
		  TypedQuery<Passport> query=session.createQuery("from Passport where user.id=:userId",Passport.class);
		  query.setParameter("userId", 2);
		  Passport p = query.getSingleResult();
		  User user = p.getUser(); // It will fetch user lazily..
		  System.out.println(p.getId()+" "+p.getPassportNo()+" "+user.getName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
        Scanner sc = new Scanner(System.in);
        SessionFactory sessionFactory = HibernateUtil.getFactory();
        try(Session session = sessionFactory.openSession();){
        	System.out.println("Enter user name");
        	String name  = sc.next();
        	System.out.println("Enter passport number");
        	String passportNo = sc.next();
        	
        	User user = new User();
        	user.setName(name);
        	
        	Passport passport = new Passport();
        	passport.setPassportNo(passportNo);
        	
        	user.setPassport(passport);
        	passport.setUser(user);
        	
        	Transaction transaction = session.beginTransaction();
        	session.persist(user);
        	transaction.commit();
        	System.out.println("Record saved...");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
}












