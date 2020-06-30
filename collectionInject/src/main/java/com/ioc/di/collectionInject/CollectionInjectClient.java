package com.ioc.di.collectionInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.collectionInject.pojo.CarTest2;

public class CollectionInjectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		/* collection Type */
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("resources/Car.xml");
		 * 
		 * CarTest c =(CarTest) applicationContext.getBean("t");
		 *
		 * c.printData();
		 */		
		/* particular collection Type */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/CarCollection.xml");

		
		CarTest2 c1 =(CarTest2) applicationContext.getBean("t");
			
        c1.printData();

	}

}
