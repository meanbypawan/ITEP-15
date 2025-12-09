package com.info.testdi.entity;

public class Customer {
	private int id;
	private String name;
	private int age;
    public Customer(int id, String name, int age) {
    	System.out.println("Construcotr called...");
    	this.id = id;
    	this.name = name;
    	this.age = age;
    }
    public Customer() {}
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setter called....");
		this.age = age;
	}
    
	public void display() {
		System.out.println(id+"  "+name+"  "+age);
	}
}
