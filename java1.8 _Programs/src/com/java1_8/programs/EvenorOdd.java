package com.java1_8.programs;

import java.util.function.Predicate;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=i->i%2==0;
		
System.out.println("even or odd of 4 "+ p.test(4));
	}

}
