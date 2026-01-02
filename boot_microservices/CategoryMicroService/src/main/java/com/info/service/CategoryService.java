package com.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.info.dto.CategoryDTO;
import com.info.entity.Category;
import com.info.externalservice.CategoryClient;
import com.info.repo.CategoryRepo;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {
  private CategoryRepo categoryRepo;
  private CategoryClient categoryClient;
  public CategoryService(CategoryRepo categoryRepo, CategoryClient categoryClient) {
	  this.categoryRepo = categoryRepo;
	  this.categoryClient = categoryClient;
  }
  
  @Transactional
  public List<Category> saveInBulk() {
	 List<CategoryDTO> dtoList =  categoryClient.getCategories();
     List<Category> categoryList = new ArrayList<>();
     for(CategoryDTO dto : dtoList) {
    	 Category c = new Category();
    	 c.setName(dto.getName());
    	 c.setSlug(dto.getSlug());
    	 c.setUrl(dto.getUrl());
    	 categoryList.add(c);
     }
     List<Category> dbCategories =  categoryRepo.saveAll(categoryList);
     return dbCategories;
  }
  
  public List<Category> getList(){
	  return categoryRepo.findAll();
  }
}







