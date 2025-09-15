package testio;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private int age;
    
	public static String universityName = "InfoBeans Foundation";
    
	transient private String address;
	
	private String contact;
	
	public Student() {

	}

	public Student(int id, String name, int age, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
    
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
