package com.java.programs;

public class CountOfRepeatedElentsInArrray {

	public static void main(String[] args) {
		// create and initialize an array with elements
		int[] first = new int[] { 1, 2, 3, 2, 5, 4, 5, 6, 1 };
		// create new array
		int second[] = new int[first.length];
		int visited = -1;
		// loop first array elements
		for (int i = 0; i < first.length; i++) {
			// loop second array with elements
			int count = 1;
			for (int j = i+1; j < first.length; j++) {
				// compare first array and second array
				if (first[i] == first[j]) {
					count++;
					//avoid counting the repeated element
					second[j] = visited;
				}
			}
			if (second[i] != visited) {
				second[i] = count;
			}
			
		}
		
		for(int i=0;i<second.length;i++){
			if(second[i]!=visited){
			System.out.println("first element"+  first[i]+" |"+second[i]);
			}
		}

	}

}


/*first element1 |2
first element2 |2
first element3 |1
first element2 |1
first element5 |2
first element4 |1
first element5 |1
first element6 |1
first element1 |1
*/

/*first element1 |2
first element2 |2
first element3 |1
first element5 |2
first element4 |1
first element6 |1
*/