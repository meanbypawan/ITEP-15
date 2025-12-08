package com.info.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.annotationconfig.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
      Employee e =  context.getBean(Employee.class);
      System.out.println(e.getId()+"  "+e.getName()+"  "+e.getDepartment());
    }
}
