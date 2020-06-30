package com.nitprogram;


class Parent{
	static void fun1(){
		
		System.out.println("fun1");
	}
}
public class Test {

	/*
	 * public ThreadIdentity() {
	 * 
	 * }
	 */
	/*public void validate() throws MyException {

		int a = 10, b = 0;
		if(a!=b){

		throw new MyException("not equql");
	}
	}*/
//static int a=100;
	/*
	 * ThreadIdentity(String name){ super(name); }
	 */
	static void fun(){
		System.out.println("fun");
	}
	
	public static void main(String[] args) {
 //final int a=200;
	
		/*String s="hello";
		String s2="world";
		s=s.concat(s2);
		*/
		Test.fun();
		fun();
		Parent.fun1();
		//System.out.println(s);
	//	System.out.println(a);
		// Thread t=Thread.currentThread();
		//Test t = new Test();
        //t.validate ();
		/*try {
			t.sum();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}*/
		// t.setDaemon(true);
		// System.out.println(t.isDaemon());

		/*
		 * System.out.println("parent"+t.getName());
		 * System.out.println(t.getPriority());
		 */

	}
}

/*
 * public class ParentObjectCreationInChild {
 * 
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * int a=10,b=0; try{
 * 
 * int c=a/b; System.out.println("aaa"+a); int x=10,y=0; int z=x/y;
 * System.out.println("ZZZ"+z); }catch(ArithmeticException exception){
 * System.out.println("exception"); }catch(Exception exception2){
 * System.out.println("exception2"); } }
 * 
 * }
 */