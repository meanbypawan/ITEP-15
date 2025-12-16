package com.info.testmvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.testmvc.entity.Admin;
import com.info.testmvc.repo.AdminRepository;

@Service
public class AdminService {
   @Autowired	
   private AdminRepository adminRepo;

   public Admin registerAdmin(Admin admin) {
	   return adminRepo.save(admin);
   }
   public Admin authenticateAdmin(Admin admin) {
//	 Optional<Admin> optional = adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
//     if(optional.isPresent())
//    	 return optional.get();
//     return null;
     return adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword()).orElse(null);
   }
}





