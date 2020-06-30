package com.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine());

		//Solution.fizzBuzz(n);

		bufferedReader.close();
	}

	public static void fizzBuzz(int n) {

		for (int i = 1; i <= 3; i++) {
			
			 if (i % 3 == 0)
				System.out.println("Fizz" + " ");

			else
				System.out.println(i + " ");
		}

		
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				System.out.println("FizzBuzz" + " ");

			else if (i % 5 == 0)
				System.out.println("Buzz" + " ");

			else if (i % 3 == 0)
				System.out.println("Fizz" + " ");

			else
				System.out.println(i + " ");
		}

	}

}
// }

