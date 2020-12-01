package com.mshakir.Interview;

public class ReverseString {
	public String ReverStringMethod(String str) {
		// Now Try to reverse the whole string variable;
		
		String res = "";
		for (int i =0; i <str.length(); i ++) {
			res += str.charAt(str.length() - i - 1);
			// Inside the For Loop We are Appending the String into Res Variable, So everytime when Loop runs it will add into the Res Variable.
			// str.charAt(str.length()) ==> 15, i ==> 0, 15 - 0 - 1
			
//			We add - 1 because charAt returns a char at a specified index from 0 - n but length returns the whole length 
			
		}
		return res;
	}

}
