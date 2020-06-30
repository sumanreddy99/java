package com.dependencyinjection.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Colleage {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Student student=context.getBean("student",Student.class);
		student.studentInfo();
		
		AnotherStudent anotherStudent=context.getBean("anotherStudent", AnotherStudent.class);
		
		anotherStudent.studInfo();
	}
}
