package com.java.programs;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n=7;
		int j;
		for(int i=2;i<=n/2;i++){
			
			j=n%i;
			if(j==0){
				System.out.println("not prime");
			}else{
				System.out.println("prime");
				break;
			}
		}
		
	}

}
