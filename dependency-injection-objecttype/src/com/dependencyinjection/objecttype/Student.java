package com.dependencyinjection.objecttype;

public class Student {
	
	StudentExam studentExam;
	
	Student(){
		System.out.println("Student");
	}
	public void setStudentExam(StudentExam studentExam) {
		this.studentExam = studentExam;
	}


	public void studentInfo(){
		studentExam.getExamInfo();
	}

}
