package com.info.javaconfigapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.javaconfigapp.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
      Employee e = (Employee) context.getBean("getEmployee");
      System.out.println(e.getId()+"  "+e.getName()+" "+e.getDepartment());
    }
}
