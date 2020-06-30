package com.java.programs;

class  superClass{
	public static void sum(){
		System.out.println("superclass");
	}
}

class subClass extends superClass{

	public static void sum(){
		System.out.println("subClass");
	}

}
	
	public class Inheritence{
	
	public static void main(String[] args) {
		superClass sup=new subClass();
		sup.sum();
	}
}

