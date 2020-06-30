package com.ioc.di.FactoryClassUsingFactorybean.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.FactoryClassUsingFactorybean.bean.Car;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		Car con= (Car) ap.getBean("cf");
		con.drive();
	}

}
