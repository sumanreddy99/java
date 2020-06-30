package com.ioc.di.collectionInject.pojo;

import java.util.*;

public class CarTest2 {

	private Vector carNames;
	private TreeSet modalYear;
	private Hashtable brandVersion;
	public void setCarNames(Vector carNames) {
		this.carNames = carNames;
	}
	public void setModalYear(TreeSet modalYear) {
		this.modalYear = modalYear;
	}
	public void setBrandVersion(Hashtable brandVersion) {
		this.brandVersion = brandVersion;
	}
	public void printData() {
	//carNames.forEach(carNames->System.out.println(carNames));
	
	for( Object car: carNames)
	System.out.println("forEcah Car list  "+carNames);
	
	//modalYear.forEach(modalYear->System.out.println(modalYear));
	
	for(Object o: modalYear)
		System.out.println("forEach modal year set  "  + modalYear);
	
	//brandVersion.forEach((k,v)->System.out.println(k +"," +v));
	
	Set keys=brandVersion.keySet();
	
	for(Object key:keys)
		System.out.println(key +" for each " + brandVersion.get(key));
	
	
	}
		
	
	}
	
	
