package com.ioc.di.PropertyandConstructorNS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.PropertyandConstructorNS.pojo.Car;

public class PropertyAndConstructorNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
	Car c= (Car)applicationContext.getBean("car");
	
	c.printData();
	}

}
