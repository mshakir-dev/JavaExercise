package com.mshakir.Circle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle ..... ");
		double radius = c.nextDouble();
		double circumference = 2.0 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("The Circumference is : " + circumference);
		System.out.println("The Area is : " + area);
		System.out.println("The Area is : " + Math.round(area * 100.00) / 100.00);
	}
}
