package com.ioc.di.PropertiesInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.collectionInject.pojo.DriverTest;

public class PropertiesInjectionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		/* normal dtd schema */
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("resources/drivers1.xml");
		 */
		
		/*
		 * schema based properties
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/drivers.xml");

		DriverTest c1 =(DriverTest) applicationContext.getBean("t");
			
        c1.printData();

	}

}
