package com.info.springjpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.springjpa.entity.User;
import com.info.springjpa.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
      UserService service =  context.getBean(UserService.class);
      List<User> userList =  service.getUserList();
      for(User user : userList)
    	  System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
      //      User user = new User();
//      user.setEmail("chk@gmail.com");
//      user.setPassword("12345");
//      user.setName("cheeku");
//      service.saveUser(user);
//      System.out.println("Record saved...");
    }
}
