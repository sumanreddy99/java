package com.ioc.di.InjectAnnotation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.InjectAnnotation.bean.Car;

public class InjectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
	Car c= (Car)applicationContext.getBean("car");
	c.printData();
	
	}

}
