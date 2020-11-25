package com.mshakir.ObjectToJSON;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		ARCE a1 = new ARCE("Muhammad Shakir", 28, "Java Developer", 1400);
		emp.setAge(1);
		emp.setFirstName("Muhammad");
		emp.setLastName("Shakir");
		emp.setProfession("Java Developer");
		
		String address [] = {"Gadsden", "Alabama"};
		emp.setAddress(address);
 		
		Gson outputJSON = new Gson();
		String response = outputJSON.toJson(emp);
		System.out.println(response);
		
		
//		a1.greetings();
		String res1 = outputJSON.toJson(a1);
		System.out.println(res1);
	}

}
