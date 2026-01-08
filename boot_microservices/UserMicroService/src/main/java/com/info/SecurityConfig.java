package com.info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
   @Bean	
   public SecurityFilterChain securityFilterChain(HttpSecurity http) {
	   http.csrf(csrf->csrf.disable())
	   .authorizeHttpRequests(auth->auth.requestMatchers("/auth","/auth/signin").permitAll());
	   return http.build();
   }
   
   @Bean
   public PasswordEncoder passwordEncoder() {
	   return new BCryptPasswordEncoder();
   }
   
   @Bean
   public AuthenticationManager authenticationManager(AuthenticationConfiguration config) {
	   return config.getAuthenticationManager();
   }
}





