package com.java;

import java.util.*;


public class AddelementToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(50);
		al.add(20);
		al.add(100);
		al.add(30);
		al.add(40);
		
		System.out.println("Before adding the element to list"+al);
		
		addElementtoCollection(al);
		System.out.println("after adding the element to list"+al);

	}

	private static void addElementtoCollection(Collection<Integer> al) {
		// TODO Auto-generated method stub
		
		// if user modifying(add/remove) the collection while iterating through for loop then 
        //it will throw concurrent modification Exception
		
		/*
		 * for(Integer mark:al) { if(mark<40) { al.add(mark); } }
		 */
				// To Solve concurrent modification Exception use the Iterator collection.
		
		/*
		 * for(ListIterator<Integer> iterator= ((List<Integer>)
		 * al).listIterator();iterator.hasNext();) {
		 * 
		 * Integer marks=iterator.next(); if(marks<40) { iterator.add(marks); } }
		 */
			
			// create new List , add element to new list .
			//and the new list element to orginal list
			
			List<Integer> temList=new ArrayList<Integer>();
			for(Integer mark: al) {
				if(mark<40) {
					temList.add(mark);
				}
			}
			
			al.addAll(temList);
		
		
	}

}
