package com.springioc.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.springioc.annotation.bean")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	/*@Bean
	public Teacher getMathTeach(){
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean(){
		return new Principal();
	}
	
	@Bean
	public College collegeBean(){
		System.out.println("College collegeBean");
		
		College college =new  College();
		college.setPrincipal(principalBean());
		college.setTeacher(getMathTeach());
		return college;
	}*/
}
