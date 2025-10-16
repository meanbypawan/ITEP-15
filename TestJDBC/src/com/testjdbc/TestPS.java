package com.testjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestPS {
   public static void main(String args[]) {
	   try (Connection con = GetConnection.getConnection();){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter name");
		   String name = sc.next();
		   
		   System.out.println("Enter salary");
		   int salary = sc.nextInt();
		   
		   System.out.println("Enter skill");
		   String skill = sc.next();
		   
		   String sql = "insert into employee(name,skill,salary) values(?,?,?),(?,?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, name);
		   ps.setString(2, skill);
		   ps.setInt(3, salary);
		   ps.setString(4,"Harshit");
		   ps.setString(5,"AngularJs");
		   ps.setInt(6, 89000);
		   
		   int x = ps.executeUpdate();
		   System.out.println("X : "+x);
		   if(x!=0)
			   System.out.println("Record Inserted...");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
