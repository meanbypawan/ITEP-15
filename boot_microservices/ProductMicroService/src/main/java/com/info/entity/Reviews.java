package com.info.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer rating;
  private String comment;
  private String date;
  private String reviewerName;
  private String reviewerEmail;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public Integer getRating() {
	return rating;
  }
  public void setRating(Integer rating) {
	this.rating = rating;
  }
  public String getComment() {
	return comment;
  }
  public void setComment(String comment) {
	this.comment = comment;
  }
  public String getDate() {
	return date;
  }
  public void setDate(String date) {
	this.date = date;
  }
  public String getReviewerName() {
	return reviewerName;
  }
  public void setReviewerName(String reviewerName) {
	this.reviewerName = reviewerName;
  }
  public String getReviewerEmail() {
	return reviewerEmail;
  }
  public void setReviewerEmail(String reviewerEmail) {
	this.reviewerEmail = reviewerEmail;
  }
  public Product getProduct() {
	return product;
  }
  public void setProduct(Product product) {
	this.product = product;
  }
  
}
