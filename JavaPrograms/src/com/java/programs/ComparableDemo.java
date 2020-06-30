package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
	List<Student> stud=new ArrayList<Student>();
	
	stud.add(new Student(29, 12, "Suman"));
	stud.add(new Student(34, 10, "Pavani"));
	stud.add(new Student(21, 3, "Srujan"));
	
	Collections.sort(stud);
	System.out.println("age "+"id "+"name");
	for(Student student:stud){
		
		int age=student.getAge();
		int id=student.getId();
		String name=student.getName();
		System.out.println(age + " "+ id +" "+ name);
	}
	
	StudentIDDemo  studentIDDemo=new StudentIDDemo();
	Collections.sort(stud, studentIDDemo);
	
for(Student student:stud){
		
		int age=student.getAge();
		int id=student.getId();
		String name=student.getName();
		System.out.println(age + " "+ id +" "+ name);
	}
	
	}
}
