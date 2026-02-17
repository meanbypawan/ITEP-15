package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Integer>{

}
