package com.ioc.pojo;

public class TestBean {

	/*
	 * private TestBean(){ System.out.println("TestBean"); }
	 * 
	 * 
	 * private String name; private int age; private String email; public void
	 * setName(String name) { this.name = name; } public void setAge(int age) {
	 * this.age = age; } public void setEmail(String email) { this.email = email; }
	 */
	
	private String name;
	private int age;
	private String email;

	private TestBean(String name, int age , String email) {
		
		this.name=name;
		this.age=age;
		this.email=email;
	}

	public void printData() {
		System.out.println(name + " " + age + " " + email);

	}
}
