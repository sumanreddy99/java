package com.spring.dependencyInjection;

public class Student {

	private String studentName;
	
	private int id;

	/*public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setId(int id) {
		this.id = id;
	}*/
	
	public Student(String studentName, int id) {
		
		this.studentName = studentName;
		this.id = id;
	}
			
	public Student(int id) {
	
		this.id = id;
	}





	public void studentDisplay(){
		System.out.println(" Student Name " + studentName + " Id " + id);
	}

	
	
	
	
}
