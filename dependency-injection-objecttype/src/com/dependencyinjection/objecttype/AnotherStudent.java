package com.dependencyinjection.objecttype;

public class AnotherStudent {
	
	StudentExam exam;
	
	AnotherStudent(){
		System.out.println("AnotherStudent");
	}
	public void setExam(StudentExam exam) {
		this.exam = exam;
	}


	public void studInfo(){
		exam.getExamInfo();
	}

}
