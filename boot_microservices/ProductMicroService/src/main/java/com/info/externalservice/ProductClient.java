package com.info.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.info.dto.ProductResponseDTO;

@FeignClient(name = "product-service",
url="https://dummyjson.com/products")
public interface ProductClient {
   @GetMapping	
   ProductResponseDTO getProducts(); 
}
