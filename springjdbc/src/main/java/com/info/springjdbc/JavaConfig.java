package com.info.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.info.springjdbc.dao.StudentDAO;

@Configuration
public class JavaConfig {
  
  @Bean	
  public DriverManagerDataSource getDataSource() {
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  dataSource.setUrl("jdbc:mysql://localhost:3306/itep_springjdbc");
	  dataSource.setUsername("root");
	  dataSource.setPassword("");
	  return dataSource;
  }
  @Bean
  public JdbcTemplate getTemplate() {
	  JdbcTemplate template = new JdbcTemplate();
	  template.setDataSource(getDataSource()); // Manual DI
      return template;
  }
  @Bean
  public StudentDAO getStudentDAO() {
	  StudentDAO dao = new StudentDAO();
	  return dao;
  }
  
}
