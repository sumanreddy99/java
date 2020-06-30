package com.ioc.di.PropertyandConstructorNS.pojo;

import org.springframework.beans.factory.annotation.Required;

/**
 * Hello world!
 *
 */
public class Car {

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car Object created");
	}

	private String name;
	private Engine engine;

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("Car  " + name);
		System.out.println("Modal Year  " + engine.getModalYear());
	}

}
