package com.ecommerce.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.User;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    private UserRepository userRepo;
	public CustomUserDetailsService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
    @Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
    	User dbUser =  userRepo.findByEmail(email).orElseThrow(()->new ResourceNotFoundException("Email not found"));
	
    	GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
		
    	return new org.springframework.security.core.userdetails.User(dbUser.getEmail(), dbUser.getPassword(), List.of(authority));
	}

}











