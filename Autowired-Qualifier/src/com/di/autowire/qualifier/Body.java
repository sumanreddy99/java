package com.di.autowire.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {
	@Autowired
	@Qualifier("animalHeart")
	private Heart heart;
/*
	public Body() {

	}

	public Body(Heart heart) {
		System.out.println("constructor");
		this.heart = heart;
	}

	
	public void setHeart(Heart heart) {
		System.out.println("setter heart" );
		this.heart = heart;
	}*/

	public void bodyInfo() {
		System.out.println(" heart"+heart.getNoHeart());
		heart.pumping();
	}

}
