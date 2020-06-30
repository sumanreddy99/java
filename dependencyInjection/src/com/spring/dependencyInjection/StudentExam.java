package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 Student student=context.getBean("student", Student.class);
         student.studentDisplay();
         
         Student student2=context.getBean("student1", Student.class);
         student2.studentDisplay();
	}

}
