package com.dependInject.Example;

public class Airtel {

	public Airtel(Service service){
		System.out.println("Airtel service");
		service.service();
	}
	
}
