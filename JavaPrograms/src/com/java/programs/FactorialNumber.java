package com.java.programs;

public class FactorialNumber {

	public static void main(String[] args) {

		/*
		 * int number=5; int fact=1; for(int i=1;i<=number;i++){
		 * 
		 * fact=fact*i; System.out.println("fact"+fact); }
		 */

		int fact = 1;

		int number = 5;

		fact = factNumber(number);
		System.out.println("fct" + fact);
	}

	public static int factNumber(int number) {

		if (number == 0) {
			return 1;
		} else {

			return (number * factNumber(number - 1));
		}

		// return number;
		// TODO Auto-generated method stub

	}

}
