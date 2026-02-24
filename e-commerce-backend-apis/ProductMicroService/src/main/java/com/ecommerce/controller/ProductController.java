package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
	
    public ProductController(ProductService productService) {
    	this.productService = productService;
    }
    @PostMapping("/save-in-bulk")
	public ResponseEntity<?> saveInBulk(@RequestBody List<ProductDTO> list){
	  return ResponseEntity.ok(productService.saveInBulk(list));
	}
    @GetMapping
    public ResponseEntity<List<ProductDTO>> fetchAll(){
    	return ResponseEntity.ok(productService.fetchAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> fetchById(@PathVariable int id){
    	return ResponseEntity.ok(productService.fetchById(id));
    }
    @GetMapping("/category")
    public ResponseEntity<?> fetchByCategory(@RequestParam String category){
    	return ResponseEntity.ok(productService.fetchByCategory(category));
    }
}





