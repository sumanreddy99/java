package com.java.programs;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers");
		int radius=scanner.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("area"+area);
		
		
	}

}
