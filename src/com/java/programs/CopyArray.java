package com.java.programs;

public class CopyArray {

	public static void main(String[] args) {
		//Initialize array
		int [] arr1 = new int[]{1,2,3,4,5};
		// create new array
		int arr2[]=new int[arr1.length];
		//copy from arr1 to arr2
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		//loop arr1 
		System.out.print("array1 ");
		for(int i=0;i<arr1.length;i++){
			//
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n"+"array2 ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		

	}

}
