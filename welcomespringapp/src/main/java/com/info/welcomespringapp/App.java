package com.info.welcomespringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.info.welcomespringapp.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee e = (Employee) context.getBean("emp");    
       System.out.println(e);
    
       System.out.println(e.getId()+"  "+e.getName()+"  "+e.getDepartment());
    }
}








