package com.springioc.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("ScienceTeacher");
		
	}

}
