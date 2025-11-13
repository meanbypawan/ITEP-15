package com.info.ecommerceapp;

import java.util.Scanner;

import com.info.ecommerceapp.dao.CategoryDAO;
import com.info.ecommerceapp.dao.UserDAO;
import com.info.ecommerceapp.entity.Category;
import com.info.ecommerceapp.entity.User;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for user registration..");
			System.out.println("Press 2 for user login");
			System.out.println("Press 3 for saving product");
			System.out.println("Press 4 for saving category");
			System.out.println("Press 0 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter user name");
					String name = sc.next();
					System.out.println("Enter email id");
					String email = sc.next();
					System.out.println("Enter password");
					String password = sc.next();
					System.out.println("Enter Aadhar Card No.");
					String aadharNo = sc.next();
					User user = new User();
					user.setAadharNo(aadharNo);
					user.setEmail(email);
					user.setName(name);
					user.setPassword(password);
					boolean status = UserDAO.save(user);
					if (status)
						System.out.println("User Registered successfully...");
					else
						System.out.println("Something wrong...");
					break;
				case 2:
					System.out.println("Enter email id");
					String userEmail = sc.next();
					System.out.println("Enter password");
					String userPassword = sc.next();
					
					User u = new User();
					u.setEmail(userEmail);
                    u.setPassword(userPassword);
                    if(UserDAO.authenticate(u))
                    	System.out.println("Login Success....");
                    else
                    	System.out.println("Oops! something went wrong...");
                    break;
				case 3:
					System.out.println("Enter product title");
					break;    
				case 4: 
					System.out.println("Enter category name");
					String categoryName = sc.next();
					Category c = new Category();
					c.setCategoryName(categoryName);
					if(CategoryDAO.save(c))
						System.out.println("Category saved..");
					else
						System.out.println("Something wrong...");
					break;		
				case 0:
					System.exit(0);
			}
		}
	}
}
