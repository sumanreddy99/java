package com.ioc.di.PropertyandConstructorNS.pojo;

/**
 * Hello world!
 *
 */
public class Engine {

	private String modalYear;

	public Engine(String modalYear) {
		// TODO Auto-generated constructor stub
		this.modalYear=modalYear;
		System.out.println("Engine Object created");
	}

	
	public String getModalYear() {
		return modalYear;
	}
	
   }
   
   
