package com.info.ecommerceapp.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordHashUtil {
  
  public static String hashPassword(String plainPassword) {
	return BCrypt.hashpw(plainPassword, BCrypt.gensalt(12));
  }
  public static boolean checkPassword(String plainPassword, String dbPassword) {
	return BCrypt.checkpw(plainPassword, dbPassword); 
  }
}
