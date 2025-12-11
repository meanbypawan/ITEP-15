package com.info.optimized_spring_jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.info.optimized_spring_jdbc.dao.StudentDAO;

@Configuration
@ComponentScan(basePackages = {"com.info.optimized_spring_jdbc.service"})
@EnableTransactionManagement
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

   @Bean(autowireCandidate = false)
   public JdbcTemplate getTemplate2(DataSource dataSource) {
	   return new JdbcTemplate(dataSource);
   }
   @Bean
   public JdbcTemplate getTemplate(DataSource dataSource) {
	   return new JdbcTemplate(dataSource);
   }
   
   @Bean
   public StudentDAO getStudentDAO(JdbcTemplate template) {
	   return new StudentDAO(template);
   }
   
   @Bean
   public PlatformTransactionManager transactionManager(DriverManagerDataSource dataSource) {
       return new DataSourceTransactionManager(dataSource); // or JpaTransactionManager, etc.
   }
}







