package com.ecommerce;

import java.util.Date;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
  private final String SECRETKEY = "fadklfdrerieriovnmvncmmbberhkhgfkhkfhghdfghdfreriogflhjfk";
  
  public String generateToken(UserDetails user) {
	  String token = Jwts.builder()
	  .setSubject(user.getUsername())
	  .setClaims(Map.of("role",user.getAuthorities()))
	  .setIssuedAt(new Date())
	  .setExpiration(new Date(System.currentTimeMillis()+60*60*1000))
	  .signWith(Keys.hmacShaKeyFor(SECRETKEY.getBytes()), SignatureAlgorithm.HS256)
	  .compact();
	  return token;  
  }
}







