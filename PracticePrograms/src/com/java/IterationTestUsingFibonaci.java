package com.java;

import java.util.Scanner;

public class IterationTestUsingFibonaci {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("how many fibonaci serires do you want");
		
		int count=scanner.nextInt();
		
		printFibonaci(count);
		
		

	}

	public  static void printFibonaci(int count) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=1,num3;
		
		if(count>=2) {
			System.out.print(num1 + " " +num2);
		}
		
		// fibonaci start from 2 
		
		for(int i=2;i<count;i++) {
			
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print(" "+num3);
			
		}
		
	}

}
