package com.java1_8.programs;

import java.util.function.Function;

public class SqrtOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f=i->i*i;
		
System.out.println("sqrt of 40 "+f.apply(40));
	}

}
