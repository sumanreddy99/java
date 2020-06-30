package com.ioc.di.collectionInject.pojo;

import java.util.Properties;
import java.util.Set;



public class DriverTest {

	private Properties driverclasses;
	
	public void setDriverclasses(Properties driverclasses) {
		this.driverclasses = driverclasses;
	}
	
	public void printData() {
	Set keys=driverclasses.keySet();
	
	for(Object key:keys)
		System.out.println(key +" : " + driverclasses.getProperty(key.toString()));
	
	
	}
		
	
	}
	
	
