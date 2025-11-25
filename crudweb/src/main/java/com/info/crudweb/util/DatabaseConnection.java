package com.info.crudweb.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
   private static Connection con = null;
   public static Connection getConnection() {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdweb","root","");
	      return con;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
   }
}
