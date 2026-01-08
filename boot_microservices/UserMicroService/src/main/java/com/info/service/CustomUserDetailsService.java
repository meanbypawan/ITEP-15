package com.info.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.info.entity.User;
import com.info.exception.ResourceNotFoundException;
import com.info.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    private final UserRepository userRepo;
    public CustomUserDetailsService(UserRepository userRepo) {
    	this.userRepo = userRepo;
    }
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User dbUser =  userRepo.findByEmail(username)
				.orElseThrow(()->new ResourceNotFoundException("Username not found"));
		
		GrantedAuthority authority = new SimpleGrantedAuthority("USER");
		
		return new org.springframework.security.core.userdetails
				.User(dbUser.getEmail(), dbUser.getPassword(), List.of(authority));
	}
 
}












