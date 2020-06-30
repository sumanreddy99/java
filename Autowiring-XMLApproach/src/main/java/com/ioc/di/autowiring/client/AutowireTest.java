package com.ioc.di.autowiring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.autowiring.bean.Car;

public class AutowireTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext_byType.xml");
		
	Car c= (Car)applicationContext.getBean("car");
	c.printData();
	
	}

}
