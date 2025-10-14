package com.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
   public static void main(String args[]) {
	 try {  
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
	   System.out.println("Database connected : "+con);
	 }
	 catch(ClassNotFoundException e) {
		 e.printStackTrace();
	 }
	 catch(SQLException e) {
		 e.printStackTrace();
	 }
	}
}
