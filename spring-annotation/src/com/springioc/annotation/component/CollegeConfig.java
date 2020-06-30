package com.springioc.annotation.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springioc.annotation")
public class CollegeConfig {
	public void getCollegeConfig(){
	System.out.println("CollegeConfig");
	}
}
