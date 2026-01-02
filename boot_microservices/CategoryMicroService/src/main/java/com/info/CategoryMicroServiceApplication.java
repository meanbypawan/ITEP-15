package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CategoryMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryMicroServiceApplication.class, args);
	}

}
