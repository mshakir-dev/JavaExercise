package com.mshakir.Interview;

public class FizzBuzz {
	public static void printShowFizzBuzz(int number) {
		for (int i = 1; i <= number; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " - Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " - Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " - Buzz");
			} else {
				System.out.println(i + " - Not Fizz Not Buzz");
			}
		}
	}
}
