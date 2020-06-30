package com.java.programs;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		
	int sum=0;
	@SuppressWarnings("resource")
	Scanner s =new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	//int i=0;
	while(n>0){
		//sum  of given integer
		//sum=sum+(n%10);
		//n=n/10;
		
		int i=n%10;
		sum=(sum*10)+i;
		n=n/10;
	}
	System.out.println(sum);
 }
}
