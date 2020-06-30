package com.java.programs;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome hello world";

		//char[] ch= new char[s.length()];
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			//if(s.charAt(i) == ''){
			//ch[i]=s.charAt(i);
			if((s.charAt(i)==' ')  && (s.charAt(i+1)!=' '))
			{
			count++;
			}
		}
		System.out.println("count" + count);
	}

}
