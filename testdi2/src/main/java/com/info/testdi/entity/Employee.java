package com.info.testdi.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> addressList;
	private Set<String> phoneList;
	private Map<String, String> projectList;

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

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Set<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(Set<String> phoneList) {
		this.phoneList = phoneList;
	}

	public Map<String, String> getProjectList() {
		return projectList;
	}

	public void setProjectList(Map<String, String> projectList) {
		this.projectList = projectList;
	}
    
	public void display() {
		System.out.println("Employee Basic Details : "+id+" "+name);
		System.out.println("Address Details : "+addressList.toString());
		System.out.println("Phone List : "+phoneList.toString());
		System.out.println("Projec List : "+projectList.toString());
	}
}
