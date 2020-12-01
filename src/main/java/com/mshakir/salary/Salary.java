package com.mshakir.salary;

import java.util.Scanner;

public class Salary {
	public static void main(String [] args){

        final double MIN_HOURS_YEARLY = 2080; 
        final double MIN_OFFICIAL_HOLIDAY_HOURS = 88;
        final double MIN_PAID_TIME_OFF_HOURS = 80;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Expected Salary: ");
        double salary = sc.nextDouble();
        double hourlyWage = salary / MIN_HOURS_YEARLY;
        double paidTimeOff = MIN_PAID_TIME_OFF_HOURS *hourlyWage;
        double holidayOff = hourlyWage* MIN_OFFICIAL_HOLIDAY_HOURS;
        
        System.out.println();
        System.out.println();
        System.out.println("************************************");
        System.out.println("Expected Hourly Wage: " + hourlyWage);
        System.out.println("Official PTO Hours Pay: "+ paidTimeOff);
        System.out.println("Official Holiday Hours Pay: "+holidayOff);
        
        double fullTimeSalary = salary - paidTimeOff - holidayOff;
        System.out.println("Full Time Salary: " + fullTimeSalary);
   }
}