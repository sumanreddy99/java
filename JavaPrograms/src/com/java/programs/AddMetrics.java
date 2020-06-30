package com.java.programs;

import java.util.Scanner;

public class AddMetrics {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int rows = 0;
		int cols = 0;
		
		System.out.println("please enter the number of rows and columns");
		
		rows=scanner.nextInt();
		cols=scanner.nextInt();
		int[][] first= new int[rows][cols];
		int[][] second=new int[rows][cols];
		int[][] sum=new int [rows][cols];
		System.out.println("Please Enter elements of first matrix");

		for(int c=0;c<rows;c++){
			for(int d=0;d<cols;d++){
				first[c][d]=scanner.nextInt();
				//System.out.println("first rows"+first[c][d]);
			}
		}
		System.out.println("Please Enter elements of second matrix");
			for(int c=0;c<rows;c++){
				for(int d=0;d<cols;d++){
				second[c][d]=scanner.nextInt();	
				}
			}
			
			for(int c=0;c<rows;c++){
				for(int d=0;d<cols;d++){
					sum[c][d]=first[c][d]+second[c][d];
					
					//System.out.println("sum"+sum[c][d]+"\t");
				}
			}
			System.out.println("Sum of entered matrices:-");

			for(int c=0;c<rows;c++){
				for(int d=0;d<cols;d++)
					System.out.print(sum[c][d]+"\t");
				System.out.println();
					
				
			}
			
			
			/*for (int c = 0 ; c < rows ; c++ )
		      {
		         for ( int d = 0 ; d < cols ; d++ )
		            System.out.print(sum[c][d]+"\t");
		         System.out.println();
		      }				
			*/
		}
		
		
		
		
		
	}


