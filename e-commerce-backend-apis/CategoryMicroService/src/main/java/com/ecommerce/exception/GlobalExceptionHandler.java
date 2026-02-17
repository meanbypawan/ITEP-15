package com.ecommerce.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<?> handleNotFound(Exception e){
	  return ResponseEntity.status(404).body(e.getMessage());
  }
  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleInternalServer(Exception e){
	 return ResponseEntity.internalServerError().body(e.getMessage()); 
  }
}
