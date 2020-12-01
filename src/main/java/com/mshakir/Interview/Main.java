package com.mshakir.Interview;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*
		 * Author:  Learn Code With MS
		 * Java Interview Series 
		*/
		// FizzBuzz.printShowFizzBuzz(10); 
		// SwapNumbersWithoutTempVariable.showSwap(20, 30);
		// SwapNumbersWithTempVariableSwapNumbers(30, 50);
		

		ReverseString str1 = new ReverseString(); // Create an Instance of ReverseString Class.
		
		System.out.println(str1.ReverStringMethod("LearnCodeWithMS"));
		JOptionPane.showMessageDialog(null, str1.ReverStringMethod("LearnCodeWithMS"));
		
	}
	
	

}