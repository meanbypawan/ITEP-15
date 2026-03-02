package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
  private UserService userService;
  public UserController(UserService userService) {
	  this.userService = userService;
  }
  @GetMapping("/{id}")	
  public ResponseEntity<?> getUserById(@PathVariable int id){
	  System.out.println("called..........................");
	 return ResponseEntity.ok(userService.getUserById(id));  
  }
}
