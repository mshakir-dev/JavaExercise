package com.mshakir.SUM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double sum = 0;
		double ave = 0;
		Scanner input = new Scanner(System.in);
		System.out.print(" How many numbers you wanna add ????  ....  ");
		double number = input.nextDouble();

		for (double i = 1; i <= number; i++) {
			System.out.print("Enter the - " + i + " - Value : ");
			double value = input.nextDouble();
			sum = sum + value;
			ave = sum / number;
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("The Sum of " + number + " Numbers are:      " + sum);
		System.out.println("The Average of " + number + " Numbers are:: " + ave);
	}
}
