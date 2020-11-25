package com.mshakir.BBVA;

public class Main {

	public static void main(String[] args) {
		BBVAEmployeeBusinessLogic logic = new BBVAEmployeeBusinessLogic();
		BBVAEmployeeDetails details = new BBVAEmployeeDetails();
		Message msg = new Message();
		
		details.setAge(28);
		details.setExperience(2);
		details.setName("Muhammad Shakir");
		details.setWeeklySalary(1800);
		details.setRoleInProject("Java Developer");
		
		System.out.println(msg.greetings(details) + " Yearly Salary: " + logic.calculateYearlySalary(details) );

	}

}
