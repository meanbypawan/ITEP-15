package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee;
import service.GetConnection;

public class EmployeeDAO {
  public static boolean save(Employee e) {
	  boolean status = true;
	  try (Connection con = GetConnection.getConnection();){
		  String sql = "insert into employee(name,salary,skill) values(?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, e.getName());
		  ps.setInt(2, e.getSalary());
		  ps.setString(3, e.getSkill());
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception ee) {
		  ee.printStackTrace();
	  }
	  return status;
  }
  public static boolean update(Employee e) {
	  try (Connection con = GetConnection.getConnection();){
		  String sql = "update employee set name = ?, salary = ?, skill = ? where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, e.getName());
		  ps.setInt(2, e.getSalary());
		  ps.setString(3, e.getSkill());
		  ps.setInt(4, e.getId());
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception ee) {
		  ee.printStackTrace();
	  }
	  return false;
  }
  public static ArrayList<Employee> fetchAll(){
	 ArrayList<Employee> al = new ArrayList<Employee>(); 
	 try (Connection con = GetConnection.getConnection();){
		 String sql = "select * from employee";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs =  ps.executeQuery();
		 while(rs.next()) {
			 int id = rs.getInt("id");
			 String name = rs.getString("name");
			 String skill = rs.getString("skill");
			 int salary  =rs.getInt("salary");
			 Employee emp = new Employee(id, name, salary, skill);
			 al.add(emp);
		 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return al;
  }
  public static boolean delete(int id) {
	  try (Connection con = GetConnection.getConnection();){
		  String sql = "delete from employee where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, id);
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return false;
  }
  
}



