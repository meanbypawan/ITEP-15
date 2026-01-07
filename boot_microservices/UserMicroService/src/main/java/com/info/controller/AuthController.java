package com.info.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.entity.User;
import com.info.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
   private final UserService userService;
   public AuthController(UserService userService) {
	   this.userService = userService;
   }
   @PostMapping	
   public ResponseEntity<?> registerUser(@RequestBody User user){
	   return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(user));
   }
}
