package com.ioc.di.Requiredannotation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.Requiredannotation.pojo.Car;

public class RequiredAnnotationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		Object o=applicationContext.getBean("c1");
		
		Car h=(Car)o;
		h.printData();
		
	}

}
