package com.java.programs;

class Multiplication {

	/*
	 * public MainMethod(int i){ System.out.println("MainMethod"); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * MainMethod m=new MainMethod(9); }
	 */

	public void add() {
		System.out.println("super class add");
	}

}

class Addition extends Multiplication { // Sub class

	public void add() {
		System.out.println("sub class add");
	}
}

public class MainMethod {
	public static void main(String[] args) {

		Multiplication multiplication = new Addition();// Manipulation is reference
													// type
						multiplication.add();							// and Addition is reference
													// type

		//addition.add();

	}
}
