package com.ioc.di.lookupDI.bean;

/**
 * Hello world!
 *
 */
public  class Truck {

	public  Engine myTruckEngine() {
		
		Engine engine=new Engine();
		engine.setName("AshokLeyland");
		return engine;
		
		
	}
}
