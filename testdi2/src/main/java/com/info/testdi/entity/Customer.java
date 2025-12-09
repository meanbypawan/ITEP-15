package com.info.testdi.entity;

public class Customer {
	private int id;
	private String name;
	private int age;
	private NomineeDetails nomineeDetail;
    
    
	public NomineeDetails getNomineeDetail() {
		return nomineeDetail;
	}
	public void setNomineeDetail(NomineeDetails nomineeDetail) {
		this.nomineeDetail = nomineeDetail;
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
		System.out.println("Nominee Details : "+nomineeDetail.getName()+"  "+nomineeDetail.getContact());
	}
}
