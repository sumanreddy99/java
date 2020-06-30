package com.ioc.di.autowiring_annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * Hello world!
 *
 */
public class Car {

	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	@Qualifier(value =  "engine")
	@Autowired
	private Engine engine;

	
	public void printData() {
		// TODO Auto-generated method stub
		
		  System.out.println("Car  " + name); 
		  System.out.println("Modal Year  " + engine.getModalYear());
		 
	}

}
