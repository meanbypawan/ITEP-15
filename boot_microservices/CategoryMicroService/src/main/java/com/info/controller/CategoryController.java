package com.info.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.dto.CategoryDTO;
import com.info.entity.Category;
import com.info.externalservice.CategoryClient;
import com.info.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
   private CategoryService categoryService;
   public CategoryController(CategoryService categoryService) {
	   this.categoryService = categoryService;
   }
   
   @PostMapping	
   public ResponseEntity<List<Category>> getCategories(){
	 return ResponseEntity.ok(categoryService.saveInBulk()); 
   }
   @GetMapping
   public ResponseEntity<List<Category>> getList(){
	   return ResponseEntity.ok(categoryService.getList());
   }
}




