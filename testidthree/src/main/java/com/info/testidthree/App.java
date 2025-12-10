package com.info.testidthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.testidthree.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       Student s = (Student) context.getBean("getStudent");
       System.out.println(s.getId()+"  "+s.getName()+"  "+s.getCouse());
    }
}
