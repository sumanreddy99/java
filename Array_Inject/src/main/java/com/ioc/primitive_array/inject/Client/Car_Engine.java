package com.ioc.primitive_array.inject.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.primitive_array.inject.PrimitiveArray_Inject.Car;
import com.ioc.primitive_array.inject.PrimitiveArray_Inject.NameTest;

public class Car_Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "resources/Car.xml", "resources/Engine.xml" };
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(names);
		Car t = (Car) applicationContext.getBean("t");
		t.prinetData();

	}

}
