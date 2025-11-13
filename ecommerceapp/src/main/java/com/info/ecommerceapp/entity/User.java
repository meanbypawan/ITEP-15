package com.info.ecommerceapp.entity;

import com.info.ecommerceapp.util.DataConvertor;
import com.info.ecommerceapp.util.PasswordHashUtil;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String name;
	@Column(unique = true, nullable = false)
	private String email;
	private String password;
	
	@Convert(converter = DataConvertor.class)
	private String aadharNo;
	@OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
	private Cart cart;

	@PrePersist
	@PreUpdate
	public void encryptPassword() {
	    if(password!=null && (!password.startsWith("$2a$")))
		  password = PasswordHashUtil.hashPassword(password);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
