package com.ioc.di.resourceannotation.bean;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
public class Car {

	
@Resource	
private Engine e1;


public void printData() {
	// TODO Auto-generated method stub
System.out.println("Car   "+e1.getName());
}
}
