package com.info.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.info.testhibernate.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
      Configuration configuration = new Configuration();
      configuration.configure();
      SessionFactory sf =  configuration.buildSessionFactory();
      Session session =  sf.openSession();
      Transaction transaction = session.beginTransaction();
      
      Product p = new Product();
      p.setTitle("Teddy");
      p.setPrice(500);
      
      session.persist(p);
      
      transaction.commit();
      session.close();
      sf.close();
    }
}
