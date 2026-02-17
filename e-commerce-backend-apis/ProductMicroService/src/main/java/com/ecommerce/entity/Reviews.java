package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;	
  private int rating;
  private String comment;
  private String date;
  @Column(name = "reviewer_name")
  private String reviewerName;
  
  @Column(name="reviewer_email")
  private String reviewerEmail;
  
  @ManyToOne
  private Product product;

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public int getRating() {
	return rating;
  }

  public void setRating(int rating) {
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
