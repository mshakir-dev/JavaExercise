package com.mshakir.fizBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		showFizzBuzz(15);

	}

	private static void showFizzBuzz(int number) {

		for (int i = 1; i <= number; i++) 
		{
		    if (((i % 2) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 7?
		        System.out.println("fizzbuzz");
		    else if ((i % 2) == 0) // Is it a multiple of 5?
		        System.out.println("fizz");
		    else if ((i % 3) == 0) // Is it a multiple of 7?
		        System.out.println("buzz");
		    else
		        System.out.println(i); // Not a multiple of 5 or 7
		}
	}

}
