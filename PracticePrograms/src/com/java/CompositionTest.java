package com.java;

public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car("modern");
		//System.out.println(car);
		Engine engine=car.getEngine();
		//System.out.println(engine);
		
		//if parent destroyed child cannot exist (it is "Is Part Of" relationship)
		//car(parent),engine(child)
	car=null;
	System.out.println(car.getEngine());
		
		
	}

}
