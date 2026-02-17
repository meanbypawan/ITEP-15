package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product_images")
public class Images {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "image_url")
  private String imageUrl;
  @ManyToOne
  private Product product;
  public int getId() {
	return id;
  }
  public void setId(int id) {
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
