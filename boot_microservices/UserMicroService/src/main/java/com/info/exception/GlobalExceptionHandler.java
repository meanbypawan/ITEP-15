package com.info.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(ResourceNotFoundException.class)	
   public ResponseEntity<HashMap<String,Object>> handleNotFound(ResourceNotFoundException e){
	   HashMap< String, Object> hm = new HashMap<>();
	   hm.put("error", e.getMessage());
	   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(hm);
   }
   @ExceptionHandler(Exception.class) 	
   public ResponseEntity<HashMap<String, Object>> handleInternalServer(Exception e){
	   HashMap< String, Object> hm = new HashMap<>();
	   hm.put("error", e.getMessage());
	   return ResponseEntity.internalServerError().body(hm);
   }
}
