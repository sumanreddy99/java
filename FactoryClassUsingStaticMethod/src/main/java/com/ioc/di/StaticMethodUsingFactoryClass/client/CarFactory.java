package com.ioc.di.StaticMethodUsingFactoryClass.client;

import com.ioc.di.StaticMethodUsingFactoryClass.bean.Car;
public class CarFactory {

	private static String carName;
	
	
	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	
	public static  Car getCarFactory() throws InstantiationException, IllegalAccessException, 
	 ClassNotFoundException {
		
		return  (Car) Class.forName(carName).newInstance();
		
		
	}
	
	
}
