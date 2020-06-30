package com.helloworld.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helloworld.Hellodomain.Hello;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		Object o=applicationContext.getBean("hello");
		
		Hello h=(Hello)o;
		h.hello();
		
	}

}
