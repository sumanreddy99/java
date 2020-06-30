package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "STUDENT_TABLE")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private int studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	
	//@OneToMany//(mappedBy = "student")
	
	@ManyToMany (mappedBy = "student")
//	@JoinColumn(name = "SCHOOL_ID")
	/*
	 * @JoinTable(name = "STUDENT_SCHOOL",joinColumns = @JoinColumn(name =
	 * "STUDENT_ID"),inverseJoinColumns = @JoinColumn(name="SCHOOL_ID"))
	 */
	 
	private Collection<School> school=new ArrayList<School>();
	
	public Collection<School> getSchool() {
		return school;
	}

	public void setSchool(Collection<School> school) {
		this.school = school;
	}

	/*
	 * @ElementCollection(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "STUDENT_ADDRESS", joinColumns=@JoinColumn(name =
	 * "STUDENT_ID"))
	 * 
	 * @GenericGenerator(name = "hilo-gen", strategy = "hilo")
	 * 
	 * @CollectionId(columns = { @Column (name = "ADDR_ID")}, generator =
	 * "hilo-gen", type = @Type(type = "long")) private Collection<Address> addr =
	 * new ArrayList<Address>();
	 * 
	 */
	
	
	
	/*@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
			@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
			@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PINCODE_NAME")) })
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "COMP_STREET_NAME")),
			@AttributeOverride(name = "city", column = @Column(name = "COMP_CITY_NAME")),
			@AttributeOverride(name = "state", column = @Column(name = "COMP_STATE_NAME")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "COMP_PINCODE_NAME")) })
	private Address companyAddress;*/

	/*
	 * public Collection<Address> getAddr() { return addr; }
	 * 
	 * public void setAddr(Collection<Address> addr) { this.addr = addr; }
	 */

	@Temporal(TemporalType.DATE)
	private Date joindate;

	private String description;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName + " " + "From Getter Name";
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
