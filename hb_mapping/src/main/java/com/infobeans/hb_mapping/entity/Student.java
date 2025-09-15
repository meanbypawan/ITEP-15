package com.infobeans.hb_mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int marks;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Profile profile;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private ClassRoom room;
	
	public void setRoom(ClassRoom room) {
		this.room = room;
	}
	public ClassRoom getRoom() {
		return room;
	}
	public Student() {
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Profile getProfile() {
		return profile;
	}
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
