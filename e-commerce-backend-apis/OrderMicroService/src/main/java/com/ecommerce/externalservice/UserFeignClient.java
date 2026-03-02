package com.ecommerce.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ecommerce.dto.UserDTO;

@FeignClient(
		name="USERMICROSERVICE")
public interface UserFeignClient {
  @GetMapping("/user/{id}")	
  public UserDTO fetchUserById(@PathVariable int id,@RequestHeader("Authorization") String token);
}
