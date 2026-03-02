package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
