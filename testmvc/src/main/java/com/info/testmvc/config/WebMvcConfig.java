package com.info.testmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// "home"
// /WEB-INF/views/home.jsp
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.info.testmvc.controller"})
public class WebMvcConfig implements WebMvcConfigurer{
  @Bean
  public InternalResourceViewResolver getResolver() {
	  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	  resolver.setPrefix("/WEB-INF/views/");
	  resolver.setSuffix(".jsp");
	  return resolver;
  }
}
