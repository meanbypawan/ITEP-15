package com.info.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.JwtUtil;
import com.info.entity.User;
import com.info.service.CustomUserDetailsService;
import com.info.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
   private final UserService userService;
   private final AuthenticationManager authenticationManager;
   private final UserDetailsService detailsService;
   private final JwtUtil jwt;
   public AuthController(UserService userService,AuthenticationManager authenticationManager, UserDetailsService detailsService, JwtUtil jwt) {
	   this.userService = userService;
	   this.authenticationManager = authenticationManager;
	   this.detailsService = detailsService;
	   this.jwt = jwt;
   }
   @PostMapping	
   public ResponseEntity<?> registerUser(@RequestBody User user){
	   return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(user));
   }
   @PostMapping("/signin")
   public ResponseEntity<?> signIn(@RequestBody User user){
	   authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
	   UserDetails userDetails =  detailsService.loadUserByUsername(user.getEmail());
	   String token = jwt.generateToken(userDetails);
	   HashMap<String, Object> hm = new HashMap<>();
	   hm.put("message","Sign in success");
	   hm.put("token", token);
	   return ResponseEntity.ok(hm);
   }
}
