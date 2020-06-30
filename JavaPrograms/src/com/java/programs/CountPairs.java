package com.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPairs {
	
	public static int countPairs(List<Integer> numbers, int k) {
	    // Write your code here
	    int count =0;
	    Set<Integer> set = new HashSet<>(numbers);
	    for(Integer i : set){
	        if (set.contains(i + k)) {
	            count++;
	        }
	    }
	    return count;
	    }
	public static void main(String args[]) 
    { 
        int arr[] = {8, 12, 16, 4, 0, 20 }; 
        
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int numbersItem = arr[i];
            numbers.add(numbersItem);
        }

       // int n = arr.length; 
        int k = 8; 
        System.out.println("Count of pairs with given diff is "
                        + countPairs(numbers, k)); 
    } 
	}



