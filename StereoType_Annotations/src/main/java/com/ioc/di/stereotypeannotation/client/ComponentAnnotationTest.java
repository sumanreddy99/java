package com.ioc.di.stereotypeannotation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.stereotypeannotation.bean.Car;

public class ComponentAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext_bycomponentscan.xml");
		
	Car c= (Car)applicationContext.getBean(Car.class);
	c.printData();
	
	}

}
