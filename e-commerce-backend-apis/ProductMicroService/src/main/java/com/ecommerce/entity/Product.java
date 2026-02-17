package com.ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String description;
  private String brand;
  private float price;
  @Column(name = "discount_percentage")
  private float discountPercentage;
  private float rating;
  private int stock;
  private String category;
  @Column(name="warranty_information")
  private String warrantyInformation;
  
  @Column(name="shipping_information")
  private String shippingInformation;
  
  @Column(name="availability_status")
  private String availabilityStatus;
  
  @Column(name="return_policy")
  private String returnPolicy;
  private String thumbnail;
  
  @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
  private List<Reviews> reviews;
  
  @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
  private List<Images> images;

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public String getTitle() {
	return title;
  }

  public void setTitle(String title) {
	this.title = title;
  }

  public String getDescription() {
	return description;
  }

  public void setDescription(String description) {
	this.description = description;
  }

  public String getBrand() {
	return brand;
  }

  public void setBrand(String brand) {
	this.brand = brand;
  }

  public float getPrice() {
	return price;
  }

  public void setPrice(float price) {
	this.price = price;
  }

  public float getDiscountPercentage() {
	return discountPercentage;
  }

  public void setDiscountPercentage(float discountPercentage) {
	this.discountPercentage = discountPercentage;
  }

  public float getRating() {
	return rating;
  }

  public void setRating(float rating) {
	this.rating = rating;
  }

  public int getStock() {
	return stock;
  }

  public void setStock(int stocks) {
	this.stock = stocks;
  }

  public String getCategory() {
	return category;
  }

  public void setCategory(String category) {
	this.category = category;
  }

  public String getWarrantyInformation() {
	return warrantyInformation;
  }

  public void setWarrantyInformation(String warrantyInformation) {
	this.warrantyInformation = warrantyInformation;
  }

  public String getShippingInformation() {
	return shippingInformation;
  }

  public void setShippingInformation(String shippingInformation) {
	this.shippingInformation = shippingInformation;
  }

  public String getAvailabilityStatus() {
	return availabilityStatus;
  }

  public void setAvailabilityStatus(String availabilityStatus) {
	this.availabilityStatus = availabilityStatus;
  }

  public String getReturnPolicy() {
	return returnPolicy;
  }

  public void setReturnPolicy(String returnPolicy) {
	this.returnPolicy = returnPolicy;
  }

  public String getThumbnail() {
	return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
	this.thumbnail = thumbnail;
  }

  public List<Reviews> getReviews() {
	return reviews;
  }

  public void setReviews(List<Reviews> reviews) {
	this.reviews = reviews;
  }

  public List<Images> getImages() {
	return images;
  }

  public void setImages(List<Images> images) {
	this.images = images;
  }
  
}
