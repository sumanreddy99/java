package com.nitprogram;

public class MyException extends Exception {

	String s;

	MyException(String ex) {
		this.s = ex;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception  " + s;
	}

}
