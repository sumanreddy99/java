package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharInString {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		//with out HashMap
		String str="javahelloworld";
		//convert string in to array
		char[] ch=str.toCharArray();
		
		System.out.print(" repeated chartacter :");
		for(int i=0;i<str.length();i++){
			
			for(int j=i+1;j<str.length();j++){
				if((ch[i]==ch[j])){
					System.out.print(" "+ch[j]);
					break;
				}
			}
		}

	*/
	String str="java hello world";
	char[] ch=str.toCharArray();
	Map<Character,Integer> hashmap=new HashMap<Character, Integer>();
	//loop the String
	
	for(Character c:ch){
		if(hashmap.containsKey(c)){
			hashmap.put(c, hashmap.get(c)+1);
			System.out.println("hashmap"+c+" "+ hashmap.get(c));
		}else{
			hashmap.put(c,1);
		}
		
	}
	
	
	Set<Character> keys=hashmap.keySet();
	for(Character c:keys){
		if(hashmap.get(c)>1){
			System.out.println(c+" "+ hashmap.get(c));
			
		}
	}
	
	
	
	
	}

}
