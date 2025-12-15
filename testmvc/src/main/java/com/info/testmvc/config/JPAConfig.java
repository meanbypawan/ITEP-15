package com.info.testmvc.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.info.testmvc.service"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.info.testmvc.repo"})
@Configuration
public class JPAConfig {
  @Bean	 
  public DriverManagerDataSource getDataSource() {
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  dataSource.setUrl("jdbc:mysql://localhost:3306/itep_springwebmvc");
	  dataSource.setUsername("root");
	  dataSource.setPassword("");
	  return dataSource;
  }
  @Bean(name = "entityManagerFactory")
  public LocalContainerEntityManagerFactoryBean getFactory(DriverManagerDataSource dataSource) {
     LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
     factory.setDataSource(dataSource);
     factory.setPackagesToScan("com.info.testmvc.entity");
    
     HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
     
     Properties prop = new Properties();
     prop.put("hibernate.hbm2ddl.auto", "update");
     prop.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
     prop.put("hibernate.format_sql", true);
     prop.put("show_sql", true);
     
     factory.setJpaProperties(prop);
     factory.setJpaVendorAdapter(adapter);
     
     return factory;
  }
  @Bean(name="transactionManager")
  public JpaTransactionManager getTransaction(LocalContainerEntityManagerFactoryBean factory) {
	  JpaTransactionManager transaction = new JpaTransactionManager();
	  transaction.setEntityManagerFactory(factory.getObject());
	  return transaction;
  }
}













