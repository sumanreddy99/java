package com.java.programs;

public class ReturnInTry {

	
	public static void main(String[] args) {
		ReturnInTry obj=new ReturnInTry();
		//obj.cal();
		System.out.println("iiii"+obj.cal());
	}
	
	public int cal(){
		try{
			//
			int x=12/0;
			return 1;
		}
		catch(Exception e){
			return 0;
			
		}
		//System.out.println("13123213");
		//return 1;
		//System.out.println("");//unreachable code
		//return 0;
		//return 1;
	}
	
}
