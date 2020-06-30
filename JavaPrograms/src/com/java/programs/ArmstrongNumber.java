package com.java.programs;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=371;
		int r;
		int sum=0;
		int temp=n;
		while(n>0){
			
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum){
			
			System.out.println("polindrome");
		}else{
			System.out.println("not polindrome");
		}
	}

}
