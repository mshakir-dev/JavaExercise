package com.mshakir.ReverseString;

public class Main {

	public static void main(String[] args) {
		String myStr = "Hello";
		System.out.println("Returns the specific letter from the charAt === " + myStr.charAt(4));
		
		System.out.println("Reverse String: " + reverse("abdul"));
	}

	public static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result += s.charAt(s.length() - i - 1);
		}
		return result;
	}
}
