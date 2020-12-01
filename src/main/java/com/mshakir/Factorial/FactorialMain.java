package com.mshakir.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
		System.out.println("Factorial of -1 is: " + factorials(-1));
		System.out.println("Factorial of 5 is: " + factorials(5));
	}

	public static Integer factorials(Integer num) {
		if (num < 0) {
			return null;
		} else if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return num * factorials(num - 1);
		}
	}
}
