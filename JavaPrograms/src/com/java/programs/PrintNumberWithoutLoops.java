package com.java.programs;

public class PrintNumberWithoutLoops {
	
	public static void main(String[] args) {
		recursiveNumber(1);	
	}
	
	public static void recursiveNumber(int n){
		
		if(n<=10){
			
			System.out.println("recursive"+n);
			n++;
			
			recursiveNumber(n);
		}
		
		
		
}
}
