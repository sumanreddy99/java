package com.java.programs;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 ....
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1 +" "+n2);
		int i;
		for( i=2;i<10;i++){
			n3=n2+n1;
			
		System.out.print(" " +n3);	
			System.out.print("\n");
			System.out.print("i "+i);
		n1=n2;
		n2=n3;
		}

	}

}


/*0 1 1
i 2 2
i 3 3
i 4 5
i 5 8
i 6 13
i 7 21
i 8 34
i 9*/


/*0 1 1
i 2 2
i 3 3
i 4 5
i 5 8
i 6 13
i 7 21
i 8 34
i 9*/