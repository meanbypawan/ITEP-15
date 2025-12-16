package com.info.testmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
  @GetMapping("/add-category")	
  public String addCategoryPage() {
	  return "add-category";
  }
}
