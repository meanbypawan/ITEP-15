package com.testjdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {
   public static void main(String args[]) {
	   try (Connection con = GetConnection.getConnection();){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter name");
		 String employeeName = sc.next();
		 
		 System.out.println("Enter salary");
		 int salary = sc.nextInt();
		 
		 System.out.println("Enter skill");
		 String skill = sc.next();
		 
		 Statement st =  con.createStatement();
		 String sql = "insert into employee(name,salary,skill) values('"+employeeName+"',"+salary+",'"+skill+"')";
		 int x = st.executeUpdate(sql);
		 if(x!=0)
			 System.out.println("Record Inserted...");
		 else 
			 System.out.println("Record not inserted...");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
