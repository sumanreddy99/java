package com.java.programs;

import java.util.Arrays;

public class StringAnogramOrNot {
	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		boolean status=true;
		if(s1.length() !=s2.length()){
			status=false;
		}else{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			status=Arrays.equals(c1, c2);
			
		}
		if(status){
			System.out.println("two strings are anogram");
		}else{
			System.out.println("two strings are not anogram");
		}
	}

}
