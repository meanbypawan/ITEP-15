package com.ecommerce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.dto.ReviewDTO;
import com.ecommerce.entity.Images;
import com.ecommerce.entity.Product;
import com.ecommerce.entity.Reviews;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repo.ImagesRepository;
import com.ecommerce.repo.ProductRepository;
import com.ecommerce.repo.ReviewRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
  private ProductRepository productRepo;
  private ReviewRepository reviewRepo;
  private ImagesRepository imageRepo;
  
  public ProductService(ProductRepository productRepo, ReviewRepository reviewRepo, ImagesRepository imageRepo) {
	 this.productRepo = productRepo;
	 this.reviewRepo = reviewRepo;
	 this.imageRepo = imageRepo;
  }
  
  @Transactional
  public HashMap<String, String> saveInBulk(List<ProductDTO> list){
	  HashMap<String, String> hm = new HashMap<String,String>();
	  List<Product> productList = new ArrayList<Product>();
	  for(ProductDTO dto:list) {
		Product p = new Product();
		p.setTitle(dto.getTitle());
		p.setPrice(dto.getPrice());
		p.setRating(dto.getRating());
		p.setStock(dto.getStock());
		p.setBrand(dto.getBrand());
		p.setDescription(dto.getDescription());
		p.setWarrantyInformation(dto.getWarrantyInformation());
		p.setShippingInformation(dto.getShippingInformation());
		p.setAvailabilityStatus(dto.getAvailabilityStatus());
		p.setThumbnail(dto.getThumbnail());
		p.setDiscountPercentage(dto.getDiscountPercentage());
		p.setCategory(dto.getCategory());
		p.setReturnPolicy(dto.getReturnPolicy());
		List<ReviewDTO>reviewDTO =  dto.getReviews();
		List<Reviews> reviewsList = new ArrayList<>();
		for(ReviewDTO rDTO: reviewDTO) {
			Reviews r = new Reviews();
			r.setComment(rDTO.getComment());
			r.setDate(rDTO.getDate());
			r.setReviewerEmail(rDTO.getReviewerEmail());
			r.setReviewerName(rDTO.getReviewerName());
			r.setRating(rDTO.getRating());
			r.setProduct(p);
			reviewsList.add(r);
		}
		p.setReviews(reviewsList);
		List<String> imageDTOList =  dto.getImages();
		List<Images> imagesList = new ArrayList<>();
		for(String url : imageDTOList) {
			Images img = new Images();
			img.setImageUrl(url);
			img.setProduct(p);
			imagesList.add(img);
		}
		p.setImages(imagesList);
		productList.add(p);
	  }
	  productRepo.saveAll(productList);
	  hm.put("message", "All product saved...");
	  return hm;
  }
  
  public List<ProductDTO> fetchAll() {
	  List<Product>dbList =  productRepo.findAll();
	  List<ProductDTO> dtoList = new ArrayList<>();
	  for(Product p : dbList) {
		  ProductDTO dto = new ProductDTO();
		  dto.setId(p.getId());
		  dto.setThumbnail(p.getThumbnail());
		  dto.setTitle(p.getTitle());
		  dto.setPrice(p.getPrice());
		  dto.setBrand(p.getBrand());
		  dto.setDescription(p.getDescription());
		  dto.setStock(p.getStock());
		  dto.setRating(p.getRating());
		  dto.setShippingInformation(p.getShippingInformation());
		  dto.setAvailabilityStatus(p.getAvailabilityStatus());
		  dto.setWarrantyInformation(p.getWarrantyInformation());
		  dto.setDiscountPercentage(p.getDiscountPercentage());
		  dto.setReturnPolicy(p.getReturnPolicy());
		  dto.setCategory(p.getCategory());
		  List<Reviews> reviewsList =  p.getReviews();
		  List<ReviewDTO> reviewDTOList = new ArrayList<>();
		  for(Reviews r : reviewsList) {
			  ReviewDTO rd = new ReviewDTO();
			  rd.setComment(r.getComment());
			  rd.setDate(r.getDate());
			  rd.setRating(r.getRating());
			  rd.setReviewerEmail(r.getReviewerEmail());
			  rd.setReviewerName(r.getReviewerName());
			  reviewDTOList.add(rd);
		  }
		  dto.setReviews(reviewDTOList);
		  
		  List<Images> imagesList = p.getImages();
		  List<String> imagesDTOList = new ArrayList<>();
		  for(Images img : imagesList) {
			  imagesDTOList.add(img.getImageUrl());
		  }
		  dto.setImages(imagesDTOList);
		  dtoList.add(dto);
	  }
	  return dtoList;
  }
  
  public ProductDTO fetchById(int id) {
	 Product p =  productRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found")); 
	 ProductDTO dto = new ProductDTO();
	  dto.setId(p.getId());
	  dto.setThumbnail(p.getThumbnail());
	  dto.setTitle(p.getTitle());
	  dto.setPrice(p.getPrice());
	  dto.setBrand(p.getBrand());
	  dto.setDescription(p.getDescription());
	  dto.setStock(p.getStock());
	  dto.setRating(p.getRating());
	  dto.setShippingInformation(p.getShippingInformation());
	  dto.setAvailabilityStatus(p.getAvailabilityStatus());
	  dto.setWarrantyInformation(p.getWarrantyInformation());
	  dto.setDiscountPercentage(p.getDiscountPercentage());
	  dto.setReturnPolicy(p.getReturnPolicy());
	  dto.setCategory(p.getCategory());
	  List<Reviews> reviewsList =  p.getReviews();
	  List<ReviewDTO> reviewDTOList = new ArrayList<>();
	  for(Reviews r : reviewsList) {
		  ReviewDTO rd = new ReviewDTO();
		  rd.setComment(r.getComment());
		  rd.setDate(r.getDate());
		  rd.setRating(r.getRating());
		  rd.setReviewerEmail(r.getReviewerEmail());
		  rd.setReviewerName(r.getReviewerName());
		  reviewDTOList.add(rd);
	  }
	  dto.setReviews(reviewDTOList);
	  
	  List<Images> imagesList = p.getImages();
	  List<String> imagesDTOList = new ArrayList<>();
	  for(Images img : imagesList) {
		  imagesDTOList.add(img.getImageUrl());
	  }
	  dto.setImages(imagesDTOList);
	 return dto;
  }
  
  public List<ProductDTO> fetchByCategory(String category){
      List<Product> dbList = productRepo.findByCategory(category);
      List<ProductDTO> dtoList = new ArrayList<>();
	  for(Product p : dbList) {
		  ProductDTO dto = new ProductDTO();
		  dto.setId(p.getId());
		  dto.setThumbnail(p.getThumbnail());
		  dto.setTitle(p.getTitle());
		  dto.setPrice(p.getPrice());
		  dto.setBrand(p.getBrand());
		  dto.setDescription(p.getDescription());
		  dto.setStock(p.getStock());
		  dto.setRating(p.getRating());
		  dto.setShippingInformation(p.getShippingInformation());
		  dto.setAvailabilityStatus(p.getAvailabilityStatus());
		  dto.setWarrantyInformation(p.getWarrantyInformation());
		  dto.setDiscountPercentage(p.getDiscountPercentage());
		  dto.setReturnPolicy(p.getReturnPolicy());
		  dto.setCategory(p.getCategory());
		  List<Reviews> reviewsList =  p.getReviews();
		  List<ReviewDTO> reviewDTOList = new ArrayList<>();
		  for(Reviews r : reviewsList) {
			  ReviewDTO rd = new ReviewDTO();
			  rd.setComment(r.getComment());
			  rd.setDate(r.getDate());
			  rd.setRating(r.getRating());
			  rd.setReviewerEmail(r.getReviewerEmail());
			  rd.setReviewerName(r.getReviewerName());
			  reviewDTOList.add(rd);
		  }
		  dto.setReviews(reviewDTOList);
		  
		  List<Images> imagesList = p.getImages();
		  List<String> imagesDTOList = new ArrayList<>();
		  for(Images img : imagesList) {
			  imagesDTOList.add(img.getImageUrl());
		  }
		  dto.setImages(imagesDTOList);
		  dtoList.add(dto);
	  }
	  return dtoList;
  }
}























