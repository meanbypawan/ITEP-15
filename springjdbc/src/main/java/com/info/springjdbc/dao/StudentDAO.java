package com.info.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.info.springjdbc.entity.Student;
import com.info.springjdbc.mapper.StudentRowMapper;

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

  public List<Student> getList(){
	  List<Student> list =  template.query("select * from student", new StudentRowMapper());
      return list;
  }
  
  public Student getStudentById(int id) {
	 String sql = "select * from student where id = ?";
	 Student s =  template.queryForObject(sql,new Object[] {id},new StudentRowMapper());
     return s;
  }
}






