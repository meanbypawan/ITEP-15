package com.info.crudweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.info.crudweb.model.Product;
import com.info.crudweb.util.DatabaseConnection;

public class ProductDAO {
  public static boolean persist(Product p) {
	  try (Connection con = DatabaseConnection.getConnection();){
		  String sql = "insert into product(title,price,brand) values(?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, p.getTitle());
		  ps.setInt(2, p.getPrice());
		  ps.setString(3, p.getBrand());
		  if(ps.executeUpdate()!=0)
			  return true;
		  return false;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return false;
  }
}
