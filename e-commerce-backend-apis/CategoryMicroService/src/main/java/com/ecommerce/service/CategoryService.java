package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.Category;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.feignclient.ProductClient;
import com.ecommerce.repo.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {
  private final CategoryRepository categoryRepo;
  private ProductClient productFeignClient;
  public CategoryService(CategoryRepository categoryRepo,ProductClient productFeignClient) {
	  this.categoryRepo = categoryRepo;
	  this.productFeignClient = productFeignClient;
  }
  @Transactional
  public List<Category> saveInBulk(List<String> list){
	  List<Category> categoryList = new ArrayList<>();
	  for(String s : list) {
		  Category c = new Category();
		  c.setCategoryName(s);
		  categoryList.add(c);
	  }
	  List<Category> dbList =  categoryRepo.saveAll(categoryList);
	  return dbList;
  }
  public List<Category> fetchAll(){
	  return categoryRepo.findAll();
  }
  
  public Category fetchById(int id) {
	  return categoryRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource not found | Id not found"));
  }
  
  public Category deleteById(int id) {
	Category dbCategory =   categoryRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource not found | Id not found"));
    categoryRepo.delete(dbCategory);
    return dbCategory;
  }
  public List<Object> fetchProduct(String category){
	 return productFeignClient.fetchProductByCategory(category);
  }
}


