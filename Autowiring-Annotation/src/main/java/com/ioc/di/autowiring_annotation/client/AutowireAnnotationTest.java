package com.ioc.di.autowiring_annotation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.autowiring_annotation.bean.Car;

public class AutowireAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext_byannoatation.xml");
		
	Car c= (Car)applicationContext.getBean("car");
	c.printData();
	
	}

}
