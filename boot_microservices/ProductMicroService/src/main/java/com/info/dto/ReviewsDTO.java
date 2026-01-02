package com.info.dto;

import com.info.entity.Product;

public class ReviewsDTO {
	 private Integer id;
	  private Integer rating;
	  private String comment;
	  private String date;
	  private String reviewerName;
	  private String reviewerEmail;
	  private Integer productId;
	  public Integer getId() {
		return id;
	  }
	  public Integer getProductId() {
		return productId;
	}
	  public void setProductId(Integer productId) {
		  this.productId = productId;
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
}
