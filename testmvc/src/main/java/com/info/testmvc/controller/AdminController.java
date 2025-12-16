package com.info.testmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info.testmvc.entity.Admin;
import com.info.testmvc.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
    private AdminService adminService;
	@PostMapping("/sign-up")
	public String signUpAction(@ModelAttribute Admin admin) {
		Admin dbAdmin =  adminService.registerAdmin(admin);
		if(dbAdmin!=null)
			return "redirect:/home";
		return "create-account";
	}
	@PostMapping("/sign-in")
	public String signInAction(@ModelAttribute Admin admin,HttpSession session) {
	   Admin dbAdmin = adminService.authenticateAdmin(admin);
	   if(dbAdmin!=null) {
		   session.setAttribute("isLoggedIn", true);
		   session.setAttribute("currentUser", admin.getEmail());
		   return "redirect:/dashboard";
	   }
	   return "redirect:/home";
	}
	
}
