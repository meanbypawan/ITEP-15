package com.info.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.dto.ProductResponseDTO;
import com.info.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public ResponseEntity<ProductResponseDTO> getProducts() {
		return ResponseEntity.ok(productService.getProducts());
	}
	@PostMapping
	public ResponseEntity<HashMap<String, Object>> saveInBulk(){
		HashMap<String, Object>hm =  productService.saveInBulk();
		return ResponseEntity.ok(hm);
	}
}










