package com.mshakir.ObjectToJSON;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setAge(1);
		emp.setFirstName("Muhammad");
		emp.setLastName("Shakir");
		emp.setProfession("Java Developer");
		
		String address [] = {"Gadsden", "Alabama"};
		emp.setAddress(address);
 		
		Gson outputJSON = new Gson();
		String response = outputJSON.toJson(emp);
		System.out.println(response);
	}

}
