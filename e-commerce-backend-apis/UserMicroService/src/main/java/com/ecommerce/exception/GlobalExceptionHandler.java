package com.ecommerce.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(ResourceNotFoundException.class)	
  public ResponseEntity<?> handleNotFound(ResourceNotFoundException e){
	  return ResponseEntity.status(404).body(e.getMessage());
  }
  @ExceptionHandler(Exception.class)	
  public ResponseEntity<?> handleInternalServerError(Exception e){
	  return ResponseEntity.internalServerError().body(e.getMessage());
  }

}
