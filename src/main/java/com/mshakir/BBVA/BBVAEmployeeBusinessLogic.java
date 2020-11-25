package com.mshakir.BBVA;

public class BBVAEmployeeBusinessLogic {
	public double calculateYearlySalary(BBVAEmployeeDetails details) {
		double yearlySaraly = 0;
		yearlySaraly = details.getWeeklySalary() * 52;
		return yearlySaraly;
	}
}
