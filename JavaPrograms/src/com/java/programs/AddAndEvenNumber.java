package com.java.programs;

import java.util.Scanner;

public class AddAndEvenNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=scanner.nextInt();
		/*if(n%2==0){
			System.out.println("even number"+n);
		}else{
			System.out.println("odd number"+n);
		}*/

	/*	if((n/2)*2==n){
			System.out.println("even number"+n);
		}else{
			System.out.println("odd number"+n);
		}
		
		if((n & 1)==0){
			System.out.println("even number"+n);
		}else{
			System.out.println("odd number"+n);
		}
	*/
		
	if((n>>1)<<1==n)
	{
		System.out.println("even number"+n);
	}else{
		System.out.println("odd number"+n);
	}
	
	
	
	}
	
	
}
