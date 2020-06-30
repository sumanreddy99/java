package com.ioc.di.staticvariable.bean;

/**
 * Hello world!
 *
 */
public class Car {

private static String name;


public static void setName(String name) {
	Car.name = name;
}
	
	public void printData() {
		// TODO Auto-generated method stub
		
		  System.out.println("Car name  " + name);
		 
	}

}
