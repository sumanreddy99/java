package com.ioc.di.autowiring.bean;

import org.springframework.beans.factory.annotation.Required;

/**
 * Hello world!
 *
 */
public class Car {

	
	private String name;
	private Engine engine;

	private Engine engine1;
	
	/*
	 * public Car(String name1,Engine e,Engine e1) {
	 * 
	 * this.name=name1; this.engine=e; this.engine1=e1;
	 * 
	 * System.out.println("name  "+name); System.out.println("Engine "+
	 * engine.printData()); System.out.println("Engine1 "+engine1.printData()); }
	 */
	
	
	  public void setEngine1(Engine engine1) { this.engine1 = engine1; }
	  
	  public void setName(String name) { this.name = name; }
	  
	  public void setEngine(Engine engine) { this.engine = engine; }
	 
	public void printData() {
		// TODO Auto-generated method stub
		
		  System.out.println("Car  " + name); 
		  System.out.println("Modal Year  " + engine.getModalYear());
		  System.out.println("Modal Year  " + engine1.getModalYear());
		 
	}

}
