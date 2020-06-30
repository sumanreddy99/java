package com.ioc.di.namedannatation.bean;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Named
public class Car {

	
	
	@Qualifier(value = "e1")
	
	@Resource
	private Engine engine;

	
	public void printData() {
		// TODO Auto-generated method stub
		
		  System.out.println("Modal Year  " + engine.getModalYear());
		 
	}

}
