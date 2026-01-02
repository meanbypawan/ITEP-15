package com.info.exception;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(Exception.class)
   public ResponseEntity<HashMap<String, Object>> handleInternalServer(Exception e){
	   e.printStackTrace();
	   HashMap<String, Object> hm = new HashMap<>();
       hm.put("error", "Oops! something went wrong.");
       return ResponseEntity.internalServerError().body(hm);
   }
}
