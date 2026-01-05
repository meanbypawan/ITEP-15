package com.info.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
   List<Product> findByCategory(String categoryName);
}
