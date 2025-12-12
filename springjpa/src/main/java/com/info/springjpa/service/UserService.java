package com.info.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.springjpa.entity.User;
import com.info.springjpa.repo.UserRepository;

@Service
public class UserService {
   @Autowired	
   UserRepository userRepo;
   
   @Transactional
   public User saveUser(User user) {
	  return userRepo.save(user);
   }
   public List<User> getUserList(){
	   return userRepo.findAll();
   }
}
