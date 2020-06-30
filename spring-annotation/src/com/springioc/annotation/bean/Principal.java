package com.springioc.annotation.bean;

import org.springframework.stereotype.Component;
@Component
public class Principal {
	
	public void getPrincipalInfo(){
		System.out.println("Principal getPrincipalInfo");
	}

}
