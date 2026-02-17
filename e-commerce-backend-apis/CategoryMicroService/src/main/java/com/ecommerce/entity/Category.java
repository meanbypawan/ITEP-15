package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name="category_name")
  private String categoryName;

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public String getCategoryName() {
	return categoryName;
  }

  public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
  }
  
  
}
