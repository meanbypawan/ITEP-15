package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String contact;
  private String address;
  private String title;
  private float price;
  private String brand;
  private int productId;
  private int userId;
  private int qty;
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getContact() {
	return contact;
  }
  public void setContact(String contact) {
	this.contact = contact;
  }
  public String getAddress() {
	return address;
  }
  public void setAddress(String address) {
	this.address = address;
  }
  public String getTitle() {
	return title;
  }
  public void setTitle(String title) {
	this.title = title;
  }
  public float getPrice() {
	return price;
  }
  public void setPrice(float price) {
	this.price = price;
  }
  public String getBrand() {
	return brand;
  }
  public void setBrand(String brand) {
	this.brand = brand;
  }
  public int getProductId() {
	return productId;
  }
  public void setProductId(int productId) {
	this.productId = productId;
  }
  public int getUserId() {
	return userId;
  }
  public void setUserId(int userId) {
	this.userId = userId;
  }
  public int getQty() {
	return qty;
  }
  public void setQty(int qty) {
	this.qty = qty;
  }
  
}
