package com.java;

public class Engine {
	
	private String eType;

	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	@Override
	public String toString() {
		return "Engine [eType=" + eType + "]";
	}
	
	

}
