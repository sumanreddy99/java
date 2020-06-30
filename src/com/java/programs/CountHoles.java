package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class CountHoles {

	

	public static int countHoles(int num) {
	    // Write your code here
	    int res =0;
	        List<Integer> list0 = Arrays.asList(1,2,3,5,7);
	        List<Integer> list1 = Arrays.asList(0,4,6,9);
	        List<Integer> list2 = Arrays.asList(8);
	        char[] cAry = Integer.toString(num).toCharArray();
	        for(char c : cAry){
	            int o = Character.getNumericValue(c);
	        if(list0.contains(o)){
	            res = res + 0;
	        }else if (list1.contains(o)) {
	            res = res + 1;
	        }else if (list2.contains(o)) {
	            res = res + 2;
	        }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
countHoles(6457819);
	}

}
