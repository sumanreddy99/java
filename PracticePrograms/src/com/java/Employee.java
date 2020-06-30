package com.java;

import java.io.Serializable;

public final class Employee implements Serializable{

	private Integer Id;
	private String name;
	private String mail;

	private Address address;

	public Employee(Integer id, String name, String mail, Address address) {
		super();
		Id = id;
		this.name = name;
		this.mail = mail;
		this.address = address;
	}

	public Integer getId() {
		return Id;
	}

	public Address getAddress() {
		return address;
	}

	/*
	 * public void setAddress(Address address) { this.address = address; }
	 */
	/*
	 * public void setId(Integer id) { Id = id; }
	 */
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public String getMail() {
		return mail;
	}
	/*
	 * public void setMail(String mail) { this.mail = mail; }
	 */

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", mail=" + mail + ", address=" + address + "]";
	}

}
