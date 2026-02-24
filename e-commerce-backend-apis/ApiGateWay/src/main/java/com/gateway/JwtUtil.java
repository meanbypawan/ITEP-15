package com.gateway;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
  private final String SECRETKEY = "fadklfdrerieriovnmvncmmbberhkhgfkhkfhghdfghdfreriogflhjfk";
  
  public Claims extractClaims(String token) {
	  return Jwts.parserBuilder()
	  .setSigningKey(Keys.hmacShaKeyFor(SECRETKEY.getBytes()))
	  .build()
	  .parseClaimsJws(token)
	  .getBody();
  }
  public void validateToken(String token) {
	  extractClaims(token);
  }
}
