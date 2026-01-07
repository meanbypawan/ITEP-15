package com.info.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.info.dto.UserDTO;
import com.info.entity.User;
import com.info.repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
   private final UserRepository userRepo;
   private final PasswordEncoder passwordEncoder;
   public UserService(UserRepository userRepo, PasswordEncoder passwordEncoder) {
	   this.userRepo = userRepo;
	   this.passwordEncoder = passwordEncoder;
   }
   @Transactional
   public UserDTO registerUser(User user) {
	   String encryptedPassword = passwordEncoder.encode(user.getPassword());
	   user.setPassword(encryptedPassword);
	   User dbUser =  userRepo.save(user);
	   UserDTO dto = new UserDTO();
	   dto.setId(dbUser.getId());
	   dto.setEmail(dbUser.getEmail());
	   dto.setUsername(dbUser.getUsername());
	   dto.setRole(dbUser.getRole());
	   return dto;
   }
}
