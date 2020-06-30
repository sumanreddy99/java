package com.java.programs;

import java.io.IOException;
import java.util.HashSet;


class A{
	 void m1() throws Exception{
		System.out.println("class A M1()");
	}
}

class B extends A{
	 void m1()throws IOException{
	System.out.println("class B M1()");	
	}
	void m2(){
		System.out.println("class B M2()");
	}
}

public class Examples {

	String name;
	int age;
	
	Examples(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		
		/*String status;
		int rank=3;
		status = (rank==1)?"done":"pending";
		System.out.println(status);
		*/
		int counter;
		
		for (  counter = 0; counter < 10; counter++){
		    System.out.println(counter);
		
         
		if (counter== 4) {

		    continue;
		}
		System.out.println("This will not get printed when counter is 4"+counter);
		}
	
		/*Examples c1= new Examples("John",20);
		Examples c2= new Examples("John",20);
		
		HashSet<Examples> customerSet=new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examples other = (Examples) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
*/
		}
}