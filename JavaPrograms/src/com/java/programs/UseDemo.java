package com.java.programs;

class A1{
	void show(){
		System.out.println("parent show A");
	}
}

class B1 extends A1{
	void show(){
		System.out.println("child show B");
	}
}
public class UseDemo { 
	  public static void main(String [] args) 
    { 
  A1 a = new A1(); 
  a.show();
  B1 b=new B1();
  b.show();
  A1 a1=new B1();
  a1.show();
 
  
    }  
}
