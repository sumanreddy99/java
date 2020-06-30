package com.java;

public class Car {

	
	private Engine engine;
	public Car(String type) {
		// TODO Auto-generated constructor stub

	 engine=new Engine();
	engine.seteType(type);
	
	
	}
	public Engine getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
}
