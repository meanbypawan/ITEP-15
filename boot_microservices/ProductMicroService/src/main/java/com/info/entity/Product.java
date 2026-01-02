package com.info.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
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
  private Integer id;
  private String title;
  private String description;
  private String category;
  private Float price;
  private Float discountPercentage;
  private Float rating;
  private Integer stock;
  private String brand;
  private String warrantyInformation;
  private String shippingInformation;
  private String availabilityStatus;
  
  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  private List<Reviews> reviews;
  
  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  private List<Images> images;
  
  private String thumbnail;

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
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

  public String getCategory() {
	return category;
  }

  public void setCategory(String category) {
	this.category = category;
  }

  public Float getPrice() {
	return price;
  }

  public void setPrice(Float price) {
	this.price = price;
  }

  public Float getDiscountPercentage() {
	return discountPercentage;
  }

  public void setDiscountPercentage(Float discountPercentage) {
	this.discountPercentage = discountPercentage;
  }

  public Float getRating() {
	return rating;
  }

  public void setRating(Float rating) {
	this.rating = rating;
  }

  public Integer getStock() {
	return stock;
  }

  public void setStock(Integer stock) {
	this.stock = stock;
  }

  public String getBrand() {
	return brand;
  }

  public void setBrand(String brand) {
	this.brand = brand;
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

  public String getThumbnail() {
	return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
	this.thumbnail = thumbnail;
  }
  
}
