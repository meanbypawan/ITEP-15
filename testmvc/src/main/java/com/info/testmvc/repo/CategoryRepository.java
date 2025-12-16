package com.info.testmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.testmvc.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
