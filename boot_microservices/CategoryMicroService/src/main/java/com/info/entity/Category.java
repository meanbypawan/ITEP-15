package com.info.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String slug;
  private String name;
  private String url;
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public String getSlug() {
	return slug;
  }
  public void setSlug(String slug) {
	this.slug = slug;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getUrl() {
	return url;
  }
  public void setUrl(String url) {
	this.url = url;
  }
  
  
}
