package com.infobeans.hb_mapping.entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class ClassRoom {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String classRoomName;
  @OneToMany(mappedBy = "room", cascade = CascadeType.REMOVE)
  private List<Student> studentList;
  public void setStudentList(List studentList) {
	  this.studentList = studentList;
  }
  public List<Student> getStudentList(){
	  return studentList;
  }
  public void setId(int id) {
	  this.id = id;
  }
  public void setClassRoomName(String classRoomName) {
	  this.classRoomName = classRoomName;
  }
  public int getId() {
	  return id;
  }
  public String getClassRoomName() {
	  return classRoomName;
  }
}
