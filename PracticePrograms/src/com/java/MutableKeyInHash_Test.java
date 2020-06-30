package com.java;

import java.util.HashMap;
import java.util.Map;

public class MutableKeyInHash_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<EmployeeType,Department> empDeptMap=new HashMap<EmployeeType,Department>();
		
		EmployeeType employeeType=new EmployeeType(1001, "suman","suman@gmail.com");
		
		Department department=new Department(1111, "IT", "Chennai");
		
		empDeptMap.put(employeeType, department);
		
		System.out.println("Before Hash Key is modified : "+empDeptMap.get(employeeType));
		
		employeeType.setName("Harsha");
		
		System.out.println("After Hash Key is modified : "+empDeptMap.get(employeeType));
		
		
		empDeptMap.forEach((k,v)->System.out.println((k+"\t"+v)));
		
		
		
		
		
		
		

	}

}
