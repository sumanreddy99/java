package com.di.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {
public static void main(String[] args) {
	ApplicationContext context=new  ClassPathXmlApplicationContext("bean.xml");
	Body body=context.getBean("body", Body.class);
	body.bodyInfo();
}
}
