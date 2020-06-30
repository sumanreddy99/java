package com.required.valu.propvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean.xml");
		Student student = context.getBean("student", Student.class);
		//student.studentDetails();
	}

}
