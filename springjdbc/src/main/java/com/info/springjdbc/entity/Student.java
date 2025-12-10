package com.info.springjdbc.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.info.springjdbc.dao.StudentDAO;

public class Student {
	private int id;
	private String name;
	private String course;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
