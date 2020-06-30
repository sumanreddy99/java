package com.ioc.primitive_array.inject.PrimitiveArray_Inject;

/**
 * Hello world!
 *
 */
public class NameTest 
{
	
	public NameTest() {
	
		System.out.println("Test");
	}
	
  private String[] names;
  
   public void setNames(String[] names) {
	this.names = names;
}
   
   public void printData() {
	// TODO Auto-generated method stub
	   for(String name:names)
	   System.out.println("name  "+name);

}
   
   
}
