package com.ioc.primitive_array.inject.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.primitive_array.inject.PrimitiveArray_Inject.NameTest;

public class NamesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/NameSpring.xml");
	NameTest t=(NameTest)applicationContext.getBean("t");
	t.printData();

	}

}
