package com.java.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Demo implements Serializable {
	
	transient int a;
	static int b;
	String c;
	public Demo(int a, int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
}


public class SerializationDemo {
public static void main(String[] args) {
	
	Demo d=new Demo(2, 1000, "java");
	
	
	try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"D:/javaprograms/JavaPrograms/src/com/java/programs/demo.txt");

			ObjectOutputStream stream = new ObjectOutputStream(fileOutputStream);
			stream.writeObject(d);
			
			fileOutputStream.close();
			stream.close();
			printdata(d);
			d.b=2000;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//d=null;
	
	try {
		FileInputStream fileinputStream=new FileInputStream("D:/javaprograms/JavaPrograms/src/com/java/programs/demo.txt");
	    ObjectInputStream  objectInputStream=new ObjectInputStream(fileinputStream); 
    
		d=(Demo) objectInputStream.readObject();
	    printdata(d); 
    
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void printdata(Demo d) {
	// TODO Auto-generated method stub
	
	System.out.println("transient"+ d.a + "static " + d.b +" String " + d.c);
	
}
}
