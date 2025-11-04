package com.info.testcurd;

import java.util.ArrayList;

import com.info.testcrud.dao.UserDAO;
import com.info.testcrud.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<User> userList =  UserDAO.getList();
    	for(User user : userList) {
    		System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
    	}
//       User user = new User();
//       user.setEmail("d@gmail.com");
//       user.setPassword("12345");
//       user.setName("D");
//       boolean status = UserDAO.persist(user);
//       if(status)
//    	   System.out.println("Record Inserted..");
//       else
//    	   System.out.println("Somethign wrong...");
//    	boolean status = UserDAO.remove(3);
//        if(status)
//        	System.out.println("Record Removed...");
//        else
//        	System.out.println("Something wrong...");
//       User user = new User();
//       user.setName("test");
//       user.setEmail("testing@gmail.com");
//       user.setPassword("00000");
//       user.setId(1);
//       boolean status = UserDAO.update(user);
//       if(status)
//    	   System.out.println("Record Updated...");
//       else
//    	   System.out.println("Record Not Updated...");
    
    }
}
