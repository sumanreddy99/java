package com.ioc.di.InstanceMethodUsingFactoryClass.client;

import com.ioc.di.InstanceMethodUsingFactoryClass.bean.Car;
public class CarFactory {

	private  String carName;
	
	
	public  void setCarName(String carName) {
		this.carName = carName;
	}
	
	public   Car getCarFactory() throws InstantiationException, IllegalAccessException, 
	 ClassNotFoundException {
		
		return  (Car) Class.forName(carName).newInstance();
		
		
	}
	
	
}
