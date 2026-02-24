package com.ecommerce.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.UserDTO;
import com.ecommerce.entity.User;
import com.ecommerce.repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
  private UserRepository userRepo;
  private PasswordEncoder passwordEncoder;
  
  public UserService(UserRepository userRepo, PasswordEncoder passwordEncoder) {
	  this.userRepo = userRepo;
	  this.passwordEncoder = passwordEncoder;
  }
  @Transactional
  public UserDTO saveUser(User user) {
	 user.setPassword(passwordEncoder.encode(user.getPassword())); 
	 User dbUser =  userRepo.save(user);
     UserDTO dto = new UserDTO();
     dto.setId(dbUser.getId());
     dto.setEmail(dbUser.getEmail());
     dto.setContact(dbUser.getContact());
     return dto;
  }
}
