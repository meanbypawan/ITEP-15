package com.info.testidthree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.info.testidthree.entity.Student;

@Configuration
public class JavaConfig {
   
   @Bean	
   public Student getStudent() {
	   Student s = new Student();
	   s.setId(100);
	   s.setName("Atul");
	   s.setCouse("Java FullStack");
	   return s;
   }
}
