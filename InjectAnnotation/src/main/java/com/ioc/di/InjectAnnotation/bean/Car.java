package com.ioc.di.InjectAnnotation.bean;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Hello world!
 *
 */
public class Car {

	
@Inject	
private Engine e1;


public void printData() {
	// TODO Auto-generated method stub
System.out.println("Car   "+e1.getName());
}
}
