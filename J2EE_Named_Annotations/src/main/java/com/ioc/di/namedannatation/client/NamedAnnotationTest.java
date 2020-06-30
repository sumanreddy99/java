package com.ioc.di.namedannatation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.namedannatation.bean.Car;

public class NamedAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
	Car c= (Car)applicationContext.getBean(Car.class);
	c.printData();
	
	}

}
