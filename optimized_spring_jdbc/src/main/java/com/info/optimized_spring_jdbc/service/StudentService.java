package com.info.optimized_spring_jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.optimized_spring_jdbc.dao.StudentDAO;
import com.info.optimized_spring_jdbc.entity.Student;

@Service
public class StudentService {
   @Autowired	
   private StudentDAO studentDAO;
   
   @Transactional
   public boolean save(Student s) {
	   return studentDAO.save(s);
   }
}







