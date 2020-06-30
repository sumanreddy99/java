package com.java.programs;

public class Student implements Comparable<Student>{
	
	private int age;
	private int id;
	private String name;
	public Student(int age, int id, String name) {
		
		this.age = age;
		this.id = id;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Student stud){
		
		return  stud.getAge() - this.getAge();
		
		
		
	}
	
	

}
