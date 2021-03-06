package com.java;

import java.io.Serializable;

public class Address implements Serializable{

	
	private String Hno;
	private String street;
	private String addressLine1;
	private String addressLine2;
	
	public Address(String hno, String street, String addressLine1, String addressLine2) {
		super();
		Hno = hno;
		this.street = street;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	public String getHno() {
		return Hno;
	}

	/*
	 * public void setHno(String hno) { Hno = hno; }
	 */
	public String getStreet() {
		return street;
	}

	/*
	 * public void setStreet(String street) { this.street = street; }
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/*
	 * public void setAddressLine1(String addressLine1) { this.addressLine1 =
	 * addressLine1; }
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/*
	 * public void setAddressLine2(String addressLine2) { this.addressLine2 =
	 * addressLine2; }
	 */
	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", street=" + street + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + "]";
	}
	
	
	
	
	
}
