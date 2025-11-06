package com.info.crudapp.entity;

import com.info.crudapp.util.DataConvertor;
import com.info.crudapp.util.PasswordHashUtil;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(nullable = false, unique = true, length = 200)
	@Convert(converter = DataConvertor.class)
	private String email;

	@Column(nullable = false, length = 100)
	private String password;
    
	@PrePersist
	@PreUpdate
	public void hashPasswordBeforeSave() {
	   if(password != null && !password.startsWith("$2a$"))	
	    password = PasswordHashUtil.hashPassword(password);
    }
	public User() {
		super();
	}

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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
    
}
