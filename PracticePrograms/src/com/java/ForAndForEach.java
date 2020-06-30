package com.java;

public class ForAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {10,20,30,40};
		for(int i=0;i<x.length;i++) {
			
			System.out.println(x[i]+"\n");// for loop always index based
			
		}
		for(int i:x) {
			//System.out.println(x[i]);//x[10] - for-each always value based
			System.out.println("\n"+i);
		}
		

	}

}
