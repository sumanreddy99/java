package com.required.valu.propvalues;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Student implements InitializingBean{
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.hobby}")
	private String hobby;

	public void afterPropertiesSet() {
		System.out.println("afterPropertiesSet");
		System.out.println(" name " + name + " course " + course +" hobby "+ hobby );
	}
	/*public void setName(String name) {
		this.name = name;
		System.out.println("name");
	}
	
	
	public void setCourse(String course) {
		this.course = course;
		System.out.println("course");
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("hobby");
	}*/
	
	
	/*public void studentDetails(){
		System.out.println(" name " + name + " course " + course +" hobby "+ hobby );
		
	}*/
	

}
