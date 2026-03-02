package com.ecommerce.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
		name="PRODUCTMICROSERVICE")
public interface ProductFeignClient {
  @GetMapping("/product/{id}")	
  public Object fetchProductById(@PathVariable int id);
}
