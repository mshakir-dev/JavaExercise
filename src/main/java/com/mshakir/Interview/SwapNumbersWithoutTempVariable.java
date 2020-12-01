package com.mshakir.Interview;

public class SwapNumbersWithoutTempVariable {
	public static void SwapNumbers(int num1, int num2) {

		System.out.println("Numbers Before Swap: " + num1);
		System.out.println("Numbers Before Swap: " + num2);

		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;

		System.out.println("---------------------------");

		System.out.println("Numbers After Swap: " + num1);
		System.out.println("Numbers After Swap: " + num2);

	}

}
