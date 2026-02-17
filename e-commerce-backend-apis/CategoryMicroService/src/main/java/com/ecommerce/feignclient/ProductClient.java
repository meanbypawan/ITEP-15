package com.ecommerce.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(
		name = "PRODUCTMICROSERVICE")
public interface ProductClient {
	
  @GetMapping("/product/category")	
  List<Object> fetchProductByCategory(@RequestParam("category") String category);  

}
