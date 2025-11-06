package com.info.crudapp.util;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import jakarta.persistence.AttributeConverter;

public class DataConvertor implements AttributeConverter<String, String>{
    private static final String ALGORITHM = "AES";
    private static final String KEY = "MySuperSecretKey";
	@Override
	public String convertToDatabaseColumn(String attribute) {
	  try {	
		if(attribute == null)
		 return null;
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		SecretKeySpec keySpecification = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, keySpecification);
		byte[] encryptedBytes =  cipher.doFinal(attribute.getBytes());
		String encryptedString =  Base64.getEncoder().encodeToString(encryptedBytes);
		System.out.println(encryptedString);
		return encryptedString;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
	  try {	
		if(dbData == null)
			return null;
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		SecretKeySpec keySpecification = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, keySpecification);
		byte[]  decodedBytes =  Base64.getDecoder().decode(dbData);
		byte[] decryptedBytes =  cipher.doFinal(decodedBytes);
		
		return new String(decryptedBytes);
	  }
	  catch(Exception e){
		  e.printStackTrace();
		  throw new RuntimeException(e.getMessage());
	  }
	}
  
}





