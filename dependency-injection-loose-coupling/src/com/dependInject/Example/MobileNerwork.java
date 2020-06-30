package com.dependInject.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileNerwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new  ClassPathXmlApplicationContext("bean.xml");
Airtel airtel=context.getBean("airtel", Airtel.class);

	}

}
