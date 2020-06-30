package com.java;

import java.util.Scanner;

public class IterationUsingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("how many fibonaci serires do you want");
		
		int count=scanner.nextInt();
		
		printFactorial(count);
		
		

	}

	private static void printFactorial(int count) {
		// TODO Auto-generated method stub
		int fact=1;
		if(count <=1) {
		
			System.out.println("Factorial"+count);
		}else {
			
			for(int i=2;i<=count;i++) {
				
			fact=fact*i;	
				
			}
			System.out.println("fact  : "+fact);
		}
		
	}

	}


