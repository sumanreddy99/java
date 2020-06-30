package com.ioc.di.staticvariable.client;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.di.staticvariable.bean.Car;

public class StaticVariableDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * MethodInvokingFactoryBean bean=new MethodInvokingFactoryBean();
		 * 
		 * bean.setArguments(args); bean.setStaticMethod(null);
		 */
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
	Car c= (Car)applicationContext.getBean(Car.class);
	c.printData();
	
	}

}
