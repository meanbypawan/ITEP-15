package com.ecommerce.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.UserDTO;
import com.ecommerce.entity.Order;
import com.ecommerce.externalservice.ProductFeignClient;
import com.ecommerce.externalservice.UserFeignClient;
import com.ecommerce.repo.OrderRepository;

@Service
public class OrderService {
   private OrderRepository orderRepo;
   private UserFeignClient userClient;
   private ProductFeignClient productClient;
   public OrderService(OrderRepository orderRepo, UserFeignClient userClient, ProductFeignClient productClient) {
	   this.orderRepo = orderRepo;
	   this.userClient = userClient;
	   this.productClient = productClient;
   }
   
   public Order saveOrder(Order order, String token){
	  UserDTO userDTO =  userClient.fetchUserById(order.getUserId(),token);
      Object obj = productClient.fetchProductById(order.getProductId());
	  Order dbOrder =  orderRepo.save(order);
      return dbOrder;
   }
}
