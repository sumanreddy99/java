package com.java;

public class B extends A{
	
	public B() {
		// TODO Auto-generated constructor stub
	greeting();
	print();
	
	}
	
	
	public void greeting() {
		
		System.out.println("instance from method from B class");
	}

	static void print() {
		System.out.println("static method from B class");
	}

}
