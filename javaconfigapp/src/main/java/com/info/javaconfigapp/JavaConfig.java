package com.info.javaconfigapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.info.javaconfigapp.entity.Employee;

@Configuration
public class JavaConfig {

  @Bean	
  public Employee getEmployee() {
	  Employee e = new Employee();
	  e.setId(100);
	  e.setName("Atul");
	  e.setDepartment("Java Team");
	  return e;
  }
}
