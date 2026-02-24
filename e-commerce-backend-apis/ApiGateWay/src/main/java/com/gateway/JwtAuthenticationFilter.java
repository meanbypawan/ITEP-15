package com.gateway;


import java.net.http.HttpRequest;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServer;

@Component
public class JwtAuthenticationFilter implements GlobalFilter,Ordered{
    private final JwtUtil jwt;
	public JwtAuthenticationFilter(JwtUtil jwt) {
		this.jwt = jwt;
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		ServerHttpRequest request =  exchange.getRequest();
		String requestedRoute =  request.getURI().getPath();
		System.out.println(requestedRoute);
		 // ✅ Allow preflight CORS requests
	    if (request.getMethod().name().equals("OPTIONS")) {
	        return chain.filter(exchange);
	    }	
	    if(requestedRoute.equalsIgnoreCase("/category/") || requestedRoute.startsWith("/product")) {
	    	return chain.filter(exchange);
	    }
		if(requestedRoute.startsWith("/auth") || requestedRoute.startsWith("/auth/signin"))
			return chain.filter(exchange);
		
		if(!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION))
		  return unauthorized(exchange, "Authorization header is missing");
		
		String authHeader = request.getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
		System.out.println(authHeader);
		if(authHeader == null || !authHeader.startsWith("Bearer "))
		   return unauthorized(exchange,"Invalid Authorization Header");
		
		String token =  authHeader.substring(7);
		try {
			jwt.validateToken(token);
		}
		catch(Exception e) {
		 return	unauthorized(exchange, "Invalid Jwt Token");
		}
		return chain.filter(exchange);
	}
    public Mono<Void> unauthorized(ServerWebExchange exchange, String message){
	   exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
	   return exchange.getResponse().setComplete();
	}
	
}













