package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
   private CategoryService categoryService;
   public CategoryController(CategoryService categoryService) {
	   this.categoryService = categoryService;
   }
   
   @PostMapping("/save")
   public ResponseEntity<?> saveInBulk(@RequestBody List<String> list){
	   return ResponseEntity.ok(categoryService.saveInBulk(list));
   }
   
   @GetMapping("/")
   public ResponseEntity<?> fetchAll(){
	   return ResponseEntity.ok(categoryService.fetchAll());
   }
   @GetMapping("/{id}")
   public ResponseEntity<?> fetchById(@PathVariable int id){
	   return ResponseEntity.ok(categoryService.fetchById(id));
   }
   
   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteById(@PathVariable int id){
	   return ResponseEntity.ok(categoryService.deleteById(id));
   }
   @GetMapping("/product")
   public ResponseEntity<?> fetchProduct(@RequestParam("category") String category){
	   return ResponseEntity.ok(categoryService.fetchProduct(category));
   }
}









