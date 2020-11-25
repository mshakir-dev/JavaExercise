package com.mshakir.NonNegative;

import java.util.Scanner;

public class NonMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number ");
		double value = input.nextDouble();
		
		if (value < 0) {
			System.out.println("Invalid Entry");
		}
		else {
			double square = Math.pow(value, 2);
			double cube = Math.pow(value, 3);
			double sroot = Math.sqrt(value);
			double croot = Math.cbrt(value);
			System.out.println("The Square of a Real Number is --------- " + square);
			System.out.println("The Cube of a Real Number is ----------- " + cube);
			System.out.println("The SquareRoot of a Real Number is ----- " + sroot);
			System.out.println("The CubeRoot of a Real Number is ------- " + croot);
			System.out.println("-------------------------------------------------");
		}
	}
}
