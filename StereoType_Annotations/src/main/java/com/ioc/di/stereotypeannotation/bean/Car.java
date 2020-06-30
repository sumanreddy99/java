package com.ioc.di.stereotypeannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class Car {

	
	
	
	@Autowired
	private Engine engine;

	
	public void printData() {
		// TODO Auto-generated method stub
		
		  System.out.println("Modal Year  " + engine.getModalYear());
		 
	}

}
