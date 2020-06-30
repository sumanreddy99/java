package com.java.programs;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {

		String s = "";
		String reverse = "";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		s=scanner.nextLine();
		//polindrome means Reverse of string same as original string

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}

		if (reverse.equals(s)) {
			System.out.println("polindrome");
			System.out.println("reverse  :" + reverse);
			System.out.println("s : " + s);
		} else {
			System.out.println("not polidrome");
		}
	}
}
