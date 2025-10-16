package com.testjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSelect {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();) {
		  String sql = "select id,name,salary from employee id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ResultSet rs =  ps.executeQuery();
		  while(rs.next()) {
			  int id = rs.getInt(1);
			  String name = rs.getString("name");
			  int salary = rs.getInt(3);
			  System.out.println(id+" "+name+" "+salary);
			  
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
