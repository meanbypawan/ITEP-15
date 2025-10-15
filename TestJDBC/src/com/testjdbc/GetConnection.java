package com.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  GetConnection{
   private static Connection con = null;
   public static Connection getConnection() {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return con;
   }
}





