package com.info.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product_images")
public class Images { 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String imageUrl;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public String getImageUrl() {
	return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
  }
  public Product getProduct() {
	return product;
  }
  public void setProduct(Product product) {
	this.product = product;
  }
  
}
