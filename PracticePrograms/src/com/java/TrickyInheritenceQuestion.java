package com.java;


class Ab{
	void add() {
		System.out.println("class A add method");
	}
}

class Ba extends Ab{
	void add() {
		super.add();
		System.out.println("class B add method");
	}
}

class C extends Ba{
	
	void add() {
		super.add();
		System.out.println(" class C add method");
	}
}

public class TrickyInheritenceQuestion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.add();
	}

}
