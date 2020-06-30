package com.ioc.di.lookupDI.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.lookupDI.bean.Bus;
import com.ioc.di.lookupDI.bean.Car;
import com.ioc.di.lookupDI.bean.Truck;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		Car c=(Car)ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getName());
		
		
		Bus b=(Bus)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		
		System.out.println(b.mybusEngine().getName());
		
		Truck t=(Truck)ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		
		System.out.println(t.myTruckEngine().getName());
		
}
}
