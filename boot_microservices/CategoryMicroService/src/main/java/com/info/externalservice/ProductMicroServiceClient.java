package com.info.externalservice;

import java.util.HashMap;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="PRODUCTMICROSERVICE")
public interface ProductMicroServiceClient {
   @GetMapping("/{name}")	
   List<Object> getProductByCategory(@PathVariable String name); 
}
