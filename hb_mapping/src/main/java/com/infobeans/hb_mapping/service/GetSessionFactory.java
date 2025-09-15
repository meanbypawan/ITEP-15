package com.infobeans.hb_mapping.service;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class GetSessionFactory {
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static void shutDown(SessionFactory sessionFactory) {
		if(sessionFactory != null)
			sessionFactory.close();
	}
}
