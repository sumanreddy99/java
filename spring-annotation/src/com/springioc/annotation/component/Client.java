package com.springioc.annotation.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(
				CollegeConfig.class);
		System.out.println("context");
		College college = context.getBean("college", College.class);
		college.getCollege();
		System.out.println(college);
	}

}
