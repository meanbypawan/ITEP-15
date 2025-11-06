package com.info.crudapp.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordHashUtil {
   public static String hashPassword(String plainPassword) {
	   String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt(12));
	   System.out.println(hashedPassword);
	   return hashedPassword;
   }
   public static boolean checkPassword(String plainPassword, String hashPassword) {
	   return BCrypt.checkpw(plainPassword, hashPassword);
	}
}
