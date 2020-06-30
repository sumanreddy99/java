package com.java.programs;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
	      String[] testArray = { "Hai", "This", "is", "Ashok" };
	      String str = Arrays.toString(testArray);
	      str = str.substring(1, 10).replace(",", "");
	      
	     /* String str1 = Arrays.toString(testArray);
	      str1 = str1.substring(10, str1.length()-1).replace(",","");
	      String str2=str+str1;
	      */
	      System.out.println(str);
	      System.out.println(str);
	      String str1 = Arrays.toString(testArray);
	      str1 = str1.substring(10, str1.length()-1).replace(",", "");
	      
	      System.out.printf(str1.replaceFirst(" ", ""));
	   }
}
