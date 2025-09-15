package com.infobeans.hb_mapping;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.infobeans.hb_mapping.dao.ProfileDAO;
import com.infobeans.hb_mapping.dao.StudentDAO;
import com.infobeans.hb_mapping.entity.Profile;
import com.infobeans.hb_mapping.entity.Student;
import com.infobeans.hb_mapping.service.GetSessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 for insert");
       System.out.println("Enter 2 for creating profile");
       int choice = sc.nextInt();
       if(choice == 1) {
    	   System.out.println("Enter student marks");
    	   int marks = sc.nextInt();
    	   
    	   
    	   System.out.println("Enter student name");
    	   String name = sc.next();
    	   
    	   
    	   Student s = new Student();
    	   s.setName(name);
    	   s.setMarks(marks);
    	   if(StudentDAO.save(s))
    		   System.out.println("Student saved...");
    	   else
    		   System.out.println("Student not saved...");
       }
       else if(choice == 2) {
    	   System.out.println("Enter student id");
    	   int studentId = sc.nextInt();
    	   System.out.println("Enter email id");
    	   String emailId = sc.next();
    	   System.out.println("Enter address");
    	   String address = sc.next();
    	   Profile p = new Profile();
    	   p.setEmail(emailId);
    	   p.setAddress(address);
    	   boolean status = ProfileDAO.save(p, studentId);
           if(status)
        	   System.out.println("Profile created...");
           else
        	   System.out.println("Something went wrong...");
       }
    }
}
