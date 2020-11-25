package com.mshakir.PasswordGenerator;

public class Main {

	public static void main(String[] args) {

		System.out.println(randomPassword(10));

	}
	private static String randomPassword(int passLength) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyz!@#$%^&*()_+=-<>0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// System.out.println("String Length : " + passwordSet.length());
		char[] password = new char[passLength];
		
		for (int i = 0; i < passLength; i++) {
			int randomValue = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomValue);
		}
		// Can not Convert the Char into String, Therefore Casting Needs to avoid the Error		
		return new String (password);
	}
}
