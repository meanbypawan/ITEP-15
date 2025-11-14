package com.info.ecommerceapp.util;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import jakarta.persistence.AttributeConverter;

public class DataConvertor implements AttributeConverter<String, String> {
	private static final String ALGORITHM = "AES";
	private static final String KEY = "MySuperSecretKey";

	@Override
	public String convertToDatabaseColumn(String attribute) {
		try {
			if (attribute == null)
				return null;
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			SecretKeySpec certificate = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, certificate);
			byte[] encryptedBytes = cipher.doFinal(attribute.getBytes());
			return Base64.getEncoder().encodeToString(encryptedBytes);
		} catch (Exception e) {
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
			SecretKeySpec certificate = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, certificate);
			byte[] decodedBytes = Base64.getDecoder().decode(dbData.getBytes());
    		byte[] decryptedData = cipher.doFinal(decodedBytes);
			return new String(decryptedData);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

}
