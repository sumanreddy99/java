package com.ioc.di.FactoryClassUsingFactorybean.client;

import org.springframework.beans.factory.FactoryBean;

import com.ioc.di.FactoryClassUsingFactorybean.bean.Car;
public class CarFactory implements FactoryBean<Object> {

	private  String carName;
	
	
	public  void setCarName(String carName) {
		this.carName = carName;
	}
	
	@Override
	public Object getObject() throws Exception {
		
		
		
		return (Car) Class.forName(carName).newInstance(); 
	}
	
	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
