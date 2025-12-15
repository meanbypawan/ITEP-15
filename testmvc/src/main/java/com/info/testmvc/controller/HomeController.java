package com.info.testmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  // http://localhost:8080/testmvc/home ---> GET/POST/PUT/DELETE
  @GetMapping("/home")	
  public String getHomePage() {
	  return "home";
  }
}
