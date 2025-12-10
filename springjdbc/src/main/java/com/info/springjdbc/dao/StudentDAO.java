package com.info.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.info.springjdbc.entity.Student;

public class StudentDAO {
  
  @Autowired
  JdbcTemplate template;
  
  public boolean save(Student s) {
	  String sql = "insert into student(name,course) values(?,?)";
	  return template.update(sql,s.getName(),s.getCourse()) > 0;
  }
  
  public boolean update(Student s) {
	  String sql = "update student set name=? , course = ? where id = ?";
	  return template.update(sql,s.getName(),s.getCourse(),s.getId()) > 0;
  }
  public boolean delete(int id) {
	  String sql = "delete from student where id = ?";
      return template.update(sql,id) > 0;
  }


}
