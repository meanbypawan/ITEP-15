package com.info.testdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.info.testdi.entity.Employee;

public class MainTwo {
   public static void main(String args[]) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   Employee e =  context.getBean(Employee.class,"emp");
       e.display();
   }
}
