package com.info.optimized_spring_jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.info.optimized_spring_jdbc.entity.Student;

public class StudentDAO {
  private JdbcTemplate template;
  
  @Autowired
  public StudentDAO(JdbcTemplate template) {
	  this.template = template;
  }
  
  public boolean save(Student s) {
     String sql = "insert into student(name,course) values(?,?)";
     return template.update(sql,s.getName(),s.getCourse()) > 0;     
  }
}







