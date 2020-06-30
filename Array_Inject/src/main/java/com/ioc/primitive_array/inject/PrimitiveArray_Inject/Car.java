package com.ioc.primitive_array.inject.PrimitiveArray_Inject;

public class Car {

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car");
	}
	
	private Engine[] engine;
	
	private String[] carName;
	
	public void setCarName(String[] carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	public void prinetData() {
		
		for(Engine e: engine) {
			System.out.println("Engine  "+e.getModalYear());
		}
		for(String car:carName) {
			System.out.println("Car  "+ car);
		  }
		}
	
	
	
}
