package com.mshakir.Interview;
public class SwapNumbersWithTempVariable {
	// First Create a Static Method
	public static void SwapNumbers(int num1, int num2) {
		int temp;

		System.out.println("Numbers Before Swap: " + num1);
		System.out.println("Numbers Before Swap: " + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("---------------------------");

		System.out.println("Numbers Before Swap: " + num1);
		System.out.println("Numbers Before Swap: " + num2);

	}

}
