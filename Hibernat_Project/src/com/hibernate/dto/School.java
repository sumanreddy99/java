package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SCHOOL_TABLE")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SCHOOL_ID")
	private int schoolId;
	@Column(name = "SCHOOL_NAME")
	private String Sname;
	
	@ManyToMany 
	//@JoinColumn(name = "STUDENT_ID")
	//private Student student;
	private Collection<Student> student=new ArrayList<Student>();

	public Collection<Student> getStudent() {
		return student;
	}

	public void setStudent(Collection<Student> student) {
		this.student = student;
	}

	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	
	
	/*
	 * Hibernate: insert into STUDENT_TABLE (description, joindate, STUDENT_NAME,
	 * STUDENT_ID) values (?, ?, ?, ?) Hibernate: insert into SCHOOL_TABLE
	 * (SCHOOL_NAME, STUDENT_ID, SCHOOL_ID) values (?, ?, ?) Hibernate: insert into
	 * SCHOOL_TABLE (SCHOOL_NAME, STUDENT_ID, SCHOOL_ID) values (?, ?, ?) Hibernate:
	 * insert into STUDENT_SCHOOL (STUDENT_ID, SCHOOL_ID) values (?, ?) Hibernate:
	 * insert into STUDENT_SCHOOL (STUDENT_ID, SCHOOL_ID) values (?, ?)
	 */
	

}
