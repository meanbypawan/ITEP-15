package com.ecommerce.dto;

import java.util.List;

import com.ecommerce.entity.Images;
import com.ecommerce.entity.Reviews;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class ProductDTO {
   	  private int id;
	  private String title;
	  private String description;
	  private String brand;
	  private float price;
	  private float discountPercentage;
	  private float rating;
	  private int stock;
	  private String category;
	  private String warrantyInformation;
	  private String shippingInformation;
	  private String availabilityStatus;
	  private String returnPolicy;
	  private String thumbnail;
	  private List<ReviewDTO> reviews;
	  private List<String> images;
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
	  public List<ReviewDTO> getReviews() {
		  return reviews;
	  }
	  public void setReviews(List<ReviewDTO> reviews) {
		  this.reviews = reviews;
	  }
	  public List<String> getImages() {
		  return images;
	  }
	  public void setImages(List<String> images) {
		  this.images = images;
	  }
	  

}
