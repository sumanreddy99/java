package com.java.programs;

public class Fibonacciseries {

	public static void main(String[] args) {
	
		
		Fibonacciseries fibonacciseries=new Fibonacciseries();
		fibonacciseries.fib(0,1);
	}

	public void fib(int i, int j) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		if(i==0){
		System.out.println(i+"\n"+j);	
		}
		sum=i+j;
		if(sum<=100){
			System.out.println(sum);
			
			i=j;
			j=sum;
			
			fib(i,j);
			
		
	  }
	}
}
