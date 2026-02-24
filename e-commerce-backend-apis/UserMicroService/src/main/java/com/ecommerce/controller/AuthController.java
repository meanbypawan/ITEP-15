package com.ecommerce.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.JwtUtil;
import com.ecommerce.dto.UserDTO;
import com.ecommerce.entity.User;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repo.UserRepository;
import com.ecommerce.service.CustomUserDetailsService;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;
    private UserService userService;
    private CustomUserDetailsService userDetailsService;
    private AuthenticationManager authenticationManager;
    private JwtUtil jwt;
    public AuthController(UserService userService, CustomUserDetailsService userDetailsService,AuthenticationManager authenticationManager,JwtUtil jwt, UserRepository userRepository){
    	this.userService = userService;
    	this.userDetailsService = userDetailsService;
    	this.authenticationManager = authenticationManager;
    	this.jwt = jwt;
    	this.userRepository = userRepository;
    }
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return ResponseEntity.ok(userService.saveUser(user));
	}
	@PostMapping("/signin")
	public ResponseEntity<HashMap<String, Object>> signIn(@RequestBody User user){
		User dbUser =  userRepository.findByEmail(user.getEmail()).orElseThrow(()->new ResourceNotFoundException("Email not found.."));
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
		UserDetails userDetails =  userDetailsService.loadUserByUsername(user.getEmail());
	    String token =  jwt.generateToken(userDetails);
		UserDTO dto = new UserDTO();
		dto.setEmail(dbUser.getEmail());
		dto.setId(dbUser.getId());
		dto.setContact(dbUser.getContact());
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("token", token);
		hm.put("user", dto);
	    return ResponseEntity.ok(hm);
	}
}




