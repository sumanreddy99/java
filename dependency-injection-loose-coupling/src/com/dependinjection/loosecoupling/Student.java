package com.dependinjection.loosecoupling;

public class Student  {

	private Cheat cheat;
	private Cheat cheat1;

	
	
	public void setCheat1(Cheat cheat1) {
		this.cheat1 = cheat1;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void studCheating(){
		cheat.cheat();
		cheat1.cheat();
	}
	

}
