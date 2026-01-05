package com.info.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.info.dto.ProductDTO;
import com.info.dto.ProductResponseDTO;
import com.info.dto.ReviewsDTO;
import com.info.entity.Images;
import com.info.entity.Product;
import com.info.entity.Reviews;
import com.info.externalservice.ProductClient;
import com.info.repo.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
  private ProductClient productClient;
  private ProductRepository productRepo;
  public ProductService(ProductClient productClient,ProductRepository productRepo) {
	  this.productClient = productClient;
	  this.productRepo = productRepo;
  }
  public ProductResponseDTO getProducts() {
	  return productClient.getProducts();
  }
  @Transactional
  public HashMap<String, Object> saveInBulk(){
	  HashMap<String, Object>hm = new HashMap<>();
	  ProductResponseDTO responseDTO =  productClient.getProducts();
	  System.out.println(responseDTO.toString());
	  
	  List<ProductDTO> dtoList =  responseDTO.getProducts();
	  List<Product> productList = new ArrayList<>();
	  
	  for(ProductDTO dto : dtoList) {
		 Product p = new Product();
		 p.setTitle(dto.getTitle());
		 p.setPrice(dto.getPrice());
		 p.setDescription(dto.getDescription());
		 p.setBrand(dto.getBrand());
		 p.setStock(dto.getStock());
		 p.setRating(dto.getRating());
		 p.setAvailabilityStatus(dto.getAvailabilityStatus());
		 p.setWarrantyInformation(dto.getWarrantyInformation());
		 p.setShippingInformation(dto.getShippingInformation());
		 p.setDiscountPercentage(dto.getDiscountPercentage());
		 p.setThumbnail(dto.getThumbnail());
		 p.setCategory(dto.getCategory());
		 List<ReviewsDTO> reviewsDTOList =  dto.getReviews();
	     List<Reviews> reviewsList = new ArrayList<>();
	     for(ReviewsDTO reviewDTO : reviewsDTOList) {
	    	Reviews r = new Reviews();
	    	r.setComment(reviewDTO.getComment());
	    	r.setReviewerEmail(reviewDTO.getReviewerEmail());
	    	r.setReviewerName(reviewDTO.getReviewerName());
	    	r.setDate(reviewDTO.getDate());
	    	r.setRating(reviewDTO.getRating());
	    	r.setProduct(p);
	    	reviewsList.add(r);
	     }
	     p.setReviews(reviewsList);
	     List<String> imageUrlList =  dto.getImages();
	     List<Images> imageList = new ArrayList<>();
	  
	     for(String url: imageUrlList) {
	    	 Images img = new Images();
	    	 img.setImageUrl(url);
	    	 img.setProduct(p);
	    	 imageList.add(img);
	     }
	     p.setImages(imageList);
	     productList.add(p);
	  }
	  List<Product>dbProductList =  productRepo.saveAll(productList);
	  hm.put("message", "All product saved");
	  return hm;
  }
  public List<ProductDTO> getProductByCategory(String categoryName) {
	 List<Product> list =  productRepo.findByCategory(categoryName);
     List<ProductDTO> dtoList = new ArrayList<>();
     
     for(Product p : list) {
    	 ProductDTO dto = new ProductDTO();
    	 dto.setId(p.getId());
    	 dto.setTitle(p.getTitle());
    	 dto.setPrice(p.getPrice());
    	 dto.setDiscountPercentage(p.getDiscountPercentage());
    	 dto.setBrand(p.getBrand());
    	 dto.setWarrantyInformation(p.getWarrantyInformation());
    	 dto.setShippingInformation(p.getShippingInformation());
    	 dto.setAvailabilityStatus(p.getAvailabilityStatus());
    	 dto.setDescription(p.getDescription());
    	 dto.setStock(p.getStock());
    	 dto.setThumbnail(p.getThumbnail());
    	 List<String> dtoImageList = new ArrayList<>();
    	 List<Images> imagesList =  p.getImages();
         for(Images img : imagesList) {
        	 dtoImageList.add(img.getImageUrl());
         }
         dto.setImages(dtoImageList);
         
         List<Reviews> reviewsList =  p.getReviews();
         List<ReviewsDTO> dtoReviewList = new ArrayList<>();
         
         for(Reviews r : reviewsList) {
        	 ReviewsDTO reviewDTO = new ReviewsDTO();
        	 reviewDTO.setComment(r.getComment());
        	 reviewDTO.setDate(r.getDate());
        	 reviewDTO.setId(r.getId());
        	 reviewDTO.setReviewerEmail(r.getReviewerEmail());
        	 reviewDTO.setReviewerName(r.getReviewerName());
        	 reviewDTO.setRating(r.getRating());
        	 dtoReviewList.add(reviewDTO);
         }
         dto.setReviews(dtoReviewList);
         dtoList.add(dto);
     }
     return dtoList;
  }
}








