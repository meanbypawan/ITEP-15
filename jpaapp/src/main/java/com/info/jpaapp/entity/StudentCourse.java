package com.info.jpaapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students_courses")
public class StudentCourse {
	@EmbeddedId
	private StudentCourseKey key;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "course_name")
	private String courseName;

	public StudentCourseKey getKey() {
		return key;
	}

	public void setKey(StudentCourseKey key) {
		this.key = key;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
