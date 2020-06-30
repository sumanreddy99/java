package com.ioc.di.methodreplacer.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.methodreplacer.bean.Bank;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		
		
		Bank b=(Bank)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		b.deposit();
		b.CalInt();
		b.withDraw();
		
}
}
