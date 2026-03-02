package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Order;
import com.ecommerce.service.OrderService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;
    public OrderController(OrderService orderService) {
    	this.orderService = orderService;
    }
	@PostMapping
	public ResponseEntity<?> saveOrder(@RequestBody Order order, @RequestHeader("Authorization") String token){
	  return ResponseEntity.ok(orderService.saveOrder(order, token));	
	}
}
