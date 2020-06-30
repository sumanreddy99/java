package com.ioc.di.programmaticapproach.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values 1 or 2");
		int t = scanner.nextInt();

		switch (t) {

		case 1:

			DBConnection connection = (DBConnection) ap.getBean("connection");
			System.out.println("enter user id");
			int id = scanner.nextInt();

			System.out.println("enter user name");
			String username = scanner.next();

			/*
			 * System.out.println("enter user password"); String password=scanner.next();
			 */
			connection.save(id, username);
			break;

		default:

			ap.close();
			break;
		}

	}
}
}
