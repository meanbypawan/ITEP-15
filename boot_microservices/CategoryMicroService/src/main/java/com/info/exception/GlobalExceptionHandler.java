package com.info.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(Exception.class)
   public ResponseEntity<String> handleInternalServer(Exception e){
	   return ResponseEntity.internalServerError().body(e.getMessage());
   }
}
