package com.info.springjpa;

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

@EnableJpaRepositories(basePackages = "com.info.springjpa.repo")
@EnableTransactionManagement
@Configuration
@ComponentScan(basePackages = {"com.info.springjpa.service"})
public class JavaConfig {
   
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/itep_springjpa");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactory(DriverManagerDataSource dataSource) {
	   LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	   factory.setPackagesToScan("com.info.springjpa.entity");
	   
	   HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	   adapter.setShowSql(true);
	   Properties prop = new Properties();
	   prop.put("hibernate.hbm2ddl.auto", "update");
	   prop.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	   factory.setDataSource(dataSource);
	   factory.setJpaVendorAdapter(adapter);
	   factory.setJpaProperties(prop);
	   return factory;  
	}
	
	@Bean(name="transactionManager")
	public JpaTransactionManager getTransaction(LocalContainerEntityManagerFactoryBean factory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(factory.getObject());
		return transactionManager;
	}
}








