package com.info.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.info.springjdbc.entity.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
	    int id =  rs.getInt(1);
	    String name = rs.getString(2);
	    String course = rs.getString(3);
	    s.setId(id);
	    s.setCourse(course);
	    s.setName(name);
		return s;
	}
  
}








