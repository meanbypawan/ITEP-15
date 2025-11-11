package com.info.testmapping;

import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.testmapping.entity.Passport;
import com.info.testmapping.entity.User;
import com.info.testmapping.util.HiberanteUtil;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for creating user");
			System.out.println("Press 2 for fetch user");
			System.out.println("Press 0 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				fetch();
				break;
			case 0:
				System.exit(0);
			}
		}
	}

	public static void fetch() {
		SessionFactory sessionFactory = HiberanteUtil.getFactory();
		try (Session session = sessionFactory.openSession();) {
			User user = session.get(User.class, 1);
			//System.out.println(user.getName());
			// Passport passport = user.getPassport();
			// System.out.println(passport.getPassportNo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insert() {
		SessionFactory sessionFactory = HiberanteUtil.getFactory();
		try (Session session = sessionFactory.openSession();) {
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setName("Atul");
			Passport passport = new Passport();
			passport.setPassportNo("A1000001");
			passport.setUser(user);
			user.setPassport(passport);
			session.persist(user);
			transaction.commit();
			System.out.println("Record Saved...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
