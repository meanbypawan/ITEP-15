package com.info.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.springjdbc.dao.StudentDAO;
import com.info.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Press 1 for insert");
				System.out.println("Press 2 for update");
				System.out.println("Press 3 for delete");
				System.out.println("Press 4 for fetch students");
				System.out.println("Press 5 for fetch by id");
				System.out.println("Press 0 for exit");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				if (choice == 0)
					System.exit(0);
				else if (choice == 1)
					insert();
				else if (choice == 2)
					updateStudent();
				else if (choice == 3)
					deleteStudent();
				else if(choice == 4)
					fetchStudents();
				else if(choice == 5)
					fetchById();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void fetchById() {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			StudentDAO dao =  context.getBean(StudentDAO.class);
		    Student s =  dao.getStudentById(1);
	    	System.out.println(s.getId()+"  "+s.getName()+"  "+s.getCourse());
	    	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    private static void fetchStudents() {
    	try {
    		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    		StudentDAO dao =  context.getBean(StudentDAO.class);
    	    List<Student> list = dao.getList();
    	    for(Student s : list)
    	    	System.out.println(s.getId()+"  "+s.getName()+"  "+s.getCourse());
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	private static void updateStudent() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter course");
			String course = sc.next();
			System.out.println("Enter id");
			int id = sc.nextInt();
			Student s = new Student();
			s.setCourse(course);
			s.setName(name);
			s.setId(id);
			ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			StudentDAO dao = context.getBean("getStudentDAO", StudentDAO.class);
			if (dao.update(s))
				System.out.println("Record updated...");
			else
				System.out.println("Somethig wrong...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deleteStudent() {
		try {
	    	 Scanner sc = new Scanner(System.in);
	    	 
	    	 System.out.println("Enter id");
	    	 int id = sc.nextInt();
	         ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	         StudentDAO dao =  context.getBean("getStudentDAO",StudentDAO.class);
	         if(dao.delete(id))
	        	 System.out.println("Record deleted");
	         else
	        	 System.out.println("Somethig wrong...");
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}

	private static void insert() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter course");
			String course = sc.next();

			Student s = new Student();
			s.setCourse(course);
			s.setName(name);

			ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			StudentDAO dao = context.getBean("getStudentDAO", StudentDAO.class);
			if (dao.save(s))
				System.out.println("Record Saved");
			else
				System.out.println("Somethig wrong...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
