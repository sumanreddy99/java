package com.ioc.di.singleDI.bean;

/**
 * Hello world!
 *
 */
public class Car {

private static Car c; // static variable

public Car() {
	// TODO Auto-generated constructor stub
}

public static Car getInstance() {  // static method getInstance

	if(c==null) {
     c=new Car();		
		return c;
	}else {
		
		return c;
	}
 }

}
