package com.mshakir.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
	    System.out.println("Factorial of -1 is: " + factorial(-1));
	    System.out.println("Factorial of 5 is: " + factorial(5));

	}

	public static Integer factorial(Integer n) {
		if (n < 0) {
			return null;
		} else {
			int factorial = n;
			for (int i = n - 1; i > 0; i--) {
				factorial = factorial * i;
			}
			return factorial;			
		}
	}
}
