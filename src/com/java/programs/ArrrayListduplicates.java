package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrrayListduplicates {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,2,4,5,1));
		List<Integer> newlist1=new ArrayList<Integer>();
		for(Integer l:list){
			if(!newlist1.contains(l)){
				newlist1.add(l);
				
			}
			
		}
		System.out.println("new list"+newlist1);
	}

}
