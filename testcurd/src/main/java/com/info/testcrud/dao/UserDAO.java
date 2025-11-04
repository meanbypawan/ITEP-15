package com.info.testcrud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.info.testcrud.model.User;
import com.info.testcurd.util.DatabaseConnection;

public class UserDAO {
  public static User get(int id) {
	  User user = null;
	  try (Connection con = DatabaseConnection.getConnection();){
		  String sql = "select id,name,email from user where id = ?";
	      PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY);
	      ps.setInt(1, id);
	      ResultSet rs = ps.executeQuery();
	      if(rs.next()) {
	    	  int userId = rs.getInt(1);
	    	  String name = rs.getString(2);
	    	  String email = rs.getString(3);
	    	  user = new User();
	    	  user.setId(userId);
	    	  user.setName(name);
              user.setEmail(email);
	      }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return user;
  }
  public static ArrayList<User> getList(){
	  ArrayList<User> userList = new ArrayList<User>();
	  try(Connection con = DatabaseConnection.getConnection();) {
		  String sql = "select * from user";
		  //PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs = ps.executeQuery();
		  //rs.absolute(2);
		  //rs.next();
		  //rs.next();
		  //rs.relative(2);
		  while(rs.next()) {
			  int id = rs.getInt("id");
			  String name = rs.getString("name");
			  if(id == 5) {
				  rs.updateString("email", "abc@gmail.com");
				  rs.updateRow();
			  }
			  String email = rs.getString("email");
			  String password = rs.getString("password");
			  
		      User user = new User(id, name, email, password);
		      userList.add(user);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return userList;
  }
  public static boolean persist(User user) {
	  Connection con = DatabaseConnection.getConnection();
	  try{
		  con.setAutoCommit(false);
		  String sql = "insert into user(name,email,password) values(?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1,user.getName());
		  ps.setString(2, user.getEmail());
		  ps.setString(3, user.getPassword());
		  int x = ps.executeUpdate();
		  if(x!=0) {
			  con.commit();
			  return true;
		  }		  
		  return false;
	  }
	  catch(Exception e) {
		  try{
			 con.rollback(); 
		  }
		  catch(Exception ee) {
			  ee.printStackTrace();
		  }
		  e.printStackTrace();
	  }
	  finally {
		  try {
			  con.close();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	  return false;
  }
  public static boolean remove(Integer id) {
	  boolean status = false;
	  Connection con = DatabaseConnection.getConnection();
	  try{
		  con.setAutoCommit(false);
		  String sql = "delete from user where id = ?";
	      PreparedStatement ps = con.prepareStatement(sql);
	      ps.setInt(1, id);
	      if(ps.executeUpdate()!=0) {
	    	  status = true;
	    	  con.commit();
	      }
	  }
	  catch(Exception e) {
		 try { 
		  e.printStackTrace();
		  con.rollback();
		 }
		 catch(Exception ee) {
			 ee.printStackTrace();
		 }
	  }
	  finally {
		 try { 
		  con.close();
		 } 
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	  }
	  return status;
  }
  public static boolean update(User user) {
	  boolean status = false;
	  Connection con = DatabaseConnection.getConnection();
	  try {
		  con.setAutoCommit(false);
		  String sql = "update user set name = ?,email=?,password=? where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1,user.getName());
		  ps.setString(2, user.getEmail());
		  ps.setString(3, user.getPassword());
		  ps.setInt(4,user.getId());
		  if(ps.executeUpdate()!=0) {
			  status = true;
			  con.commit();
		  }
	  }
	  catch(Exception e) {
		  try {
			  con.rollback();
		  }
		  catch(Exception ee) {
			  ee.printStackTrace();
		  }
	  }
	  finally {
		  try {
			  con.close();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	  return status;
  }
}
