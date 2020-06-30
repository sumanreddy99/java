package com.springioc.annotation.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("MathTeacher");
		
	}

}
